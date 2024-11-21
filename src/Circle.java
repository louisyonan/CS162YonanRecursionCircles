import processing.core.PApplet;

public class Circle {
    private float radius;
    private int r, g, b;
    private float x, y;

    public Circle(float radius, int r, int g, int b, float x, float y) {
        this.radius = radius;
        this.r = r;
        this.g = g;
        this.b = b;
        this.x = x;
        this.y = y;
    }

    public void draw(PApplet app) {
        app.fill(r, g, b); 
        app.ellipse(x, y, radius * 2, radius * 2); 
    }
}
