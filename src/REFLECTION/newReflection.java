package REFLECTION;

import DESIGN_PATTERN.SINGLETON.SingletonClass;

import java.lang.reflect.*;

public class newReflection {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        if (SingletonClass.class.isInstance(SingletonClass.getObject777())) {
            if (SingletonClass.getObject777() instanceof SingletonClass)
                System.out.println(true);

            Field po = SingletonClass.class.getDeclaredField("object777");
            po.setAccessible(true);
            SingletonClass fieldValue = (SingletonClass) po.get("object777");
            System.out.println(fieldValue);

            Method ra = SingletonClass.class.
                    getDeclaredMethod("disp", null);

            ra.setAccessible(true);

            SingletonClass caazyObject = SingletonClass.getObject777();
            String returnValue = (String) ra.invoke(caazyObject, null);
            System.out.println(returnValue);

            //describes the methods or functions

            for (Method method : SingletonClass.class.getMethods()) {
                System.out.println(method.getName());

            }

            //describes the fields or variables
            for (Field field : SingletonClass.class.getFields()) {
                System.out.println(field.getName());

            }

            //describes the access specifier of the class
            int modifiers = SingletonClass.class.getModifiers();
            System.out.println(Modifier.isAbstract(modifiers));
            System.out.println(Modifier.isFinal(modifiers));
            System.out.println(Modifier.isInterface(modifiers));
            System.out.println(Modifier.isNative(modifiers));
            System.out.println(Modifier.isPrivate(modifiers));
            System.out.println(Modifier.isProtected(modifiers));
            System.out.println(Modifier.isPublic(modifiers));
            System.out.println(Modifier.isStatic(modifiers));
            System.out.println(Modifier.isStrict(modifiers));
            System.out.println(Modifier.isSynchronized(modifiers));
            System.out.println(Modifier.isTransient(modifiers));
            System.out.println(Modifier.isVolatile(modifiers));


            //package or path info
            Package package1 = SingletonClass.class.getPackage();
            System.out.println(package1);


            for (Constructor constructor : SingletonClass.class.getConstructors())
                System.out.println(constructor);


            for (Class interfaces : SingletonClass.class.getInterfaces())
                System.out.println(interfaces);
        }

    }
}
