package DataTypes_Variables_and_Literals;

public class Bitwise_operators
{
    public static void main(String[] args) {

        int a=10;
        int b=4;
        int c = a&b;
        int d=a|b;
        int e=~a;
        int f= a>>1;
        int g=a>>>1;
        int h=a<<1;
        int i=a^b;
        System.out.println(c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i);


        //bitwise merging and masking

        int j=10, k=15;
        //swapping
        j=j^k;
        k=j^k;
        j=j^k;
        System.out.println(j+" "+k);

        //storing j=15 ank k=10 in l
        int l;
        l=j<<4;
        l=l|k;
        System.out.println((l&0b11110000)>>4);
        System.out.println((l&0b00001111));

    }
}
