package code_directory.java_code.io;


import java.io.*;

public class pushbbackinputstreamclass{
    public static void main(String[] args) {
        String data="public class PushbackInputStreamExample {\r\n" + 
                "    public static void main(String[] args) {\r\n" + 
                "        String data = \"Hello, World!\";\r\n" + 
                "        byte[] byteArray = data.getBytes();\r\n" + //
                "\r\n" + //
                "        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArray);\r\n" + //
                "             PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream))";
        byte[] bytearray=data.getBytes();

        try(ByteArrayInputStream bis=new ByteArrayInputStream(bytearray);
            PushbackInputStream pis=new PushbackInputStream(bis)){
                
                int dat;
                 // Read the first 30 bytes
                for(int i=0;i<250;i++){
                    dat=pis.read();
                    System.out.print((char)dat);
                }

                // Push back the last byte
                pis.unread(bytearray[250]);
                
                // Read all bytes again
                System.out.println("-");
                while((dat=pis.read())!=-1){
                    System.out.print((char)dat);
                }

              



        }catch(IOException e){
            System.out.println(e);
        }
    }
}