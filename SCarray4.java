package scarray4;

public class SCarray4 {

    public static void main(String[] args)
            /*
    {
        String arr[]={"java","python","pascal","smalltalk","ada","basic"};
        
        java.util.Arrays.sort(arr);
        
        for(String x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println("");
    }
            */
    
//    MULTIPLYING 2 MATRICES
    /*
    {
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};
        
        int C[][]=new int[3][3];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
*/
    
//    ADDING 2 MATRICES
    {
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};
        
        int C[][]=new int[3][3];
        
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
