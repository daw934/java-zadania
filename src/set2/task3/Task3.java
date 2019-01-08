package set2.task3;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        Wielomian w[] = new Wielomian[3];
        w[0] = new FunkcjaLiniowa(2,1);
        w[1] = new FunkcjaKwadratowa(1,-2,2);
        w[2] = new FunkcjaKwadratowa(1,0,-1);

        for (int i = 0; i < w.length; i++) {
            w[i].wypiszMiejscaZerowe();
        }
    }
}
