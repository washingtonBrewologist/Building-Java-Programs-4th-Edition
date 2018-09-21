/*
    Lets build an hour glass using nested for loops, methods, and introduce class constant for flexibility
    Desired output:
+----------+
|\......../|
| \....../ |
|  \..../  |
|   \../   |
|    \/    |
|    /\    |
|   /..\   |
|  /....\  |
| /......\ |
|/........\|
+----------+
|    /\    |
|   /..\   |
|  /....\  |
| /......\ |
|/........\|
|\......../|
| \....../ |
|  \..../  |
|   \../   |
|    \/    |
+----------+
*/

public class HourGlass {
    public static final int SUB_HEIGHT = 5;
    public static void main(String[] args){
        top();
        middleTop();
        middleBottom();
        top();
        middleBottom();
        middleTop();
        top();

    }
    public static void top(){
        System.out.print("+");
        for (int i = 1; i <= (2*SUB_HEIGHT); i++){
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
    }
    public static void middleTop(){
        for (int line = 1; line <= SUB_HEIGHT; line++) {
            System.out.print("|");
            for (int j = 1; j <= (line-1); j++){
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int k = 1; k <= 2*SUB_HEIGHT - 2 * line; k++){
                System.out.print(".");
            }
            System.out.print("/");
            for (int j = 1; j <= line - 1; j++){
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static void middleBottom() {
        for (int line = 1; line <= SUB_HEIGHT; line++) {
            System.out.print("|");
            for (int i = 1; i <= (SUB_HEIGHT - line); i++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 1; i <= 2*(line - 1);i++){
                System.out.print(".");
            }
            System.out.print("\\");
            for (int i = 1; i<= (SUB_HEIGHT-line); i++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
