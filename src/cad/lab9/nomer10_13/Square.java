package cad.lab9.nomer10_13;

public class Square extends TwoDimensionalShape {
    public Square(double length) {
        super(length);
    }

    @Override
    public double getArea() {
        return super.getSide1() * super.getSide1();
    }

    @Override
    public String toString() {
        return "Square";
    }

}
