import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		String kata;
		StringBuffer balik ;
		
		
		System.out.println("Input Kata");

		Scanner input = new Scanner(System.in);
		kata = input.nextLine();
		
		balik = new StringBuffer(kata);
		
		System.out.println("kata setelah di balik");
		
		System.out.println(balik.reverse());

		
	}
}
