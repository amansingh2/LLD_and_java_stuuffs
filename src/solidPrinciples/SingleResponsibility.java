package solidPrinciples;

/*
Def: A class should have only one reason to change, meaning it should only have
     one responsibility!

Example: here Invoice class is responsible for managing invoice details, while
    a separate InvoicePrinter class handles printing!

 */
class Invoice{
    private long id;
    private double amount;

    public Invoice(long id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
}
class InvoicePrinter{
    public void print(Invoice invoice){
        System.out.println("Invoice ID : " + invoice.getId());
        System.out.println("Amount is : " + invoice.getAmount());
    }
}
public class SingleResponsibility {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1 , 100);
        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice);
    }
}
