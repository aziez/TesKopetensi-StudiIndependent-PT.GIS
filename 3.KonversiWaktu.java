import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		int jam = 0,menit = 0,detik = 0;
		String hari = "pm";

		System.out.print("Jam = ");
		Scanner js = new Scanner(System.in);
		jam = js.nextInt();
			
		while(jam > 12){
			System.out.println("Jam SALAH [0-12]");

			System.out.print("Jam = ");
			jam = js.nextInt();
		}



		System.out.print("Menit = ");
		Scanner ms = new Scanner(System.in);
		menit = ms.nextInt();


		System.out.print("detik = ");
		Scanner ds = new Scanner(System.in);
		detik = ds.nextInt();

		System.out.print("Hari [AM/PM] = ");
		Scanner hs = new Scanner(System.in);
		hari = hs.nextLine();
		hari.toUpperCase();
		

		while(!hari.equalsIgnoreCase("AM") && !hari.equalsIgnoreCase("PM")){
			System.out.println("Input Hari Salah");
			System.out.print("Hari [AM/PM] = ");
			hari = hs.nextLine();
			hari.toUpperCase();
			
		}
		
		

		if (menit % 60 == 0 || menit >= 60){
			menit = menit - 60;
			jam = ++jam;
		}

		if(detik % 60 == 0 || detik >= 60){
			detik = detik - 60;
			menit = ++menit;
		}



		if(jam > 12 && hari.equalsIgnoreCase("PM")){
			switch(jam){
				case 13:
					jam = 1;
					break;
				case 14:
					jam = 2;
					break;
				case 15: 
					jam = 3;
					break;
				case 16:
					jam = 4;
					break;
				case 17:
					jam = 5;
					break;
				case 18:
					jam = 6;
					break;
				case 19:
					jam = 7;
					break;
				case 20:
					jam = 8;
					break;
				case 21:
					jam = 9;
					break;
				case 22:
					jam = 10;
					break;
				case 23:
					jam = 11;
					break;
				case 24:
					jam = 12;
					break;

			}
		}

		if(hari.equalsIgnoreCase("AM")){
			switch(jam){
				case 24 :
					jam = 00;
					break;
				case 12:
					jam = 00;
					break;
				case 11:
					jam = 23;
					break;
				case 10:
					jam = 22;
					break;
				case 9:
					jam = 21;
					break;
				case 8:
					jam = 20;
					break;
				case 7:
					jam = 19;
					break;
				case 6:
					jam = 18;
					break;
				case 5:
					jam = 17;
					break;
				case 4:
					jam = 16;
					break;
				case 3:
					jam = 15;
					break;
				case 2:
					jam = 14;
					break;
				case 1:
					jam = 13;
					break;
			}
		}

		System.out.println(jam + ":" +menit+ ":" + hari);
	}
}
