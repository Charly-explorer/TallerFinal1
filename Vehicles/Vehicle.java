
import java.time.LocalDate;



public class Vehicle {
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
    
    
}