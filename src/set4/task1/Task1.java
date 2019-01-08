package set4.task1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task1 {

    private final static String ISO = "ISO8859_2";
    private final static String UTF = "UTF-8";
    private final static String WINDOWS = "windows-1250";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String format = UTF;
        System.out.format("choose the format: \n 1:%s \n 2:%s \n 3:%s \n",ISO,UTF,WINDOWS);
        switch (scanner.nextInt()){
            case 1:format=ISO;
            break;
            case 2:format=UTF;
            break;
            case 3:format=WINDOWS;
        }
        try { OutputStream outputStream = new FileOutputStream("D:\\zadania\\zadanie1.2\\src\\file.txt");
           OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream,format);
            System.out.println("TEXT format:"+format);
            scanner.nextLine();
           String line = scanner.nextLine();
            outputStreamWriter.write(line);
            outputStreamWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
