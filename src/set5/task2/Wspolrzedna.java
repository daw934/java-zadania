package set5.task2;

import java.util.Objects;

public class Wspolrzedna implements Comparable<Wspolrzedna> {
    private int x,y;

    public Wspolrzedna(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Wspolrzedna{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Wspolrzedna wspolrzedna) {
        if (this.x==wspolrzedna.x)
            return this.y-wspolrzedna.y;
        else return this.x-wspolrzedna.x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wspolrzedna)) return false;
        Wspolrzedna that = (Wspolrzedna) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
