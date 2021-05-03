
public class CustomerManager implements ICustomerService {

	@Override
	public void save(Customer custumer) {
		System.out.println("Adý: " + custumer.firstName + "\nSoyadý: " + custumer.lastName + "\nDoðum Tarihi: " + custumer.yearOfBirth + "\nT.C. Kimlik Numarasý: " + custumer.nationlaity + "\nVeri tabanýna eklendi.");
		
	}

}
