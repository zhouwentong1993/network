package org.wentong.sample2;

import java.net.InetSocketAddress;
import java.net.Socket;

import static java.net.StandardSocketOptions.SO_REUSEPORT;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Started on: " + System.currentTimeMillis());
        try {

//            for (int i = 0; i < 10; i++) {
                Socket socket = new Socket();
                socket.setOption(SO_REUSEPORT, true);
                socket.setReuseAddress(true);
                socket.bind((new InetSocketAddress(8888)));
                socket.connect(new InetSocketAddress("www.baidu.com", 80));
//            }
        } finally {
            System.out.println("End on: " + System.currentTimeMillis());
        }
    }
}
