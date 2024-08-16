package RelacionClientes;

import Mechanics.Mechanic;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class Client {
   private Map<Integer, Client> clientesMap;
   private int ID;
   private String nombre;
   private String telefono;
   private String direccion;

    public Map<Integer, Client> getClientesMap() {
        return clientesMap;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
 

    public Client(int ID, String nombre, String telefono, String direccion) {
        this.ID = ID;
        this.nombre=nombre;
        this.telefono=telefono;
        this.direccion=direccion;
        
    }

    @Override
    public String toString() {
        return "Client{" + "clientesMap=" + clientesMap + ", ID=" + ID + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
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
