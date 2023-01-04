package CONTAINER.LIST;

import CONTAINER.Displayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



//normal way of using extend ;without the myobject() in Displayer
/*public class list_example extends Displayer {
List l=new ArrayList();
    private void dis(List l){
        display(l.iterator());
    }
    public Displayer getting_object(){
        try {
            return Displayer.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List l=new list_example().l;
        l.add("a");
        l.add("a");
        new list_example().dis(l);
    }

}*/

public class list_example extends Displayer {
    static int x=10;
    public void test(Iterator<String> i){
        myobject().display(i);
    }
    public static void main(String[] args) {
        System.out.println(x);
        List l=new ArrayList();
        boolean b=l.add("a");
        l.add("b");
        l.add("c");
        l.remove(l.get(0));
        System.out.println(l);
        new list_example().test(l.iterator());
    }
}
