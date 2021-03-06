package test_07_27;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPChatDemo {
    public static void main(String[] args) {
        new Thread(new Sender()).start();
        new Thread(new Receiver()).start();

    }
}

@SuppressWarnings("FieldCanBeLocal")
class Sender implements Runnable {
    private DatagramSocket ds;
    private DatagramPacket dp;
    private Scanner sc;

    {
        try {
            ds = new DatagramSocket();
            sc = new Scanner(System.in);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        while (true) {
            byte[] bs = sc.nextLine().getBytes();
            dp = new DatagramPacket(bs, bs.length, new InetSocketAddress("localhost", 8090));
            try {
                ds.send(dp);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class Receiver implements Runnable {
    private DatagramSocket ds;
    private DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);

    {
        try {
            ds = new DatagramSocket(8090);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        while (true) {
            try {
                ds.receive(dp);
                System.out.println(dp.getAddress() + ":");
                System.out.println(new String(dp.getData(), 0, dp.getLength()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}