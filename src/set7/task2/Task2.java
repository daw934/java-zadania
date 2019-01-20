package set7.task2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        PrintWriter out;
        BufferedReader in;
        try {
            Socket socket = new Socket("localhost",9696);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String result;
            Scanner scanner = new Scanner(System.in);
            result = in.readLine();
            System.out.println(result);
            do {
                out.println(scanner.next());
                result = in.readLine();
                System.out.println(result);
            }while (!result.equals("bum"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
