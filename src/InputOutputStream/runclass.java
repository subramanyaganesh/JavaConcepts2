package InputOutputStream;

import java.util.Map;

import static InputOutputStream.MapReplaceFunction.filldata;
import static InputOutputStream.MapReplaceFunction.zxc.getObject;

public class runclass {
    public static void main(String[] args) {
        MapReplaceFunction.zxc.saveObject(filldata());
        Map<String, Map<String, String>> a=(Map<String, Map<String, String>>)getObject();
        System.out.println(a);
        a.forEach((key,val)->{
            System.out.println("form for"+key+":::"+val);
        });
    }



}
