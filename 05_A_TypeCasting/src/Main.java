public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Declare variables for all primitive data types except boolean. Initialize them with appropriate values.
        // Perform type casting operations as follows:
        //      a. Start with the smallest range data type.
        //      b. Cast this type to every other type with a larger range.
        //      c. Repeat this process for each data type, always casting to types with larger ranges.
        // For each casting operation:
        //      If the cast is valid (widening conversion), perform the operation.
        //      If the cast is invalid or requires an explicit cast (narrowing conversion), write the code but comment it out.


        // Your code here
        byte     byteValue= 19;
        short    shortValue= 2100;
        char     charValue='A';
        int      intValue= 123_123_123;
        long     longValue= 112_123_123_123L;
        float    floatValue=0.34f;
        double   doubleValue= 0.93123d;

        //widening
        intValue= (int) longValue;
        System.out.println(intValue);

        //widening
        byteValue =  (byte) shortValue;
        System.out.println(byteValue);

        //narrowing
        longValue= intValue;
        System.out.println(longValue);
        //--------------------------------------------------------------------------------------------------------------
        // 2. Now create a long with the value = 1234567890.
        //    Manually cast the long to an int and print it out


        // Your code here
        long a = 1_234_567_890;
        int i =312_312;
        a = i;
        System.out.println(a);
        //--------------------------------------------------------------------------------------------------------------
        // 3. Try to guess what the following code is doing:

        String myNumber = "33";
        int intNumber = 10;

        myNumber += intNumber;

        // Try to guess first what happens, then test it.
        // System.out.println(myNumber);
        // it doesn't work
        // Can you explain what is happening?

  //  Strings can not work together with int or the other groups
        //--------------------------------------------------------------------------------------------------------------
        // 4. Below is a line commented out, because it is throwing an error.
        //    What is the error and why does it happen?
        //    Try to figure out, how you could convert a String-value to an int.
        //    PS: You need to look it up in the internet.
        //    You might want to try following search term: "java string to int"
        //    Check with the System.out.println if you are actually printing an int


        String houseNumberInString = "52";
        // int houseNumber = houseNumberInString;
        // System.out.println(houseNumber);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Write down what could go wrong with your solution above
        // Write down here
        // Strings are for text not for numbers

    }
}