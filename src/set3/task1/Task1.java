package set3.task1;

public class Task1 {

    public static void main(String[] args) {
        Kolejka k = new Kolejka();
        try {
            k.doKolejki(7);
            k.doKolejki("Ala ma kota");
            k.doKolejki(3.14);
            for (int i = 0; i <=4; i++) {
                System.out.println(k.zKolejki().toString());
            }
        }catch (Przepelnienie e){
            System.out.println("przepelniona kolejka");
        }catch (Niedomiar e){
            System.out.println("Pusta Kolejka");
        }
    }
}
