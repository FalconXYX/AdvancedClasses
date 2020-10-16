package ShapeProject;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;

public class Tester {

    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(800, 600));
        Shape a = new wheel();
        Shape b = new rect();
        circle c = new wheel();
        wheel w = new wheel(50, 50, 150, 50);
        w.draw(p);
        p.setColor(Color.white);
        w.draw(p);
       Shape l = makeOneShapeFromAnother(w, 2);
       p.setColor(Color.red);
       l.draw(p);
        
        

    }

    public static Shape makeOneShapeFromAnother(Shape inShape, int type){
     Shape outShape; if(type ==1){ double area = inShape.area();
        return new rect(inShape.getX(), inShape.getY(), Math.sqrt(area), Math.sqrt(area));
    }
    else if(type ==2){ double area = inShape.area();
        double rad = Math.sqrt(area / Math.PI);
        return new circle(inShape.getX(), inShape.getY(), rad);
    }

    
        else { double area = inShape.area();
        double rad = Math.sqrt(area / Math.PI);
        return new wheel(inShape.getX(), inShape.getY(), rad, 5);
    }}

}
