package arrays;

public class array1
{
    public static void main(String[] args) {

        int A[]=new int[5]; //here A[] is reference , int[5] is a object and new signifies that the array is created in heap
        //we can find out length of array using A.length; here we dont write length() bcoz it is not the method it is the property

        //methods of creating array
        int B[]={1,2,3,4,5,36,19};
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }
        System.out.println();

        //for each loop
        for (int i:B)  //means for every i in B
        {
            System.out.print(i+" ");
        }


        int sum=0 ;    //printing sum
        for (int i=0 ; i<B.length;i++){
            sum+=B[i];
        }
        System.out.println(sum);

        int element=3; //finding element
        for (int i=0 ; i<B.length;i++)
        {
            if (B[i]==element)
            {
                System.out.println(i);
                break;
            }
        }


        //finding maximum element
        //B={1,2,3,4,5}
        int max=B[0];
        for (int i=0 ; i<B.length;i++)
        {

            if (B[i]>max)
            {
                max=B[i];
            }

        }
        System.out.println("Maximum element = "+max);


        //finding second largest element
        int max1=B[0];
        int max2=B[0];
        for (int i=0 ; i<B.length;i++)
        {
            if(B[i]>max1)
            {
                max2=max1;
                max1=B[i];
            } else if (B[i]>max2)
            {
                max2=B[i];

            }
        }
        System.out.println("First largest element is : "+max1+" second largest element is : "+max2);


        //Array rotation
        //1. left rotation of B = {1,2,3,4,5,36,19}
        int temp=B[0];
        int m=0;
        for (;m<B.length-1;m++ )
        {

            B[m]=B[m+1];

        }
        B[m]=temp;
        for (int i=0 ;i<B.length ;i++)  //printing
        {
            System.out.print(B[i]+" ");
        }

        //2. rigth rotation of B = {2,3,4,5,36,19,1}
        System.out.println();
        int temp1=B[B.length-1];
         int i=B.length-1;
        for (;i>0 ;i--)
        {

                B[i]=B[i-1];

        }
        B[i]=temp1;
        for (int j=0 ;j<B.length ;j++) //printing
        {
            System.out.print(B[j]+" ");
        }




        //inserting an element in array at 2nd position let that element be 108
        System.out.println();
        int arr[]=new int[10];
        int pos=2;
        for (int k=0;k<6;k++)
        {
            arr[k]=k+1;
        }
        for (int k=0 ; k<6 ;k++)
        {
            System.out.print(arr[k]+" ");
        }
        int len= arr.length-1;
        for ( ; len>pos-1;len--)
        {

                arr[len]=arr[len-1];


        }
        arr[len]=108;
        System.out.println();
        for (int arrlen=0 ; arrlen<arr.length;arrlen++)
        {
            System.out.print(arr[arrlen]+" ");
        }


        //deleting an element
        System.out.println();

        int positionele=2;
        int postdel=positionele-1;

        for (;postdel< arr.length-1;postdel++)
        {
            arr[postdel]=arr[postdel+1];
        }
        arr[postdel]=0;
        for (int print=0 ; print<arr.length;print++)
        {
            System.out.print(arr[print]+" ");
        }



    }
}
