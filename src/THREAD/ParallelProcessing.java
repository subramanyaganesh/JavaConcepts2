package THREAD;

public class ParallelProcessing extends Thread {
    private  int decrementValue=5;
    private  int threadCount;
    private ParallelProcessing(int i) {
        threadCount=i;
        System.out.println("Making "+threadCount);
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Thread "+threadCount+" ("+decrementValue+")");
            if (--decrementValue==0)return;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            new ParallelProcessing(i).start();
            System.out.println("All threads started");
        }
    }
}
