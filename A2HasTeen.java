class A2HasTeen extends ConsoleProgram {

  /**
  * Checks if at least one of three ages is a teen (between 13 and 19 inclusive)
  * @author: N. Moran
  */
  
  public void run() {
    
    // Declare variables
    int intAgeOne;
    int intAgeTwo;
    int intAgeThree;

    // Get ages from user
    intAgeOne = readInt("Enter age one: ");
    intAgeTwo = readInt("Enter age two: ");
    intAgeThree = readInt("Enter age three: ");

    // Check if any of the ages are between 13 - 19 inclusive
    if ((intAgeOne >= 13 && intAgeOne <= 19) || (intAgeTwo >= 13 && intAgeTwo <= 19) || (intAgeThree >= 13 && intAgeThree <= 19)) {
      System.out.println(true);
    }
    else {
      System.out.println(false);
    }
  }
}
