package THREAD;

public class ThreadExample extends Thread{


    static int counter=0;
    static int i = 0;
    public ThreadExample(String  counter) {
        System.out.println("my thread name::"+counter);
    }
    @Override
    public void run() {
        for ( i = 0; i < 10000; i++) {
            if (i==0||i==10*i) System.out.println("executing thread number ::"+i+" with thread name:: "+Thread.currentThread().getName());
        }
        while (Thread.currentThread().isAlive()){
            System.out.println("inside while of run() for ::" +counter);
           interrupt();
            try {
                sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        counter++;
    }

    public void runner() {
        new ThreadExample("first thread").start();
        new ThreadExample("second thread").start();
        new ThreadExample("third thread").start();
        new ThreadExample("fourth thread").start();

        System.out.println("All threads started");
        while (counter!=4){
            //System.out.println("inside while of main() method"+" and value of counter is :"+ counter);
        }
        System.out.println("All threads completed");
    }

    public static void main(String[] args) {
        new ThreadExample("").runner();
    }
}
