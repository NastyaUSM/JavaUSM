package cad.lab9.nomer10_13;

public class Circle extends TwoDimensionalShape {
    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * super.getSide1() * super.getSide1();
    }

    @Override
    public String toString() {
        return "Circle";
    }

}
