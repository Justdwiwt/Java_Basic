package test_07_27;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClientDemo {
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) throws IOException {
        Socket s = new Socket();
        s.connect(new InetSocketAddress("localhost", 8085), 5000);
        OutputStream out = s.getOutputStream();
        out.write("Client test".getBytes());
        s.shutdownOutput();
        InputStream in = s.getInputStream();
        byte[] bs = new byte[1024];
        int len = -1;
        while ((len = in.read(bs)) != -1)
            System.out.println(new String(bs, 0, len));
        s.close();
    }
}
