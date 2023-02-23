/**
 * 1211EC / Homework nr 8
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
    public class Cylinder extends Circle {
        int height;
    
        public Cylinder() {
            // default constructor
        }
    
        public Cylinder(int h, int r, int a, int b) {
            super(r, a, b);
            this.height = h;
        }
    
        public void setHeight(int h) {
            this.height = h;
        }
    
        @Override
        public double computeArea() {
            // return surface area of cylinder
            return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
        }
    
        @Override
        public double computeVolume() {
            // return volume of cylinder
            return Math.PI * radius * radius * height;
        }
    
        @Override
        public String toString() {
            return "Cylinder{" +
                    "height=" + height +
                    ", radius=" + radius +
                    ", x=" + x +
                    ", y=" + y +
                    ", a=" + a +
                    ", b=" + b +
                    '}';
        }
    }
}