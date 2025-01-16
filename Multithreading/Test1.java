package Multithreading;

public class Test1 implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        Test1 t=new Test1();
        Thread t1=new Thread(t);//imp line
        t1.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }

    }
}
