class A1FreezingHot extends ConsoleProgram {

  /**
  * Checks if two temps entered by the user is less than 0 and greater than 100
  * @author: N. Moran
  */
  
  public void run() {

    // Declare variables
    int intTempOne;
    int intTempTwo;

    // Get temps from user
    intTempOne = readInt("Enter the first temp: ");
    intTempTwo = readInt("Enter the second temp: ");

    // Check if temp is less than 0 and the other is greater than 100
    if ((intTempOne < 0 && intTempTwo > 100) || (intTempOne > 100) && (intTempTwo < 0)) {
      System.out.println(true);
    }
    else {
      System.out.println(false);
    }
  }
}