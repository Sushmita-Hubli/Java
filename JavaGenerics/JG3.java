package JavaGenerics;


class Data <T>
{
    private T obj;
    public void setData(T v)
    {
        obj=v;
    }
    public T getData()
    {
        return obj;
    }
}
public class JG3
{
    public static void main(String[] args)
    {
        Data<Integer> d=new Data<>();
        d.setData(1); //or d.setData(new Integer(1));
//        d.setData("HI");   THIS GIVES AN ERROR COMPILE TIME ERROR
        System.out.println(d.getData());

    }
}
