/*
* Our goal is to produce the following output (60 characters wide)
* with nested for loops. Output:
*                  |         |         |         |         |         |
*         123456789012345678901234567890123456789012345678901234567890
* */
public class rotatingListLoops {
    public static void main(String[] args) {
    // first lets create a loops to handle pipes and spaces!
        for (int pipes = 1; pipes <= 6; pipes++){
            for (int spaces = 1; spaces <= 9; spaces++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        // next we handle the numbers: we'll use the modulus operator to help us
        // display the correct digits
        for (int nums = 1; nums <= 60; nums++){
            System.out.print(nums%10);
        }
    }
}
