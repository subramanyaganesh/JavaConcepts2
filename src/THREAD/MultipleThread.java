package THREAD;

class firstThread extends Thread {
    private int i;

    public firstThread(int i) {
        this.i = i;
        System.out.println("Created firstThread Object in Thread Number " + i);
    }

    @Override
    public void run() {
        for (int j = 0; j < 14; j++) {
            System.out.println("firstThread Object number:--" + j + "  performing a function in thread number ::-" + i);
        }

    }
}

class secondThread extends Thread {
    private int i;

    public secondThread(int i) {
        this.i = i;
        System.out.println("Created secondThread Object in Thread Number " + i);
    }

    @Override
    public void run() {
        for (int j = 0; j < 14; j++) {
            System.out.println("secondThread Object number:--" + j + "   performing a function in thread number ::-" + i);
        }
    }
}

class thirdThread extends Thread {
    private int i;

    public thirdThread(int i) {
        this.i = i;
        System.out.println("Created thirdThread Object in Thread Number " + i);
    }

    @Override
    public void run() {
        for (int j = 0; j < 14; j++) {
            System.out.println("thirdThread Object number:--" + j + "  performing a function in thread number ::-" + i);
        }
    }
}


public class MultipleThread {

    public Thread firstThreadFunction(int i1) {
        return new Thread(() -> {
            for (int j = 0; j < 14; j++) {
                System.out.println("firstThread Object number:--" + j + "  performing a function in thread number ::-" + i1);
            }
        });
    }
    public Thread secondThreadFunction(int i1) {
        return new Thread(() -> {
            for (int j = 0; j < 14; j++) {
                System.out.println("secondThread Object number:--" + j + "  performing a function in thread number ::-" + i1);
            }
        });
    }
    public Thread thirdThreadFunction(int i1) {
        return new Thread(() -> {
            for (int j = 0; j < 14; j++) {
                System.out.println("thirdThread Object number:--" + j + "  performing a function in thread number ::-" + i1);
            }
        });
    }


    public static void main(String[] args) {

/*        System.out.println("____________________________________________");
        firstThread a = new firstThread(0);
        a.setPriority(9);
        a.setName("firstThread");


        System.out.println("____________________________________________");
        secondThread b = new secondThread(1);
        b.setPriority(1);
        b.setName("secondThread");


        System.out.println("____________________________________________");
        thirdThread c = new thirdThread(2);
        c.setPriority(8);
        c.setName("thirdThread");


        a.start();
        b.start();
        c.start();*/



        new MultipleThread().firstThreadFunction(0).start();
        new MultipleThread().secondThreadFunction(1).start();
        new MultipleThread().thirdThreadFunction(2).start();



    }
}
