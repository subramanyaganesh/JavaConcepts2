package ANNONIMUSINNERCLASS_WRAPPING;

public class WrappingClass {

     Content myFunction(){
        class innerClass implements Content{
            int i=9;
            @Override
            public int value() {
                return i;
            }
        }
        return new innerClass();
    }
    Content hisFunction(){
        class innerClass implements Content{
            int i=99;
            @Override
            public int value() {
                return i;
            }
        }
        return new innerClass();
    }

    public static void main(String[] args) {
        WrappingClass wrappingClass=new WrappingClass();
        System.out.println(wrappingClass.myFunction().value());

        System.out.println(wrappingClass.hisFunction().value());
    }
}
