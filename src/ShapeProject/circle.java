package ShapeProject;

import TurtleGraphics.Pen;

public class circle extends Shape {

    protected double r;//protected lets the child classes use this

    public circle() {
        super();
        r = 10;

    }

    public circle(double xpos, double ypos, double raduis) {

        super(xpos, ypos);
        r = raduis;

    }

    @Override
    public double area() {
        return Math.PI * r * r;

    }
    public double perimeter(){
        double p = (r*2)*Math.PI;
        return p;
    
    
    
    }
    @Override
    public void draw(Pen p) {
        double side = 2 * Math.PI * r / 120;
        p.up();
        p.move(x, y);
        p.setDirection(0);
        p.move(r);
        p.setDirection(90);
        p.down();
        for (int i = 0; i <= 120; i++) {
            p.move(side);
            p.turn(3);

        }

    }

    @Override
    public void stetchBy(double factor) {
        r = r * factor;

    }

    public String toString() {
        String str = "Circle\n";
        str += "Raduis: " + r +"\n";
        str+= "Area: "+area()+"\n";
        str+= "Perimeter: "+perimeter()+" \n";
        str += super.toString();
        return str;
    }

}
