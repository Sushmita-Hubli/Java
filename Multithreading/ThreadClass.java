package Multithreading;


class MyRun implements Runnable{
    public void run()
    {

    }
}
class MeraThread extends Thread
{
    public MeraThread(String name)
    {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++);
            try {
                Thread.sleep(10);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadClass
{
    public static void main(String[] args) {
        System.out.println("Thread class methods and constructors");
        System.out.println("5 most useful constructors of Thread class are\n1.Thread()\n2.Thread(Runnable r):Here we can are passing the object of the class which is implementing from Runnable interface" +
                "\n3.Thread(String name):this constructor can be used to name a thread\n4.Thread(Runnable r, String name): using this Thread we can pass the object of Runnable interface along with the name of the String\n" +
                "5.Thread(ThreadGroup g, String name): using this method we can pass the group of thread along with the name of the ThreadGroup name as arguments");

        System.out.println("other methods like getters and setters from the Thread class are as follows\n");
        System.out.println("1.long getId():we can get id of a thread\n" +
                "2.String getName():get name of a thread\n" +
                "3.int getPriority():get priority of a thread\n" +
                "4.Thread.state getState():gets state of a thread\n" +
                "5.ThreadGroup getThreadGroup():gets the group to which thread belongs to \n" +
                "6.void setName(String name): set name of the thread\n" +
                "7.void setPriority(int P):set priority of a thread\n" +
                "8.void setDaemon(boolean d):Daemon thread is the thread which runs in the background and has the least priority. example : autosave in word ,etc. we can set any particular thread created by us as a daemon thread using this method.\n");

        System.out.println("Enquiry methods:\n1.boolean isAlive():tells if the thread is still alive or terminated\n" +
                "2.boolean isDaemon():tells if a thread is the Daemon thread or not\n" +
                "3.boolean isInterrupted():we can know whether a thread is interrupted or not");

        System.out.println("Instance methods:\n" +
                "1.void interrupt():thread can be interrupted from its current state using this method.\n" +
                "2.void join():instead of terminating, a thread can join with other thread\n" +
                "3.void join(int millis):a thread can join other threads for few milli seconds\n" +
                "4.void run()\n" +
                "5.void start()");
        System.out.println("Static methods:\n" +
                "1.static int activeCount():tells how many threads are active in agroup\n2." +
                "2.static Thread currentThread():gives reference of the current thread.\n" +
                "3.static void yield():temporarily pauses the currently executing thread to allow other threads of the same priority to execute\n" +
                "4.static void dumpStack():prints the current thread's stack trace to the standard error stream, useful for debugging purposes.");



        //code execution -->constructors
        Thread t=new Thread();
        Thread t1=new Thread(new MyRun());
        Thread t2=new Thread(new MyRun(),"name");
        Thread t3=new Thread("sushmita");


        MeraThread t4=new MeraThread("pallavi");


        //code execution for methods

        System.out.println("Id is "+t4.getId());
        System.out.println(t4.getName());
        System.out.println(t4.getPriority());
        t4.start();
        t4.interrupt();
        System.out.println(t4.getState());
        System.out.println(t4.isAlive());





    }
}
