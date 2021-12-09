package cad.lab7.nomer8_4;

public class App {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Ploshadi = " + rectangle.area());
        System.out.println("Perimetr = " + rectangle.perimeter());

        Rectangle rectangle1 = new Rectangle(-1, -1);
        System.out.println("Ploshadi 1 = " + rectangle1.area());
        System.out.println("Perimetr 1 = " + rectangle1.perimeter());
    }
}
