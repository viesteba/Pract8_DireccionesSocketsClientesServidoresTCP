import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.net.UnknownHostException;
import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) throws UnknownHostException, IOException {
    Apartado3();
}

public static void Apartado2b() throws UnknownHostException, IOException {
    //Cliente TCP básico
    String linea;
    Socket s = new Socket("djxmmx.net", 17);
    Scanner entrada = new Scanner(s.getInputStream());
    while (entrada.hasNextLine()) {
        System.out.println(entrada.nextLine());
    }
    s.close();
}

public static void Apartado2c() throws IOException{
    //Cliente HTTP
    Socket s = new Socket("www.upv.es",80);
    Scanner entrada = new Scanner(s.getInputStream());
    PrintWriter salida = new PrintWriter(s.getOutputStream(),true);
    salida.print("GET / HTTP/1.0\r\n");
    salida.print("\r\n");
    salida.flush();
    while(entrada.hasNextLine()){
        System.out.println(entrada.nextLine());
    }
    s.close();
}

public static void Apartado3() throws IOException{
    //Servidor TCP simple
    ServerSocket ss = new ServerSocket(55555);
    //no podemos poner ningun puerto entre 0 y 1023, es preferible que sea superior a 2x52
    Socket s = ss.accept();
    PrintWriter salida = new PrintWriter(s.getOutputStream(),true);
    salida.println("Bienvenido al servidore de prueba de Redes de Computadores");
    salida.flush();
    s.close();
    ss.close();
}
public static void Apartado4() throws IOException{
    //Servidor TCP iterativo
    ServerSocket ss = new ServerSocket(55555);
    int cliente = 0;
    while(true){
        Socket s = ss.accept();
        PrintWriter salida = new PrintWriter(s.getOutputStream(),true);
        cliente ++;
        salida.println("Bienvenido al servidor de Redes. Usted es el cliente numero: "+cliente);
        salida.flush();
        System.out.println("Se ha conectado el cliente numero "+cliente);
        s.close();
    }
}
public static void Apartado5() throws IOException{
    //Servidor de tablas de multiplicar
    ServerSocket ss = new ServerSocket(55555);
    while(true){
        Socket s = ss.accept();
        //no podemos poner ningun puerto entre 0 y 1023, es preferible que sea superior a 2x52
        PrintWriter salida = new PrintWriter(s.getOutputStream(),true);
        Scanner entrada = new Scanner(s.getInputStream());
        salida.println("Bienvenido al servidor de Redes. Introduce un número entre 1 y 9");
        //Esperar a que lo reciba y cuando lo reciba enviar la tabla de multiplicar
        //Si le pone el número 0 cierra la conexión
        //Si le pone un número negativo raro como -33 333 cierra el servidor
        //Para cualquier otro número envía la tabla de multiplicar.
        salida.flush();
        int multiplicando = entrada.nextInt();
        for(int multiplicador = 1; multiplicador <10; multiplicador++){
            salida.println(multiplicando + "x" + multiplicador);
        }
        salida.flush();
        salida.
    }

}