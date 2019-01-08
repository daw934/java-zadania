package set1.task2;

import java.math.BigInteger;
import java.util.Optional;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1");
        Scanner scanner = new Scanner(System.in);
            int n =scanner.nextInt();
            if(n < 0){
                System.out.println("tylko liczby nieujemne");
            }else if(n == 0 || n==1){
                System.out.println(1);
            }else {
                n += 1;
                for (int i = 2; i < n; i++) {
                    bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
                }
                System.out.println(bigInteger.toString());
            }
    }
}

