package ejercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Hilo extends Thread implements Runnable {

    public Hilo(String str) {
        super(str);
    }

       @Override
       public void run(){
           for (int i = 0; i < 10; i++) {
               System.out.println(i+" "+getName());
               try {
                   Hilo.sleep((long) (Math.random()*1000)+1);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           System.out.println("Termina "+getName());
           
       }
}
