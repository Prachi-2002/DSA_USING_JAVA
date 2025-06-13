package ASSIGNMENT_SOLID.ParkingLotDesign;

import java.util.ArrayList;

public class ParkingLot {

    String name; //Name of the parking lot,
    String address;
    ArrayList<Floor> floors;
    ArrayList<Integer> entriesId;
    ArrayList<Integer> existsId;

    // No of available spots in each floor

    ParkingLot(String name, String address){
        this.name= name;
        this.address = address;
    }
}