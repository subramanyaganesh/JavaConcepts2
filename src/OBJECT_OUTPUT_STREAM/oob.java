package OBJECT_OUTPUT_STREAM;

import java.io.*;

import static InputOutputStream.MapReplaceFunction.filldata;

public class oob extends ObjectOutputStream {

    public oob(OutputStream out) throws IOException {
        super(out);
    }

    void put(Object o) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/subramanya.ganesh/Documents/mytext.txt"));
            objectOutputStream.writeObject(o);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    void putingb(Object o) {
        try {
           /* BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream("/Users/subramanya.ganesh/Documents/mytext.txt"));
            bufferedOutputStream.*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Object get() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/Users/subramanya.ganesh/Documents/mytext.txt"));
            System.out.println(inputStream.readObject());
            return inputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public static void main(String[] args) throws Exception {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(filldata());
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("/Users/subramanya.ganesh/Documents/mytext.txt"));
        bufferedOutputStream.write(stringBuffer.toString().getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

        InputStream bufferedInputStream=new BufferedInputStream(new FileInputStream("/Users/subramanya.ganesh/Documents/mytext.txt"));
        int ch;
        while ((ch=bufferedInputStream.read()) != -1){
            //System.out.println(bufferedInputStream.read());
            System.out.print((char)ch);
        }

    }
    //            BufferedOutputStream o = new BufferedOutputStream(new FileOutputStream(getClass().getProtectionDomain().getCodeSource().getLocation().getPath() + "filing.txt"));

}
