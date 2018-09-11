package test_07_27;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientDemo {
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) throws IOException {
        Socket s = new Socket();
        s.connect(new InetSocketAddress("localhost", 8090));
        OutputStream out = s.getOutputStream();
        File file = new File("D:\\a.txt");
        byte[] name = new byte[1024];
        out.write(name.length - 128);
        out.write(name);
        FileInputStream fin = new FileInputStream(file);
        byte[] bs = new byte[1024];
        int len = -1;
        while ((len = fin.read(bs)) != -1)
            System.out.println(new String(bs, 0, len));
        s.shutdownOutput();
        fin.close();
    }
}
