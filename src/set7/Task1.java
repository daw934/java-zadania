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

        if (args.length > 0) {
            nazwahosta = args[0];}
        else {
            nazwahosta = "time-a.nist.gov"; }
        try {
            Socket gniazdo = new Socket(nazwahosta, 37);
            InputStream strumien = gniazdo.getInputStream();
            long l;
            long res=0;
            for(int i=24;i>=0;)
            {
                System.out.println("dsd");
                l = strumien.read();
                res+= l<<i;
                i-=8;
            }

            System.out.println("Czas: "+res);
        }
        catch (UnknownHostException e) {
            System.err.println(e);
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}
