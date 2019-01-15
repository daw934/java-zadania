package set3.task2;

public abstract class Wierzcholek {
    Wierzcholek lewy,prawy;
    public abstract int wartosc();
}
class Stala extends Wierzcholek{
    private int wart;

    public Stala(int wart) {
        this.wart = wart;
    }

    @Override
    public int wartosc() {
        return wart;
    }
    class Dzialanie extends Wierzcholek{
        private char op;

        public Dzialanie(char znak) {
            this.op = znak;
        }
        public void dodajLewy(Wierzcholek arg){
            lewy=arg;
        }
        public void dodajPrawy(Wierzcholek arg){
            prawy=arg;
        }
        public int wartosc(){
            switch (op){
                case '+': return lewy.wartosc()+prawy.wartosc();
                case '-': return lewy.wartosc()-prawy.wartosc();
                case '/': return lewy.wartosc()/prawy.wartosc();
                case '*': return lewy.wartosc()*prawy.wartosc();
            }
            return 0;
        }
    }
}
