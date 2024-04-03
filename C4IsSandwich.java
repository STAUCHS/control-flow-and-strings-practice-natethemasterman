class C4IsSandwich extends ConsoleProgram {

  /**
  * Program that prints the substring between the first and last appearance of "bread"
  * @author: N. Moran
  */
  
  public void run() {
    
    // Declare variables
    String strSandwich;
    int intFirstBreadIndex;
    int intSecondBreadIndex;

    // Get sandwich string from user
    strSandwich = readLine("Enter a sandwich: ");

    // Find index of first and second 'bread'
    intFirstBreadIndex = strSandwich.indexOf("bread");
    intSecondBreadIndex = strSandwich.indexOf("bread", intFirstBreadIndex + 1);

    // Case #1: No first and/or second appearance of 'bread'
    if (intFirstBreadIndex == -1 || intSecondBreadIndex == -1) {
      System.out.println("");
    }

    // Case #2: 'bread' appears twice
    else {
      System.out.println(strSandwich.substring(intFirstBreadIndex + 5, intSecondBreadIndex));
    }
  }
}