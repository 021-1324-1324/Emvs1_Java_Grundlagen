import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Solve the following exercises __only__ with do-while-loops.
        // Separate exercises 'for' will follow.
        // Exercise 01-06 are similar to the while-exercises, just with a do-while instead of a while-loop.
        // Exercise 07 and 08 are new exercises.
        //--------------------------------------------------------------------------------------------------------------


//--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      int iteratorEx1 = 0;
        //
        //      do {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //      while (iteratorEx1 < 10);
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is?
        //      2. Why does this behavior occur?
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9
        //      4. Extra: What happens, if the initial value of "iteratorEx1" would be set to 100 instead of 0?


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");

        // 02. Using do-while loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100 X
        //      02-02. 42 to 100
        //      02-03. 42 to 123
        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
        //      02-06. -10 to 20
        //      02-07. 35 to 0 (descending)
        //      02-08. 15 to -20 (descending)
        //      02-09. Even numbers from 10 to -10 (descending)
        //      02-10. Odd numbers from 10 to -10 (descending)
        int exercise02Num1 = 0;
        do{
            System.out.println("i:" + exercise02Num1);
            exercise02Num1++;
        }while (exercise02Num1 <=100);
        //...

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int exercise03Num1 = 0;
        int whileSum_03 = 0;

        do {
            whileSum_03 += exercise03Num1;
            exercise03Num1++;
        } while (exercise03Num1 <= 100);


        // Your code here

        System.out.println(whileSum_03); // Should be 5050


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_04 = 0;
        int exercise04Num1 = 0;

        do{
            whileSum_04 += exercise04Num1;
            exercise04Num1++;
            exercise04Num1++;
        } while (exercise04Num1 <= 100);
        // Your code here

        System.out.println(whileSum_04); // Should be 2550


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_05 = 0;
        int exercise05Num1 = 1;
        // Your code here
        do {
            whileSum_05 += exercise05Num1;
            exercise05Num1++;
            exercise05Num1++;
        } while (exercise05Num1 <= 100);
        System.out.println(whileSum_05); // Should be 2500


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.  Generate random numbers between 0 and 100 (inclusive) until you get 22.
        //      Count and report how many attempts it took to generate 22.

        // Creating an object of type Random, calling it randomGenerator.
        // Check the import at the very beginning of this file. This import is needed to make this work
        Random randomGenerator = new Random();

        // Declaring an integer
        int randomNumber;

        // Setting the value of the integer to a random number between 0 (inclusive) and 101 (exclusive)
        randomNumber = randomGenerator.nextInt(0,101);
        long iterationSteps = 0;

        // Implement a do-while loop that:
        // 1. Generates a random number
        // 2. Increments the iteration count
        // 3. Stops when 22 is generated
        do {
            System.out.println(randomNumber);
            randomNumber = randomGenerator.nextInt(0,101);
            iterationSteps++;
        } while (randomNumber != 22);
        // Your code here

        System.out.println("The program ran " + iterationSteps + " times until the number was found!");


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 07");
        // 07.  Generate random numbers between 0 and 100 (inclusive) until you get a match with the firstRandomNumber.
        //      Use a do-while loop, initializing the second random number inside the loop.
        //      Count and report how many attempts it took to generate a matching number.

        // We can use the random generator from exercise 06. So the following line is not needed:
        // Random randomGenerator = new Random();


        System.out.println("Exercise 07");


        int firstRandomNumber = randomGenerator.nextInt(0, 101);


        int secondRandomNumber;
        iterationSteps = 0;

        do {
            secondRandomNumber = randomGenerator.nextInt(0, 101);
            iterationSteps++;
        } while (secondRandomNumber != firstRandomNumber);

        System.out.println("The program ran " + iterationSteps + " times until both random numbers matched.");
        System.out.println("The matching number was: " + firstRandomNumber);


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 08");
        // 08.  Generate a random number between 0 and 10 (inclusive).
        //      Use a do-while loop to repeatedly ask the user to guess the number.
        //      Continue asking until the user correctly guesses the random number.
        //      Once guessed correctly, congratulate the user and reveal the number.

        // We can use the random generator from exercise 06/07. So the following line is not needed:
        // Random randomGenerator = new Random();

        int rndNumberToGuess = randomGenerator.nextInt(0, 11);


        Scanner input = new Scanner(System.in);
        int userGuess;

        do {
            System.out.print("Rate Zahl zwischen 0 und 10: ");
            userGuess = input.nextInt();

            if (userGuess != rndNumberToGuess) {
                System.out.println("Falsc versuch es nochmal!");
            }
        } while (userGuess != rndNumberToGuess);

        System.out.println(" richtige Zahl : " + rndNumberToGuess);
    }
}