package DESIGN_PATTERN.SINGLETON;

public final class SingletonClass {

    private volatile static SingletonClass object777 = null;

    private SingletonClass() {
    }
public String dummyfield;
    private String  disp(){
        return "reflections are cool";
    }
    /*@Override
    public SingletonClass clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
*/
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static SingletonClass getObject777() {
        if (object777 == null) {
            synchronized (SingletonClass.class) {
                object777 = new SingletonClass();
            }
        }
        return object777;
    }


}

