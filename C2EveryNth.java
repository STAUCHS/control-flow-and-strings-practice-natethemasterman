class C2EveryNth extends ConsoleProgram {

  /**
  * Program that prints out a string made with character 0 and then every Nth char of the string.
  * @author: N. Moran
  */
  
  public void run() {
    
    // Declare variables
    String strWord;    
    String strNewWord;
    int intNthChar;
    int intLength;
    
    // Get word from user
    strWord = readLine("Enter a word: ");
    intNthChar = readInt("Enter an integer: ");

    // Initialize varaibles
    intLength = strWord.length();
    strNewWord = "";

    for (int i = 0; i <= intLength; i += intNthChar) {
      strNewWord += strWord.charAt(i);
    }

    System.out.println(strNewWord);
  }
}
