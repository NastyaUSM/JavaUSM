package cad.lab9.nomer10_13;

public class Test {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{
                new Circle(10),
                new Triangle(3, 3, 3),
                new Square(5),
                new Sphere(17),
                new Cube(8),
                new Tetrahedron(9)
        };

        for (Shape shape : shapes) {
            if (shape instanceof TwoDimensionalShape) {
                TwoDimensionalShape twoDimensionalShape = (TwoDimensionalShape) shape;
                System.out.println("Area of this " + shape + " = " + twoDimensionalShape.getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) shape;
                System.out.println("Area of this " + shape + " = " + threeDimensionalShape.getArea() + " | " +
                        "Volume of this figure = " + threeDimensionalShape.getVolume());
            }
        }
    }
}
