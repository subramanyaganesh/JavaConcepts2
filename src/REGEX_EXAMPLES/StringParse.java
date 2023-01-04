package REGEX_EXAMPLES;

import java.util.Scanner;

public class StringParse {
    public static void main(String[] args) {
        String s = "Port    IP              Netmask         PrimaryIP   Name                        \n" +
                "----------------------------------------------------------------------------\n" +
                "mgm b    10.196.39.200   255.255.255.0   Yes     \n" +
                "1       10.100.10.2     255.255.255.0   Yes                                     \n" +
                "2       10.100.12.1     255.255.255.0   Yes                                     \n" +
                "\n";
        String[] values;
        String[] finalvalue = new String[10];
        Scanner input = new Scanner(s);
        while (input.hasNextLine()) {
            String line = input.nextLine();

            values = line.split("(?<=\\d)\\s+(?=[^x])|(?<=[^x])\\s+(?=\\d)");
            try {
                for (int i = 0; i < 5; i++) {
                    if (values[i] == null)
                        values[i] = "";
                    finalvalue[i] = values[i];
                    //System.out.println(i + "th line:::" + finalvalue[i]);
                }
            } catch (Exception e) {
                if (finalvalue[3]!=null)finalvalue[4]="";
                continue;
            }
        }
        for (int i=0;i<5;i++)
            System.out.println(finalvalue[i]);
    }
}
