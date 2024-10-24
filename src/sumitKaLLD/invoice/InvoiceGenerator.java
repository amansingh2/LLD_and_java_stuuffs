package sumitKaLLD.invoice;

import sumitKaLLD.Vehicle;

public class InvoiceGenerator {
    public InvoiceGenerator(Vehicle vehicle) {
        Invoice invoice = new InvoiceStrategy().generateInvoice(vehicle);
        invoice.rent();
    }
}
