//dynamic binding of f()
package INNERCLASSOVERRID;

class Egg2{

    public Egg2(){
        System.out.println("New Egg2()");
    }

    protected  class Yolk{
        public Yolk(){
            System.out.println("Egg2.Yolk()");
        }
        public  void f(){
            System.out.println("egg2.yolk.f()");
        }
    }

    Yolk y=new Yolk();//NOTE the global variables are loaded at the time when the class is loaded not only object
    String s;
    int i;

    public void insertYoke(Yolk y){
        this.y=y;
    }
    public void g(){
        y.f();
    }
}

 class BigEgg2 extends Egg2 {
     public BigEgg2() {
         insertYoke(new Yolk());
     }

     public class Yolk extends Egg2.Yolk {
         public Yolk() {
             System.out.println("BigEgg2.Yolk()");
         }

         public  void f() {
             System.out.println("BigEgg2.yolk.f()");
         }
     }
 }


public class INNERCLASSOVERRIDING {
    public static void main(String[] args) {
        Egg2 e=new BigEgg2();
        e.g();
    }
}


//static binding of f()
/*
package INNERCLASSOVERRID;

class Egg2{

    public Egg2(){
        System.out.println("New Egg2()");
    }

    protected static class Yolk{
        public Yolk(){
            System.out.println("Egg2.Yolk()");
        }
        public static void f(){
            System.out.println("egg2.yolk.f()");
        }
    }

    Yolk y=new Yolk();
    String s;
    int i;

    public void insertYoke(Yolk y){
        this.y=y;
    }
    public void g(){
        y.f();
    }
}

class BigEgg2 extends Egg2 {
    public BigEgg2() {
        insertYoke(new Yolk());
    }

    public static class Yolk extends Egg2.Yolk {
        public Yolk() {
            System.out.println("BigEgg2.Yolk()");
        }

        public static void f() {
            System.out.println("BigEgg2.yolk.f()");
        }
    }
}


public class INNERCLASSOVERRIDING {
    public static void main(String[] args) {
        Egg2 e=new BigEgg2();
        e.g();
    }
}
*/
