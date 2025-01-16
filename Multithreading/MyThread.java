package Multithreading;


class MyThreadClass extends Thread
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
}
public class MyThread
{
    public static void main(String[] args) {
        MyThreadClass m=new MyThreadClass();
        m.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
        i++;
        }
    }


}
