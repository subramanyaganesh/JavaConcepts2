package INTERFACE_EXAMPLES;

public class Down_Casting_MAIN {
   static void t(Down_Casting_canFight variable_For_Fight){//variable for fight
        variable_For_Fight.fight();
    }
    static void u(Down_Casting_canSwim variable_For_Swim){//variable for swim
        variable_For_Swim.swim();
    }
    static void v(Down_Casting_canFly variable_For_fly){//variable for fly (this is not object as we cannot create object of interface)
        variable_For_fly.fly();
    }

    public static void main(String[] args) {
        Down_Casting_Hero hero=new Down_Casting_Hero();
        t(hero);//downcasting
        u(hero);
        v(hero);

    }
}
