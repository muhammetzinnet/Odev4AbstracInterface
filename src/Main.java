


public class Main {

	public static void main(String[] args) {
		
		
		CustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"mahmut","�evik","1.1.1980","123456789"));

	}

}
