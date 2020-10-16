package ShapeProject;

import TurtleGraphics.Pen;

public class rect extends Shape {

    private double w, h;

    public rect() {
        super();
        w = 10;
        h = 10;

    }

    public rect(double xpos, double ypos, double height, double width) {
        super(xpos, ypos);
        w = width;
        h = height;
    }

    @Override
    public double area() {
        return w * h;

    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(x, y);
        p.down();
        p.setDirection(0);
        p.move(w);
        p.turn(-90);
        p.move(h);
        p.turn(-90);
        p.move(w);
        p.turn(-90);
        p.move(h);

    }

    public double getarea() {
        return w * h;
    }

    @Override
    public void stetchBy(double factor) {
        w = w * factor;
        h = h * factor;

    }
    public double perimeter(){
        double p = (w*2)+(h*2);
        return p;
    
    
    
    }

    public String toString() {
        String str = "Rectangle \n";
        str += "Width: "+w+" Height: "+h +"\n";
        str+= "Area: "+area()+" \n";
        str+= "Perimeter:" +perimeter()+" \n";
        str += super.toString();
        return str;
    }

}
