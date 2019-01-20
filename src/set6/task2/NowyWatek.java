package set6.task2;

public class NowyWatek extends Thread{
    private MapaKomunikatow mapa;
    private int istart;
    
    public NowyWatek(MapaKomunikatow mapa, int istart) {
        this.mapa = mapa;
        this.istart = istart;
    }
    
    @Override
    public void run() {
        for(int i=istart; i<=10; i+=2) {
            mapa.wyslij(Integer.toString(i), i);
            try {
                Thread.sleep(50);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
}
