import My_Utils.Colledge.Generator;
import My_Utils.Colledge.Student;
import My_Utils.Colledge.Teacher;
import My_Utils.Person;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
  public static void main(String[] args) {
    // Creating array of students
   Student[] studentsArr = Generator.createStudents(10);

    //Printing all students
    tableHead();
    for (Student each : studentsArr) {
      System.out.println(each);
    }

    // Create ArrayList of Students
    ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(studentsArr));

    Student st1 = new Student();
    studentsList.add(st1);

//     ArrayList<Student> studentsList = new ArrayList<>(){{
//      addAll(Arrays.asList(studentsArr));
//     }};

//    ArrayList<Student> studentsList = new ArrayList<>();
//    for (int i=0; i<studentsArr.length; i++){
//      studentsList.add(studentsArr[i]);
//    }

    System.out.println("=============================================");
    System.out.println(studentsList.contains(st1));
    System.out.println(studentsList.contains("Amana"));

    ArrayList<Object> objLIst = new ArrayList<>();
    objLIst.add(st1);
    objLIst.add("Amana");
    objLIst.add(123);

    System.out.println("=============================================");
    System.out.println(objLIst.contains(st1));
    System.out.println(objLIst.contains("Amana"));

    System.out.println("=============================================");

    ArrayList arrList = new ArrayList();

    arrList.add(st1);
    arrList.add("Amana");
    System.out.println(arrList.contains(st1));
    System.out.println(arrList.contains("Amana"));
    System.out.println(arrList);

//
//    Student st1 = new Student();
//    Student st2 = new Student("USA");
//    Teacher t1 = new Teacher();
//
//    System.out.println(Person.calcAge(st1.dob));
//
//    System.out.println(Student.findCampus("Where is genetics school"));


  }

  // Supplemental method
  public static void tableHead(){
    System.out.println(" | ID   | F. Name     | L. Name     | Gender |  D. O. B.   | Admission   | Academic Y  | Faculty ");
    System.out.println("------------------------------------------------------------------------------------------------------------------------");
  }

}
