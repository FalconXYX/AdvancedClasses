
package ShapeProject;

import TurtleGraphics.Pen;

/**
 *
 * @author Parth
 */
public class triangle extends Shape {
    double l;
    double x2, y2, x3, y3;
    public triangle() {
        super();
        l = 10;

    }

    public triangle(double xpos, double ypos,double xpos2, double ypos2,double xpos3, double ypos3 ) {

        super(xpos, ypos);
        
        x2 = xpos2; 
        y2 = ypos2;
        y3 = ypos3;
        x3 = xpos3;
        
        

    }

    

    @Override
    public double area() {
        double a;
        a = Math.abs((x*y2-x2*y)+(x2*y3-x3*y2)+(x3*y-x*y3))/2;
        return a;
    }
    @Override
    public void move(double xpos, double ypos) {
        double changex, changey;
        changex = x-xpos;
        changey = y-ypos;
        
        x = xpos;
        y = ypos;
        x2 += changex;
        x3 += changex;
        y2 += changey;
        y3 += changey;

    }
    @Override
    public void stetchBy(double factor) {
        x2= (x2-x) * factor + x;
        y2= (y2-y) * factor + y;
        x3= (x3-x) * factor + x;
        y3= (y3-y) * factor + y;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(x,y);
        p.down();
        p.move(x2,y2);
        p.move(x3,y3);
        p.move(x,y);
        
        
    }

    @Override
    public double perimeter() {
        double p;
        p = Math.sqrt((x-x2)*(x-x2)+(y-y2)*(y-y2));
        return p;
    }
    public String toString() {
        String str = "Triangle \n";
        str+= "Area: "+area()+" \n";
        str+= "Perimeter:" +perimeter()+" \n";
        str += super.toString();
        return str;
    }
}
