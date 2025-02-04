package JavaGenerics;



class M{}
interface N{}
interface O{}

class MyArray1<T extends M&N&O>{}//-->1,2,3
//class MyArray2<T super Number>{}  not allowed
class MyArray21<T>{}
class Yo
{
    static void fun(MyArray21<? super Number> obj) //use of super keyword here is allowed-->4
    {

    }
}
public class JG7
{
    static void fun(MyArray<?> obj)
    {
        obj.append(null);
    } //this is allowed-->5


//    static void fun1(MyArray<?> obj)
//    {
//        obj.append("Hello"); //-->not allowed according to condition 5
//    }
    public static void main(String[] args) {
        System.out.println("Do's and Dont's in Java Generics");
        System.out.println("1.Only extends is allowed in Generic class definition\n" +
                "2.extends is used for interfaces also\n" +
                "3.extends from only one class and multiple interfaces\n" +
                "4.extends and super are allowed with ? in methods\n" +
                "5.<?> will accept all types but cannot access\n" +
                "6.Base type of Object should be same or ?");

        MyArray<String> ma1=new MyArray<>();
        //fun1(ma1);

//        MyArray<Number> ma2=new MyArray<Integer>();  not allowed according to condition 6 coz Base type should be same or ?
        MyArray<Integer> ma3=new MyArray<Integer>(); //allowed acc. to condition 6
        MyArray<?> ma4=new MyArray<String>();//allowed acc. to condition 6
    }
}
