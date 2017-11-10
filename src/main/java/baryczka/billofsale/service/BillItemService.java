package baryczka.billofsale.service;

import baryczka.billofsale.model.BillItem;
import baryczka.billofsale.repository.BillItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillItemService implements IService<BillItem> {

    @Autowired
    BillItemRepository billItemRepository;

    @Override
    public String save(BillItem billItem) {
        return null;
    }

    @Override
    public String delete(BillItem billItem) {
        return null;
    }

    @Override
    public BillItem findOne(Long id) {
        return null;
    }

    @Override
    public List<BillItem> getAll() {
        return null;
    }
}
