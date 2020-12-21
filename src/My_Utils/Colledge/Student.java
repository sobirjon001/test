package My_Utils.Colledge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Student extends Person {

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

  // Constructor overload
  public Student(String citizenship) {
    super(citizenship); // calls Person constructor
    id = 1000 + (++count);
    now = LocalDate.now();
    dob = LocalDate.of(
            now.getYear() - r.nextInt(20) - 20, r.nextInt(12) + 1, r.nextInt(28) + 1
    );
    admissionYear = LocalDate.of(
            now.getYear() - (r.nextInt(4) + 1), 9, 1
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
  // ****************** END of Constructor **********************

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

  // *********** override methods
  @Override
  public void eat(String food){
    System.out.println(firstName + " is eating " + food + "in campus cafeteria");
  }
  // *********** END of override methods

  // ************ Static/Utility methods
  public static String findCampus(String faculty) {
    String result;
    if (ifContains(faculty, facultyFeed[0])) {
      result = "18 Columbus Avenue campus of Art";
    } else if (ifContains(faculty, facultyFeed[1])) {
      result = "2020 Houston Street campus of Computer technology";
    } else if (ifContains(faculty, facultyFeed[2])) {
      result = "125 1st Ave campus of School of Medicine";
    } else if (ifContains(faculty, facultyFeed[3])) {
      result = "2020 Houston Street campus of Computer technology";
    } else if (ifContains(faculty, facultyFeed[4])) {
      result = "4516 Cort Street campus of Law ang Criminal Justice";
    } else {
      result = "We don't have campus for this faculty";
    }
    return result;
  }
  // ************ END of Static/Utility methods

  // *********** Supplementary private method for inside class use only

  // adds space after to match 11 character length for table cell
  private static String forTable(String word) {
    StringBuilder result = new StringBuilder(word);
    for (int i = (11 - word.length()); i > 0; i--) {
      result.append(" ");
    }
    return result.toString();
  }

  // Checks if String contains any word from another String
  private static boolean ifContains(String sentence1, String sentence2){
    boolean result = false;
    for (String word : sentence1.split(" ")){
      if(sentence2.contains(word)){
        result = true;
        break;
      }
    }
    return result;
  }
  // *********** END of Supplementary private method for inside class use only
}



