package scexception1;

class StackOverFlowException extends Exception
{
    public String toString()
    {
        return "Stack is Over Flow";
    }
}

class StackUnderFlowException extends Exception
{
    public String toString()
    {
        return "Stack is Under Flow";
    }
}

class Stack //throws StackOverFlowException , StackUnderFlowException
{
    int top=-1;
    public int[] arr;
    // Scanner sc=new Scanner(System.in);
    // Stack(int val)
    // {
    //     int ent=sc.nextInt(val);
    // }
    int size;
    int count=0;
    Stack(int s)
    {
        size=s;
        arr=new int[s];
    }
    public void push(int val) //throws StackOverFlowException
    {
        try
        {
            if (top==size-1)
            {
                for (int i=0;i<arr.length;i++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
                throw new StackOverFlowException();
            }
            arr[count++]=val;
            top++;
        
        }
        catch(StackOverFlowException e)
        {
            System.out.println(e);
        }
    }
    public int pop()
    {
        int j=0;
        try
        {
            if (top==-1)
            {
                for(int i=0;i<arr.length;i++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
                throw new StackUnderFlowException();
            }
            else
            {
                j=arr[top--];
                System.out.println(j);
            }
        }
        catch(StackUnderFlowException e)
        {
            System.out.println(e);
        }
        return 0;
    }
}


public class Scexception1 
{

    public static void main(String[] args) 
    {
        Stack st=new Stack(5);
        
        st.push(4);
         st.push(3);
         st.push(8);
         st.push(2);
         st.push(7);
         st.push(5);
//        st.pop();
//        st.pop();
    }
    
}
