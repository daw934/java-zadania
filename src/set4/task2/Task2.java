package set4.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Task2 {



    public static void main(String[] args) {
        String file = "D:\\zadania\\zadanie1.2\\src\\file.txt";
        String gzipFile ="D:\\zadania\\zadanie1.2\\src\\filegzip.zip";
        String newFile = "D:\\zadania\\zadanie1.2\\src\\fileNew.txt";

        compress(file,gzipFile);
        decompress(gzipFile,newFile);
    }
    private static void compress(String file,String gzipFile){
        byte[] buffer = new byte[1024];
        try (GZIPOutputStream gzipOutputStream = new GZIPOutputStream(new FileOutputStream(gzipFile));
             FileInputStream fileInputStream = new FileInputStream(file)){
            int len;
            while ((len = fileInputStream.read(buffer)) !=-1){
                gzipOutputStream.write(buffer,0,len);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    private static void decompress(String gzipFile,String file){
        byte[] buffer = new byte[1024];
        try (GZIPInputStream gzipInputStream= new GZIPInputStream(new FileInputStream(gzipFile));
             FileOutputStream fileOutputStream= new FileOutputStream(file)){
            int len;
            while ((len = gzipInputStream.read(buffer)) !=-1){
                fileOutputStream.write(buffer,0,len);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


}
