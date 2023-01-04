package ANNONIMUSINNERCLASS_WRAPPING;

import java.util.concurrent.atomic.AtomicReference;

class A {
    String func(String s1) {
        AtomicReference<String> sp=new AtomicReference<>();
        String sss;
        class B {
            String s;

            private B() {
                this.s = s1;
            }

            String  gets1() {
                /*sss=s;*/  //sss should be final
                sp.getAndSet(s);
                return sp.get();
            }
        }
        return new B().gets1();
    }
}
public class Variables_insideClass_final {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.func("hi"));
    }
}
