

# Control Flow and Strings Practice


## Instructions

1. Start by coding the solutions for sections A (1 program), B (2 Programs), C (2 Programs), and D (1 Programs).  Be sure to:

  * include a program header
  * name variables appropriately
  * include in-program comments **for clarification**

2. If you want more practice you can go back and code the remaining programs in each section.

## Section A - Selection (Choose 1)


### A1FreezingHot.java

Given two temperatures via user input, output true if one is less than 0 and the other is greater than 100.


#### Sample Run 1


```
120
-1
true
```



#### Sample Run 2


```
-1
120
true
```

#### Sample Run 3

```
2
120
false
```



### A2HasTeen.java

We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values via user input, output true if 1 or more of them are teen.


#### Sample Run 1
```
13
20
10
true
```



#### Sample Run 2


```
20
19
10
true
```


Sample Run 3


```
20
10
3
false
```

### A3Within10.java

Given 2 int values via user input, output whichever value is nearest to the value 10, or output 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


#### Sample Run 1


```
8
13
8
```

#### Sample Run 2


```
13
8
8
```

#### Sample Run 3

```
13
7
0
```



## Section B - Selection & Repetition (Choose 2)


### B1DiceGame.java

Write a program that lets you simulate the rolling of 100 pairs of dice.  For each roll, 



* If the pair adds up to 2, print "snake eyes!"
* If the pair adds up to 7, print "lucky seven"
* if the pair adds up to any other sum, do not print out anything


### B2GuessingGame.java

Write a program GuessingGAME that lets the computer generate a secret number, an integer between 1 and 100, for your friend to guess. If they guess too high, print: "Too high, guess again." If they guess too low, print: "Too low, guess again". If they guess the number, let the program stop and print "Congratulations".  If they've guessed incorrectly after 5 attempts, print "Nice Try".


### B3DivisorCount.java

Write a program DivisorCount that lets you enter an integer and that prints all the divisors of that number. Note that d is a divisor of n if n % d = 0.


### B4IsPrime.java

Write a program that lets you enter an integer, and that will print appropriately "is a prime number" or "is a composite number". A number n is a prime number, if it has no divisors d. A prime number is only be divisible by 1 and itself.


## Section C - Strings (Choose 2)


### C1BackToBack.java

Given a string, take the last character and print a new string with the last character added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.


### C2EveryNth.java


Given a non-empty string and an int N, return the string made starting with character 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

#### Sample Run 1
```
Miracle
2
Mrce
```



#### Sample Run 2
```
abcdefg
2
aceg
```

#### Sample Run 3
```
abcdefg
3
adg
```

### C3MiddleAbc.java

Given a string, does "abc" appear in the middle of the string? To define middle, we'll say that the number of characters to the left and right of the "abc" must differ by at most one.

#### Sample Run 1
```
AAabcBB
true
```

#### Sample Run 2
```
AabcBB
true
```

#### Sample Run 3
```
AabcBBB
false
```



### C4IsSandwich.java

A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or output the empty string "" if there are not two pieces of bread.


#### Sample Run 1
```
breadjambread
jam
```

#### Sample Run 2
```
xxbreadjambreadyy
jam
```

#### Sample Run 3
```
xxbreadyy
```

## Section D - Formatted tables

### D1GramsToPounds.java
Write a program that outputs a formatted table that shows a conversion from grams to pounds from 100 to 1000 grams.  
* The table should display for every 100 grams.
* The pounds values must be calculated.
* The grams column should be formatted to take up 6 spaces
* The pounds column should be formatted to take up 10 spaces.

#### Sample Output
```
 Grams     Pounds
--------------------
   100     0.2205
   200     0.4409
   300     0.6614
   400     0.8819
   500     1.1023
   600     1.3228
   700     1.5433
   800     1.7637
   900     1.9842
  1000     2.2046
```

