package cad.lab3.nomer4_35;

public class Triangle {

    private double storona1;
    private double storona2;
    private double storona3;

    public Triangle(double storona1, double storona2, double storona3) {
        if (storona1 > 0) {
            this.storona1 = storona1;
        }

        if (storona2 > 0) {
            this.storona2 = storona2;
        }

        if (storona3 > 0) {
            this.storona3 = storona3;
        }
    }

    public void displayInformation() {
        if (storona1 == 0 || storona2 == 0 || storona3 == 0) {
            System.out.println("Dannie storoni ne mogut obrazovati treugolinik!");
        }

        if (storona1 + storona2 > storona3 && storona1 + storona3 > storona2 && storona2 + storona3 > storona1) {
            System.out.println("Dannie storoni obrazuiut treugolinik!");
        } else {
            System.out.println("Dannie storoni ne mogut obrazovati treugolinik!");
        }
    }
}
