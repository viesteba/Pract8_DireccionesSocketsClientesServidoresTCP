package org.example;

import java.net.*;

public class InetAddressExample2 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);

            InetAddress name = InetAddress.getByName("www.elmundo.es");
            System.out.println(name);

            for (int j = 0; j < args.length; j++) {
                InetAddress[] list = InetAddress.getAllByName(args[j]);
                System.out.print("Se han obtenido " + list.length + " direcciones");
                System.out.println(" para " + list[0].getHostName());

                for (int i = 0; i < list.length; i++) {
                    System.out.println("\t" + list[i].getHostAddress());
                }
            }

        } catch (UnknownHostException e) {
            System.out.println("Incapaz de determinar la dirección de este host");
        }
    }
}
