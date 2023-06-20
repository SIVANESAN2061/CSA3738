package poorna1;
import static org.junit.Assert.assertEquals;
import java.util.*;
public class poorna3{
    public static void main(String[] args){
        Scanner aa = new Scanner(System.in);
        System.out.println("enter the string1");
        String one = aa.next();
        Scanner ab = new Scanner(System.in);
        System.out.println("enter the string2");
        String two = ab.next();
        System.out.println(one.equals(two));
        assertEquals(one,two);
        
        
    }
        
    
}
