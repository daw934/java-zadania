package set6.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Task2 {

    
    public static void main(String[] args) {
//        KolejkaKomunikatow k = new KolejkaKomunikatow();
//        Watek w1 = new Watek(k, 1);
//        Watek w2 = new Watek(k, 2);
//        w1.start();
//        w2.start();
//
//        try {
//            w1.join();
//            w2.join();
//            System.out.println("Dsad");
//        } catch (InterruptedException e) {
//        }
//        ;
//
//        Object ob = k.odbierz();
//        while (ob != null) {
//            System.out.println(((Integer) ob).toString());
//            ob = k.odbierz();
//        }

        MapaKomunikatow m = new MapaKomunikatow();
        NowyWatek w1 = new NowyWatek(m,1);
        NowyWatek w2 = new NowyWatek(m,2);

        w1.start();
        w2.start();

        try {
            w1.join();
            w2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object ob = m.odbierz();
        while (ob != null) {
            System.out.println(ob.toString());
            ob = m.odbierz();
        }

    }

}
