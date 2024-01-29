package code_directory.java_code.io.file_creation;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class creatnewfile {
    public static void main(String args[]){
        try{
            // get input from user which is file or path 
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the file name ");
            String filename;
            filename=input.nextLine();
            
            //function calling
            newfile(filename);
            System.out.println("");
            fileinfo(filename);
            System.out.println("");
            renaming(filename);
            System.out.println("");
            filedelete(filename);
            input.close();


        }
        catch(Exception e){
            e.printStackTrace();
        }
    
    }

   //create new file
    public static void newfile(String path) throws IOException{
        // new file creation
        File newfil=new File(path);

        //check the file is exsit ro not 
        if(newfil.exists()){
            System.out.println("File is aldready exist");
        }else{
            //confirm the new file creat and is not creat show failed 
            if(newfil.createNewFile()){
                System.out.println("file is sucessfullu create ");
            }else{
                System.out.println("file creatio is failed ");
            }
        }
    
    }

    // this function is renaming for specific file
    public static void renaming(String path) throws IOException{
        // new file object creation for previous file name
        File previousfileobj=new File(path);
        Scanner input=new Scanner(System.in);
        // copy the parent directory
        String renamefile=previousfileobj.getParent();
        String filename;
        //get name for rename to file from user  
        System.out.println("enter the file name :");
        filename=input.nextLine();
        //attach parent directory with rename name 
        renamefile=renamefile.concat("\\"+filename);
        
        File renamefileobj=new File(renamefile);
        //renaming area
        if(previousfileobj.exists()){
           
            //renaming opareation by using renameto method    
            boolean renamecheck=previousfileobj.renameTo(renamefileobj);
            if(renamecheck){
                System.out.println("rename is sucessfully");
            }else{
                System.out.println("rename is faild ");
            }
        }
        else{
            System.out.println("File is not exist ");
        }
        input.close();
    }

    // this function is peerform file delete operation
    public static void filedelete(String path) throws IOException{
        // create the file ovject 
        File deletefileobj=new File(path);

        //check the file is exist or not 
        if(deletefileobj.exists()){
            if(deletefileobj.delete()){
                System.out.println("file is succesfully delete");
            }else{
                System.out.println("Failed for file delete");
            }
            
        }
        else{
            System.out.println("file is not exist");
        }
    }

    // get basic information about current file  
    public static void fileinfo(String path)throws IOException{
        //put file path for object 
        File fileinfoobj =new File(path);

        //checking the file exist  or not 
        if(fileinfoobj.exists()){
            //show basic details abot file 
            System.out.println("Information about file-"+fileinfoobj.getName());

            String nameoffile=fileinfoobj.getName();
            System.out.println("File name         : "+nameoffile);
            String rightpath=fileinfoobj.getAbsolutePath();
            System.out.println("Right path        : "+rightpath);
            String Parentdirectory=fileinfoobj.getParent();
            System.out.println("Parent directory  : "+Parentdirectory);
            long lastModification=fileinfoobj.lastModified();
            System.out.println("Last modification : "+lastModification);
            long freespace=fileinfoobj.getFreeSpace();
            System.out.println("Free Space        : "+freespace);
            String filepath=fileinfoobj.getPath();
            System.out.println("File path         : "+filepath);
            long Length=fileinfoobj.length();
            System.out.println(fileinfoobj.getName()+" is Lenth of file "+Length+" Byte");
        }else{
            System.out.println("File is not Exist");
        }
    }
}
