package OBJECT_OUTPUT_STREAM;

import InputOutputStream.MapReplaceFunction;

import java.io.*;



class ObjectOutputStreamDemo extends ObjectOutputStream {
    public ObjectOutputStreamDemo(OutputStream out) throws IOException {
        super(out);
    }

    public static void main1(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fout = new FileOutputStream(System.getProperty("user.dir")+"/config/"+"file.txt");
        ObjectOutputStreamDemo oot = new ObjectOutputStreamDemo(fout);


        //illustrating annotateProxyClass(Class<?> cl) method
        //oot.annotateProxyClass(Character.class);

        //Write the specified object to the ObjectOutputStream
        oot.writeObject(MapReplaceFunction.filldata());

        //flushing
        oot.flush();

        //closing the stream
        oot.close();

        FileInputStream fin = new FileInputStream(System.getProperty("user.dir")+"/config/"+"file.txt");
        ObjectInputStream oit = new ObjectInputStream(fin);
        System.out.print(oit.readObject());
        oit.close();
    }

    public static void main(String[] args) throws Exception{
        FileOutputStream fout = new FileOutputStream("/Users/subramanya.ganesh/actualcmdb_ci_databaseempty.txt");
        FileInputStream fin = new FileInputStream("/Users/subramanya.ganesh/actualcmdb_ci_databaseempty.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fout);
        BufferedInputStream bis=new BufferedInputStream(fin);
        byte[] barray=new byte[1024];
        barray[0]=0;
        bos.write(barray,0,1);
        bos.flush();
        int x=bis.read();
        while (true) {
            if (x == 'C'){ System.out.println("true");break;}
            else System.out.println("false");
        }

    }
}
