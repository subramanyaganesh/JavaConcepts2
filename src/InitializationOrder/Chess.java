package InitializationOrder;


/*class Game {
    *//*Game() {
        this(5);
    }*//*

    Game(int i) {
        System.out.println("Game Constructor");
    }
}

class BoardGame extends Game {


    BoardGame(int i) {
        super(i);
        System.out.println("Board Game Constructor");

    }
}

public class Chess extends BoardGame {
    Chess(int i) {
        super(i);
        System.out.println("Chess Constructor");
    }

    public static void main(String[] args) {
        Chess chess=new Chess(5);
    }
}*/
class Game {

    Game() {
    }

    Game(int i) {
        System.out.println("Game Constructor");
    }
}

class BoardGame extends Game {


    BoardGame(){

}

    BoardGame(int i) {
        super(i);
        System.out.println("Board Game Constructor");

    }
}

public class Chess extends BoardGame {
    Chess(){
        this(5);
    }
    Chess(int i) {
        super(i);
        System.out.println("Chess Constructor");
    }

    public static void main(String[] args) {
        Chess chess=new Chess();
    }
}
