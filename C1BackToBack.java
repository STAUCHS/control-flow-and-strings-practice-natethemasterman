class C1BackToBack extends ConsoleProgram {

  /**
  * Adds the last character of a string to the front and back
  * @author: C. Chen
  */
  
  public void run() {
    
    // Declare variables
    String strWord;
    String strLastChar;
    String strNewWord;

    // Get word from user
    strWord = readLine("Enter a word: ");

    // Get the last character of the word
    strLastChar = strWord.substring(strWord.length() - 1);

    // Add the last character to the front and back
    strNewWord = strLastChar + strWord + strLastChar;

    // Output new word
    System.out.println(strNewWord);
  }
}
