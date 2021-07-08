package OOP;

public class Circle {

    private static double radius;

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }

    public static double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double getPerimetr() {
        return 2 * Math.PI * radius;
    }
}
