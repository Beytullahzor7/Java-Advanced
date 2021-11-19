package oop;

public class ObjectFactory {

	public static void main(String[] args) {
		
		Pen firstPen = new Pen();
		firstPen.setColor("black"); 
		firstPen.setHeight(12);
	
		firstPen.writeMessage("Kalem Oluþturuldu"); 
		
		Car car = new Car();
		car.setNumberOfSeats(5);
		car.setNumberOfWheels(4);
		
		Vehicle bicycle = new Bicycle(); //Her araba ayný zamanda bir vehicledýr
		bicycle.start();
		bicycle.stop();
		
	}

}
