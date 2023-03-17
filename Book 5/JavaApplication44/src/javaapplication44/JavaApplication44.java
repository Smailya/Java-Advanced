/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication44;

/**
 *
 * @author ISMAIL
 */
public class JavaApplication44 extends Thread  {

    public void run(){
        for(int t = 1; t<10;t++){
            System.out.println("T minus" + t);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                
            }
        }
    }
    public static void main(String[] args) {
       Thread clock = new JavaApplication44();  
      clock.start();
     
      //using runnable class:
      
      
    }
    
}
