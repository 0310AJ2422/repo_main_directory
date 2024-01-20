package java_code.io_code;

import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.lang.reflect.Field;

public class objectstream{
    public static void main(String args[]){
        ObjectStreamClass osc=ObjectStreamClass.lookup(MyClass.class);
        Class<?> oscForClass = osc.forClass();

        System.out.println("Original ObjectStreamClass"+ osc);
        System.out.println("class name "+osc.getName());
        System.out.println("SerialVersionUID "+osc.getSerialVersionUID());
        System.out.println("fileds");

        for(ObjectStreamField field : osc.getFields()){
            System.out.println("  "+field.getName()+" : "+field.getType());
        }

        System.out.println("ObjectStreamClass obtained with forClass()"+ oscForClass);
        System.out.println("class name "+oscForClass.getName());
       // System.out.println("SerialVersionUID "+oscForClass.getSerialVersionUID());
        System.out.println("fileds");
        for(Field fields : oscForClass.getFields()){
            System.out.println("  "+fields.getName()+" : "+fields.getType());
        }

    }
}
class MyClass implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    // Other class members and methods
}