import java.awt.*;
import java.util.Random;

import static java.awt.font.TextAttribute.FONT;


public class Window {
    private int x;
    private int y;
    private int w;
    private int h;
    private Color myColor;
    private int zOrder = 1;

    public Window(){
        Random rand = new Random();
        this.x = rand.nextInt(801)+100;
        //801+100 is max, 100 is min
        this.y = rand.nextInt(501)+100;
        this.w = 500;
        this.h = 500;
        this.myColor = new Color(rand.nextInt(255)+1, rand.nextInt(255)+1, rand.nextInt(255)+1); // Color white
    }

    public Window(int x, int y, int w,int h){
        Random rand = new Random();
        this.x = x;
        //801+100 is max, 100 is min
        this.y = y;
        this.w = w;
        this.h = h;
        this.myColor = new Color(rand.nextInt(255)+1, rand.nextInt(255)+1, rand.nextInt(255)+1); // Color white
    }

    public void setZOrder(int newZOrder){
        this.zOrder = newZOrder;
    }

    public void comparable(Window w){

    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getW(){
        return this.w;
    }

    public int getH(){
        return this.h;
    }

    public int getZOrder(){
        return this.zOrder;
    }

    public void drawWindow (Graphics g) {
        g.setColor(this.myColor);
        g.fillRect(this.x, this.y, this.h, this.w);
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        //g.drawString(""+this.zOrder,this.x+10,this.y+30);
    }
}
