package set2.task3;

public class FunkcjaKwadratowa implements Wielomian {
    private double a;
    private double b;
    private double c;

    public FunkcjaKwadratowa(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void wypiszMiejscaZerowe() {
        if(a==0) {
            if (b != 0) {
                double x = -c / b;
                System.out.println(x);
            } else {
                System.out.println("brak");
            }
        }
        double sum = Math.pow(b,2)-4*a*c;
            if(sum< 0){
                System.out.println("brak");
            }else if(sum ==0){
                double x = -b/(2*a);
                System.out.println(x);
            }else {
                double x1 = (-b-Math.sqrt(sum))/(2*a);
                double x2 = (-b+Math.sqrt(sum))/(2*a);
                System.out.println(x1+" "+x2);
            }
    }

}
