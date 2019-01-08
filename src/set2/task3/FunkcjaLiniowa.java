package set2.task3;

public class FunkcjaLiniowa implements Wielomian {

    private double a;
    private double b;

    public FunkcjaLiniowa(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void wypiszMiejscaZerowe() {
        if(a!=0) {
            double x = -b/a;
            System.out.println(x);
        }else {
            System.out.println("brak");
        }
        }


}
