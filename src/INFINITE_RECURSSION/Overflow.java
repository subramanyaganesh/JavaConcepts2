package INFINITE_RECURSSION;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Overflow {


    class stackOverflow1 {
        AtomicInteger aa = new AtomicInteger(1);

        public void make(Overflow am) {
            System.out.println(aa.getAndIncrement() + ": " + am);
            make(new Overflow());
        }
    }

    class stackOverflow2 {
        stackOverflow2 obj;

        public stackOverflow2() {
            obj = new stackOverflow2();
        }
    }
    class heapOverflow {
        public void make(){
            AtomicInteger aa = new AtomicInteger(1);
            List a=new ArrayList();
            while (true){
                byte[] b = new byte[1024];
                a.add( b );
                a.add(aa.getAndIncrement());
                System.out.println(aa);
            }
        }
    }



    public static void main(String[] args) {
        new Overflow().new heapOverflow().make();
        //new Overflow().new stackOverflow2();
        // new Overflow().new stackOverflow1().make(new Overflow());
    }
}
