package Entities;
import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
//import Abstract.ICustomerCheckService;
import Concrete.KahveDunyasiCustomerManager;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseCustomerManager customerManager=new KahveDunyasiCustomerManager(new MernisServiceAdapter());
		Customer customer=new Customer();
		customerManager.save(new Customer(1, "betul", "dddd", 1999, "00000000001"));

	}

}
