package Concrate;

import Abstract.CustomerService;
import Abstract.Repository;
import Adapters.MernisServiceAdapter;
import Entities.Campaing;
import Entities.Customer;

public class CustomerManager implements CustomerService, Repository<Customer> {
    MernisServiceAdapter serviceAdapter;

    public CustomerManager(MernisServiceAdapter serviceAdapter) {
        this.serviceAdapter = serviceAdapter;
    }

    @Override
    public void add(Customer customer) {
        if (this.serviceAdapter.checkInRealPerson(customer))
        {
            System.out.println("Added to : "+customer.getFirstName());
        }
        else
        {
            System.out.println("Registration failed");
        }

    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Deleted to : "+customer.getFirstName());
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Updated : "+customer.getFirstName());
    }
}
