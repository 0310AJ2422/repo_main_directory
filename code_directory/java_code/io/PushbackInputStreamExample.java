package code_directory.java_code.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamExample{
    public static void main(String[] args) {
        String inputData = "123abc456";
        byte[] inputBytes = inputData.getBytes();

        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(inputBytes);
             PushbackInputStream pushbackStream = new PushbackInputStream(inputStream)) {

            int currentByte;

            // Read the digits
            while ((currentByte = pushbackStream.read()) != -1 && Character.isDigit((char) currentByte)) {
                System.out.print((char) currentByte);
            }

            // Push back the non-digit character
            if (currentByte != -1) {
                pushbackStream.unread(currentByte);
            }

            // Continue reading from where we left off
            while ((currentByte = pushbackStream.read()) != -1) {
                System.out.print((char) currentByte);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
