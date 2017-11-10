package baryczka.billofsale.repository;

import baryczka.billofsale.model.BillOfSale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillOfSaleRepository extends JpaRepository<BillOfSale, Long> {
}
