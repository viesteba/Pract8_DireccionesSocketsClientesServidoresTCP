package org.example;

import java.net.*;
import java.io.*;

public class InetAddressExample {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress d;

        d = InetAddress.getLocalHost();
        System.out.println(d);
        System.out.println(d.getHostName());
        System.out.println(d.getHostAddress());

        d = InetAddress.getByName("www.elpais.com");
        System.out.println(d);
        System.out.println(d.getHostName());
        System.out.println(d.getHostAddress());

        InetAddress list[];
        list = InetAddress.getAllByName("www.google.es");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getHostName());
            System.out.println(list[i].getHostAddress());
        }
    }
}
