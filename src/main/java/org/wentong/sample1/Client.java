package org.wentong.sample1;

import java.net.Socket;

/**
 * 全连接队列溢出
 */
public class Client {

    public static void main(String[] args) throws Exception {
        System.out.println("Started on: " + System.currentTimeMillis());
        try {

            for (int i = 0; i < 10; i++) {
                Socket socket = new Socket("127.0.0.1", 8888);
                System.out.println(socket.getPort());
            }
        } finally {
            System.out.println("End on: " + System.currentTimeMillis());
        }
    }

}
