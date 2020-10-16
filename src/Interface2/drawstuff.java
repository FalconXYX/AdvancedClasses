package Interface2;
import TurtleGraphics.*;

import java.util.Scanner;
import java.awt.Color;
public class drawstuff {

    public static void main(String[] args) {
        Shape x = new rect(0, 0, 200, 75);
        Shape y = new circle(50, 50, 100);
        Shape z = new wheel(150, 50, 100, 6);
        Pen p = new StandardPen(new SketchPadWindow(800, 600));
        p.setColor(Color.red);
        p.setWidth(10);
        z.draw(p);
        x.draw(p);
        p.setColor(Color.green);
        y.draw(p);
        Scanner s = new Scanner(System.in);
        System.out.print("Press <enter> to move rectangle to -200,-200");
        s.nextLine();
        p.setColor(Color.white);
        x.draw(p);
        x.move(-200, -200);
        p.setColor(Color.red);
        x.draw(p);
        
        
        
     //   z.move(-211, -211);
        
        

    }

}
