package OOP;

public class Square implements Squarable {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSquare() {
        return Math.pow(side, 2);
    }

    public double getPerimetr() {
        int sides = 4;
        return side * sides;
    }
}
