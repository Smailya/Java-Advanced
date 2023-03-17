/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lauch.event;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 *
 * @author ISMAIL
 */
public class DoTwoThings {

    /**
     * @param args the command line arguments
     */
     DoTwoThings() {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }
    ScheduledThreadPoolExecutor pool
            = new ScheduledThreadPoolExecutor(2);
    CountDownClock clock = new CountDownClock(20);

    public static void main(String[] args) {
        DoTwoThings doT = new DoTwoThings();
      new  DoTwoThings();
    }

   
    
}
