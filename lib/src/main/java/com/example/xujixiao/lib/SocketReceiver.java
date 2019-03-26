package com.example.xujixiao.lib;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SocketReceiver {
    public static void main(String[] args) {
        try {
            System.out.print("接收方启动了");
            DatagramSocket datagramSocket = new DatagramSocket(6666);
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            datagramSocket.receive(datagramPacket);
            System.out.print(datagramSocket.getInetAddress());
            System.out.println();

            String s = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            System.out.print(s);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
