package Exception;

import java.io.IOException;

class Exceptions extends Exception {
    public Exceptions() {

    }

    public Exceptions(String s) {
        super(s);
    }
}

public class MyException {
    void itsfun() throws Exceptions {
        throw new Exceptions("This is a demo exception");
    }

    void itsdirect() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) throws IOException {
        try {
            new MyException().itsfun();
        } catch (Exceptions e) {
            System.err.println(e);
            System.err.println(e.getLocalizedMessage());
            System.out.write(String.format("|%s| |%s| \n","firstMSG","secondMSG").getBytes());

            System.out.write("hfcgfdfgfyuoihugiyfthgxdfgfhgjvhkj".getBytes());
            System.out.flush();
            try {
                new MyException().itsdirect();
            } catch (Exception m) {
                m.printStackTrace(System.out);
            }
        }
    }
}
