package set2.task1;

import java.util.Objects;

public class Rational implements Comparable<Rational>{
    private int licznik;
    private int mianownik;

    public Rational(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }
    public Rational add(Rational arg){
        if(arg.mianownik == this.mianownik){
            return new Rational(this.licznik+arg.licznik,this.mianownik);
        }
        int licznikT = this.licznik*arg.mianownik;
        int mianownikT = this.mianownik*arg.mianownik;

        int licznikA = arg.licznik*this.mianownik;
            return new Rational
                (licznikT+licznikA,mianownikT);
    }

    public Rational mul(Rational arg){
        int licznik = arg.licznik*this.licznik;
        int mianownik = arg.mianownik*this.mianownik;
        return new Rational(licznik,mianownik);
    }
    public Rational sub(Rational arg){
        if(arg.mianownik == this.mianownik){
            return new Rational(this.licznik-arg.licznik,this.mianownik);
        }
        int licznikT = this.licznik*arg.mianownik;
        int mianownikT = this.mianownik*arg.mianownik;

        int licznikA = arg.licznik*this.mianownik;
        return new Rational
                (licznikT-licznikA,mianownikT);
    }
    public Rational div(Rational arg){
        int licznik = this.licznik*arg.mianownik;
        int mianownik = this.mianownik*arg.licznik;
        return new Rational(licznik,mianownik);
    }
    //int,, nie wdziala
    @Override
    public int compareTo(Rational rational) {
        double first = (double)this.licznik / (double)this.mianownik;
        double second = (double)rational.licznik / (double)rational.mianownik;
        if(first>second)
            return 1;
        else if (first==second)
            return 0;
        else return -1;
    }
    //int,, nie wdziala
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rational)) return false;
        Rational rational = (Rational) o;
        return ((double)this.licznik / (double)this.mianownik) == ((double)rational.licznik / (double)rational.mianownik);
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
