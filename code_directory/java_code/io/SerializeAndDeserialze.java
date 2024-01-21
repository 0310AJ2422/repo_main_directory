package code_directory.java_code.io;


import java.io.*;
public class SerializeAndDeserialze {
    public static void main(String test[]) throws ClassNotFoundException{
        
        //serialize an object 
        try(ObjectOutputStream obs=new ObjectOutputStream(new FileOutputStream("files.bat"))){
            testableClass test1=new testableClass(1, "tamizhi");
            obs.writeObject(test1);
        }catch(IOException e){
            e.printStackTrace();    
        }

        //deserialize an object 
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("files.bat"))){
                
            Object obj=ois.readObject();
            
            if(obj instanceof testableClass){
                testableClass test2=(testableClass)obj;

                //use objectstreamclass.lookup to get information of class
                ObjectStreamClass osc= ObjectStreamClass.lookup(testableClass.class);

                System.out.println("Class name: "+osc.getName());
                System.out.println("serialversionUID "+osc.getSerialVersionUID());

                //get information about the field of the class 

                ObjectStreamField[] osf=osc.getFields();
                for(ObjectStreamField fs:osf){
                    System.out.println("Field name "+fs.getName());
                    System.out.println("Field type "+fs.getType());
                }
                System.out.println("deserialize object "+test2);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

class testableClass implements Serializable{
    private static final long SerialVersionUID=1L;
    private int id ;
    private String name;
    
    

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

    testableClass(int id,String name){
        id=this.id;
        name=this.name;
    }
    
     @Override
    public String toString() {
        return "MyClass{field1=" + id + ", field2='" + name + '\'' + '}';
    }
    
}
