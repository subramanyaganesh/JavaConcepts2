package ANNONIMUSINNERCLASS_WRAPPING;

import java.io.Serializable;

public class AnonymousInnerClass3 implements Serializable {

    public Destination WrapperFunctionInsideClass(String m) {
        class inner implements Destination {
             String lable;

            public inner(String x) {          //here we can use constructors as we know the class name
                lable = x;
            }

            @Override
            public String  setlabel() {
                return lable;
            }
        }
        return new inner(m);
    }


    public Destination AnonymousFunctionInnerClass(String a){
        return new Destination() {
            String lable=a;              //here directly the variable from the main function is set to the inner class variable

            @Override
            public String setlabel() {
                return lable;
            }
        };
    }

    public static void main(String[] args) {
        Destination d=new AnonymousInnerClass3().WrapperFunctionInsideClass("hello");
        System.out.println(d.setlabel());


        d=new AnonymousInnerClass3().AnonymousFunctionInnerClass("bye");
        System.out.println(d.setlabel());
    }
}
