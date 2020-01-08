package lt.bit.oop.day3;

class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }
}