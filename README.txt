This program named Happy.java is a simple java application that takes a
numeric value from the user and checks to see if it is a happy number. A happy
number is a number that will eventually reach 1 after a series of steps. Those
steps include summing the value of the square of each digit in the number. For
example, 19.
1^2 + 9^ = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1 (Therefore, 19 is a happy number)
If the user enters a letter, the program prints and error message and considers
the value as a zero which is not a happy number. The squareSum function does the
calculation for the main function. After each iteration, the result is added to
an ArrayList called numList. If after an iteration, the result is already
contained in numList, then the number is not a happy number. For example, 2.
2^2 = 4
4^2 = 16
1^2 + 6^2 = 37
3^2 + 7^2 = 58
5^2 + 8^2 = 89
8^2 + 9^2 = 145
1^2 + 4^2 + 5^2 = 42
4^2 + 2^2 = 20
2^2 + 0^2 = 4 (Already in list therefore, 2 is not a happy number)
*******************************
Compile application: javac Happy.java
Run application: java Happy 
