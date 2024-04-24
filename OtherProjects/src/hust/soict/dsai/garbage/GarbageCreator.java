package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GarbageCreator {    public static void main(String[] args) throws IOException {
    final String fileName = "/home/bhtu/Downloads/funny turtles.mp4";
    byte[] bs = {0};
    long startTime, endTime;

    try {
        bs = Files.readAllBytes(Path.of(fileName));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

    startTime = System.currentTimeMillis();
    Appendable ouputS;
    ouputS = new StringWithAdd(); // this is a String wrapper to use with <append> methode;
    //ouputS = new StringBuilder();
    for (var b : bs) {
        ouputS.append((char) b);
    }

    endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);
    }
}
