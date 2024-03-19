/**
 * @author RISHU
 * @since 2024
 * @version 2.0
 */
package javadocdemo;

/**
 *
 * @author RISHU
 * 
 * Class for the Library
 */
public class Book 
{
    /**
     * @value 10 default value
     */
    static int val=10;
    
    /**
     * Parameterized Constructor
     * @param s 
     */
    
    Book(String s){}
    
    /**
     * Issue a Book to a Student 
     * @param roll Roll number of a Student 
     * @throws Exception If Book is not available , throws Exception
     */
    
    public void issue (int roll) throws Exception {}
    
    /**
     * Check if Book is Available
     * @param str Book name
     * @return If Book is available then return true else false
     */
    
    public boolean available(String str) {return true;}
    
    /**
     * Get Book name
     * @param id Book id
     * @return return Book name
     */
    
    public String getBookName(int id){return "";}
    
}
