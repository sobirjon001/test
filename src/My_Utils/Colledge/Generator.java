package My_Utils.Colledge;

public class Generator {
  public static Student[] createStudents(int howMany){
    Student[] result = new Student[howMany];

    for (int i=0; i<howMany; i++){
      result[i] = new Student();
    }

    return result;
  }
}
