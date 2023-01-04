package DESIGN_PATTERN.SINGLETON;

public class ImplementSingletonClass {
    public static void main(String[] args) {
        SingletonClass singletonClass= SingletonClass.getObject777();
        SingletonClass singletonClass1= SingletonClass.getObject777();
        SingletonClass singletonClass2= SingletonClass.getObject777();
        SingletonClass singletonClass3= SingletonClass.getObject777();


        System.out.println(singletonClass);
        System.out.println(singletonClass1);
        System.out.println(singletonClass2);
        System.out.println(singletonClass3);
    }
}
