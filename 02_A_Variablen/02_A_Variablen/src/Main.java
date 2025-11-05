import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // Naming

        // Which are valid variable names and which are not?
        // Try to determine what is valid and what is not without uncommenting the code.
        // If something is not valid, write a comment explaining why it is not valid.

        // Example:
        // int myVariable; // Valid
        // int %myVariable; // Not Valid, starts with a special character.


        // int 1stNumber; valid but not recommended

        // int firstNumber; valid and recommended

        // int tryThisNumber; valid and recommended

        // int _myNumber; valid, not recommended

        // int int; it doesn't work because you can't use two times int

        // int _number_; not valid because it starts with _ and ends with _

        // int i; valid but not recommended

        // int number1; valid but not recommended

        // int .product; not valid because it has a dot at first

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Naming convention

        // Which are recommended variable names and which are not?

        // Example:
        // int myVariable; // recommended
        // int _myVariable; // not recommended, starts with a special character
        // int g; // not recommended, depending on the context, it can make sense. E.g. in the context of gravitational acceleration

        int number1; // recommended
        int speed; // recommended
        int JustANUmber; //almost right some of the word are small and some big
        int justAnotherNumber; //recommended
        int _weather; //not recommended because it starts with _
        int _Id; //not recommended because it starts with _
        int $Money;  //not recommended because it starts with $
        int moneyInTheBankAccount; //recommended
        int aLotOfMoneyOnBankAccount; //recommended
        int circumstanceEarthInKM; //recommended
        int circumstanceEarth_KM; //recommend

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Declaration and initialization of variables

        // Add the appropriate data type before the variable name, so, that it becomes a valid declaration and initialization.
        // (Variable names are in german to not reveal the result)

        float meineGleitKommaZahl = 23.5f;

        byte meineSehrKleineGanzzahl = 50;

        char meinUnicodeZeichen = '\u003D';

        int meineKleineGanzzahl = 200;

        char meinBuchstabe = 'B';

        float meineNegativeGleitkommaZahl = -14.612f;

        double meineGrosseGleitkommaZahl = 50.1234567890123d;

        boolean meinWahrheitswert1 = false;

        int meineNormaleGanzzahl = 50_000;

        long meineGrosseGanzzahl = 123_456_789_012_345L;

        boolean meinWahrheitswert2 = true;




        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Keyword final

        // Based on the variable name/value, decide if the keyword "final" is suitable or not.
        // If it is suitable, apply the recommended naming convention for variables with the "final" keyword.
        // Write -why- you decided to either mark it as final or not.


        int moneyInBankAccount = 100_000;

        final short MY_BIRTHDAY_YEAR = 2001;


        byte amountOfMonths = 12;

        final float GRAVITY_FORCE = 9.81f;

        final byte AMOUNT_OF_MINUTES_PER_HOUR = 60;

        final short AMOUNT_OF_SECONDS_PER_HOUR = 3600;

        final float PI = 3.14159f;

        short amountOfStudents = 167;

        //--------------------------------------------------------------------------------------------------------------
    }
}