package CONTAINER.SET;

import CONTAINER.Displayer;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


//Normal way

public class set_example extends Displayer {
    Set s;

    private void dis() {
        display(s.iterator());
    }

    public set_example(Set s) {
        this.s = s;
    }

    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("ba");
        s.add("a");
        new set_example(s).dis();


        s = new TreeSet();
        s.add("p");
        s.add("m");
        new set_example(s).dis();


    }
}


//using reflections
/*

public class set_example {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Set s = new HashSet();
        s.add("ba");
        s.add("a");
        Displayer.class.newInstance().display(s.iterator());//directly using reflection

        s = new TreeSet();
        s.add("p");
        s.add("m");
        new list_example().getting_object().display(s.iterator());//extending list to access reflection of Displayer

    }
}
*/
