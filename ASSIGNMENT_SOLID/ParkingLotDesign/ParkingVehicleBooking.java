package ASSIGNMENT_SOLID.ParkingLotDesign;

public class ParkingVehicleBooking {

    // Get Ticket

    ParkingLot parkingLot = new ParkingLot("V3s Mall", "Nirman vihar");
    Floor floor1 = new Floor(1);
    Floor floor2 = new Floor(2);
    Floor floor3 = new Floor(3);
    Floor floor4 = new Floor(4);

    Ticket getTicket(Vehicle vehicle){
        parkingLot.getTicket(vehicle);
    }

    // Payment

    boolean getPayment(Ticket ticket){

    }
}