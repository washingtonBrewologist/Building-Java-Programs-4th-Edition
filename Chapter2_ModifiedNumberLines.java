/*
* The goal here is to modify our previous program(numberLines) to produce
* the following output:
*       99999888887777766666555554444433333222221111100000
*       99999888887777766666555554444433333222221111100000
*       99999888887777766666555554444433333222221111100000
*       99999888887777766666555554444433333222221111100000
*       99999888887777766666555554444433333222221111100000
* */

public class Chapter2_ModifiedNumberLoop {
    public static void main(String[] args) {
        for (int lines = 1; lines <= 5; lines++){
            for (int nums = 9; nums >= 0; nums--){
                for (int count = 1; count <= 5; count++)
                    System.out.print(nums);
            }
            System.out.println();
        }
    }
}
