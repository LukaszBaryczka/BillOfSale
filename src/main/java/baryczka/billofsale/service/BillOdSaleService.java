package baryczka.billofsale.service;

import baryczka.billofsale.model.BillOfSale;
import baryczka.billofsale.repository.BillOfSaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillOdSaleService implements IService<BillOfSale> {

    @Autowired
    BillOfSaleRepository billOfSaleRepository;

    @Override
    public String save(BillOfSale billOfSale) {
        return null;
    }

    @Override
    public String delete(BillOfSale billOfSale) {
        return null;
    }

    @Override
    public BillOfSale findOne(Long id) {
        return null;
    }

    @Override
    public List<BillOfSale> getAll() {
        return null;
    }
}
