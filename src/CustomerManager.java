
public class CustomerManager implements ICustomerService {

	@Override
	public void save(Customer custumer) {
		System.out.println("Ad�: " + custumer.firstName + "\nSoyad�: " + custumer.lastName + "\nDo�um Tarihi: " + custumer.yearOfBirth + "\nT.C. Kimlik Numaras�: " + custumer.nationlaity + "\nVeri taban�na eklendi.");
		
	}

}
