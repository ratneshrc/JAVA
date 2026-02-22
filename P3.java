abstract class Shape {
    double dim1, dim2;

    Shape(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Shape {
    Rectangle(double l, double b) {
        super(l, b);
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    Triangle(double h, double b) {
        super(h, b);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class P3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 9);
        Triangle t = new Triangle(6, 7);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Triangle Area: " + t.area());
    }
}