abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Circle extends Shape {
    private double r;

    Circle(double r) {
        this.r = r;
    }

    @java.lang.Override
    double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    double getArea() {
        return Math.PI * r * r;
    }
}


class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        double p = (a + b + c) / 2.0d;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    double getArea() {
        return a * b;
    }
}
