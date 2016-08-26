/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kann
 */
public class ThreadExer2 {

    public static class Even {

        private int n = 0;

        public int next() {
            n++;
            n++;
            return n;
        }
    }

    public static Even even1 = new Even();
    
    public static class Thread1 extends Thread {


        @Override
        public synchronized void run() {

            System.out.println("Running thread");
            

            while (true) {
                try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                System.out.println("Thread interrupted");

            }
                System.out.println(even1.next());
            }

        }
    }
    
    public static class Thread2 extends Thread{
        
        @Override
        public synchronized void run() {

            System.out.println("Running thread");


            while (true) {
                try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                System.out.println("Thread interrupted");

            }
                System.out.println(even1.next());
            }

        }
    }
    
    public static void main(String[] args) {
        Thread2 thread = new Thread2();
        Thread1 thread1 = new Thread1();
        
        thread.start();
        thread1.start();
    }
}
