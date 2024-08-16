/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Mechanics.Mechanic;
import RelacionClientes.Client;
import Vehicles.Vehicle;
import java.util.Iterator;

/**
 *
 * @author Student
 */
public class TodasListas {

    private static ListaClientes clientes;
    private static HashSetMecanicos mecanicos;
    private static ArrayListVehicle vehiculos;
    private static QueueRepair reparations;

    public Iterator<Client> getClientes() {
        return clientes.iterator();
    }

    public static void setClientes(ListaClientes clientes) {
        TodasListas.clientes = clientes;
    }
    
    public Iterator<Mechanic> getMecanicos() {
        return mecanicos.iterator();
    }

    public static void setMecanicos(HashSetMecanicos mecanicos) {
        TodasListas.mecanicos = mecanicos;
    }

    public Iterator<Vehicle> getVehiculos() {
        return vehiculos.iterator();
    }

    public static void setVehiculos(ArrayListVehicle vehiculos) {
        TodasListas.vehiculos = vehiculos;
    }

    public Iterator<String> getReparations() {
        return reparations.iterator();
    }

    public static void setReparations(QueueRepair reparations) {
        TodasListas.reparations = reparations;
    }

    

    
    
}
