package Listas;


import Vehicles.Vehicle;
import java.util.ArrayList;



    public class ArrayListVehicle {

     ArrayList<Vehicle> vehicles = new ArrayList<>();

   
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
      vehicles.remove(vehicle);
        
    }
    
    public Vehicle findVehicle(Vehicle vehicle) {
        for (Vehicle Vehicle: vehicles) {
            if (vehicle.equals(vehicle)) {
                return vehicle;
            }
        }
        return null;
    }


    
}