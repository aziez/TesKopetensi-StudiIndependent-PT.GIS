import java.util.*;

public class Main
{
	public static void main(String[] args)
	{

		String kata,balik="";
		int pjg;


		System.out.println("Input Kata");

		Scanner input = new Scanner(System.in);
		kata = input.nextLine();

		pjg = kata.length();
		
		for(int i = pjg-1; i >= 0; i--){
			balik = balik + kata.charAt(i);
			System.out.print(kata.charAt(i));
			
			
		}
		if(balik.equals(kata)){
			System.out.println("Kata PALINDROME");
		}else{
			System.out.println(" bukan Palindrome");
		}
	}
}
