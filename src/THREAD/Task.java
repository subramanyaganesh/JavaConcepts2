package THREAD;


import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Test implements Runnable {
    private String name;

    public Test(String s) {
        name = s;
    }

    // Prints task name and sleeps for 1s
    // This Whole process is repeated 5 times
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                if (i == 0) {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization Time for"
                            + " task name - " + name + " = " + ft.format(d));
                    //prints the initialization time for every task
                } else {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - " +
                            name + " = " + ft.format(d));
                    // prints the execution time for every task
                }
                Thread.sleep(1000);
            }
            System.out.println(name + " complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Task {
    // Maximum number of threads in thread pool
    static final int MAX_T = 3;

    public static void main(String[] args) throws InterruptedException {
       /* Instant start = Instant.now();
        System.out.println("start" + start);

        ExecutorService pool = Executors.newFixedThreadPool(5);

        // passes the Task objects to the pool to execute (Step 3)
        pool.execute(new Test("task 1"));
        pool.execute(new Test("task 2"));
        pool.execute(new Test("task 3"));
        pool.execute(new Test("task 4"));
        pool.execute(new Test("task 5"));

        // pool shutdown ( Step 4)
        pool.shutdown();
        *//*pool.awaitTermination(1,TimeUnit.SECONDS);*//*
        while (!pool.isTerminated())
        TimeUnit.NANOSECONDS.sleep(1);

        Instant stop = Instant.now();
        System.out.println("stop" + stop);
        System.out.println(Duration.between(start, stop).getSeconds());*/
        System.out.println("the final answer is :::::::::::::::"+ Duration.parse("PT18.57S").getSeconds());
    }
}
