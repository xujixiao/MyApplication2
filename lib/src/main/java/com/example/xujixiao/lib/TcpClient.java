package com.example.xujixiao.lib;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 6666);
            socket.connect(inetSocketAddress);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("xujixiaotcp".getBytes());
            socket.close();
        } catch (Exception e) {

        }
    }
}
