package PrintWithoutLoop;

import java.util.Arrays;
import java.util.BitSet;

public class PrintWithoutLoop {
    public static void main(String[] args) {
        Object[] a = new Object[100];
        Arrays.fill(a,new Object(){
            int count=1;
            @Override
            public String toString() {
                return Integer.toString(count++);
            }
        });
        System.out.println(Arrays.toString(a));

        String b = new BitSet() {{
            set(1, 101);
        }}.toString();
        System.out.append(b, 1, b.length());
    }
}
