package onejavaVideo;

public class Functions {

	public static void main(String[] args) {
		/*int sonuc = toplam(5, 6);
		System.out.println(sonuc);*/
		
		System.out.println(toplam(5, 4));
		System.out.println(hello("Beytullah"));
		System.out.println(findYear(22));
		bye();
		

	}
	
	public static int toplam(int sayi1, int sayi2) {
		int cevap = sayi1 + sayi2;
		return cevap;
	}
	
	public static String hello(String ad) {
		return "Merhaba " + ad;
	}
	
	public static String findYear(int yas) {
		int y�l = 2021-yas;
		y�l-=1;
		
		return (y�l + " y�l�nda dogdunuz");
	}
	
	public static void bye() {
		System.out.println("G�r���r�z");
	}
	
	

}
