package SOCKET;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientSocket {

    public static void main(String[] args) throws IOException {
        InetAddress inetAddress = InetAddress.getByName(null);
        //InetAddress inetAddress = InetAddress.getByName("127.0.0.1);
        //InetAddress inetAddress = InetAddress.getByName("localhost");
        Socket socket=new Socket(inetAddress,8090);
        try{
            System.out.println("Socket = "+socket);

            BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);

            for (int i = 0; i < 10000; i++) {
                out.println("howdy " +i);
                String s=in.readLine();
                System.out.println(s);
            }
            out.println("END");

        }finally {
            System.out.println("closing ...");
            socket.close();
        }
    }
}
