package miniproject.ProjectAPI;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemRepo ItemRepository;



    public  Iterable<Item> findAllItem() {

        return ItemRepository.findAll();
    }

    public Item getItemId(int id) {
        return ItemRepository.findById(id).get();
    }

    public void saveOrUpdateItem(Item item) {
        ItemRepository.save(item);
    }

    public void deleteItem(int id) {
        ItemRepository.deleteById(id);
    }
}

