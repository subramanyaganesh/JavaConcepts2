package InputOutputStream;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapReplaceFunction {
    static String path = System.getProperty("user.dir") + "/config/";

    public static Map<String, Map<String, String>> filldata() {
        Map<String, Map<String, String>> mymap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        Map<String, String> attri = new HashMap<>();
        attri.put("state", "Installed");
        attri.put("status", "Available");
        attri.put("name", "ant");
        mymap.put("ant_id", attri);
        Map<String, String> attri1 = new HashMap<>();
        attri1.put("state", "Installed");
        attri1.put("status", "Available");
        attri1.put("name", "elephant");
        mymap.put("elephant_id", attri1);
        return mymap;
    }

    static class zxc {
        int a=210;


        public static void saveObject(Object o) {
            try {
                ObjectOutputStream oob = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("/Users/subramanya.ganesh/Documents/" + "mytext.txt")));
                oob.writeObject(o);
                oob.flush();
                oob.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        public static Object getObject() {
            try {
                ObjectInputStream oob = new ObjectInputStream(new FileInputStream("/Users/subramanya.ganesh/Documents/" + "mytext.txt"));
                return oob.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }


        /* public static void main(String[] args) {
   Map<String, Map<String, String>> mymap = filldata();
        Map<String, Map<String, String>> hismap = Stream.of("AnT_Id").filter(mymap::containsKey).collect(Collectors.toMap(Function.identity(), mymap::get));
        hismap.forEach((key, value) -> {
            value.put("state", "terminated");
            value.put("status", "Retired");
        });
        System.out.println(hismap);


        int[] i = new int[10];
        int[] j = new int[10];
        Arrays.fill(i, 10);
        j = Arrays.copyOfRange(i, 3, 6);
        Arrays.stream(j).forEach(System.out::print);

        String val = "";
        //val="5";
        if (val.isEmpty()) {
            System.out.println("empty");
        }
        System.out.println(val);

*/
       /* List p=new ArrayList();
        for (int i = 0; i <10 ; i++) {
            p.add("");
        }
        Collections.fill(p,"hi");
        System.out.println(p);
        List<String> a=new LinkedList<>();
        List<String> a1=new ArrayList<>();
        a.add("fs");
        a.get(0);
        Map<String,String > m=new HashMap<>();
        HashMap<String,String> pfsf=new HashMap<>();*/
}




