/*
Generate the following output using nested for loops:

     /**\    
    //**\\   
   ///**\\\  
  ////**\\\\ 
 /////**\\\\\
+*=*=*=*=*=*=+
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
+*=*=*=*=*=*=+
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
+*=*=*=*=*=*=+
     /**\    
    //**\\   
   ///**\\\  
  ////**\\\\ 
 /////**\\\\\

*/

public class Ch2_Projects_RocketShip {

    public static void main(String[] args){
        topAndBottom();
        border();
        topHalf();
        bottomHalf();
        border();
        bottomHalf();
        topHalf();
        border();
        topAndBottom();
    }
    public static void topAndBottom(){
        for (int line = 1; line<= 5; line++){
            for (int space = 1; space<= (6-line); space++){
                System.out.print(" ");
            }
            for (int i = 1; i <= (line - 1) +1; i++){
                System.out.print("/");
            }
            System.out.print("**");
            for (int i = 1; i<= (line - 1)+1; i++){
                System.out.print("\\");
            }
            for (int space = 1; space<= (5-line); space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void border(){

        System.out.print("+");
        for (int i = 1; i <= 6; i++){
            System.out.print("*=");
        }
        System.out.println("+");

    }
    public static void topHalf(){
        for (int line =1; line<= 3; line++){
            System.out.print("|");
            for (int i = 1; i <= 3 - line; i++){
                System.out.print(".");
            }
            for (int i = 1; i <= (line - 1) + 1; i++){
                System.out.print("/\\");
            }
            for (int i = 1; i<= 6-2 * line; i++){
                System.out.print(".");
            }
            for (int i = 1; i <= (line - 1) + 1; i++){
                System.out.print("/\\");
            }
            for (int i = 1; i<= 3 - line; i++){
                System.out.print(".");
            }
            System.out.println("|");
        }
    }
    public static void bottomHalf(){
        for (int line = 1; line<= 3; line++){
            System.out.print("|");
            for (int i = 1; i <= (line -1); i++){
                System.out.print(".");
            }
            for (int i = 1; i <= 4 - line; i++){
                System.out.print("\\/");
            }
            for (int i = 1; i <= (-2 + line) + line; i++){
                System.out.print(".");
            }
            for (int i = 1; i<= 4 - line; i++){
                System.out.print("\\/");
            }
            for (int i = 1; i<= (line - 1); i++){
                System.out.print(".");
            }
            System.out.println("|");
        }
    }
}
