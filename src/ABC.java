import java.util.*;

public class ABC {
    public static void main(String[] args) {
        Set<Model> loadBalancerRelation = new HashSet<>();

        Model a=new Model("aa","aa","aa");
        Model b=new Model("aa","aa","aa");
       /* System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        Integer m =new Integer(10);
        Integer n =new Integer(10);
        System.out.println(m.toString());
        System.out.println(n.toString());
        if(m.equals(n))System.out.println("true");
        System.out.println(m.byteValue());
        System.out.println(n.byteValue());*/
        loadBalancerRelation.add(a);
        loadBalancerRelation.add(b);

        System.out.println(loadBalancerRelation);
        Iterator<Model> iterator=loadBalancerRelation.iterator();

            Model a1=  iterator.next();
            Model b1=  iterator.next();
            if (a1.equals(b1)){
                System.out.println(true);
            }
            if (loadBalancerRelation.contains(a1)){
                System.out.println("true");
            }

    }
}
