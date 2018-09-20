/*
* Desired output:
!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!//////
\\\\\\\\!!!!!!////////
\\\\\\\\\\!!//////////

Thought Table: 
Line:    Bangs:         \:        /:
1            22          0         0  
2            18          2         2
3            14          4         4
4            10          6         6
5             6          8         8
6             2          10        10

Bangs = 26-4 * line
\ = -2 + 2 * line
/ = -2 + 2 * line

* */

public class SlashFigure {
    public static void main(String[] args){
        for (int line =1; line<= 6; line++){
            for (int backSlash = 0; backSlash < -2+2*line; backSlash++)
                System.out.print("\\");
            for (int bang = 0; bang < 26-4*line; bang++)
                System.out.print("!");
            for (int forwardSlash = 0; forwardSlash < -2+2*line; forwardSlash++)
                System.out.print("/");
            System.out.println();
        }
    }

}
