package org.example;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClienteTCPBasico {

    public static void main(String[] args)
            throws UnknownHostException, IOException {
        Socket s = new Socket("test.rebex.net", 21);
        Scanner entrada = new Scanner(s.getInputStream());
        System.out.println(entrada.nextLine());
        s.close();
    }

}
