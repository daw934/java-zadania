package set6.task2;

import java.util.HashMap;
import java.util.Map;

public class MapaKomunikatow {
     private Map<String, Integer> mapa = new HashMap<>();
    private static int i = 1;
    
    public synchronized Integer wyslij(String key, int value) {

        return mapa.put(key, value);
    }
    
    public synchronized Integer odbierz() {
        return mapa.remove(Integer.toString(i++));
    }
}
