import java.util.*;
import java.util.regex.*;

public class Main{
	
	public static void main(String[] args)
	{
		String regex = "^[A-Za-z0-9+_.-]{0,20}+@(.+)[co.id&&[^co]+id]$";
		String email;
		
		System.out.println("Input Format Email");

		Scanner input = new Scanner(System.in);
		email = input.nextLine();
		
		Pattern r = Pattern.compile(regex);
		Matcher m = r.matcher(email);
		
		if(m.find()){
			System.out.println("Email Valid");
		}else{
			System.out.println("EMAIL SALAH");
		}

	}
}
