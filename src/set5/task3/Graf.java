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
        System.out.println(n);
        tab = new LinkedList[n];
        for (int i = 0; i < n; ++i) {
            tab[i] = new LinkedList();
        }
            while (st.hasMoreTokens()){
                String s = st.nextToken();
                tab[Integer.parseInt(s)]
                        .add(Integer.valueOf(st.nextToken()));
            }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(i).append(": ");
            tab[i].forEach(s -> stringBuilder.append(s).append(" "));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
