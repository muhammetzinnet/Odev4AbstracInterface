
public class StarbucksCustomerManager extends CustomerManager {
	
	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		
		
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)){
	           super.save(customer);
	       }else{
	           System.out.println("Personel bulunamadý.");
	       }
	}

}
