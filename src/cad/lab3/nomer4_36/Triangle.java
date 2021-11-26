package cad.lab3.nomer4_36;

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

    public void displayIsRight() {
        if (storona1 == storona2 && storona2 == storona3) {
            System.out.println("Dannie storoni obrazuiut pravilinii treugolinik!");
        } else {
            System.out.println("Dannie storoni ne mogut obrazovati pravilinii treugolinik!");
        }
    }
}
