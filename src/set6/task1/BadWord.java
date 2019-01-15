package set6.task1;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BadWord implements Runnable {

    private JTextArea jTextArea;
    private boolean zakonczyc = false;
    private Pattern pattern = Pattern.compile("cholera");
    private Matcher matcher ;
    public BadWord(JTextArea jTextArea) {
        this.jTextArea = jTextArea;
    }

    @Override
    public void run() {
        while (!zakonczyc) {
            try {
                System.out.println(Thread.currentThread().toString());
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String text = jTextArea.getText();

            matcher = pattern.matcher(text);
            if (matcher.find()) {
                JOptionPane.showMessageDialog(null, "bad word : 'cholera'");
            }

        }
    }

    public JTextArea getjTextArea() {
        return jTextArea;
    }

    public void setjTextArea(JTextArea jTextArea) {
        this.jTextArea = jTextArea;
    }

    public boolean isZakonczyc() {
        return zakonczyc;
    }

    public void setZakonczyc(boolean zakonczyc) {
        this.zakonczyc = zakonczyc;
    }
}
