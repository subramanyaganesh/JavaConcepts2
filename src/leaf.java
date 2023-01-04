import sun.plugin.dom.css.Counter;

public class leaf {
    int i=0;
    leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i:::"+i);
        new Counter(null).getIdentifier();
    }

    public static void main(String[] args) {
        new leaf().increment().increment().increment().print();
    }
}
