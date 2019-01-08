package set2.task1;

import java.util.Objects;

public class Rational implements Comparable<Rational>{
    private int licznik;
    private int mianownik;

    public Rational(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }
//    public Rational add(Rational arg){
//
//        return new Rational
//                ((this.licznik/this.mianownik)+(arg.licznik/arg.mianownik));
//    }
    public Rational mul(Rational arg){
        int licznik = arg.licznik*this.licznik;
        int mianownik = arg.mianownik*this.mianownik;
        return new Rational(licznik,mianownik);
    }
//    public Rational sub(Rational arg){
//
//    }
    public Rational div(Rational arg){
        int licznik = this.licznik*arg.mianownik;
        int mianownik = this.mianownik*arg.licznik;
        return new Rational(licznik,mianownik);
    }
    //int,, nie wdziala
    @Override
    public int compareTo(Rational rational) {
        double licznik = this.licznik / this.mianownik;
        System.out.println(licznik);
        double mianownik = rational.licznik / rational.mianownik;
        System.out.println(mianownik);
        return (this.licznik / this.mianownik)-(rational.licznik / rational.mianownik);
    }
    //int,, nie wdziala
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rational)) return false;
        Rational rational = (Rational) o;
        return (this.licznik / this.mianownik) == (rational.licznik / rational.mianownik);
    }
    @Override
    public int hashCode() {
        return Objects.hash(licznik, mianownik);
    }

    @Override
    public String toString() {
        return "Rational{" +
                "licznik=" + licznik +
                ", mianownik=" + mianownik +
                '}';
    }
}
