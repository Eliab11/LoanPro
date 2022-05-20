import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.util.ArrayList;
public class validEmail {
	
	
	public static boolean isValid(String email) {  
		
		
		String regex = "^[a-zA-Z0-9_+&*-]+(?:\\." +  "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		
		Pattern pat = Pattern.compile(regex);
		if(email == null)
			return false;
		else 
			return pat.matcher(email).matches();
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner crn = new Scanner(System.in);
		home		 System.out.println("Enter your email please!");
			String str = crn.nextLine();
		
		if(isValid(str)) 
			
			System.out.println(str + "   - Yes");
		else
			
			System.out.println(str + "   - No");
						    
	}
		
 }
