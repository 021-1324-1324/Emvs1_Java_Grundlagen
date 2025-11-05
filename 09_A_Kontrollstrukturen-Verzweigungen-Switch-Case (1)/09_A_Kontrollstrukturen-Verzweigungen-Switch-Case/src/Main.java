import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a number between 1 and 7.
        //     If the number is a 1, then print out Monday.  2 = Tuesday, 3 = Wednesday and so on until 7 = Sunday.
        //     Print "Not a weekday!" if it's not a number between 1-7.
        Scanner userInputNumber = new Scanner(System.in);
        System.out.println("Enter a weekday with numbers 1 = Monday 2 = Tuesday ...");
        byte weekDayNumber = userInputNumber.nextByte();
        switch (weekDayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong number");
                break;

        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a Month (String). Based on the provided month, print out the corresponding season.
        //     Months: January, February, March, April, May, June, July, August, September, October, November, December
        //     Seasons: Winter, Spring, Summer, Autumn
        //     Example:  "January" -> "Winter"
        //     Example: "EMVs" -> "Not a month!";
        //     Write the old switch-statement so, that it only contains 4 breaks.
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Gib einen Monat ein (z. B. Januar):");
        String month = scanner1.nextLine();

        switch (month) {
            case "Dezember":
            case "Januar":
            case "Februar":
                System.out.println("Winter");
                break;

            case "März":
            case "April":
            case "Mai":
                System.out.println("Frühling");
                break;

            case "Juni":
            case "Juli":
            case "August":
                System.out.println("Sommer");
                break;

            case "September":
            case "Oktober":
            case "November":
                System.out.println("Herbst");
                break;

            default:
                System.out.println("Kein gültiger Monat!");
                break;
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Create a program that takes a month number (1-12) and prints the number of days in that month.
        //     Assume it's not a leap year.
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Gib eine Monatszahl ein (1–12):");
        int monthNumber = scanner2.nextInt();

        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Tage");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Tage");
                break;

            case 2:
                System.out.println("28 Tage");
                break;

            default:
                System.out.println("Ungültige Monatszahl!");
                break;
        }



        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Create a basic role-playing game character class selector.
        //      Based on a number input, assign strength, agility, and intelligence values to a character.
        //      Example: "Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): "
        //      User Input: 2
        //      Output: "Mage (Strength: 3, Agility: 4, Intelligence: 9)"
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wähle eine Klasse (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric):");
        int classChoice = scanner.nextInt();

        switch (classChoice) {
            case 1:
                System.out.println("Warrior (Strength: 9, Agility: 5, Intelligence: 2)");
                break;
            case 2:
                System.out.println("Mage (Strength: 3, Agility: 4, Intelligence: 9)");
                break;
            case 3:
                System.out.println("Rogue (Strength: 5, Agility: 9, Intelligence: 4)");
                break;
            case 4:
                System.out.println("Cleric (Strength: 4, Agility: 3, Intelligence: 8)");
                break;
            default:
                System.out.println("Ungültige Auswahl!");
                break;

        }



        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Solve this exercise with whatever switch you feel more comfortable (new or old).
        //      You can use all you know so far to solve this.
        //      Ask the user to translate a digit (0-9) (userInput 1)
        //      in another language (1-german, 2-english, 3-japanese) (user input 2).

        //      Example:
        //      "Which digit do you want to translate?" -> 7
        //      "In which language do you want to translate your digit?" -> 3
        //      Output: nana

        //      Help for japanese Numbers:
        //      0: zero
        //      1: ichi
        //      2: ni
        //      3: san
        //      4: shi
        //      5: go
        //      6: roku
        //      7: nana
        //      8: hachi
        //      9: kyuu
        //      default: Mukō na sūchi
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);

        System.out.println("Which digit do you want to translate? (0–9)");
        byte numberForTranslate = scanner4.nextByte();

        System.out.println("In which language do you want to translate your digit? (1-German, 2-English, 3-Japanese)");
        byte languageForTranslate = scanner5.nextByte();

        if (languageForTranslate == 1) {
            // German
            switch (numberForTranslate) {
                case 0:
                    System.out.println("null");
                    break;
                case 1:
                    System.out.println("eins");
                    break;
                case 2:
                    System.out.println("zwei");
                    break;
                case 3:
                    System.out.println("drei");
                    break;
                case 4:
                    System.out.println("vier");
                    break;
                case 5:
                    System.out.println("fünf");
                    break;
                case 6:
                    System.out.println("sechs");
                    break;
                case 7:
                    System.out.println("sieben");
                    break;
                case 8:
                    System.out.println("acht");
                    break;
                case 9:
                    System.out.println("neun");
                    break;
                default:
                    System.out.println("Ungültige Zahl!");
                    break;
            }
        } else if (languageForTranslate == 2) {
            // English
            switch (numberForTranslate) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("Invalid digit!");
                    break;
            }
        } else if (languageForTranslate == 3) {
            // Japanese
            switch (numberForTranslate) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("ichi");
                    break;
                case 2:
                    System.out.println("ni");
                    break;
                case 3:
                    System.out.println("san");
                    break;
                case 4:
                    System.out.println("shi");
                    break;
                case 5:
                    System.out.println("go");
                    break;
                case 6:
                    System.out.println("roku");
                    break;
                case 7:
                    System.out.println("nana");
                    break;
                case 8:
                    System.out.println("hachi");
                    break;
                case 9:
                    System.out.println("kyuu");
                    break;
                default:
                    System.out.println("Mukō na sūchi");
                    break;
            }
        } else {
            System.out.println("Ungültige Sprachwahl!");
        }






        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.   Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Write a small calculator. A user types in two numbers and an operation ('addition', 'subtraction', 'division', 'multiplication').
        //      Calculate the correct answer and print it out.
        //      Print a warning when the user tries to divide by 0 (Example: 2/0 -> number two must not be 0!
        Scanner scanner6 = new Scanner(System.in);


        System.out.println("Gib die erste Zahl ein:");
        double num1 = scanner6.nextDouble();

        System.out.println("Gib die zweite Zahl ein:");
        double num2 = scanner6.nextDouble();


        System.out.println("Welche Operation möchtest du durchführen? (addition, subtraction, multiplication, division):");
        String operation = scanner6.next();


        switch (operation) {
            case "addition":
                System.out.println("Ergebnis: " + (num1 + num2));
                break;

            case "subtraction":
                System.out.println("Ergebnis: " + (num1 - num2));
                break;

            case "multiplication":
                System.out.println("Ergebnis: " + (num1 * num2));
                break;

            case "division":
                if (num2 == 0) {
                    System.out.println("Warnung: Die zweite Zahl darf nicht 0 sein!");
                } else {
                    System.out.println("Ergebnis: " + (num1 / num2));
                }
                break;

            default:
                System.out.println("Ungültige Operation!");
                break;
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Optional exercises");
        // 01.  Try to come up with a program on your own and the tools you
        //    know so far. Try to implement user input.
    }
}