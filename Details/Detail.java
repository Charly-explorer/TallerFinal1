/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Details;

import java.time.LocalDate;

/**
 *
 * @author user
 */
public class Detail {
  private int id;
    private String vehicle;
    private String mechanic;
    private LocalDate date;
    private String description;
    private boolean state;

    public int getId() {
        return id;
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getMechanic() {
        return mechanic;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public boolean isState() {
        return state;
    }


    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void setMechanic(String mechanic) {
        this.mechanic = mechanic;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Detail(int id, String vehicle, String mechanic, LocalDate date, String description, boolean state) {
        this.id = id;
        this.vehicle = vehicle;
        this.mechanic = mechanic;
        this.date = date;
        this.description = description;
        this.state = state;
    }

    public Detail() {
        this(0,"","",LocalDate.now(),"",false);
    }

    @Override
    public String toString() {
        return "Detail{" + "id=" + id + ", vehicle=" + vehicle + ", mechanic=" + mechanic + ", date=" + date + ", description=" + description + ", state=" + state + '}';
    }
      
}
