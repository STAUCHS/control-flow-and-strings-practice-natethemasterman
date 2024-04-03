class A3Within10 extends ConsoleProgram {

  /**
  * Program that takes in two int and outputs the int closer to 10
  * @author: M. Nathan
  */
  
  public void run() {
    
    // Declare variables
    int intNumOne;
    int intNumTwo;
    
    // Get int values from user
    intNumOne = readInt("Enter integer one: ");
    intNumTwo = readInt("Enter integer two: ");

    // Check which number is closer to 10
    if (Math.abs(intNumOne - 10) < Math.abs(intNumTwo - 10)) {
      System.out.println(intNumOne);
    }

    else if (Math.abs(intNumOne - 10) > Math.abs(intNumTwo - 10)) {
      System.out.println(intNumTwo);
    }

    else {
      System.out.println(0);
    }
  }
}
