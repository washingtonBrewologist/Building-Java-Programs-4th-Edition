// Write a nested for loop that produces the following output (Each line 40 chars long):
//   ----------------------------------------
//   _-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
//   1122334455667788990011223344556677889900

public class Chapter2Exercises {
    public static void main(String[] args){
        waveLoopDesign();
    }
    public static void waveLoopDesign() {
        for (int i = 0; i < 40; i++)
            System.out.print("-");
        System.out.println();

        for (int i = 0; i < 10; i++)
            System.out.print("_-^-");
        System.out.println();

        for (int j = 0; j < 2; j++){
            for (int i = 1; i <=10; i++){
                System.out.print(i%10);
                System.out.print(i%10);
            }
        }
        System.out.println();

    }
    }
