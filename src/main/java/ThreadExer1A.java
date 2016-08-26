/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kann
 */
public class ThreadExer1A extends Thread{
    
    public static void main(String[] args) {
        new Thread1().start(); 
        
    }
    
    public static class Thread1 extends Thread{
        
    int sum = 0;
    
    
    
    @Override
    public void run(){
        
        System.out.println("Running thread");
        // Prints numbers from one to a billion and sums it up.
        try{
            for (int i = 0; i < 1000000000; i++) {
                sum += 1;
                System.out.println("Thread: " + i);
                Thread.sleep(60);
            }
        }
            catch (InterruptedException e){
                    
                    System.out.println("Thread interrupted");
                
            }
    }
    }
    
    }
    



    
    

