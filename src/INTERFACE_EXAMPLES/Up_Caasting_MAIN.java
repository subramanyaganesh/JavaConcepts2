package INTERFACE_EXAMPLES;

public class Up_Caasting_MAIN {

    public static UpCasting_Shape selectShape(int a){
        switch (a){
            default:
            case 0:return new Up_Casting_Square();
            case 1:return new Up_Casting_Triangle();
            case 2:return  new UpCasting_Circle();
        }
    }

//In this case there is one  interface which has a function which is overridden and we do shape.func()->so based on the object created
    //that respective function is called

    public static void main(String[] args) {
        UpCasting_Shape[] main=new UpCasting_Shape[9]; //here effectively INTERFACE_EXAMPLES.UpCasting_Shape object is created


        UpCasting_Shape shape=new UpCasting_Circle();
        shape.draw();
        UpCasting_Shape shape1=new Up_Casting_Triangle();
        shape1.draw();
        UpCasting_Shape shape2=new Up_Casting_Square();
        shape2.draw();



        for (int i=0;i<main.length;i++){
            main[i]=Up_Caasting_MAIN.selectShape(i%3);//circle,square or triangle object is assigned to shape object
        }
        for (int i=0;i<main.length;i++){
            main[i].draw();
        }
    }
}
