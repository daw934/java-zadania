package set5.task3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Graf {
    private int n;
    private LinkedList[] tab;

    public Graf(String lan) {
        StringTokenizer st = new StringTokenizer(lan,"() ,");
        n = Integer.parseInt(st.nextToken());
        tab = new LinkedList[n];
        for (int i = 0; i < n; ++i) {
            tab[i] = new LinkedList();
            while (st.hasMoreTokens()){
                tab[Integer.parseInt(st.nextToken())]
                        .add(Integer.valueOf(st.nextToken()));
            }
        }
    }

    @Override
    public String toString() {
        return "Graf{" +
                "n=" + n +
                ", tab=" + Arrays.toString(tab) +
                '}';
    }
}
