import java.awt.*;
import java.util.ArrayList;

public class WindowManager {
    private ArrayList<Window> windowList;
    private int oldZOrderBroughtToTop;

    //Constructer, initializes windowlist
    public WindowManager (){
        this.windowList = new ArrayList<>();
    }

    //adds a window to windowlist
    public void addWindow(Window w) {
        this.windowList.add(w);
    }

    //draws all windows in windowlist
    public void drawWindows(Graphics g){
        for (Window w:this.windowList) {
            w.drawWindow(g);
        }
    }

    public void updateZOrders(Window w){
        if (w != null){
            oldZOrderBroughtToTop = w.getZOrder();
            for (int i = 0; i < windowList.size(); i++) {
                if (windowList.get(i).getZOrder() < oldZOrderBroughtToTop){
                    int temp = windowList.get(i).getZOrder();
                    temp++;
                    windowList.get(i).setZOrder(temp);
                }
            }
            w.setZOrder(0);
        }
    }

    //redraws window that is brought to front on top
    public void bringToFront(Graphics g, Window w) {
        //this.drawWindows(g);

        w.drawWindow(g);
    }

    //finds top window at mouse clicked position
    public Window findWindowByPosition(int x, int y){
        ArrayList<Window> atPosition = new ArrayList<>();

        for(Window w:this.windowList){
            if(inWindow(w,x,y)){
                atPosition.add(w);
            }
        }

        if (atPosition.size() > 0) {
            int[] numWindowsAtPosition = new int[atPosition.size()];
            for (int i = 0; i < numWindowsAtPosition.length; i++) {
                numWindowsAtPosition[i] = atPosition.get(i).getZOrder();
            }
            int indexOfWindowAtTop = indexOfTop(numWindowsAtPosition);
            System.out.println(numWindowsAtPosition[indexOfWindowAtTop]);
            return atPosition.get(indexOfWindowAtTop);
        } else {
            return null;
        }
    }

    private int indexOfTop(int[] zOrders) {
        int index = 0;
        int max = 9;
        for (int i = 0; i < zOrders.length; i++) {
            if (zOrders[i] < max) {
                max = zOrders[i];
                index = i;
            }
        }
        return index;
    }

        private boolean inWindow(Window w, int x, int y){
        if(w.getX() <= x && x <= (w.getX() + w.getW()) && w.getY() <= y && y <= (w.getY() + w.getH())) return true;
        return false;
    }


    public ArrayList<Window> getWindows(){
        return this.windowList;
    }

}
