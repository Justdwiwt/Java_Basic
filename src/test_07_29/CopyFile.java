package test_07_29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("E:\\a.txt");
        FileOutputStream outputStream = new FileOutputStream("D:\\a.txt");
        byte[] bs = new byte[1024 * 10];
        int len = -1;
        while ((len = inputStream.read(bs)) != -1)
            outputStream.write(bs, 0, len);
        inputStream.close();
        outputStream.close();
    }
}
