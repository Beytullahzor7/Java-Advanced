package polymorphism;

public class Test {

	public static void main(String[] args) {
		Dog doggy = new Dog();
		System.out.println(doggy.hareket());
		
		Snake snake = new Snake();
		System.out.println(snake.hareket());
		
	}
	
	public static int toplama(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int toplama(int sayi1, int sayi2, int sayi3) { //method Overloading
		return sayi1+sayi2+sayi3;
	}
	
	public static int toplama(String x, int y) {
		return 0;	
	}
}

class Animal{
	public String hareket() {
		return "Hareket Ederim";
	}
}

class Dog extends Animal{
	public String hareket() { //overriding
		return "Koþarým";
	} 
}

class Snake extends Animal{
	
}








