package set2.task1;

public class Task1 {

    public static void main(String[] args) {
        Rational rational = new Rational(2,3);
        Rational rational2 = new Rational(2,4);
        System.out.println(rational.mul(rational2));
        System.out.println(rational.div(rational2));
        System.out.println(rational.equals(rational2));
        System.out.println(rational.compareTo(rational2));


    }

}
