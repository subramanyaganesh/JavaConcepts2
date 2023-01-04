package INTERFACE_EXAMPLES;

public class Down_Casting_Hero implements Down_Casting_canFly, Down_Casting_canSwim, Down_Casting_canFight {
    @Override
    public void fight() {
        System.out.println("fight");
    }

    @Override
    public void fly() {
        System.out.println("fly");

    }
    @Override
    public void swim() {
        System.out.println("swim");

    }
}







interface democlass extends Down_Casting_canFly,Down_Casting_canSwim,Down_Casting_canFight{
    //do nothing
}
class demoSyntax implements Down_Casting_canFly{

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
class demoSyntax1 extends demoSyntax implements Down_Casting_canFly,Down_Casting_canSwim,Down_Casting_canFight{

    @Override
    public void fight() {
        System.out.println("fight");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }//OBSERVE THAT FLY NEED NOT BE OVERRIDEN
}
