package arrays;

public class two_dimensional_array
{
    public static void main(String[] args) {
        //2-d array
        int arr[][]=new int[2][3]; //no of rows is 2 and no of columns is 3
        for(int i=0 ; i<2;i++)
        {
            for (int j=0 ;j<3;j++)
            {
                arr[i][j]=j+1;
            }
        }
        for (int i=0 ;i<2;i++)
        {
            for (int j=0 ; j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //creating an jagged array
        int brr[][]=new int[3][];
        brr[0]=new int[1];
        brr[1]=new int[2];
        brr[2]=new int[3];
        for (int i=0 ; i< brr.length;i++)
        {
            for (int j=0 ; j< brr[i].length;j++)
            {
               brr[i][j]=j+1;
            }

        }

        for (int i=0 ; i<3;i++)
        {
            for (int j=0;j< brr[i].length;j++)
            {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }


        //different ways of defining 2-D Arrays
        int A[][]=new int[5][5];

        int B[][]={{1,2,3},{1,2,3},{1,2,3}}; //this is 3 by 3 matrix

        int C[][];
        C=new int[5][5];

        int []D[]=new int[5][6];

        int[]E,F[];
        E=new int[5];
        F=new int[5][5];
    }
}
