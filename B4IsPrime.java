class B4IsPrime extends ConsoleProgram {

  /**
  * Check if a number is prime or composite
  * @author: C. Chen
  */
  
  public void run() {
    
    // Declare variables
    int intNum;
    int intCounter;
    int intDivisor;

    // Get integer from user
    intNum = readInt("Enter an integer: ");

    // Set initial values
    intCounter = 0;
    intDivisor = 2;
    
    // Case #1: 0 and 1 not prime numbers
    if (intNum == 0 || intNum == 1) {
      System.out.println(intNum + " is neither prime nor composite.");
    }
    
    // Loop through all divisors between 2 and intNum
    while (intCounter == 0 && intDivisor <= intNum/2) {
      // Checks if intNum is divisible by any intDivisor
      if (intNum % intDivisor == 0) {
        intCounter++;
        System.out.println(intNum + " is a composite number.");
      }
      
      // Increase divisor to check next number
      intDivisor++;
    }
    
    // If no divisors and not equal to 0 or 1, output prime number
    if (intCounter == 0 && intNum != 0 && intNum != 1) {
      System.out.println(intNum + " is a prime number.");
    }
  }
}
