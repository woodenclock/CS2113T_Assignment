public class Circle {
    private int x;
    private int y;
    private double radius;

    public Circle(){
        this(0, 0, 0);
    }

    public Circle(int x, int y, double radius){
        if (radius < 0) {
            radius = 0;
        }
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return (int)area;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }
}