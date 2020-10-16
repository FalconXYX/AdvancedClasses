
package Interface2;

import TurtleGraphics.*;
import java.awt.Color;


public class wheel extends circle{
    private int s;
    public wheel(){
        x = 0;
        y = 0;
        r = 0;
        s = 3;
    }
    public wheel(double xpos, double ypos,double raduis, int spokes){
        super(xpos,ypos,raduis);
        s = spokes;
    }
    public void draw(Pen p){
        super.draw(p);
        for (int i = 1; i <= s; i++) {
            
            p.up();
            p.move(x, y);
            p.down();
            p.setDirection(i*360.0/s);
            p.move(r);
            
        }
    
    }
    public void setspokes(int spokes){
        s = spokes;
    
    }
    public String toString(){
        String str = "Circle/n";
        str += "Spokes: "+s;
        str+= ""+r+"\n"+x+"\n"+y;
        return str;
    }
}
