public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Solve the following exercises __only__ with for-loops
        // Exercise 01-05 are similar to the while-exercises, just with a for instead of a while-loop.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      for (int iteratorEx1 = 0; iteratorEx1 < 10; ) {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is?
        //      Only one i:0
        //      2. Why does this behavior occur?
        //      Because it doesn't get bigger
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9
                for (int iteratorEx1 = 0; iteratorEx1 < 10;) {
                    System.out.println("i:" + iteratorEx1 + " ");
                    iteratorEx1++;
                }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using for loops, print each task and its numbers to the console (all numbers inclusive):
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
                for (int Exercise02Num1 = 0; Exercise02Num1 < 101;) {
                    System.out.println(Exercise02Num1);
                    Exercise02Num1++;
                }
        // ...
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int Sum03 = 0;

        // Your code here
                for (int i = 0; i <= 100; i++){
                    Sum03 += i;
                }

        System.out.println(Sum03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.



        // Your code here

        int Sum_04 = 0;

        for (int a = 0; a <= 100; a += 2) {
            Sum_04 += a;
        }





        System.out.println(Sum_04);
        ; // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int Sum_05 = 0;

        for (int b = 1; b <= 100; b += 2) {
            Sum_05 += b;
        }
        // Your code here

        System.out.println(Sum_05); // Should be 2500

    }
}