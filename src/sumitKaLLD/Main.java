package sumitKaLLD;

/*
requiremets
Design : parking lot system
should support Multiple types of vehicle
    CARS , BIKES , TRUCKS
and different Parkign spot Sizes
COMPACT , REGULAR , LARGE

system should handles following operations:
1.parking a vehicle
3.check parking availability
2.second remove a vehicle //
4.parking charges  // admin
 */

/*
Vehicle
User
ParkingSpot
Invoice
enum -> Vehicle , ParkingType


 */

import sumitKaLLD.parkingSpots.ParkingSpotManager;

public class Main {
    public static void main(String[] args) {
        ParkingSpotManager parkingSpotManager = new ParkingSpotManager(20);
        Vehicle vehicle = new Vehicle(VehicleType.CAR , "1");
        for(int i = 0 ; i < 10 ; i++){
            parkingSpotManager.setParking(vehicle);
        }
        for(int i = 0 ; i < 10 ; i++){
            parkingSpotManager.setParking(new Vehicle(VehicleType.TRUCK , "3"));
        }
        for(int i = 0 ; i < 10  ; i++){
            parkingSpotManager.unSetParking(new Vehicle(VehicleType.CAR , "1"));
        }
        for(int i = 0 ; i < 10 ; i++){
            parkingSpotManager.setParking(vehicle);
        }
    }

}
