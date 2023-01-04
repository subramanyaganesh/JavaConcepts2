package InputOutputStream;

import ANNONIMUSINNERCLASS_WRAPPING.AnonymousInnerClass3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialiseCLassObjectGettingClassObject {
    public static void main(String[] args) {
        try {
            ObjectInputStream objectOutputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("/Users/subramanya.ganesh/Documents/" + "mytext.txt")));

            AnonymousInnerClass3 a=(AnonymousInnerClass3)objectOutputStream.readObject();
            System.out.println(a.AnonymousFunctionInnerClass("hi").setlabel());



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
