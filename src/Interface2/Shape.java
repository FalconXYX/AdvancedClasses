
package Interface2;

import TurtleGraphics.Pen;


public interface Shape {
    public double area();
    public void draw(Pen p);
    public double getX();
    public double getY();
    public void move(double xpos, double ypos);
    public void stetchBy(double factor);
    public String toString();
    
}
