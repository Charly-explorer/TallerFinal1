/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import RelacionClientes.Client;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Student
 */
public class ListaClientes {
    
    ArrayList<Client> clients = new ArrayList<>();

    public ArrayList<Client> getClientes() {
        return clients;
    }
    
    public void AddClient(Client client){
        clients.add(client);
    }
    
    public void RemoveClient(Client client){
        clients.remove(client);
    }
    
    public Client Search(Client client){
        for (Client Client : clients){
            if(Client.equals(client)){
                return client;
            }
        }
        return null;
    }
    
    public Iterator<Client> iterator(){
        return clients.iterator();
    }
    
    
}
