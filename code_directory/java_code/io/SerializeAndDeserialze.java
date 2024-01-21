package code_directory.java_code.io;


import java.io.*;
public class SerializeAndDeserialze {
    public static void main(String test[]){
        try{
        testableClass tc=new testableClass(1, "tamizhi");
        }catch(IOException e){
            
        }
    }
}

class testableClass implements Serializable{
    private static final long SerialVersionUID=1L;
    private int id ;
    private String name;
    
    testableClass(int id,String name){
        id=this.id;
        name=this.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
