package My_Utils;

import java.util.Random;

public class Person {
  // ***************** instance variables
  public String firstName, lastName, citizenship;
  public char gender;
  // ***************** END of instance variables

  // ******* Private variable for inside class use only
  private static final String[] fNameFeedMale = {
          "Aiden", "Luke", "Alexander", "William", "Anthony", "David", "Austin", "Ryan",
          "Barrett", "Daniel", "Bennett", "Gregory", "Benjamin", "Clay", "Brady", "Jonathan",
          "Brayden", "James", "Brendan", "Ray", "Brett", "Robert", "Brody", "Gregory", "Brooks",
          "Michael", "Bryan", "Anthony", "Bryce", "Leo", "Caleb", "Anthony", "Carter", "Everett",
          "Carson", "James", "Caleb", "Anthony", "Carter", "Everett", "Carson", "James"
  };
  private static final String[] fNamesFeedFemale = {
          "Amelis", "Evelyn", "Isabella", "Olivia", "Ruby", "Sienna", "Sophia", "Doryty",
          "Elowen", "Genni", "Jenn", "Lamorna", "Lowdy", "Morgelyn", "Rosen", "Sowena",
          "Splanna", "Talwyn", "Tegen", "Tressa", "Wenna", "Daisy", "Dana", "Darlene",
          "Dasha", "Diana", "Dorothy", "Edith", "Elena", "Ella", "Emilia", "Erica", "Estella",
          "Evelin", "Faith", "Felicia", "Florence", "Frida", "Gabriella", "Geneva", "Georgia"
  };
  private static final String[] lastNameFeed = {
          "Amana", "Barlowe", "Cadden", "Fox", "Hart", "Hendrix", "Katz", "Laurier", "Madden",
          "Sai", "Villareal", "Viotto", "Abraham", "Ashford", "Benjamin", "Boone", "Elrod", "Frederick",
          "Hale", "Langston", "Levisay", "McElvfesh", "Trevino", "Whitlock", "Yarbrough", "Amos",
          "Beam", "Dash", "Duke", "Fleet", "Jian", "Moses", "Pierce", "Remington", "Sharp", "Singh",
          "Stallard", "West", "Abernathy", "Cornelius", "Crawford", "Cunningham", "Driscol", "Ellis"
  };
  private static final Random r = new Random();
  private static int count = 0;
  // ******* END of Private variable for inside class use only

  // **************** constructor
  public Person() {
    gender = ( r.nextBoolean() ? 'F' : 'M' );
    firstName = (
            gender == 'F' ? fNamesFeedFemale[ r.nextInt( fNamesFeedFemale.length ) ]
                    : fNameFeedMale[ r.nextInt( fNameFeedMale.length ) ]
    );
    lastName = lastNameFeed[ count ];

    // cycles count within lastNameFeed indexes
    // everytime when constructor called
    if ( count == lastNameFeed.length - 1 ) {
      count = 0;
    } else {
      count++;
    }
  }
}
