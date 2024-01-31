package arraypractice;

public class Arraypractice {

    public static void main(String[] args) 
    {
//        CREATING ARRAY OF SIZE 5X5
        int A[][]=new int[5][5];
        
//        CREATING 20 ARRAYS FOR SIZE 5X5
        int B[][];
        B=new int[5][5];
        
        int [][]C=new int[5][5];
        int []D[]=new int[5][5];
        
//        E IS 2D ARRAY AND F IS 1D ARRAY
        int[] E[],F;
        E=new int[5][5];
        F=new int[5];
        
//        G H AND I ARE 1D ARRAYS
        int[] G,H,I;
        
//        CREATING AND INITIALISING AN ARRAY OF SIZE 3X4
        int M[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
//        JAGGED ARRAY
        int X[][];
        X=new int[3][];
        
        X[0]=new int[5];
        X[1]=new int[3];
        X[2]=new int[8];
        
//        DISPLAYING THE ARRAY M
        for(int x[]:M)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
    
}
