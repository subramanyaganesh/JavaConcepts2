package InputOutputStream;

import ANNONIMUSINNERCLASS_WRAPPING.AnonymousInnerClass3;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialiseCLassObjectSendingClassObject {



    public static void main(String[] args) {
        try {
            AnonymousInnerClass3 anonymousInnerClass3=new AnonymousInnerClass3();
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("/Users/subramanya.ganesh/Documents/" + "mytext.txt")));
            objectOutputStream.writeObject(anonymousInnerClass3);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
