
package set3.task2;

public class Wyrazenie {
    private Wierzcholek korzen;

    private Wierzcholek utworzDrzewo(String w, int p, int q) throws ZleWyrazenie {
        if (p == q)
            if (!(Character.isDigit(w.charAt(p)))) throw new ZleWyrazenie(); //stala nie jest cyfra
            else return new Stala(Character.digit(w.charAt(p), 10));
        else {
            if (w.charAt(p) != '(') throw new ZleWyrazenie();
            int i = p + 1, nawiasy = 0;
            while ((nawiasy != 0) || (w.charAt(i) == '(') || (w.charAt(i) == ')') || (Character.isDigit(w.charAt(i)))) {
                if (w.charAt(i) != '(' && w.charAt(i) != ')' && w.charAt(i) != '+' && w.charAt(i) != '-' && w.charAt(i) != '*' && w.charAt(i) != '/' && !(Character.isDigit(w.charAt(i))))
                    throw new ZleWyrazenie();
                //blad w wyrazeniu
                if (w.charAt(i) == '(') ++nawiasy;
                if (w.charAt(i) == ')') --nawiasy;
                ++i;
            }
            Dzialanie nowy = new Dzialanie(w.charAt(i));
            nowy.dodajLewyArg(utworzDrzewo(w, p + 1, i - 1));
            nowy.dodajPrawyArg(utworzDrzewo(w, i + 1, q - 1));
            return nowy;

        }
    }

    public Wyrazenie(String w) throws ZleWyrazenie {
        korzen = utworzDrzewo(w, 0, w.length() - 1);
    }

    public int oblicz() {
        return korzen.wartosc();
    }
}
