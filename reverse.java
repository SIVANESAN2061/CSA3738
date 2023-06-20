package pooja1;
import java.util.*;
import static org.junit.Assert.assertEquals;
public class pooja2{
	public static void main(String[] args) {
		Scanner aa = new Scanner(System.in);
		System.out.println("enter the string");
		String sai = aa.next();
		
		int n = sai.length();
		StringBuilder vishnu = new StringBuilder("");
		for(int i=0;i<n;i++)
		{
			vishnu.append(sai.charAt(n-i-1));
			
		}
		System.out.println(vishnu);
		assertEquals("lohith",sai);
	}
	
}
