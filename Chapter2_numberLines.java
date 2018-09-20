/*
 * The goal here is to produce the following output using for loops:
 * Output:      000111222333444555666777888999
 *              000111222333444555666777888999
 *              000111222333444555666777888999
 *
 *
 */
public class tripleNumbersLoop {
    public static void main(String[] args){
        for (int lines = 1; lines <= 3; lines++){
            for (int nums = 0; nums <= 9; nums++){
                for (int count = 1; count <= 3; count++)
                    System.out.print(nums);
            }
            System.out.println();
        }
    }

}
