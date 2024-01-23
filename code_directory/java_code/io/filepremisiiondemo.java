package code_directory.java_code.io;

import java.io.FilePermission;
import java.security.PermissionCollection;


public class filepremisiiondemo {
   
    public static void main(String args[]){
        try{
            String files="E:\\repository\\repo_main_directory\\code_directory\\java_code\\io\\demo.txt";
            FilePermission fm=new FilePermission(files,"read");
            PermissionCollection permission=fm.newPermissionCollection();
            permission.add(fm);
            FilePermission fm1=new FilePermission(files,"write");
            permission.add(fm1);

            if(permission.implies(new FilePermission(files, "read,write"))) {  
                System.out.println("Read, Write permission is granted for the path "+files );  
                }else {  
               System.out.println("No Read, Write permission is granted for the path "+files);       
              }  

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
