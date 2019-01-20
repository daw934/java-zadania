
package set6.task2;

import java.util.Vector;


public class KolejkaKomunikatow {
  Vector kolejka = new Vector();

  public synchronized void wyslij(Object ob) {
    kolejka.addElement(ob);
  }
  
  public synchronized Object odbierz() {
     if (kolejka.isEmpty()) return null;
     Object ob = kolejka.firstElement();
     kolejka.removeElementAt(0);
     return ob;
  }
  
}  
