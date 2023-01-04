package CHECK_TOSTRING_EQUALS;

import java.util.Objects;

public class Student {
    private String a;
    private String b;
    private String c;


    public Student(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "CHECK_TOSTRING_EQUALS.Student{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(a, student.a) &&
                Objects.equals(b, student.b) &&
                Objects.equals(c, student.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }


    public static void main(String[] args) {
        Student s1=new Student("1","2","3");
        Student s2=new Student("1","2","3");
        if (s1.equals(s2)){
            System.out.println("equal");
        }
        else System.out.println("not equal" );
    }
}
