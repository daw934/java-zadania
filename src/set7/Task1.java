package set7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Task1 {
    public static void main(String[] args) {
        String nazwahosta;
        if(args.length >0){
            nazwahosta = args[0];
        }else {
            nazwahosta = "time-a.nist.gov";
        }
        nazwahosta = "time-b.nist.gov";
        try {
            Socket gniazdo = new Socket(nazwahosta,37);
            InputStream strumien = gniazdo.getInputStream();
            BufferedReader bufor = new BufferedReader(new InputStreamReader(strumien));
            String wiersz = "";
            while (wiersz !=null){
                wiersz = bufor.readLine();

                System.out.println(bufor.read());

            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
