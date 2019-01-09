package set5.task2;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {
        Map mapa = new HashMap();
        mapa.put(new Wspolrzedna(2,3), "czerwony");
        mapa.put(new Wspolrzedna(-3,0), "czerwony");
        mapa.put(new Wspolrzedna(-1,2), "czerwony");
        mapa.put(new Wspolrzedna(2,-1), "czerwony");
        Wspolrzedna w = new Wspolrzedna(-1,2);
        System.out.println("Punkt" + w.toString()+ " ma kolor " + mapa.get(w));
    }
}
