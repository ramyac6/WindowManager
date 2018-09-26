import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.util.Random;


public class Window implements Comparable<Window>{
    private int x;
    private int y;
    private int w;
    private int h;
    private Color myColor;
    private int zOrder = 1;

    //Window Constructor
    public Window(){
        Random rand = new Random();
        //801+100 is max, 100 is min
        this.x = rand.nextInt(801)+100;
        this.y = rand.nextInt(501)+100;
        this.w = 500;
        this.h = 500;
        this.myColor = new Color(rand.nextInt(255)+1, rand.nextInt(255)+1, rand.nextInt(255)+1); // Color white
    }

    @Override
    //returns higher zOrder
    public int compareTo(Window w){
        return Integer.compare(w.zOrder,this.zOrder);
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

    public void setZOrder(int newZOrder){
        this.zOrder = newZOrder;
    }

    public void drawWindow (Graphics g) {
        g.setColor(this.myColor);
        g.fillRect(this.x, this.y, this.h, this.w);
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString(""+this.zOrder,this.x+10,this.y+30);
    }
}
