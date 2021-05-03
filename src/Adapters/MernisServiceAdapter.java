package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkInRealPerson(Customer customer) {
        if (customer.getFirstName().length()>=3 && customer.getNationalityId().length()==11 && customer.getLastName().length()>=3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
