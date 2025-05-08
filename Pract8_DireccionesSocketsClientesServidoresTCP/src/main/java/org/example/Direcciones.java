package org.example;

import java.net.*;
import java.io.*;

public class Direcciones {

    public static void main(String[] args) {
        InetAddress direccion;
        try {
            direccion = InetAddress.getLocalHost();
            System.out.println("direccion = InetAddress.getLocalHost()");
            System.out.println("direccion = " + direccion);
            System.out.println("direccion.getHostName() = " + direccion.getHostName());
            System.out.println("direccion.getHostAddress() = " + direccion.getHostAddress());

            System.out.println();
            direccion = InetAddress.getByName("www.unirioja.es");
            System.out.println("direccion = InetAddress.getByName(\"www.unirioja.es\")");
            System.out.println("direccion = " + direccion);
            System.out.println("direccion.getHostName() = " + direccion.getHostName());
            System.out.println("direccion.getHostAddress() = " + direccion.getHostAddress());

        } catch (UnknownHostException e) {
            System.out.println("Incapaz de determinar esta dirección de host");
        }
    }
}
