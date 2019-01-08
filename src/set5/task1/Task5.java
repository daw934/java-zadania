package set5.task1;

import java.util.*;

public class Task5 {

    private static void wypiszElementy(Set zbior){
        Iterator it = zbior.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

    public static void main(String[] args) {
        Set zbior = new TreeSet();
        zbior.add(new Wspolrzedna(2,3));
        zbior.add(new Wspolrzedna(-3,0));
        zbior.add(new Wspolrzedna(-1,2));
        zbior.add(new Wspolrzedna(-1,2));
        zbior.add(new Wspolrzedna(-3,-2));
        wypiszElementy(zbior);
    }
}
