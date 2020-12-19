import My_Utils.Colledge.Student;
import My_Utils.Colledge.Generator;

public class Main {
  public static void main(String[] args) {
    // Creating students
    Student[] studentsArr = Generator.createStudents(10);

    //Printing all studets
    tableHead();
    for (Student each : studentsArr) {
      System.out.println(each);
    }


  }

  // Supplemental method
  public static void tableHead(){
    System.out.println(" | ID   | F. Name     | L. Name     | Gender |  D. O. B.   | Admission   | Academic Y  | Faculty ");
    System.out.println("------------------------------------------------------------------------------------------------------------------------");
  }

}
