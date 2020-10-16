package Interface2;

import TurtleGraphics.*;
import java.awt.Color;

public class drawstuff2 {

    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(800, 600));
        p.setColor(Color.red);
        Shape shapes[] = new Shape[10];
        for (int i = 0; i < 10; i++) {
            shapes[i] = getrand();
            shapes[i].draw(p);
            
        }

    }

    public static Shape getrand() {
        Shape s;
        int rx, ry, rr, rw, rh, rshape;
        rx = (int) (Math.random() * 600 - 300);
        ry = (int) (Math.random() * 600 - 300);
        rw = (int) (Math.random() * 200 + 33);
        rh = (int) (Math.random() * 200 + 33);
        rr = (int) (Math.random() * 200 + 33);
        rshape = (int) (Math.random() * 3 + 1);
        if (rshape == 1) {
            s = new rect(rx, ry, rw, rh);
            return s;

        }
        else if(rshape ==2){
            s = new circle(rx,ry,rr);
            return s;
        }
        else{
            s = new wheel(rx,ry,rr, 6);
            return s;
        
        
        }

    }
}
