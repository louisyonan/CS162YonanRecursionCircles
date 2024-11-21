import processing.core.PApplet;


/**
 * 
 * Represents any shape.
 */
    public abstract class Shape {
        private int id;
        private static int numShapes;

        protected float x, y;
        protected int r, g, b;  

        public Shape(int r, int g, int b, float x, float y) {
            this.r = r;
            this.g = g;
            this.b = b;
            this.x = x;
            this.y = y;
        }
    

        /**
         * Parameterless constructor
         */
        public Shape() {
            ++numShapes;
            setId(numShapes);
        }



        /**
         * Returns the number of shapes that have been created so far
         * @return number of shapes created
         */
        public static int getNumShapes()
        {
            return numShapes;
        }

        /**
         * Returns the id of the object
         * @return the auto-generated id
         */
        public int getId()
        {
            return id;
        }

        private void setId(int id) {
            this.id = id;
        }

        /**
         * Computes the area of the shape
         * @return the shape's area
         */
        public abstract double computeArea(); 
        /**
         * Computes the perimeter of the shape
         * @return the shape's perimeter
         */
        public abstract double computePerimeter();


        /**
         * Creates a string representation of the object
         * @return the object's type, area, and perimeter
         */
        public String toString(){
             return String.format("Shape type: %s, ID: %d, Area: %f, Perimeter: %f", getClass().getName(),
                    id, computeArea(),computePerimeter());
        }
        
        public abstract void draw(PApplet p);
        public void setPosition(float x, float y) {
            this.x = x;
            this.y = y;
        }



}