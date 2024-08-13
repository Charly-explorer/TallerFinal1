package RelacionClientes;

import Mechanics.Mechanic;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class Client {
   private Map<Integer, Client> clientesMap;
   private int ID;
   private Mechanic mechanic;
   private LocalDate date;
   private String description;
   private boolean state;
   
     public Client() {
        clientesMap = new HashMap<>();
    }
    
    public int getID() {
        return ID;  
    }

    public Mechanic getMechanic() {
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

    public void setState(boolean state) {
        this.state = state;
    }

    public Client(int ID, Mechanic mechanic, LocalDate date, String description, boolean state) {
        this.ID = ID;
        this.mechanic = mechanic;
        this.date = date;
        this.description = description;
        this.state = state;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "ID=" + ID + ", mechanic=" + mechanic + ", date=" + date + ", description=" + description + ", state=" + state + '}';
    }


    public void addClient(int ID, Client cliente) {
        clientesMap.put(ID, cliente);
    }

 
    public void deleteClient(int id) {
        clientesMap.remove(id);
    }

   
    public void updateClient(int id, Client cliente) {
        if (clientesMap.containsKey(id)) {
            clientesMap.put(id, cliente);
        }
    }
}
