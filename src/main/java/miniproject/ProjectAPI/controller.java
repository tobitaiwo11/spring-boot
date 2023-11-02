package miniproject.ProjectAPI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    

    @Autowired
    CustomerService CustomerService;

    @GetMapping("/customer")
    private Iterable<Customer> getAllCustomer() {
        return CustomerService.findAll();
    }

    @GetMapping("/customer/{id}")
    private Customer getCutomers(@PathVariable("id") int id) {
        return CustomerService.getPersonById(id);
    }

    @DeleteMapping("/customer/{id}")
    private void deleteCustomer(@PathVariable("id") int id) {
        CustomerService.delete(id);
    }

    @PostMapping("/customer")
    private int saveCustomers(@RequestBody final Customer customer) {
        CustomerService.saveOrUpdate(customer);
        return customer.getId();
    }

    @Autowired
    ItemService ItemService;

    @GetMapping("/item")
    private Iterable<Item> getAllItem() {
        return ItemService.findAllItem();
    }

    @GetMapping("/item/{id}")
    private Item getItem(@PathVariable("id") int id) {
        return ItemService.getItemId(id);
    }

    @DeleteMapping("/item/{id}")
    private void deleteItem(@PathVariable("id") int id) {
        ItemService.deleteItem(id);
    }

    @PostMapping("/item")
    private int saveItem(@RequestBody final Item item) {
        ItemService.saveOrUpdateItem(item);
        return item.getId();
    }


    @Autowired
    OrderService OrderService;

    @GetMapping("/orders")
    private Iterable<Order> getAllOrder() {
        return OrderService.findAllOrder();
    }

    @GetMapping("/orders/{id}")
    private Order getOrder(@PathVariable("id") int id) {
        return OrderService.getOrderId(id);
    }

    @DeleteMapping("/orders/{id}")
    private void deleteOrder(@PathVariable("id") int id) {
        OrderService.deleteOrder(id);
    }

    @PostMapping("/orders")
    private int saveOrder(@RequestBody final Order Order) {
        OrderService.saveOrUpdateOrder(Order);
        return Order.getId();
    }
}

