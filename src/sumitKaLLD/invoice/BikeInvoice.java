package sumitKaLLD.invoice;

public class BikeInvoice implements Invoice{
    public int amount = 10;

    @Override
    public void rent() {
        System.out.println("Invoice Generated : " + amount);;
    }
}
