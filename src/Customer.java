



public class Customer implements ICustomerService{
	public int id;
    public String firstName;
    public String lastName;
    public String yearOfBirth;
    public String nationlaity;
    
    
	public Customer(int id, String firstName, String lastName, String yearOfBirth , String nationlaity) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.yearOfBirth=yearOfBirth;
		this.nationlaity=nationlaity;
		
	}
	@Override
	public void save(Customer costumer) {
		// TODO Auto-generated method stub
		
	}

}
