/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.util.Queue;

/**
 *
 * @author user
 */
public class QueueRepair {
    private Queue<QueueRepair> colarepair;

    
      public void addRepair(QueueRepair repair) {
        colarepair.add(repair);
    }
  
    public QueueRepair getNextRepair(QueueRepair repair) {
        return colarepair.poll();
    }
    
    private void removeRepair(QueueRepair repair){
        colarepair.remove(repair);
    }

}
