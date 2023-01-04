package UPSTREAMING_USING_CLASS;

class Instrument {
    public void play() {
        System.out.println("UPSTREAMING_USING_CLASS.Instrument play");
    }
}

class Wind extends Instrument {
    public void play() {
        System.out.println("UPSTREAMING_USING_CLASS.Wind play");
    }
}



class Brass extends Instrument {
    public void play() {
        System.out.println("UPSTREAMING_USING_CLASS.Brass play");
    }
}



class Stringed extends Instrument {
    public void play() {
        System.out.println("UPSTREAMING_USING_CLASS.Stringed play");
    }
}


public class ExtendClass {

    public static void tune(Instrument i){
        i.play();
    }

    public static void main(String[] args) {
        tune(new Wind());
        tune(new Brass());
        tune(new Stringed());
        tune(new Instrument());//upstream
    }


}
