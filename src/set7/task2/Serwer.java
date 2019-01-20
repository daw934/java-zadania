
package set7.task2;
import java.net.*;
import java.io.*;


public class Serwer {

   
    public static void main(String[] args) {
       ServerSocket server;
        try {
            server = new ServerSocket(9696);
            while(true) {
                Socket polaczenie = server.accept();
                Thread t = new Thread(
                new Gracz(polaczenie));
                t.start();
            }
            }
        catch (IOException e) {
        System.out.println(e.toString());
        }
        }
    }
    

