package set1.task3;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        long sum=0;
        for (int i = 1; i <= n; i+=2) {
                sum+=i;
        }
        System.out.println("wynik = "+sum);
}

}
