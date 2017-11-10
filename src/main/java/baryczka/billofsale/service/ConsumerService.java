package baryczka.billofsale.service;

import baryczka.billofsale.model.Consumer;
import baryczka.billofsale.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerService implements IService<Consumer> {

    @Autowired
    ConsumerRepository consumerRepository;

    @Override
    public String save(Consumer consumer) {
        return null;
    }

    @Override
    public String delete(Consumer consumer) {
        return null;
    }

    @Override
    public Consumer findOne(Long id) {
        return null;
    }

    @Override
    public List<Consumer> getAll() {
        return null;
    }
}
