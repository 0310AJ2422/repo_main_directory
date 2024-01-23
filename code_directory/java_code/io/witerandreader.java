package code_directory.java_code.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class witerandreader {
    
    public static void main(String args[]) {
        String message = "nothing here just this testing area";
        String inputPath = "file1.txt";
        String outputPath = "file2.txt";

        // Writing to file1.txt
        try (Writer writer = new FileWriter(inputPath)) {
            writer.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from file1.txt and writing to file2.txt
        try (Reader reader = new FileReader(inputPath);
             Writer writer = new FileWriter(outputPath)) {

            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
