package test_07_27;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerDemo {
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8085);
        ss.accept();
        Socket s = ss.accept();
        InputStream in = s.getInputStream();
        byte[] bs = new byte[1024];
        int len = -1;
        while ((len = in.read(bs)) != -1)
            System.out.println(new String(bs, 0, len));
        s.getOutputStream().write("Client: success".getBytes());
        s.shutdownOutput();
        s.close();
    }
}
