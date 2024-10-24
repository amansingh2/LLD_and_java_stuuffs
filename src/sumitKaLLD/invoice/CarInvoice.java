package sumitKaLLD.invoice;

public class CarInvoice implements Invoice{
    public int amount = 20;

    @Override
    public void rent() {
        System.out.println("Invoice Generated : " + amount);
    }
}
