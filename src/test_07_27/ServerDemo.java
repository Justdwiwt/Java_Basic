package test_07_27;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    @SuppressWarnings({"UnusedAssignment", "ResultOfMethodCallIgnored"})
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8090);
        Socket s = ss.accept();
        InputStream in = s.getInputStream();
        byte len = (byte) in.read();
        byte[] name = new byte[len + 128];
        in.read(name);
        FileOutputStream fout = new FileOutputStream("C:\\" + new String(name));
        byte[] bs = new byte[1024];
        int i = -1;
        while ((i = in.read(bs)) != -1)
            System.out.println(new String(bs, 0, i));
        s.shutdownOutput();
        fout.close();
        ss.close();
    }
}
