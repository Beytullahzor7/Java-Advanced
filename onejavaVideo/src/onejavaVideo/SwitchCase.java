package onejavaVideo;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner okuyucu = new Scanner(System.in);
		
		System.out.println("Hesap Makinesine Hosgeldiniz");
		System.out.println("Hesaplamak istediðiniz 2 sayýyý giriniz");
		
		int sayi1 = okuyucu.nextInt();
		int sayi2 = okuyucu.nextInt();
		
		System.out.println("Hangi iþlemi yapmak istersiniz? (*, /, -, +)");
		char islem = okuyucu.next().charAt(0); //Get firstChar
		int sonuc;
		
		switch (islem) {
		
		case '+':
			sonuc = sayi1 + sayi2;
			System.out.println(sonuc);
			break;
			
		case '-':
			sonuc = sayi1 - sayi2;
			System.out.println(sonuc);
			break;
			
		case '*':
			sonuc = sayi1 * sayi2;
			System.out.println(sonuc);
			break;
			
		case '/':
			sonuc = sayi1 / sayi2;
			System.out.println(sonuc);
			break;
		
		default:
			System.out.println("Geçersiz Ýþlem Girdiniz!");
		}
		okuyucu.close();

	}

}
