package annodemo;
import java.lang.annotation.Annotation;

@interface MyAnno
{
    String name();
    String project();
    String date()default "Today";
    String version()default "13";
}

@MyAnno(name="Rishu",project="Bank")
public class Annodemo 
{
    //THIS IS INSTANCE VARIABLE
    @MyAnno(name="Rishu",project="Bank")
    int y;

    @MyAnno(name="Rishu",project="Bank")
    public static void main(@MyAnno(name="Rishu",project="Bank")String[] args) 
    {
        //AND THIS IS VARIABLE
        @MyAnno(name="Rishu",project="Bank")
        int x;
    }
    
}
