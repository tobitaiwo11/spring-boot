package miniproject.ProjectAPI;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepo OrderRepository;



    public  Iterable<Order> findAllOrder() {

        return OrderRepository.findAll();
    }

    public Order getOrderId(int id) {
        return OrderRepository.findById(id).get();
    }

    public void saveOrUpdateOrder(Order order) {
        OrderRepository.save(order);

    }

    public void deleteOrder(int id) {
        OrderRepository.deleteById(id);
    }
}

