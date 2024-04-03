class C3MiddleAbc extends ConsoleProgram {

  /**
  * Check if "abc" appears in the middle of a given string
  * @author: N. Moran
  */
  
  public void run() {
    
    // Declare variables
    String strWord;
    int intLength;
    int intMiddle;

    // Get word from user
    strWord = readLine("Type anything that contains 'abc': ");

    intLength = strWord.length();
    intMiddle = intLength / 2;

    // Case #1: string too short
    if (intLength < 3) {
      System.out.println(false);
    }

    // Case #2: length of string is odd
    else if (intLength % 2 != 0) {
      System.out.println("abc".equals(strWord.substring(intMiddle - 1, intMiddle + 2)));
    }

    // Case #3: length of string is even
    else {
      System.out.println("abc".equals(strWord.substring(intMiddle - 2, intMiddle + 1)) ||
                         "abc".equals(strWord.substring(intMiddle - 1, intMiddle + 2)));
    }
  }
}
