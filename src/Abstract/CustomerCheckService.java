package Abstract;

import Entities.Customer;

public interface CustomerCheckService {
    boolean checkInRealPerson(Customer customer);
}
