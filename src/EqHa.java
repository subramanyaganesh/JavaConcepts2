import java.util.Objects;

public class EqHa {


    public static void main(String[] args) {

        String s="";
        /*s="hi";*/
        if (s.isEmpty()){
            System.out.println("true");
        }

        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1.equals(t2));
        Test[] a;
        Test[] b = new Test[5];
        b[0] = new Test();
        b[1] = new Test();
        b[2] = new Test();
        b[3] = new Test();
        b[4] = new Test();
        Test[] c = {new Test(), new Test()};
        Test[] d = new Test[]{new Test(), new Test()};
        System.out.println((char) 0);
        //System.out.println(a.length);
        /*System.out.println(b.length);
        System.out.println(c.length);
        System.out.println(d.length);*/
        int i = 0;
        int count = 0;
        try {
            while (b[i++] != null &&
                    i <= b.length) {
                count++;
            }
        } catch (Exception e) {
            System.out.print("");
        } finally {
            System.out.println("count = " + count);
            try {
                while (b[i++] != null &&
                        i <= b.length) {
                    count++;
                }
            } catch (Exception e) {
                System.out.print("");
            } finally {
                System.out.println("inside count =" + count);
            }
        }


    }
}

class Test {
    private String age;
    private String name;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test)) return false;
        Test test = (Test) o;
        return Objects.equals(age, test.age) && Objects.equals(name, test.name);
    }

}
