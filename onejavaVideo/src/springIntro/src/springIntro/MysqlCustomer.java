package springIntro;

public class MysqlCustomer implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("MySQl Added");
		
	}

}
