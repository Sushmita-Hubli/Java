package Multithreading;


class MyData11
{
    int value;
    boolean flag=true; //true means the producer can set a value, and false means the consumer can retrieve it.

    synchronized public void set(int v)
    {
        while(flag==false)
        {
            try{wait();}catch(Exception e){e.printStackTrace();}
        }
            value=v;
            flag=false;
            System.out.println("producer : "+value);
            notify();

    }
    synchronized public void getValue()
    {

        while(flag==true) {
            try{wait();}catch (InterruptedException e){e.printStackTrace();}
}
        System.out.println("consumer : "+value);
            flag=true;
            notify();
    }

}

class Producer extends Thread
{
    MyData11 m;
    public Producer(MyData11 m)
    {
        this.m=m;
    }
    public void run()
    {
        int count=1;
        while(true) {
            m.set(count);
            count++;
        }
    }
}
class Consumer extends Thread
{
    MyData11 m;
    public Consumer(MyData11 m)
    {
        this.m=m;
    }
    public void run()
    {
       while (true)
       {
           m.getValue();
       }
    }
}
public class InterThreadComm
{
    public static void main(String[] args) {
        System.out.println("Inter-Thread communication");
        System.out.println("Inter-thread communication in Java is a mechanism that allows synchronized threads to communicate with each other, primarily using the wait(), notify(), and notifyAll() methods from the Object class. These methods enable one thread to pause its execution and release the lock on an object, while another thread, upon getting notified, can acquire the lock and resume execution. This communication is crucial for coordinating the actions of multiple threads that share resources or need to work in a specific sequence.");
        System.out.println("While the synchronized keyword ensures that only one thread can execute a synchronized block or method at a time, it does not provide a mechanism for threads to coordinate their execution beyond mutual exclusion. This is where inter-thread communication becomes necessary.\n" +
                "\n" +
                "Inter-thread communication allows threads to wait for certain conditions to be met before proceeding, which is crucial when threads depend on each other's actions. For example, one thread might be producing data, and another thread might need to wait until the data is available before consuming it. Using wait(), notify(), and notifyAll() within synchronized blocks allows threads to efficiently coordinate their activities, ensuring proper sequencing and avoiding busy waiting (where a thread continuously checks for a condition, wasting CPU cycles).");

MyData11 m=new MyData11();
Producer p=new Producer(m);
Consumer c=new Consumer(m);
p.start();
c.start();

    }
}
