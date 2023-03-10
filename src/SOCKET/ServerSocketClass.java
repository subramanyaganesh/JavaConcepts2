package SOCKET;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketClass {
    public static void main(String[] args) throws IOException {
        ServerSocket s=new ServerSocket(8090);
        System.out.println("Started: "+s);
        try{
            Socket socket=s.accept();
            try{
                System.out.println("connection accepted: "+s);

                BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);

                while (true){
                    String str=in.readLine();
                    if (str.equals("END"))break;
                    System.out.println("Echoing: "+str);
                    out.println(str);
                }
            }finally {
                System.out.println("closing...");
                socket.close();
            }
        }finally {
            s.close();
        }
    }
}
