package arrays;

public class two_dimensional_array2
{
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{1,2,3},{1,2,3}};
        int brr[][]={{1,1,1},{1,1,1},{1,1,1}};
        int crr[][]=new int[3][3];
        //addition of two matrices
        for (int i=0 ; i< arr.length;i++)
        {
            for (int j=0;j<arr[0].length;j++)
            {
                crr[i][j]=arr[i][j]+brr[i][j];
            }
            System.out.println();
        }
        for (int i=0 ; i< crr.length;i++)
        {
            for (int j=0;j<crr[0].length;j++)
            {
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }


        //multiplication
        System.out.println( );
        int drr[][]=new int[3][3];
        for (int i=0 ; i<arr.length;i++)
        {

            for (int j=0;j<arr[0].length;j++)
            {
                drr[i][j]=0;
               for (int k=0;k<arr[0].length;k++)
               {
                   drr[i][j]+=arr[i][k]*brr[k][j];
               }
            }

        }
        for (int i=0 ; i<arr.length;i++)
        {
            for (int j=0;j<arr[0].length;j++)
            {
                System.out.print(drr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
