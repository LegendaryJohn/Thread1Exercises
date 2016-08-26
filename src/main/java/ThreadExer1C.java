/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kann
 */
public class ThreadExer1C {
    
    public static void main(String[] args) throws InterruptedException {
        
        new Thread3().start();
        Thread.sleep(10000);
        new Thread3().interrupt();
        
    }
    
    public static class Thread3 extends Thread{
        
        int num = 10;
        
        @Override
        public void run(){
        
        while(true){
            try{ // Prints all numbers from 10 and up with a 3 second interval.
                for (int i = 10; i > 0; i++) {
                    num += 1;
                    
                    System.out.println("Thread running.." + i);
                    
                    Thread.sleep(3000);
                }
        }
                catch (InterruptedException E){
                      System.out.println("Thread closing..");
                }
        }
    }
}
}