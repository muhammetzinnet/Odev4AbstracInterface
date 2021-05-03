


public class Main {

	public static void main(String[] args) {
		
		
		CustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"mahmut","çevik","1.1.1980","123456789"));

	}

}
