package InputOutputStream;

import CONTAINER.Displayer;

import java.io.*;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

import static InputOutputStream.MapReplaceFunction.filldata;

public class dfghjkjhgfds {

    public void mainad() throws Exception {
        //normal way of defining a file location:-advantage of this is that the file can be anywhere
        /*InputStream i = new BufferedInputStream(new FileInputStream("/Users/subramanya.ganesh/Documents/" + "mytext.txt"));
        OutputStream o=new BufferedOutputStream(new FileOutputStream("/Users/subramanya.ganesh/Documents/" + "mytext.txt"));*/


        //using reflections to get the file at the run time :::::: the file from which it reads or writes is from the
        //production file (target/out) where in the file name that u specify will be present
        //note :: in order to make this work(.getResources) the project structure must have your file in marked as Resources field

        OutputStream o = new BufferedOutputStream(new FileOutputStream(getClass().getProtectionDomain().getCodeSource().getLocation().getPath()+"filing.txt"));
        InputStream i = new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("filing.txt"));

        BufferedWriter br=new BufferedWriter(new OutputStreamWriter(o));
        br.write(filldata().toString());
        br.newLine();
        br.write(filldata().toString());
        br.newLine();
        br.write(filldata().toString());
        br.flush();
        br.close();


        BufferedReader bf = new BufferedReader(new InputStreamReader(i));
        AtomicInteger it=new AtomicInteger(1);
        /*System.out.println(bf.readLine());*/
        bf.lines().forEach(a->{
            System.out.println(a);
            System.out.println(it.getAndIncrement());
        });
    }

    /*bf.lines().forEach(System.out::println);*/
    public static void main(String[] args) throws Exception {
        new dfghjkjhgfds().mainad();

            }

}
