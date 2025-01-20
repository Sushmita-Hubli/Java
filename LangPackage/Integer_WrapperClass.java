package LangPackage;

public class Integer_WrapperClass
{
    public static void main(String[] args) {
        System.out.println("Integer Wrapper Class");
        int m1=15;
        Integer m2=m1;  //autoboxing
        System.out.println("Equals method: "+m2.equals(m1));


        //Static classes of Integer Wrapper Class
        Integer m3= Integer.valueOf(1);
        Integer m4=Integer.valueOf("3");
        Integer m5=Integer.valueOf("1010",2); //converts the string into radix 2 that is binary format
        System.out.println("value of m5 is "+m5);

        Integer m6=Integer.valueOf("A7",16);
        System.out.println("Hexadecimal m6 "+m6);

        Integer m7=Integer.decode("0xA7");  //converts string into number
        System.out.println("m7 = "+m7);

        Integer m8=Integer.parseInt("123");
//        Integer m9=Integer.parseInt("123a"); //gives numberformat Exception

        System.out.println(Integer.toBinaryString(12));

    }
}
