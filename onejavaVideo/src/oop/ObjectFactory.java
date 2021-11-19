package oop;

public class ObjectFactory {

	public static void main(String[] args) {
		
		Pen firstPen = new Pen();
		firstPen.setColor("black"); 
		firstPen.setHeight(12);
	
		firstPen.writeMessage("Kalem Olu�turuldu"); 
		
		Car car = new Car();
		car.setNumberOfSeats(5);
		car.setNumberOfWheels(4);
		
		Vehicle bicycle = new Bicycle(); //Her araba ayn� zamanda bir vehicled�r
		bicycle.start();
		bicycle.stop();
		
	}

}
