package java_code.io_code;

import java.io.*;


 public class objectstream {
    public static void main(String[] args) {
        ObjectStreamClass osc = ObjectStreamClass.lookup(MyClass.class);
        Class<?> osc1=osc.forClass();

        System.out.println(osc1.getName());
        System.out.println(osc.getSerialVersionUID());
    }
}

class MyClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private int myInt;
    private String myString;

    public MyClass(int myInt, String myString) {
        this.myInt = myInt;
        this.myString = myString;
    }

    public int getMyInt() {
        return myInt;
    }

    public String getMyString() {
        return myString;
    }
}
