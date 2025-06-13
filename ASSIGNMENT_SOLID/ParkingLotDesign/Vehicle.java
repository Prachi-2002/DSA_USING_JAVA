package ASSIGNMENT_SOLID.ParkingLotDesign;

 enum VehicleType{
    TWOWHEELER,
    FOURWHEELER,
    HEAVYVEHICLE,
    ELECTRICTWOWHEELER,
    ELECTRICFOURWHEELER
} 
public class Vehicle {
    int vehicleId;
    String regno;
    VehicleType vehicleType;
    String color;

    Vehicle(int vehicleId, String vehicleno, VehicleType vehicleType, String color){
        this.vehicleType = vehicleType;
        this.regno = vehicleno;
        this.color = color;
        this.vehicleId =  vehicleId;
    }
}