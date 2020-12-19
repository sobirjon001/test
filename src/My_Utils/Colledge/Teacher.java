package My_Utils.Colledge;

import java.time.LocalDate;
import java.util.Random;

public class Teacher extends Person{
  public int id;
  public LocalDate dob;

  private static int count = 0;
  private static final LocalDate now = LocalDate.now();
  private static final Random r = new Random();

  public Teacher(){
    super();
    id = 25000 + (++count);
    dob = LocalDate.of(
            now.getYear() - r.nextInt(20) - 30 , r.nextInt(12) + 1, r.nextInt(29)
    );
  }
}
