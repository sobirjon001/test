package My_Utils.Colledge;

import My_Utils.Person;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public final class Student extends Person {
  // ******** Instance variables
  public int id, gradeYear;
  public String academicYear, faculty;
  public LocalDate admissionYear, dob;
  // ******** END of Instance variables

  // ************ Private static variables for current class use only
  private static final String[] facultyFeed = {
          "General Art", "Software Engineering", "Biology and Genetics",
          "Computer Technology", "Law ang Criminal Justice"
  };
  private static final Random r = new Random();
  private static LocalDate now;
  private static final DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
  private static int count = 0;
  // ************ END of Private static variables for current class use only

  // ************************  Constructor *******************
  public Student() {
    super(); // calls Person constructor
    id = 1000 + (++count);
    now = LocalDate.now();
    dob = LocalDate.of(
            now.getYear() - 20 - r.nextInt(20), r.nextInt(12) + 1, r.nextInt(28) + 1
    );
    admissionYear = LocalDate.of(
            now.getYear() - (r.nextInt(5) + 1), 9, 1
    );
    gradeYear = now.getYear() - admissionYear.getYear();
    switch (gradeYear) {
      case 1:
        academicYear = "freshman";
        break;
      case 2:
        academicYear = "sophomore";
        break;
      case 3:
        academicYear = "junior";
        break;
      case 4:
        academicYear = "senior";
        break;
      default:
        academicYear = "graduate";
    } // end of switch
    faculty = facultyFeed[r.nextInt(facultyFeed.length)];
  }


  // ************* toString method *******************
  @Override
  public String toString() {
    return " | " + id +
            " | " + forTable(firstName) +
            " | " + forTable(lastName) +
            " | " + (gender == 'F' ? "female" : "male  ") +
            " | " + forTable(dob.format(df)) +
            " | " + forTable(admissionYear.format(df)) +
            " | " + forTable(academicYear) +
            " | " + faculty;
  }
  // ************* END of toString method *******************

  // *********** Supplementary private method for inside class use only

  // adds space after to match 11 character length for table cell
  private static String forTable(String word) {
    String result = word;
    for (int i = 11 - word.length(); i>0; i--){
      result += " ";
    }
    return result;
  }
}
