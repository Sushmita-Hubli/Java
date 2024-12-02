package arrays;

public class array2
{
    public static void main(String[] args) {

        //copying an array
        int arr[]={1,2,3,4,5};
        int brr[]=new int[arr.length];
        for (int i=0 ; i<brr.length;i++)
        {
            brr[i]=arr[i];
        }
        for (int i=0 ; i<brr.length;i++)
        {
            System.out.print(brr[i]+" ");
        }


        //reverse copying an array
        int crr[]=new int[arr.length];
        int j=arr.length-1;
        for (int i=0;i<crr.length ;i++,j--)
        {
           crr[i]=arr[j];
        }

        System.out.println();
        for (int m=0 ; m<crr.length;m++)
        {
            System.out.print(crr[m]+" ");
        }


        //increasing size of an array
        //now arr is of size 5 we want to make it of size 8
        System.out.println();
        int drr[]=new int[8];
        for (int n=0 ; n<arr.length;n++)
        {
            drr[n]=arr[n];
        }
        arr=drr;
        drr=null; //use of null pointer here is efficient
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
    }
}
