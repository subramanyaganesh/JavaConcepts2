package INNERCLASSOVERRID;

class A{
    public A(){
        System.out.println("A()");

    }
}
class B extends A{
    public B(){
        System.out.println("B()");
    }
}

public class SOLVE_CONFUSION {
    public static void main(String[] args) {
        B b=new B();
    }
}
