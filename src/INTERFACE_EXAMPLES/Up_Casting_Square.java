package INTERFACE_EXAMPLES;

public class Up_Casting_Square implements UpCasting_Shape {
    @Override
    public void draw() {
        System.out.println("draw Square");

    }

    @Override
    public void erase() {
        System.out.println("erase Square");

    }
}
