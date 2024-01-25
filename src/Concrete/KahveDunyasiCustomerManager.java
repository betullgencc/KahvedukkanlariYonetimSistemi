package Concrete;
import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class KahveDunyasiCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService icustomerCheckService;
	
public KahveDunyasiCustomerManager(ICustomerCheckService icustomerCheckService) {
		
		this.icustomerCheckService = icustomerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		if(icustomerCheckService.CheckIfRealPerson(customer)) {
		save(customer);
		} 
		else {
			System.out.println("Not a valid person");
		}
	}
	}

	


