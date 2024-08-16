package Vehicles;

import java.time.LocalDate;



public class Vehicle {

    public static void EliminarVehiculo(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String licensePlate;
    private String model;
    private String brand;
    private LocalDate yearOfManufacture;

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public LocalDate getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Vehicle(String licensePlate, String model, String brand, LocalDate yearOfManufacture) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Vehicle() {
        this("","","", LocalDate.now());
       
    }

    @Override
    public String toString() {
        return "Vehicle{" + "licensePlate=" + licensePlate + ", model=" + model + ", brand=" + brand + ", yearOfManufacture=" + yearOfManufacture + '}';
    }

    public void AgregarVehiculo(Vehicle vehicle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Vehicle BuscarVehiculo(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}