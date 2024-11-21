import processing.core.PApplet;

/**
 * 
 * 
 * Recursively draws concentric circles
 * 
 * @param center The center of the circles as a Point object
 * @param radius The radius of the current circle
 * @param depth  Depth of recursion
 */
public void DrawConcentricCircle(Point center, float radius, int depth) {
    if (depth == 0) {
        return; 
    }

    
    Circle circle = new Circle(radius, (int) random(255), (int) random(255), (int) random(255), (float) center.getX(), (float) center.getY());
    circle.draw(this); 

    float newRadius = radius * 0.5f; 
    drawConcentricCircle(new Point(center.getX() - newRadius, center.getY()), newRadius, depth - 1); 
    drawConcentricCircle(new Point(center.getX() + newRadius, center.getY()), newRadius, depth - 1); 
    drawConcentricCircle(new Point(center.getX(), center.getY() - newRadius), newRadius, depth - 1); 
    drawConcentricCircle(new Point(center.getX(), center.getY() + newRadius), newRadius, depth - 1); 
    }

}

   