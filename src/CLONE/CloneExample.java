package CLONE;

class highest implements Cloneable{

}

class BaseClass extends highest{
    int i;

    public BaseClass(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}


public class CloneExample implements Cloneable{
    int i;

    public CloneExample(int i) {
        //super(i);
        this.i = i;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CloneExample)) {
            return false;
        }
        return this.i == ((CloneExample)obj).i;
    }
    @Override
    public String toString() {
        return Integer.toString(i);
    }

    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
*/
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneExample cloneExample=new CloneExample(10);
        CloneExample newClonedObject= (CloneExample) cloneExample.clone();
        newClonedObject.i++;
        System.out.println(cloneExample);
        System.out.println(newClonedObject);
    }
}
