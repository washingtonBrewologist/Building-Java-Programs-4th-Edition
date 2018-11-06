/*          ***************************        Assignment 1        ***************************
 *                                        ******** CS 140 ********
 *                                         Creator: Nick Williams
 *                                        Instructor: Ryan Parsons
 *                                              10/24/2018
 * */
import java.util.*;
public class CalendarReformed {
    // Here we can change the size of the calendar
    private static final int SIZE =  7;
    public static int highlightSelectedDay = -1;
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String userSelection;


        int day = -1;
        int month = -1;

        boolean flag = true;

        while (flag){
            userMenu();
            userSelection = console.nextLine();
            if (userSelection.equalsIgnoreCase("e")){
                message("Please enter a date:(mm/dd) ");
                String date = console.nextLine();
                highlightSelectedDay = day = dayFromDate(date);
                month = monthFromDate(date);
                displayCalendar(month, day);

            } else if (userSelection.equalsIgnoreCase("t")){
                Calendar c = Calendar.getInstance();
                highlightSelectedDay = day = c.get(Calendar.DATE);
                month = c.get(Calendar.MONTH)+1;
                System.out.println("Today's date: " + month +"/"+ day);
                displayCalendar(month,day);
            } else if (userSelection.equalsIgnoreCase("n")){
                if (day != -1 && month != -1){
                    day = 1;
                    highlightSelectedDay = -1;
                    month = grabNextMonth(month);
                    displayCalendar(month,day);
                } else{
                    message("You must have a month selected to go to next month!\n");
                }
            } else if(userSelection.equalsIgnoreCase("p")){
                if (day != -1 && month != -1){
                    day = 1;
                    highlightSelectedDay = -1;
                    month = grabPreviousMonth(month);
                    displayCalendar(month, day);
                } else {
                    message("You must first select a month for previous month to function!\n");
                }
            } else if(userSelection.equalsIgnoreCase("q")){
                message("Now exiting the Calendar program\n");
                message("Have a nice day!");
                flag = false;
            } else {
                message("        *USER ERROR DETECTED*    \n");
                System.out.println("Please make a valid selection from the menu!");
            }
        }

    }


    public static void message(String message){
            System.out.print(message);
    }

    // This method will print the month digit and centers it
    public static void drawMonth(int month, int daysToSkip, int maxDays){
        System.out.println();
        int placeMonth = (SIZE * 3)-4;
        for (int space = 1; space <= placeMonth; space++){
            printSpaces(1);
        }
        String monthHolder;
        if (month == 1){
            monthHolder = "*January*";
        } else if(month == 2){
            monthHolder = "*February*";
        }else if (month == 3){
            monthHolder = "*March*";
        } else if (month == 4){
            monthHolder = "*April*";
        } else if (month == 5){
            monthHolder = "*May*";
        } else if (month == 6){
            monthHolder = "*June*";
        } else if (month == 7){
            monthHolder = "*July*";
        } else if (month == 8){
            monthHolder = "*August*";
        } else if (month == 9){
            monthHolder = "*September*";
        } else if (month == 10){
            monthHolder = "*October*";
        } else if (month == 11){
            monthHolder = "*November*";
        } else {
            monthHolder = "*December*";
        }
        System.out.println(monthHolder);

        drawArt();
            int start = 1;
            while (start <= maxDays) {
                if (start == 1) {
                    drawRow(start, maxDays, daysToSkip);
                    start += 7 - daysToSkip;
                } else {
                    drawRow(start, maxDays, 0);
                    start += 7;
                }
            }


        // Displays the top of the calendar border
        for (int i = 1; i <= SIZE * 7; i++){
            System.out.print("_");
        }
    }

    // This method prints one row of our calendar and applies our | dividers
    public static void drawRow(int start,int maxDays, int skip){
            for (int top = 1; top <= SIZE * 7; top++){
                System.out.print("_");
            }
            System.out.println();

            int printDayNum = start;
            String dayTool;

            System.out.print("|");
        for (int i = 1; i <= 7; i++) {
            dayTool = "";
            if (i > skip && printDayNum <= maxDays) {
                if (highlightSelectedDay == printDayNum) {
                    dayTool += " ->" + printDayNum++ + "*";
                } else {
                    dayTool += printDayNum++;
                }
            }
            while (dayTool.length() < SIZE - 1){
                dayTool += " ";
        }
                dayTool += "|";
            System.out.print(dayTool);
        }
        int height = SIZE /2;
        for (int h = 2; h <= height; h++){
            System.out.print("\n|");
            for (int cell = 1; cell <= 7; cell++){
                dayTool = "";
                while (dayTool.length() < SIZE -1) {
                    dayTool += " ";
                }
                dayTool+="|";
                System.out.print(dayTool);
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
        int index = date.indexOf("/");
        String month = date.substring(0,index);
        return Integer.parseInt(month);
    }

    // This method grabs the date which is always after the first two spots of the user date String Returns an int
    public static int dayFromDate(String date){
        int index = date.indexOf("/");
        String day = date.substring(index + 1);
        return Integer.parseInt(day);
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

    public static void displayCalendar(int month, int day) {
        int startDay = getStartingDay(month);
        int maxDaysInMonth = getMaxDays(month);
        drawMonth(month, startDay, maxDaysInMonth);
        displayDate(month,day);
    }

    public static int getStartingDay(int month){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, 1);
        c.set(Calendar.MONTH, month - 1);
        return c.get(Calendar.DAY_OF_WEEK)-1;
    }

        public static int getMaxDays(int month){
        int numberOfDays;
        if (month == 4 || month == 6 || month == 9 || month == 11){
            numberOfDays = 30;
        } else if (month == 2){
            numberOfDays = 29;
        } else
            numberOfDays = 31;
        return numberOfDays;
    }

    public static int grabNextMonth(int currentMonth) {
        if (currentMonth == 12) // if current month is december
        {
            return 1; // lets give the user January
        } else
            return currentMonth + 1; // rest of the time just display the next month
    }
    public static int grabPreviousMonth(int currentMonth){
        if (currentMonth == 1){
            return 12;
        } else
            return currentMonth - 1;
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

    public static void userMenu(){
        System.out.println("Please enter a command: ");
        System.out.println("\t\t[\"e\"] to enter a date and display it");
        System.out.println("\t\t[\"t\"] to get today's date and display the corresponding calendar");
        System.out.println("\t\t[\"n\"] to display the next month");
        System.out.println("\t\t[\"p\"] to display the previous month");
        System.out.println("\t\t[\"q\"] to quit the program");
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
