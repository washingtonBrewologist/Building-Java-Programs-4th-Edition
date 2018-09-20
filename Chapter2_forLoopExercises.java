/*
 NumberPyramid():          numberStaircase():
1                                   1
22                                 2
333                               3
4444                             4
55555                           5
666666
7777777

reversedNumberStaircase();
     1
    22
   333
  4444
 55555
*/ 




public static void main(String[] args) {
        numberPyramid();
        System.out.println();
        numberStaircase();
        System.out.println();
        reversedNumberStaircase();
    }
    public static void numberPyramid()
    {
        for(int line = 1; line <= 7; line++)
        {
            for (int col = 1; col <= line; col++)
            {
             System.out.print(line);
            }
            System.out.println();
        }
    }
    public static void numberStaircase()
    {
        for(int line = 1; line <= 5; line++)
        {
            for(int space=1; space <= 5-line; space++)
            {
                System.out.print(" ");
            }
            System.out.println(line);
        }
    }
    public static void reversedNumberStaircase()
    {
        for (int line = 1; line <= 5; line++){
            for (int space = 5 - line; space >=0; space--)
                System.out.print(" ");
            for (int col = 1; col <= line; col++)
                System.out.print(line);
            System.out.println();
        }
    }
