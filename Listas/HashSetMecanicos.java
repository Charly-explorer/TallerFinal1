package Listas;

import Mechanics.Mechanic;
import java.util.HashSet;

public class HashSetMecanicos {
    
    HashSet<Mechanic> mechanics = new HashSet<>();
    
    public void AddMechanic(Mechanic mechanic){
        mechanics.add(mechanic);
    }
    
    public void RemoveMechanic(Mechanic mechanic){
        mechanics.remove(mechanic);
    }
    
}
