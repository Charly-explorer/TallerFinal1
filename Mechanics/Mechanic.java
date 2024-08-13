package Mechanics;

public class Mechanic {

    private int id; 
    private String name;
    private String specialty;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Mechanic(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public Mechanic() {
        this(0,"","");
    }

    @Override
    public String toString() {
        return "Mecanico{" + "id=" + id + ", nombre=" + name + ", especialidad=" + specialty + '}';
    }
    
}
