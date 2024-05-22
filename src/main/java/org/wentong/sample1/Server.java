package org.wentong.sample1;

import java.net.ServerSocket;

import static java.net.StandardSocketOptions.SO_REUSEPORT;

/**
 * 全连接队列溢出
 */
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8888);
        ss.setOption(SO_REUSEPORT, true);
        ss.setReuseAddress(true);
        System.out.println("Started on 8888!");
        Thread.currentThread().join();
    }
}
