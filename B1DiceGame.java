import java.util.Random;

class B1DiceGame extends ConsoleProgram {

  /**
  * Program that simulates rolling 100 pairs of dice
  * @author: N. Moran
  */
  
  public void run() {
    
    // Create random object
    Random diceRoll = new Random();
    
    // Declare variables
    int intDiceOne;
    int intDiceTwo;
    
    // Generate 100 pairs of dice rolls
    for (int counter = 0; counter < 100; counter++) {  
      intDiceOne = diceRoll.nextInt(1, 6);
      intDiceTwo = diceRoll.nextInt(1, 6);
      
      // Check if pair adds to 2
      if ((intDiceOne + intDiceTwo) == 2) {
        System.out.println("snake eyes!");
      }
      
      // Check if pair adds to 7
      else if ((intDiceOne + intDiceTwo) == 7) {
        System.out.println("lucky seven");
      }
    }
  }
}

