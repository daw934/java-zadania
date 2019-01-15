package set1.task1;

import javax.swing.*;

public class Task1 {

    public static void main(String[] args) {

        String m = JOptionPane.showInputDialog("Anyone there?");
        String mNew = m.toUpperCase();
        JOptionPane.showMessageDialog(null,mNew);
        System.out.println(mNew);
    }
}
