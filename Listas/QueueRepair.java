/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.util.Iterator;
import java.util.Queue;

/**
 *
 * @author user
 */
public class QueueRepair {
    private Queue<String> colarepair;

        public void addVehicle(String txt) {
        colarepair.add(txt);
    }

    public void removeVehicle(String txt) {
        colarepair.remove(txt);

    }

    public String findVehicle(String txt) {
        for (String Txt : colarepair) {
            if (colarepair.equals(txt)) {
                return txt;
            }
        }
        return null;
    }

    public Iterator<String> iterator() {
        return colarepair.iterator();
    }
}
