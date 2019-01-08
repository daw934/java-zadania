package set1.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while (true) {
           int number = scanner.nextInt();
           System.out.println(Task4.getBinary(number));
           System.out.println(Task4.getOctal(number));
           System.out.println(Task4.getHex(number));
       }
       }
    public static String getBinary(int number){
        return Integer.toBinaryString(number);
    }
    public static String getOctal(int number){
        return Integer.toOctalString(number);
    }
    public static String getHex(int number){
        return Integer.toHexString(number);
    }
}
