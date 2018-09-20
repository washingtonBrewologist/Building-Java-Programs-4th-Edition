/*
* Desired output:
*       -----1-----
*       ----333----
*       ---55555---
*       --7777777--
*       -999999999-
* 
* 
* */

public class Chapter2_dashesPyramid {
    public static void main(String[] args){
        // this for loop sets i to 1 and skips 2 lines for each iteration
        for (int lines = 1; lines <= 9; lines+=2){
            // the inner loop will print 11 - lines / 2 dashes
            // so 11 - 1 / 2 = 5 dashes and so forth
            for (int j = 0; j < (11-lines) / 2; j++)
                System.out.print("-");
            // prints the number after first set of dashes
            for (int j = 0; j < lines; j++)
                System.out.print(lines);
            // prints the last set of dashes
            for (int j = 0; j < (11-lines) / 2; j++)
                System.out.print("-");
            System.out.println();
        }


    }
}
