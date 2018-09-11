package test_07_29;

import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class TestCode {
    public static void main(String[] args) {
    }
}

class Client implements Runnable {
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

    String ss = sc.nextLine();

    @SuppressWarnings({"Duplicates", "InfiniteLoopStatement"})
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

class Server implements Runnable {
    private DatagramSocket ds;
    private DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);

    {
        try {
            ds = new DatagramSocket(8090);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
    File file=new File("\\worldcup.txt");

    @SuppressWarnings({"Duplicates", "InfiniteLoopStatement"})
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