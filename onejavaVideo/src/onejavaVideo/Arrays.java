package onejavaVideo;

public class Arrays {

	public static void main(String[] args) {
		
		int [] sayiDizisi = new int[10];
		
		sayiDizisi[0] = 3;
		sayiDizisi[1] = 4;
		sayiDizisi[8] = 9;
		sayiDizisi[9] = 6;

		int a = sayiDizisi[8];
		System.out.println(a);
		
		for (int i = 0; i < sayiDizisi.length; i++) 
			System.out.print(sayiDizisi[i]);	
		System.out.println(); //boþluk
		
		String[] yaziDizisi = {"Java","Python","JavaScript"};
		
		for (int i = 0; i < yaziDizisi.length; i++) {
			System.out.println(yaziDizisi[i]);
			
		}
		
	}

}
