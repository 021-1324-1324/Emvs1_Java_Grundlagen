import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Do this exercises __only__ with while-loops
        // Separate exercises for 'do-while' and 'for' will follow.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      int iteratorEx1 = 0;
        //      while (iteratorEx1 < 10) {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is?
        //      It will repeat infinitly.
        //      2. Why does this behavior occur?
        //      Because there is no counter++
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9

        int iteratorEx1 = 0;
        while (iteratorEx1 < 10) {
            System.out.println("iteratorEx1:" + iteratorEx1 + " ");
            iteratorEx1++;
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using while loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100
        //      02-02. 42 to 100
        //      02-03. 42 to 123
        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
        //      02-06. -10 to 20
        //      02-07. 35 to 0 (descending)
        //      02-08. 15 to -20 (descending)
        //      02-09. Even numbers from 10 to -10 (descending)
        //      02-10. Odd numbers from 10 to -10 (descending)
        int exerciseNum10 = 9;
        int exerciseNum9 = 10;
        int exerciseNum8 = 15;
        int exerciseNum7 = 35;
        int exerciseNum6 = -10;
        int exerciseNum5 = 1;
        int exerciseNum4 = 0;
        int exerciseNum3 = 42;
        int exerciseNum2 = 42;
        int exerciseNum1 = 0;
        while (exerciseNum1 <= 100) {
            System.out.println(exerciseNum1);
            exerciseNum1++;
        }
        while (exerciseNum2 <= 100) {
            System.out.println(exerciseNum2);
            exerciseNum2++;
        }
        while (exerciseNum3 <= 123) {
            System.out.println(exerciseNum3);
            exerciseNum3++;
        }
        while (exerciseNum4 <= 10) {
            System.out.println(exerciseNum4);
            exerciseNum4++;
            exerciseNum4++;
        }
        while (exerciseNum5 <= 10) {
            System.out.println(exerciseNum5);
            exerciseNum5++;
            exerciseNum5++;
        }
        while (exerciseNum6 <= 20){
            System.out.println(exerciseNum6);
            exerciseNum6++;
        }
        while (exerciseNum7 >= 0){
            System.out.println(exerciseNum7);
            exerciseNum7--;
        }
        while (exerciseNum8 >= -20){
            System.out.println(exerciseNum8);
            exerciseNum8--;
        }
        while (exerciseNum9 >= -20){
            System.out.println(exerciseNum9);
            exerciseNum9--;
            exerciseNum9--;
        }
        while (exerciseNum10 >= -20){
            System.out.println(exerciseNum10);
            exerciseNum10--;
            exerciseNum10--;
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_03 = 0;
        int i = 0;

        // Your code here
        while (i <= 100){
            whileSum_03 += i;
            i++;

        }
        // 1
        // whileSum = 0
        // i = 1

        // 2
        // whileSum = 1
        // i = 2

        // 3
        // whileSum = 3
        // i = 3

        // 4
        // whileSum= 6
        // i = 4



        System.out.println(whileSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.
        int whileSum_04 = 0;
        int exercise04 = 0;

        // Your code here
        while (exercise04 <= 100){
            whileSum_04 += exercise04;
            exercise04++;
            exercise04++;

        }
        System.out.println(whileSum_04);

        // Your code here
        // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.


        int whileSum_05 = 0;
        int exercise05 = 1;

        // Your code here
        while (exercise05 <= 100){
            whileSum_05 += exercise05;
            exercise05++;
            exercise05++;

        }
        System.out.println(whileSum_05);

        // Your code here

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
        while (randomNumber != 22){
            System.out.println(randomNumber);
            iterationSteps++;
            randomNumber = randomGenerator.nextInt(0,101);
        }

        // Implement a while loop that:
        // 1. Generates a random number
        // 2. Increments the iteration count
        // 3. Stops when 22 is generated

        // Your code here

        System.out.println("The program ran " + iterationSteps + " times until the number was found!");
    }
}