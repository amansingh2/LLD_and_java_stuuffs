package sumitKaLLD.invoice;

import sumitKaLLD.Vehicle;
import sumitKaLLD.VehicleType;

public class InvoiceStrategy{

    public Invoice generateInvoice(Vehicle vehicle) {
        if(vehicle.vehicleType == VehicleType.BIKE){
            return new BikeInvoice();
        }else if(vehicle.vehicleType == VehicleType.CAR){
            return new CarInvoice();
        }else{
            return new TruckInvoice();
        }
    }
}
