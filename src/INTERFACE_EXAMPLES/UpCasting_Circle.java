package INTERFACE_EXAMPLES;

public class UpCasting_Circle implements UpCasting_Shape {
    @Override
    public void draw() {
        System.out.println("draw Circle");
    }

    @Override
    public void erase() {
        System.out.println("erase Circle");

    }
}
