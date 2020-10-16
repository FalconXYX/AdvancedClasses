
package Interface2;

import TurtleGraphics.Pen;


public class circle implements Shape {
    protected double x,y,r;//protected lets the child classes use this
    public circle(){
        x= 0;
        y= 0;
        r= 10;
        
    }
    public circle(double xpos, double ypos, double raduis){
        r = raduis;
        x = xpos;
        y = ypos;
    
    
    }

    @Override
    public double area() {
        return Math.PI *r*r;
        
    }

    @Override
    public void draw(Pen p) {
        double side = 2*Math.PI*r/120;
        p.up();
        p.move(x,y);
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
    public double getX() {
        return x;
        
        
    }

    @Override
    public double getY() {
        return y;
        
        
    }

    @Override
    public void move(double xpos, double ypos) {
        x = xpos;
        y = ypos;
        
    }

    @Override
    public void stetchBy(double factor) {
        r = r*factor;
        
    }
    public String toString(){
        String str = "Circle/n";
        str+= ""+r+"\n"+x+"\n"+y;
        return str;
    }
    
}
