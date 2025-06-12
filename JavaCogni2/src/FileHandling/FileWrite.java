package FileHandling;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        String data = "Subhasish Kabi";
        FileWriter fw = new FileWriter("E:/testing/JavaCogni2/fileWriter.txt");
        for (int i = 0; i < data.length(); i++) {
            fw.write(data.charAt(i));
        }
        fw.close();
    }
}
