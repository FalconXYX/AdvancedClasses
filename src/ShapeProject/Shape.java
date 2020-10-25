package ShapeProject;

import TurtleGraphics.Pen;

public abstract class Shape {

    protected double x, y;

    public Shape() {
        x = 0;
        y = 0;
    }

    public Shape(double xpos, double ypos) {
        x = xpos;
        y = ypos;
    }

    abstract public double area();// an abstract methods is declaed with no code
    abstract public void stetchBy(double factor);
    abstract public void draw(Pen p);
    abstract public double perimeter();

    final public double getX() {
        return x;

    }

    final public double getY() {
        return y;
    }

    public void move(double xpos, double ypos) {
        x = xpos;
        y = ypos;

    }

    

    public String toString(){
        String str = "(x,y) : "+x+","+y;
        return str;
    
    
    }

}
