//Makes use of the DrawingPanel.java class file available online!


import java.awt.*;
public class Cafe {
    public static final int MORTAR =2;
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(650,400);
        Graphics g = panel.getGraphics();
        panel.setBackground(Color.GRAY);
        cafeIllusion(g);
    }

    public static void drawPair(Graphics g, int x, int y, int sizeOfBox){
        g.setColor(Color.BLACK);
        g.fillRect(x,y,sizeOfBox,sizeOfBox);
        g.setColor(Color.BLUE);
        g.drawLine(x,y, x+sizeOfBox,y+sizeOfBox);
        g.drawLine(x,y+sizeOfBox,x+sizeOfBox,y);
        g.setColor(Color.WHITE);
        g.fillRect(x+sizeOfBox,y,sizeOfBox,sizeOfBox);
    }

    public static void drawRow(Graphics g, int x, int y, int sizeOfBox, int pairs){
        for (int i = 0; i < pairs; i++){
            drawPair(g, x + 2 * sizeOfBox * i, y, sizeOfBox);
        }
    }

    public static void drawGrid(Graphics g, int x, int y, int sizeOfBox, int rowPair, int gridPairs, int offset){
        for (int i = 0; i < rowPair; i++){
            drawRow(g, x,y + 2*sizeOfBox * i, sizeOfBox, gridPairs);
            y+=MORTAR;
            drawRow(g, x + offset, y+2*sizeOfBox * i+sizeOfBox, sizeOfBox, gridPairs);
            y+=MORTAR;
        }
    }

    public static void cafeIllusion(Graphics g){
        drawRow(g,0,0,20,4);
        drawRow(g, 50,70,30,5);
        drawGrid(g, 10,150,25,4,4,0);
        drawGrid(g, 250, 200, 25, 3,3,10);
        drawGrid(g, 425,180,20,5,5,10);
        drawGrid(g,400,20,35,2,2,35);
    }
}
