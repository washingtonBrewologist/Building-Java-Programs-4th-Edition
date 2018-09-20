/*
* Again we modify our numbersLines program to produce the following output:
* 
*       999999999888888887777777666666555554444333221
*       999999999888888887777777666666555554444333221
*       999999999888888887777777666666555554444333221
*       999999999888888887777777666666555554444333221
* */

public class Chapter2_ModifiedAgain {
    public static void main(String[] args){

        for (int lines = 1; lines <= 4; lines++){
            for (int nums = 9; nums >= 1; nums--){
                for (int count = 1; count <= nums; count++)
                    System.out.print(nums);
            }
            System.out.println();
        }
    }
}
