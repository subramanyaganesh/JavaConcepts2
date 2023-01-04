package ANNONIMUSINNERCLASS_WRAPPING;

public class AnonymousInnerClass2 {

    public BaseClass FirstNewFunction() {
        return new BaseClass(10) {
        };
    }

    public BaseClass newFunction() {
        return new BaseClass(10) {  //set by this
            public int value(){
                return 100;                 //here the value of the base class is overridden o/p=100 without value in this block o/p is 10
            }
        };
    }

    public BaseClass crazyNewFunction() {
        return new BaseClass(10) {
            public int value(){
                return super.value()*5;
            }
        };
    }


    public static void main(String[] args) {
        AnonymousInnerClass2 anonymousInnerClass2=new AnonymousInnerClass2();
        System.out.println(anonymousInnerClass2.FirstNewFunction().value());


        System.out.println(anonymousInnerClass2.newFunction().value());

        System.out.println(anonymousInnerClass2.crazyNewFunction().value());
    }
}

