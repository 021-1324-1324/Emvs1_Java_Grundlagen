public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Print "I am learning Java output and getting to know Strings better" to the console.

        String myJava = "I am learning Java output and getting to know Strings better!";
        System.out.println(myJava);

        //--------------------------------------------------------------------------------------------------------------
        // 2. Now print "String concatenation works!" to the console, but not in one piece.
        //    You need to use the "+" operator, which you can also use in the output itself.

        String myLava= "better!";
        System.out.println("I am learning Java output and getting to know Strings" + " " +  myLava );

        //--------------------------------------------------------------------------------------------------------------
        // 3. Create a variable "firstName" with the appropriate data type and assign your first name to the variable.
        //    Then print this variable to the console.

       String firstName = "Ernis";
        System.out.println("Hello my name is" +  firstName);
        //--------------------------------------------------------------------------------------------------------------
        // 4. Now create another variable.
        //    Name of the variable: lastName.
        //    Value of the variable: Your last name.
        //    Study the code below and complete it so, that the following  output is displayed on the console:
        //
        //    My first name is ...
        //    And my last name is ...
        String lastName = "Bljakaj" ;

        System.out.println("My first name is " +  firstName);
        System.out.println("And my last name is " +  lastName);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Complete the code below so, that it prints the following output:
        //   Berufsfachschule Oberwallis


        String school = "Berufsfachschule";      // Complete this line
        String location = "Oberwallis";           // Complete this line

        String result = school + location;
        System.out.println(result);

        // What is the purpose of " " ?

        // Your answer here
            //For Text because when there are numbers u can't use string.
        //--------------------------------------------------------------------------------------------------------------
        // 6. Declare a variable language with the value "Java" and print "I am learning Java!" using the variable.

        String programmingLanguage= "Java" ;
        System.out.println("I am Learning" +  programmingLanguage);

        //--------------------------------------------------------------------------------------------------------------
        // 7. Print the following lines including
        // one single double quotation marks ("...")
        // and newlines using a single System.out.println:
		
        // I am learning about
        // escape characters.
        // I need to look up
        // "escape characters"
        // to solve this task.

        System.out.println("I am learning about\n"+"I need to look up\n" +"to solve this task.");
    }
}



//    "  mach einen Zeilenabstand    \n"