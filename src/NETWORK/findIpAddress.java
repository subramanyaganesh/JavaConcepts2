package NETWORK;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class findIpAddress {
    public static void main(String[] args) throws UnknownHostException {
        /*InetAddress a=Inet4Address.getByName("MREMF16E8D14");
        System.out.println(a);*/
        System.out.print(Inet4Address.getLocalHost().getHostName());

    }
}
