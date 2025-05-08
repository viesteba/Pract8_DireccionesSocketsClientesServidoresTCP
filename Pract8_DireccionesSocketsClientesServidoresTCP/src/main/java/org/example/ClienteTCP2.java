package org.example;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClienteTCP2 {

    public static void main(String[] args)
            throws UnknownHostException, IOException {
        // Conectamos al servidor HTTP en el puerto 80
        Socket s = new Socket("www.upv.es", 80);

        // Stream de entrada para leer la respuesta
        Scanner entrada = new Scanner(s.getInputStream());

        // Stream de salida para enviar la petición HTTP
        PrintWriter salida = new PrintWriter(s.getOutputStream());

        // Enviamos petición HTTP/1.0 al recurso raíz
        salida.print("GET / HTTP/1.0" + "\r\n");
        salida.print("\r\n");  // Línea en blanco que cierra el encabezado
        salida.flush();

        // Imprimimos la primera línea de la respuesta
        if (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }

        // Cerramos socket y streams
        entrada.close();
        salida.close();
        s.close();
    }
}