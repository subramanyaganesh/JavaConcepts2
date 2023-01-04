package REFLECTION;

import ANNONIMUSINNERCLASS_WRAPPING.AnonymousInnerClass;
import CONTAINER.LIST.list_example;
import DESIGN_PATTERN.BUILDER_PATTERN.Instances;

import java.lang.reflect.Method;

public class Reflector {
    public  void reflect()  {
        try {
            System.out.println(Instances.class.getClasses().length);
            System.out.println(list_example.class.getName());
            System.out.println(list_example.class.getClass());
            System.out.println(list_example.class.getConstructors());
            System.out.println(list_example.class.getMethods());
            System.out.println(list_example.class.getFields());
            System.out.println(list_example.class.newInstance());
            Method m[] = AnonymousInnerClass.class.getDeclaredMethods();
            for (int i = 0; i < m.length; i++)
            {
                System.out.println(m[i].toString());
            }
            System.out.println(AnonymousInnerClass.class.newInstance().myFunction("hi").value());
            System.out.println(AnonymousInnerClass.class.newInstance().myFunction("bye").value());
            //set_example
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Reflector().reflect();
    }
}
