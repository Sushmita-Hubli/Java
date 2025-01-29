package JavaGenerics;


interface A{}
class B implements A{

}
class C implements A{}


class D {}
class E extends D{}
class F extends E{}


public class JG6
{

    static void fun3(MyArray<? extends A> obj ) //note that here we write extends keyword and not implements keyword
      {
        obj.display();
    }


    static void fun4(MyArray<? extends D> obj)
    {
        obj.display();
    }

    //generic method
    public static <T> void show(T[] list)
    {
        for (T x:list)
        {
            System.out.println(x);
        }

    }

    public static <T extends Number> void show1(T... list)
    {
        for (T x:list)
        {
            System.out.println(x);
        }

    }

    static void fun(MyArray<?> obj ) //or we can writ<e (MyArray obj)
            //<?> is called as wildcard which means anything
    {
        obj.display();
    }

    //upperbound-->we use extends
    static void fun1(MyArray<? extends Number> obj)  //we have set the upperbound to Number so it cant accept anything other than Number format
    {
        obj.display();

    }

    //lowerbound-->we use super keyword
    static void fun6(MyArray<? super Number> obj)
    {
        obj.display();
    }


    public static void main(String[] args) {
        System.out.println("Methods in Generics");

        show(new String[]{"hi","go","bye"});
        System.out.println();
        show(new Integer[]{11,12,111,121});
        System.out.println();
        show1(1,22);
        System.out.println();


        MyArray<Integer> ma1=new MyArray<>();
        ma1.append(1);
        ma1.append(33);
        ma1.append(33);

        MyArray<String> ma2=new MyArray<>();
        ma2.append("sushmita");
        ma2.append("adarsh");
        ma2.append("pallavi");

        fun(ma1);
        fun(ma2);


        MyArray<E> ma3=new MyArray<>();
        MyArray<F> ma4=new MyArray<>();

        
    }
}
