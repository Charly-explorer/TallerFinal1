/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import RelacionClientes.Client;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class ListaClientes {

    public static void add(Client cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Iterable<Client> getClient() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
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
    
    
    
}
