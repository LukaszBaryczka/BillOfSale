package baryczka.billofsale.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "bill_item")
public class BillItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "product")
    private Product product;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "price_for_one")
    private Double priceForOne;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "bill_item_consumer",
            joinColumns = {@JoinColumn(name = "bill_item_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "consumer_id", referencedColumnName = "id")})
    private List<Consumer> consumers;

    @ManyToOne
    @JoinColumn(name = "bill_of_sale")
    private BillOfSale billOfSale;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPriceForOne() {
        return priceForOne;
    }

    public void setPriceForOne(Double priceForOne) {
        this.priceForOne = priceForOne;
    }

    public List<Consumer> getConsumers() {
        return consumers;
    }

    public void setConsumers(List<Consumer> consumers) {
        this.consumers = consumers;
    }

    public BillOfSale getBillOfSale() {
        return billOfSale;
    }

    public void setBillOfSale(BillOfSale billOfSale) {
        this.billOfSale = billOfSale;
    }
}
