package org.example;

import java.net.*;
import java.io.*;
import java.util.Scanner;

class ClienteTCP {
    public static void main(String args[]) throws UnknownHostException, IOException {
        Socket s = new Socket("zoltar.redes.upv.es", 21);
        Scanner entrada = new Scanner(s.getInputStream());
        System.out.println(entrada.nextLine());
        s.close();
    }
}
