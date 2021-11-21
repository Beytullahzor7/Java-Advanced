package springIntro;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal; //dependency injection
	
	public CustomerManager(ICustomerDal customerDal) { //Art�k bu interfaceyi kullanan t�m s�n�flar� parametre olarak verebilirim
		this.customerDal = customerDal;
	}
	public void add() {
		customerDal.add();
		
	}

}
