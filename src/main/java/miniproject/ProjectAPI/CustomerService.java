package miniproject.ProjectAPI;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo CustomerRepository;
  



    public  Iterable<Customer> findAll() {

        return CustomerRepository.findAll();
    }

    public Customer getPersonById(int id) {
        return CustomerRepository.findById(id).get();
    }

    public void saveOrUpdate(Customer customer) {
        CustomerRepository.save(customer);
    }

    public void delete(int id) {
        CustomerRepository.deleteById(id);
    }


    // public  Iterable<Item> findAll() {

    //     return ItemRepository.findAll();
    // }

    // public Customer getPersonById(int id) {
    //     return CustomerRepository.findById(id).get();
    // }

    // public void saveOrUpdate(Customer customer) {
    //     CustomerRepository.save(customer);
    // }

    // public void delete(int id) {
    //     CustomerRepository.deleteById(id);
    // }


    // public  Iterable<Customer> findAll() {

    //     return CustomerRepository.findAll();
    // }

    // public Customer getPersonById(int id) {
    //     return CustomerRepository.findById(id).get();
    // }

    // public void saveOrUpdate(Customer customer) {
    //     CustomerRepository.save(customer);
    // }

    // public void delete(int id) {
    //     CustomerRepository.deleteById(id);
    // }
}

