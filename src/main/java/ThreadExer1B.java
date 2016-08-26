/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kann
 */
public class ThreadExer1B {
    
    public static void main(String[] args) {
        new Thread2().start();
    }
    
    public static class Thread2 extends Thread{
        
        int num = 0;
        
        @Override
        public void run(){
        
        try{ // Prints the numbers from 1 - 5 with a 2 second interval.
                for (int i = 1; i < 6; i++) {
                    num += 1;
                    
                    System.out.println("Thread running.." + i);
                    
                    Thread.sleep(2000);
                }
        }
                catch (InterruptedException E){
                      System.out.println("Thread closing..");
                        }
        }
    }
}
