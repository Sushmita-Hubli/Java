package Multithreading;

class MyThread2 extends Thread
{
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++ +"MyThread2");
        }
    }
}
public class ThreadTest
{
    public static void main(String[] args) {
        MyThread2 t=new MyThread2();
        t.setDaemon(true); //if the main application is terminating then the Daemon thread also terminates
        //previously when we didnt write this line no 18, the main method waited to terminate till the tread is not terminated.
        t.start();

//        try
//        {
//            Thread.sleep(100); // so if we dont write this, then the program ends without showing any output that is count number .bcoz the program ends as soon as main method terminates.
//            //now since we have written this, the count will be shown in the output
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }

 //now we will make the main thread to join some thread
        Thread mainThread=Thread.currentThread();
        try {
            mainThread.join();
        }catch(Exception e)
        {
            e.printStackTrace();
        }


        int count=1;
        while(true)
        {
            System.out.println(count++ +"main class");
            Thread.yield(); // this will allow main thread to wait for some time till other threads can also work.
            //like MyThread2 will execute more number of times than main thread
        }

    }
}
