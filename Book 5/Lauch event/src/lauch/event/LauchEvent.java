/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lauch.event;

/**
 *
 * @author ISMAIL
 */
public class LauchEvent implements Runnable{

    private int start;
    private String message;

    public LauchEvent(int start, String message) {
        this.start = start;
        this.message = message;
    }
    public void run() {
        try {
            Thread.sleep(20000 - (start * 1000));
        } catch (InterruptedException e) {
        }
        System.out.println(message);
    }
    public static void main(String[] args) {
        
    }
    
}
