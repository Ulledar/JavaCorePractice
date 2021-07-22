package OOP;

public class SquareCounter {

    public static void main(String[] args) {
        Squarable squarable1 = new Square(5);
        Squarable squarable2 = new Circle(5);
        System.out.println(squarable1.getSquare());
        System.out.println(squarable2.getSquare());
    }
}
