package stringpractice2;

public class Stringpractice2 {

    public static void main(String[] args) {
        
        /*
        String str1="Mr. Rishabh Sharma";
        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("Rish",4));
        System.out.println(str1.endsWith("Sharma"));
        System.out.println(str1.charAt(4));
        
        for(int i=0;i<str1.length();i++)
            System.out.println(str1.charAt(4));
        */
        
        String str1="www.udemy.co.in";
        System.out.println(str1.indexOf("."));
        System.out.println(str1.indexOf(".",4));
        System.out.println(str1.indexOf("udemy"));
        System.out.println(str1.lastIndexOf("."));
    }
    
}
