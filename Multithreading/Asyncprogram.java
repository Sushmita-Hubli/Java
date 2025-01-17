package Multithreading;


class MyData
{
    public void display(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}

class Thread1 extends Thread
{
    MyData d;
    public Thread1(MyData d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Hello World");
    }
}

class Thread2 extends Thread
{
    MyData d;
    public Thread2(MyData d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Sushmita");
    }
}
public class Asyncprogram
{
    public static void main(String[] args) {
        MyData d=new MyData();
        Thread1 t1=new Thread1(d);
        Thread2 t2=new Thread2(d);

        t1.start();
        t2.start();

    }



}
