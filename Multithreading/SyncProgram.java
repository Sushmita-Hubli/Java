package Multithreading;


class MyData1
{
    synchronized public void display(String s)  //this is way 1 of achieving synchronization
    {
        synchronized (this) {    //this is way 2 of achieving synchronization
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}
class Thread3 extends Thread
{
    MyData1 d;
    public Thread3(MyData1 d)
    {
        this.d=d;
    }

    public void run()
    {
        d.display("Hello World");
    }
}

class Thread4 extends Thread
{
    MyData1 d;
    public Thread4(MyData1 d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Sushmita");
    }
}
public class SyncProgram
{
    public static void main(String[] args) {
        MyData1 d=new MyData1();
        Thread3 t1=new Thread3(d);
        Thread4 t2=new Thread4(d);
        t1.start();
        t2.start();

    }
}
