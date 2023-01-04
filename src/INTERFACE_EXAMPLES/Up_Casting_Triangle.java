package INTERFACE_EXAMPLES;

public class Up_Casting_Triangle implements UpCasting_Shape {
    @Override
    public void draw() {
        System.out.println("draw Triangle");

    }

    @Override
    public void erase() {
        System.out.println("erase Triangle");

    }
}
