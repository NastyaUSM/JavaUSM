package cad.lab2.nomer3_12;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("20876544", "computer", 5, 500);

        print(invoice);

        double invoiceAmount = invoice.getInvoiceAmount();
        System.out.println("Polnaia stoimosti tovara v cheke: " + invoiceAmount);
    }

    public static void print(Invoice invoice) {
        System.out.println("Nomer izdeila: " + invoice.getItemNumber() + ", "
                + "Opisanie izdelia: " + invoice.getItemDescription() + ", "
                + "Kolicestvo izdelii: " + invoice.getKolicestvoItem() + ", "
                + "Tcena izdelia: " + invoice.getItemPrice());
    }

}
