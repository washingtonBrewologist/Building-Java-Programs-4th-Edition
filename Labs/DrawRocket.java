/*      ***************************  Rocket Ship ASCII Art  ***************************
                                     ********Lab#2********
                            Creators: Nick Williams & Micah Krueger
                               Instructor: Ryan Parsons, CS 140
                                          10/17/2018
                        -This program produces a scalable ASCII Rocket Ship!
*/
 
public class DrawRocket {
 
    // This is our class constant which allows for scalability.
    public static final int SUB_HEIGHT = 2;
 
    public static void main(String[] args){
        // Main method is the T.O.C for  the ASCII Rocket Ship.
        topShip();
        middleTop();
        middleBottom();
        bottomShip();
    }
 
    // This method draws the top of the rocket and also acts as the flame on the bottom of the ship
    public static void top_flame(){
        for (int lines = 1; lines <= SUB_HEIGHT * 2 - 1; lines++){
            for (int spaces = 1; spaces <= 2 * SUB_HEIGHT -lines; spaces++){
                System.out.print(" ");
            }
            for (int fSlash = 1; fSlash <= lines; fSlash++){
                System.out.print("/");
            }
            System.out.print("**");
            for (int bSlash = 1; bSlash <= lines; bSlash++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }
 
    // This method draws our ships line connectors
    public static void connectors(){
        System.out.print("+");
        for (int i = 1; i <= SUB_HEIGHT * 2; i++){
            System.out.print("=*");
        }
        System.out.println("+");
    }
 
    // This method grabs the previous two methods and creates the entire top of the ship
    public static void topShip(){
        top_flame();
        connectors();
    }
 
    // This method produces the top half of the top of the rocket ship
    public static void middleTop(){
        for (int lines = 1; lines <=SUB_HEIGHT; lines++){
            System.out.print("|");
            for (int dot = 1; dot <= SUB_HEIGHT-lines; dot++){
                System.out.print(".");
            }
            for (int tri = 1; tri <= lines; tri++){
                System.out.print("/\\");
            }
            for (int moreDots = 1; moreDots <= (SUB_HEIGHT * 2 -lines) - lines; moreDots++){
                System.out.print(".");
            }
            for (int tri = 1; tri <= lines; tri++){
                System.out.print("/\\");
            }
            for (int dot = 1; dot <= SUB_HEIGHT-lines; dot++){
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }
    }
 
    // This method produces the bottom half of the top of the rocket ship
    public static void middleBottom(){
       for (int lines = 1; lines <= SUB_HEIGHT; lines++){
           System.out.print("|");
           for (int dots = 1; dots <= (lines - 1); dots++){
               System.out.print(".");
           }
           for (int flippedTri = 1; flippedTri <= SUB_HEIGHT + 1 - lines; flippedTri++){
               System.out.print("\\/");
           }
           for (int moreDots = 1; moreDots <= (lines - 2) + lines; moreDots++){
               System.out.print(".");
           }
           for (int flippedTri = 1; flippedTri <= SUB_HEIGHT + 1 - lines; flippedTri++){
               System.out.print("\\/");
           }
           for (int dots = 1; dots <= (lines - 1); dots++){
               System.out.print(".");
           }
           System.out.println("|");
       }
    }
 
    // This method uses all the methods we just wrote above and uses them to create the entire bottom section
    public static void bottomShip(){
        connectors();
        middleBottom();
        middleTop();
        connectors();
        top_flame();
    }
}
 
