package sumitKaLLD.parkingSpots;

import sumitKaLLD.Vehicle;

import sumitKaLLD.VehicleType;
import sumitKaLLD.invoice.InvoiceGenerator;

public class ParkingSpotManager {
    public ParkingSpot [] spots;
    public int n;
    public ParkingSpotManager(int n) {
        spots = new ParkingSpot[n];
        for(int i = 0 ; i < n ; i++){
            spots[i] = new ParkingSpot();
        }
        this.n = n;
        assingn();
    }
    private void assingn(){
        for(int i = 0 ; i < n - 2 ; i+=3) {
            spots[i].availability = Availability.AVAILABLE;
            spots[i].vehicleType = VehicleType.BIKE;

            spots[i+ 1].availability = Availability.AVAILABLE;
            spots[i + 1].vehicleType = VehicleType.TRUCK;

            spots[i + 2].availability = Availability.AVAILABLE;
            spots[i + 2].vehicleType = VehicleType.CAR;
        }
    }

    public void setParking(Vehicle vehicle){
        if(checkAvailability(vehicle)){
            for(int i = 0 ; i < n ; i++){
                if(spots[i].availability == Availability.AVAILABLE && spots[i].vehicleType == vehicle.vehicleType){
                    spots[i].availability = Availability.BOOKED;
                    InvoiceGenerator invoice = new InvoiceGenerator(vehicle);
                    System.out.println("Invoice successfully generated!");
                }
            }
        }else{
            System.out.println("Parking Spot Not Available!");
        }
    }
    public void unSetParking(Vehicle vehicle){
        for(int i = 0 ; i < n ; i++){
            if(spots[i].availability == Availability.BOOKED && spots[i].vehicleType == vehicle.vehicleType){
                spots[i].availability = Availability.AVAILABLE;
                System.out.println("Spot is free now!");
            }
        }
    }
    public boolean checkAvailability(Vehicle vehicle){
        for(int i = 0 ; i < n ; i++){
            if(spots[i].availability == Availability.AVAILABLE && spots[i].vehicleType == vehicle.vehicleType){
                System.out.println("Spot available!");
                return true;
            }
        }
        return false;
    }
}
