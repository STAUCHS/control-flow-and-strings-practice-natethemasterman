import java.util.Random;

class B2GuessingGame extends ConsoleProgram {

  /**
  * Guessing game where user guesses number between 1 and 100 until they get it right
  * @author: N. Moran
  */
  
  public void run() {
    
    // Generate random object
    Random randomNum = new Random();

    // Declare variable
    int intAnswer;
    int intGuess;
    int counter;

    // Generate random number
    intAnswer = randomNum.nextInt(1, 100);
    
    // Get initial guess from user
    intGuess = readInt("Guess the number (1-100): ");

    // Starting guess
    counter = 1;

    // Loop until the user guesses 
    while (intAnswer != intGuess && counter < 5) {

      // Check if answer is too high
      if (intGuess > intAnswer) {
        System.out.println("Too high, guess again.");
        intGuess = readInt("Guess the number (1-100): ");
        counter++;
      }
      
      // Check if answer is too low
      else if (intGuess < intAnswer) {
        System.out.println("Too low, guess again.");
        intGuess = readInt("Guess the number (1-100): ");     
        counter++;  
      }

    }
    
    // User does not guess it correct on the 5th try
    if (intAnswer != intGuess && counter == 5) {
      System.out.println("Nice Try");
    }

    // User guess correct
    else if (intAnswer == intGuess) {
      System.out.println("Congratulations!");
    }
  }
}