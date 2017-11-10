package baryczka.billofsale.service;

import baryczka.billofsale.model.Category;
import baryczka.billofsale.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements IService<Category> {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public String save(Category category) {
        return null;
    }

    @Override
    public String delete(Category category) {
        return null;
    }

    @Override
    public Category findOne(Long id) {
        return null;
    }

    @Override
    public List<Category> getAll() {
        return null;
    }
}
