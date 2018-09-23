/*
      Our goal here is to create a structure that looks like the space needle in Seattle using nested for loops:
      Output:
            ||             
            ||             
            ||             
            ||             
         __/||\__         
      __/:::||:::\__      
   __/::::::||::::::\__   
__/:::::::::||:::::::::\__
|""""""""""""""""""""""""|
\_/\/\/\/\/\/\/\/\/\/\/\_/
  \_/\/\/\/\/\/\/\/\/\_/  
    \_/\/\/\/\/\/\/\_/    
      \_/\/\/\/\/\_/      
            ||             
            ||             
            ||             
            ||             
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         __/||\__         
      __/:::||:::\__      
   __/::::::||::::::\__   
__/:::::::::||:::::::::\__
|""""""""""""""""""""""""|
*/

public class Ch2_Projects_SpaceNeedle {

    public static void main(String[] args){

        beams();
        topAndBottomTower();
        bottomTower();
        beams();
        elevatorShaft();
        topAndBottomTower();
    }
    public static void beams(){
        for (int lines = 1; lines<= 4; lines++){
            for (int space = 1; space < 13; space++){
                System.out.print(" ");
            }
            System.out.print("||");
            for (int space = 1; space <= 13; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void topAndBottomTower() {
           for (int lines = 1; lines <= 4; lines++){
               for (int space = 1; space <= 12 - 3 * lines; space++){
                   System.out.print(" ");
               }
               System.out.print("__/");
               for (int colon = 1; colon <= -3+3 * lines; colon++){
                   System.out.print(":");
               }
               System.out.print("||");

               for (int colon = 1; colon <= -3+3 * lines; colon++){
                   System.out.print(":");
               }

               System.out.print("\\__");
               for (int space = 1; space<= 12 - 3 * lines; space++){
                   System.out.print(" ");
               }

               System.out.println();
           }
           System.out.print("|");
           for (int quotes = 1; quotes < 25; quotes++ ){
               System.out.print("\"");
           }
           System.out.println("|");

         }
         public static void bottomTower(){
            for (int lines = 1; lines <= 4; lines++){
                for (int i = 1; i <= -2+2*lines; i++){
                    System.out.print(" ");
                }
                System.out.print("\\_");
                for (int i = 1; i <= 13 - 2 * lines; i++){
                    System.out.print("/\\");
                }
                System.out.print("_/");
                for (int i = 1; i <=-2+2*lines; i++){
                    System.out.print(" ");
                }
                System.out.println();

            }
         }
         public static void elevatorShaft(){

            for (int lines = 1; lines <= 16; lines++){
                for (int spaces = 1; spaces <= 9; spaces++){
                    System.out.print(" ");
                }
                System.out.print("|");
                System.out.print("%%");
                System.out.print("||");
                System.out.print("%%");
                System.out.print("|");
            System.out.println();
            }


         }

    }

