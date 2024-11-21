import processing.core.PApplet;

public class MySketch extends PApplet {

    public static void main(String[] args) {
        
        PApplet.main("MySketch");
    }

    @Override
    public void settings() {
        size(800, 800);  
    }

    @Override
    public void setup() {
        noStroke();  
        
       
        Point center = new Point(width / 2, height / 2);  
        drawConcentricCircle(center, 200, 5);  
    }

    @Override
    public void draw() {
        noLoop();  
    }

    /**
     * Recursively draws concentric circles
     * 
     * @param center The center of the circles as a Point object
     * @param radius The radius of the current circle
     * @param depth  Depth of recursion
     */
    public void drawConcentricCircle(Point center, float radius, int depth) {
        if (depth == 0) {
            return;  
        }

        
        fill(random(255), random(255), random(255));
        
        
        ellipse((float) center.getX(), (float) center.getY(), radius * 2, radius * 2);

        
        float newRadius = radius * 0.7f;
        
        
        drawConcentricCircle(center, newRadius, depth - 1);  
    }
}

