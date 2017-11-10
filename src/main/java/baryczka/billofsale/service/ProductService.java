package baryczka.billofsale.service;

import baryczka.billofsale.model.Product;
import baryczka.billofsale.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IService<Product> {

    @Autowired
    ProductRepository productRepository;

    @Override
    public String save(Product product) {
        return null;
    }

    @Override
    public String delete(Product product) {
        return null;
    }

    @Override
    public Product findOne(Long id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
