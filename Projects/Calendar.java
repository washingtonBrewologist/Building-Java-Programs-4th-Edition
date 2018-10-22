import java.util.*;
public class Assignment1 {
    private static final int SIZE = 7;
    public static void main(String[] args){

        // Handles our user input and displays required date
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a date:(mm/dd) ");
        String date = console.next();
        int month = monthFromDate(date);
        int day = dayFromDate(date);
        printMonth(month);
        displayDate(month, day);
        // Display Current month Calendar
        Calendar currentCalendar = Calendar.getInstance();
        month = currentCalendar.get(Calendar.MONTH)+1;
        day = currentCalendar.get(Calendar.DATE);
        System.out.println("\nThis month: ");
        printMonth(month);
        displayDate(month, day);

    }
    public static void printMonth(int month){
        int placeMonth = SIZE * 3;
        for (int space = 1; space <= placeMonth; space++){
            printSpaces(1);
        }
        // display month
        System.out.println(month);
        System.out.println(" ____   ___ _      ____ ____  ____|  ___   ____       ");
        System.out.println("|      /__ \\ |    |____|    ||    | /__ \\ |    \\      ");
        System.out.println("|____ /     \\|____|____|    ||__ _|/     \\|          ");

        for (int row = 1; row <= 5; row++){
            printRow(row);
        }
        for (int i = 1; i <= SIZE * 7; i++){
            System.out.print("_");
        }

    }
    public static void printRow(int row){
        for (int top = 1; top <= SIZE * 7; top++){
            System.out.print("_");
        }
        System.out.println();
        System.out.print("|");
        int printDayNum;
            for (int cell = 1; cell <= 7; cell++){
                printDayNum = (row - 1) * 7 + cell;
                System.out.print(printDayNum);
                int countDigits = 0;
                for (int test = printDayNum; test > 0; test/=10) {
                    countDigits++;
                }
                    for (int i = 1; i <= (SIZE - 1) - countDigits; i++) {
                        printSpaces(1);
                    }
                System.out.print("|");

            }
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

        public static void displayDate(int month, int day){
            System.out.println();
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
        }

        public static int monthFromDate(String date){
            date = date.substring(0,2);
            return Integer.parseInt(date);
        }

        public static int dayFromDate(String date){
            date = date.substring(3);
            return Integer.parseInt(date);
        }

    public static void printSpaces(int num){
        for (int i = 1; i <= num; i++){
            System.out.print(" ");
        }
    }

}

