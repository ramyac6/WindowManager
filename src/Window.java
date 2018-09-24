import java.awt.*;
import java.util.Random;


public class Window {
    private static int x;
    private static int y;
    private static int w;
    private static int h;
    private Color myColor;
    public int zOrder;
    public static int total = 0;

    public Window(){
        Random rand = new Random();
        this.x = rand.nextInt(801)+100;
        //801+100 is max, 100 is min
        this.y = rand.nextInt(801)+100;
        this.w = 500;
        this.h = 500;
        this.myColor = new Color(rand.nextInt(255)+1, rand.nextInt(255)+1, rand.nextInt(255)+1); // Color white
        this.zOrder = total;
        total++;
    }

    public Window(int x, int y, int w,int h){
        Random rand = new Random();
        this.x = x;
        //801+100 is max, 100 is min
        this.y = y;
        this.w = w;
        this.h = h;
        this.myColor = new Color(rand.nextInt(255)+1, rand.nextInt(255)+1, rand.nextInt(255)+1); // Color white
        this.zOrder = total;
        total++;
    }

    public int comparable(Window w){
        if (this.zOrder > w.getzOrder()){
            return 1;
        } else if (this.zOrder < w.getzOrder()){
            return -1;
        } else {
            return 0;
        }

    }

    public int getzOrder(){
        return this.zOrder;
    }

    public void drawWindow (Graphics g) {
        g.setColor(this.myColor);
        g.fillRect(this.x, this.y, this.h, this.w);
    }
}
