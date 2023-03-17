/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lauch.event;

import java.util.ArrayList;
/**
 *
 * @author ISMAIL
 */
public class CountDown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread clock = new CountDownClock();
        Runnable flood, ignition, liftoff;
        flood = new LauchEvent(16, "Flood the pad!");
        ignition = new LauchEvent(6, "Start engines!");
        liftoff = new LauchEvent(0, "Liftoff!");
        clock.start();
        new Thread(flood).start();
        new Thread(ignition).start();
        new Thread(liftoff).start();
    }
    
}
