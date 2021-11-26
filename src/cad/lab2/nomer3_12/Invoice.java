package cad.lab2.nomer3_12;

/*Создайте класс Invoice, который является магазином компьютерных изделий и мог бы использоваться
в качестве счёта-фактуры на товар, проданный в магазине. Счёт-фактура должен включать
четыре части информации в качестве объектных переменных - номер изделия (тип String),
описание детали (тип String), количество покупаемого товара (тип int) и цену за товар (double).
Ваш класс должен иметь конструктор, который инициализирует четыре объектные переменные.
Обеспечьте метод set и get для каждой переменной экземпляра.
Кроме того, предоставьте метод getInvoiceAmount, который вычисляет сумму счета
(т.е. умножает количество на цену за товар), а затем возвращает сумму в виде двойного значения.
Если количество не является положительным, оно должно быть установлено в 0.
Если цена за товар не является положительной, она должна быть установлена в 0.0.
Напишите тестовое приложение с именем InvoiceTest, которое демонстрирует возможности класса Invoice.
*/

public class Invoice {
    private String itemNumber;
    private String itemDescription;
    private int kolicestvoItem;
    private double itemPrice;

    //Конструктор
    public Invoice(String itemNumber, String itemDescription, int kolicestvoItem, double itemPrice) {
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
        if (kolicestvoItem > 0) {
            this.kolicestvoItem = kolicestvoItem;
        }
        if (itemPrice > 0) {
            this.itemPrice = itemPrice;
        }
    }

    //Геттер itemNumber
    public String getItemNumber() {
        return itemNumber;
    }

    //Сеттер itemNumber
    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    //Геттер itemDescription
    public String getItemDescription() {
        return itemDescription;
    }

    //Сеттер itemDescription
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    //Геттер kolicestvoItem
    public int getKolicestvoItem() {
        return kolicestvoItem;
    }

    //Сеттер kolicestvoItem
    public void setKolicestvoItem(int kolicestvoItem) {
        this.kolicestvoItem = kolicestvoItem;
    }

    //Геттер itemPrice
    public double getItemPrice() {
        return itemPrice;
    }

    //Сеттер itemPrice
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    //Подсчет полной стоимости в чеке
    public double getInvoiceAmount() {
        return kolicestvoItem * itemPrice;
    }
}







