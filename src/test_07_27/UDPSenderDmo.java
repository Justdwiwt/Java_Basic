package test_07_27;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPSenderDmo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        DatagramPacket dp = new DatagramPacket("test".getBytes(), "test".getBytes().length,
                new InetSocketAddress("localhost", 8090));
        ds.send(dp);
        ds.close();
    }
}
