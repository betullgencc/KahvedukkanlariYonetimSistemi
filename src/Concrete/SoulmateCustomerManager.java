package Concrete;
import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class SoulmateCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService checkService;

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		save(customer);
		
	}

	

}
