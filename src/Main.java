import My_Utils.Colledge.Student;
import My_Utils.Colledge.Generator;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // Creating array of students
    Student[] studentsArr = Generator.createStudents(10);

    //Printing all studets
    tableHead();
    for (Student each : studentsArr) {
      System.out.println(each);
    }

    // Create ArrayList of Students
    ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(studentsArr));

    Student st1 = new Student();
    //studentsList.add(st1);

//     ArrayList<Student> studentsList = new ArrayList<>(){{
//      addAll(Arrays.asList(studentsArr));
//     }};

//    ArrayList<Student> studentsList = new ArrayList<>();
//    for (int i=0; i<studentsArr.length; i++){
//      studentsList.add(studentsArr[i]);
//    }

//    System.out.println(studentsList.contains(st1));
//    System.out.println(studentsList.contains("Amana"));




  }

  // Supplemental method
  public static void tableHead(){
    System.out.println(" | ID   | F. Name     | L. Name     | Gender |  D. O. B.   | Admission   | Academic Y  | Faculty ");
    System.out.println("------------------------------------------------------------------------------------------------------------------------");
  }

}
