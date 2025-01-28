package JavaGenerics;


class MyArray<T>
{
//    T A[]=new T[4];  this is  not allowed\
    T[] A=(T[]) new Object[10];
    int length=0;

    public void append(T v)
    {
        A[length++]=v; //adhi length 0 ch rahnar mag tyanantr append honar
    }

    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
public class JG4
{
    public static void main(String[] args) {

MyArray<Integer> m=new MyArray<>();
m.append(1);
m.append(2);
m.append(3);
        m.append(3);
        m.append(3);
        m.append(3);
        m.append(3);
        m.append(3);
        m.append(3);
        m.append(3);

        m.display();
    }
}
