package Multithreading;


class My implements Runnable
{
    public void run()
    {
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class Test
{
    public static void main(String[] args) {

        My m=new My();
        Thread t=new Thread(m); //imp line
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }

    }
}
