package INFINITE_RECURSSION;

import java.util.ArrayList;

public class InfiniteRecursion {

    @Override
    public String toString() {
        return "InfiniteRecursion{"+super.toString()+"}\n";
        //return "InfiniteRecursion{"+this+"}\n";
        //return "InfiniteRecursion{"+new InfiniteRecursion()+"}\n";
    }
    /*public void disp(){
        System.out.println(InfiniteRecursion.this);
        InfiniteRecursion s= InfiniteRecursion.this ;
    }*/

    public static void main(String[] args) {
        //1
        /*ArrayList v = new ArrayList();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
            //new InfiniteRecursion().disp();
        }
        System.out.println(v);*/


        //2
        System.out.println(new InfiniteRecursion());

    }
}
