package sumitKaLLD.invoice;

public class TruckInvoice implements Invoice{
    public int amount = 30;

    @Override
    public void rent() {
        System.out.println("Invoice generated : " + amount);;
    }
}
