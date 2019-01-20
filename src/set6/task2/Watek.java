package set6.task2;


public class Watek extends Thread {
       private KolejkaKomunikatow koko;
    private int istart;
    
    public Watek(KolejkaKomunikatow koko, int istart) {
        this.koko = koko;
        this.istart = istart;
    }
    
    public void run() {
        try {
        for(int i=istart; i<=10; i+=2) {
            koko.wyslij(i);
            Thread.sleep(50);
        }
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

}
