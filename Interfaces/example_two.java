package Interfaces;

class Phone
{
    public void call()
    {
        System.out.println("CALLING");
    }
    public void sms()
    {
        System.out.println("Sms");
    }
}
interface ICamera
{
    public void click();
    public void record();

}
interface IMusicPlayer
{
    public void play();
    public void pause();
    public void stop();
}

class Smartphone extends Phone implements ICamera,IMusicPlayer
{
    public void click()
    {
        System.out.println("Clicking");
    }
    public void record()
    {
        System.out.println("Recording");
    }

    @Override
    public void play() {
        System.out.println("Play");
    }
    public void pause()
    {
        System.out.println("Pause");
    }
    public void stop()
    {
        System.out.println("Stop");
    }
}

public class example_two
{
    public static void main(String[] args)
    {
        Smartphone s=new Smartphone();//all methods can be called upon this object

        ICamera c=new Smartphone();  //only methods present in the ICamera interface can be called on this object
        c.click();
        c.record();

        System.out.println();
        IMusicPlayer m=new Smartphone();  //only methods present in the IMusicPlayer interface can be called on to this object
        m.play();
        m.pause();
        m.stop();




    }
}
