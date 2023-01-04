package PrintWithoutLoop;

public class try2 /*extends try1*/{
    int c=0;
    @Override
    public String toString() {
        if (c<101){
            c++;
            return c+" "+toString();
        }
        return "";
    }

    public static void main(String[] args) {
try2 k=new try2();
        System.out.println(k.toString());
    }
}
