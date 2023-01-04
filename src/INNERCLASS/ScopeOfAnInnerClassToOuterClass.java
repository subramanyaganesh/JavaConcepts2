package INNERCLASS;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class ScopeOfAnInnerClassToOuterClass {
    private Object[] obj;
    int next = 0;

    public ScopeOfAnInnerClassToOuterClass(int i) {
        obj = new Object[i];
    }

    void add(Object o) {
        if (next < obj.length) {
            obj[next] = o;
            next++;
        }
    }

    class SSelector implements Selector {
        int i = 0;

        public Selector gettingSelector() {
            return new SSelector();
        }

        public void ggeett() {
            ScopeOfAnInnerClassToOuterClass.this.add(10);
        }

        @Override
        public boolean end() {
            return i == obj.length;
        }

        @Override
        public Object current() {
            return obj[i];
        }

        @Override
        public void next() {
            if (i < obj.length) {
                i++;
            }

        }
    }
}

class main {

    public static void main(String[] args) {
        ScopeOfAnInnerClassToOuterClass scopeOfAnInnerClassToOuterClass = new ScopeOfAnInnerClassToOuterClass(10);
        scopeOfAnInnerClassToOuterClass.add(1);
        scopeOfAnInnerClassToOuterClass.add(2);
        scopeOfAnInnerClassToOuterClass.add(3);
        scopeOfAnInnerClassToOuterClass.add(4);
        scopeOfAnInnerClassToOuterClass.add(5);

        ScopeOfAnInnerClassToOuterClass.SSelector sSelector = scopeOfAnInnerClassToOuterClass.new SSelector();
        sSelector.ggeett();


        Selector s=sSelector.gettingSelector();
        while (!s.end()) {
            System.out.println(s.current());
            s.next();
        }
    }
}
