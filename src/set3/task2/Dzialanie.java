package set3.task2;


public class Dzialanie extends Wierzcholek {
    private char op; // operator +, -, / lub *

    public Dzialanie(char znak) {
        op = znak;
    }

    public void dodajLewyArg(Wierzcholek arg) {
        lewy = arg;
    }

    public void dodajPrawyArg(Wierzcholek arg) {
        prawy = arg;
    }

    @Override
    public int wartosc() throws ArithmeticException {
        switch (op) {
            case '+':
                return lewy.wartosc() + prawy.wartosc();
            case '-':
                return lewy.wartosc() - prawy.wartosc();
            case '/': {
                if (prawy.wartosc() == 0) throw new ArithmeticException("Dzielenie przez 0");
                else
                    return lewy.wartosc() / prawy.wartosc();
            }
            case '*':
                return lewy.wartosc() * prawy.wartosc();
        }
        return 0;
    }
}
