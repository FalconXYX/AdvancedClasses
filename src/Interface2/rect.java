
package Interface2;

import TurtleGraphics.Pen;


public class rect implements Shape {
    private double x,y,w,h;
    public rect(){
        x= 0;
        y= 0;
        w= 10;
        h= 10;
        
    }
    public rect(double xpos, double ypos, double height, double width){
        w = width;
        x = xpos;
        y = ypos;
        h= height;}

    @Override
    public double area() {
        return w*h;
        
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(x,y);
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
        w = w*factor;
        h = h*factor;
        
    }
    public String toString(){
        String str = "Circle/n";
        str+= ""+w+"\n"+h+"\n"+x+"\n"+y;
        return str;
    }
    
}
