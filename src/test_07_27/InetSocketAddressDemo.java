package test_07_27;

import java.net.InetSocketAddress;

public class InetSocketAddressDemo {
    public static void main(String[] args) {
        InetSocketAddress isa = new InetSocketAddress("localhost", 8080);
        System.out.println(isa.getAddress());
        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());

    }
}
