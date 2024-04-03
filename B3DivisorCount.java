class B3DivisorCount extends ConsoleProgram {

  /**
  * Program that prints all divisors of a number
  * @author: C. Chen
  */
  
  public void run() {
    
    // Declare variables
    int intNum;

    // Get integer from user
    intNum = readInt("Enter an integer: ");

    // Check for divisors between 1 and intNum
    for (int divisor = 1; divisor <= intNum; divisor++) {
      if (intNum % divisor == 0) {
        System.out.println(divisor);
      }
    }
  }
}