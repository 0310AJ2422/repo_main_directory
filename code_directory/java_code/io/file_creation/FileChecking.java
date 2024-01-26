package code_directory.java_code.io.file_creation;

import java.io.File;
import java.util.Scanner;

public class FileChecking{
    
    public static void main(String args[]){
        
        try(Scanner input=new Scanner(System.in)){
      
            String filename="";
            System.out.println("enter the file name with extention:");
            filename=input.nextLine();
        File file=new File(filename);
        if(file.createNewFile()){
            System.out.println("new file is succesfully create...");
        }else{
            System.out.println("the file is aldready exsist...");
        }
    }catch(Exception e){
       System.out.println(e);
    }    
    }
}