package CONTAINER;

import java.util.Iterator;

public  class Displayer {
    public Displayer myobject(){
        return this;
    }

    public void display(Iterator i){
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
