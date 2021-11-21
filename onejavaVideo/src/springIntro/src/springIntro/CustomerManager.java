package springIntro;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal; //dependency injection
	
	public CustomerManager(ICustomerDal customerDal) { //Artýk bu interfaceyi kullanan tüm sýnýflarý parametre olarak verebilirim
		this.customerDal = customerDal;
	}
	public void add() {
		customerDal.add();
		
	}

}
