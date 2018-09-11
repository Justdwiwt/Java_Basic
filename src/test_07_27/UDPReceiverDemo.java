package test_07_27;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiverDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8090);
        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
        ds.receive(dp);
        ds.close();
        byte[] bs = dp.getData();
        int len = dp.getLength();
        System.out.println(new String(bs,0,len));
    }
}
