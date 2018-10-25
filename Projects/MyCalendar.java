// Part one of calendar assignment

/*          ***************************        Assignment 1        ***************************
*                                        ******** CS 140 ********
*                                         Creator: Nick Williams
*                                        Instructor: Ryan Parsons
*                                                10/24/2018
*
*                     - This program prompts the user for a date and displays a scalable
*                     calendar of requested date and also displays the current calendar
*                     month underneath.
*
*
*
* */
import java.util.*;
public class MyCalendar {
    // Here we can change the size of the calendar
    private static final int SIZE =  7;
    public static void main(String[] args){
        // We create a new scanner object and pass it to our grabDateIntro method
        Scanner console = new Scanner(System.in);
        // Prompts the user to enter a date and displays requested date on calendar and displays current calendar
        grabDateIntro(console);
    }

    // This method will print the month digit and centers it
    public static void drawMonth(int month){
        int placeMonth = SIZE * 3;
        for (int space = 1; space <= placeMonth; space++){
            printSpaces(1);
        }
        System.out.println(month);
        // Displays our ascii art!
        drawArt();
        // Displays 5 rows for calendar
        for (int row = 1; row <= 5; row++){
            drawRow(row);
        }
        // Displays the top of the calendar border
        for (int i = 1; i <= SIZE * 7; i++){
            System.out.print("_");
        }
    }

    // This method prints one row of our calendar and applies our | dividers
    public static void drawRow(int row){
        drawTopBorder();
        // We declare the variable which will hold our day digit
        int printDayNum;
        for (int cell = 1; cell <= 7; cell++){
            // formula to get day digits printed correctly for all 5 lines
            printDayNum = (row - 1) * 7 + cell;
            // Displays them
            System.out.print(printDayNum);
            // Here we are testing the print dayNum value to see if we need to adjust for spacing when digit is > 9
            int countDigits = 0;
            for (int test = printDayNum; test > 0; test/=10) {
                countDigits++;
            }
            for (int i = 1; i <= (SIZE - 1) - countDigits; i++) {
                printSpaces(1);
            }
            System.out.print("|");

        }

        // Handles the padding for our cells
        int height = SIZE / 2;
        for (int i = 1; i < height; i++){
            System.out.print("\n|");
            for (int cell = 1; cell <= 7; cell++) {
                printSpaces(SIZE - 1);
                System.out.print("|");
            }
        }
        System.out.println();
    }

    // This method will display month and the day under the calendar
    public static void displayDate(int month, int day){
        System.out.println();
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }

    // This method grabs the month string from the user input and returns it as an integer
    public static int monthFromDate(String date){
        date = date.substring(0,2);
        return Integer.parseInt(date);
    }

    // This method grabs the date which is always after the first two spots of the user date String Returns an int
    public static int dayFromDate(String date){
        date = date.substring(3);
        return Integer.parseInt(date);
    }

    // Will prompt user for date and display Correct calendar
    public static void grabDateIntro(Scanner console){

        //User requested calendar
        System.out.print("Please enter a date:(mm/dd) ");
        String date = console.next();
        // grabs the value we turned into an int from the monthFromDate method and sticks it in month
        int month = monthFromDate(date);
        // same thing is happening here with the dayFromDate method.
        int day = dayFromDate(date);
        drawMonth(month);
        displayDate(month, day);


        // Display Current month Calendar
        Calendar currentCalendar = Calendar.getInstance();
        month = currentCalendar.get(Calendar.MONTH)+1;
        day = currentCalendar.get(Calendar.DATE);
        // Displays above current calendar
        System.out.println("\nThis month: ");
        drawMonth(month);
        displayDate(month, day);
    }

    // Handles the ASCII art above calendar
    public static void pattern(){
        for (int i = 1; i <= 49/6; i++){
            System.out.print("\\ 0 / ");
        }
        System.out.println();
        for (int i = 1; i <=49/6; i++){
            System.out.print("<(.)> ");
        }
        System.out.println();
        for (int i = 1; i <= 49/6; i++){
            System.out.print("/ + \\ ");
        }
        System.out.println();
    }

    // A little more art for top of calendar
    public static void drawArt(){
        System.out.println(" ____   ___ _      ____ ____  ____|  ___   ____       ");
        System.out.println("|      /__ \\ |    |____|    ||    | /__ \\ |    \\      ");
        System.out.println("|____ /     \\|____|____|    ||__ _|/     \\|          ");
        printChars('_',48);
        System.out.println();
        for (int i = 1; i <= 2; i+=2){
            pattern();
        }
    }

    // Draws top border and one part of dividers
    public static void drawTopBorder(){
        for (int top = 1; top <= SIZE * 7; top++){
            System.out.print("_");
        }
        System.out.println();
        System.out.print("|");
    }

    // Method that prints desired chars whenever called
    public static void printChars(char ch, int num){
        for (int i = 1; i <= num; i++){
            System.out.print(ch);
        }
    }

    // Method that can printSpaces when called
    public static void printSpaces(int num){
        for (int i = 1; i <= num; i++){
            System.out.print(" ");
        }
    }

}

