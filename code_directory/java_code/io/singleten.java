package code_directory.java_code.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class singleten {

    private static final singleten obj=new singleten();
    private static final String File_Path ="application.log";

    singleten(){}

    public static singleten getInstance(){
        return obj;
    }

    public void log(String meassage){
        try(PrintWriter pw=new PrintWriter(new FileWriter(File_Path,true))){
            pw.println(meassage);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
