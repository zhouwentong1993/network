package org.wentong.sample1;

import java.net.ServerSocket;

/**
 * 全连接队列溢出
 */
public class Server {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8888, 2);
        System.out.println("Started on 8888!");
        Thread.currentThread().join();
//        Socket accept = ss.accept();
    }

}
