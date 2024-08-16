package Listas;

import Mechanics.Mechanic;
import RelacionClientes.Client;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetMecanicos {
    
    HashSet<Mechanic> mechanics = new HashSet<>();
    
    public void AddMechanic(Mechanic mechanic){
        mechanics.add(mechanic);
    }
    
    public void RemoveMechanic(Mechanic mechanic){
        mechanics.remove(mechanic);
    }
    
        public Iterator<Mechanic> iterator(){
        return mechanics.iterator();
    }
}
