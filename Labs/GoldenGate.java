/*      ***************************        ASCII Art        ***************************
                                    ******** Lab#2 ********
                            Creators: Nick Williams & Micah Krueger
                               Instructor: Ryan Parsons, CS 140
                                          10/17/2018
                -This program produces a Semi-Scalable ASCII Golden Gate Bridge!
               ( Semi because if you go with a size > 10 it gets a bit too tall! )
*/
 
public class AsciiArt {
    // This our class constant which controls the size of the image.
    private static final int SIZE = 5;
 
    public static void main(String[] args) {
        // Main calls the goldenGate method
        goldenGate();
    }
    // This is the method that controls how the different pieces are displayed in output
    public static void goldenGate(){
        // displays top of tower
        topSection();
        for (int lines = 1; lines <= SIZE; lines++){
            sides();
        }
        // displays bottom of tower
        bottomSection();
        connector();
        for (int lines = 1; lines <= SIZE; lines++){
            sides();
        }
        // another layer to tower
        bottomSection();
        connector();
        for (int lines = 1; lines <= SIZE; lines++){
            sides();
        }
        // finishes with a call to connector and road methods
        connector();
        road();
    }
    // this method produces the top section of the tower
    public static void topSection(){
        System.out.println("  _________  ");
        System.out.println(" | _______ | ");
    }
    // bottom section of the tower
    public static void bottomSection(){
        System.out.println(" | _______ | ");
        System.out.println(" |_________| ");
    }
    // handles Middle connector pieces
    public static void connector(){
        System.out.println(" | _______ |  ");
    }
    // Handles the sides of the tower
    public static void sides(){
        System.out.println(" ||       ||  ");
    }
    // This method handles the road that goes through the tower
    public static void road(){
        System.out.println("  |   :   |  ");
        System.out.println("  |   :   |  ");
    }
 
}
 
