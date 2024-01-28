package code_directory.java_code.io.file_creation;

import java.io.File;
import java.io.IOException;

public class creatempfile{
    public static void main(String aj[]){
        
        try{
            // Creating a temporary file with a custom prefix and suffix
            File newfile=File.createTempFile("demo", ".bat");

             // Note: The temporary file will be deleted automatically when the JVM exits.
            System.out.println("tempovary is created :"+newfile.getAbsolutePath());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}