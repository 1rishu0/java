package mathdemo;

public class Mathdemo 
{

    public static void main(String[] args) 
    {
        System.out.print("Absolute :");
        System.out.println(Math.abs(-134));
        
        //WE DO NOT RECOMMEND TO USE THIS
        System.out.print("Absolute :");
        System.out.println(StrictMath.abs(-134));
        
        System.out.print("Cube Root :");
        System.out.println(Math.cbrt(27));
        
        System.out.print("Exact Decrement :");
        System.out.println(Math.decrementExact(-11));
        
        //DECREMENT OF MIN_VALUE LEAD TO MAX_VALUE
        int i=Integer.MIN_VALUE;
        i--;
        System.out.println(i);
        
        System.out.print("Exponent value in Floating Point Rep :");
        System.out.println(Math.getExponent(134.45));
        
        System.out.print("Round Division :");
        System.out.println(Math.floorDiv(100,3));
        
        System.out.print("e power x :");
//        System.out.println(Math.exp());

        System.out.print("e power x :");
        System.out.println(Math.exp(134));
        
        System.out.print("Log base 10 :");
        System.out.println(Math.log10(134));
        
        System.out.print("Maximum :");
        System.out.println(Math.max(134,33));
        
        System.out.print("Tan :");
        //IN TAN THERE IS THE VALUE ENTERED IN THE RADIAN FORM WHICH IS DEGREE MULTIPLY BY PI BY 180
        System.out.println(Math.tan(134*Math.PI/180));
        
        System.out.print("Convert to Radians :");
        System.out.println(Math.toRadians(134));
        
        System.out.print("Convert to Degree :");
        System.out.println(Math.toDegrees(134));
        
        System.out.print("Convert to Degree :");
        System.out.println(StrictMath.toDegrees(134));
        
        System.out.print("Random :");
        System.out.println(Math.random());
        
        System.out.print("Power :");
        System.out.println(Math.pow(134,2));
        
        System.out.print("Exact product :");
        System.out.println(Math.multiplyExact(134,2));
        
        System.out.print("Next Float Value :");
        System.out.println(Math.nextAfter(134,1));
    }
    
}
