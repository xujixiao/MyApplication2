package com.example.xujixiao.lib;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SocketSend {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            String str = "xujixiao";
            byte[] bytes = str.getBytes();
            InetAddress inetAddress = InetAddress.getLocalHost();
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, inetAddress, 6666);
            datagramSocket.send(datagramPacket);
            datagramSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
