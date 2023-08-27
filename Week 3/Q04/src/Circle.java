public class Circle {
    private int x, y;
    private double radius;

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {
        this(0, 0, 0);
    }

    public int getArea() {
        return (int) (Math.PI * Math.pow(this.radius, 2));
    }
}
