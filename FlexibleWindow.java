/*
*   Here we want to write a program which produces the following
*   output:
+===+===+       We introduce a class constant to allow for resizing of
|   |   |       the window design!
|   |   |
|   |   |
+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
* 
* */

public class Window {
    public static final int SUB_HEIGHT = 3;
    public static void main(String[] args){
        frame();
        window();
        frame();
        window();
        frame();
    }
    public static void frame(){

        System.out.print("+");
        for (int i = 1; i <= SUB_HEIGHT; i++){
            System.out.print("=");
        }
        System.out.print("+");
        for (int i = 1; i <= SUB_HEIGHT; i++){
            System.out.print("=");
        }
        System.out.print("+");
        System.out.println();
    }
    public static void window() {
        for (int line = 1; line <= SUB_HEIGHT; line++) {
            System.out.print("|");
            for (int i = 1; i <= SUB_HEIGHT; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int i = 1; i <= SUB_HEIGHT; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
