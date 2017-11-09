package baryczka.billofsale.model;

import java.util.List;

public class BillItem {

    private Long id;

    private Product product;

    private Integer amount;

    private Double priceForOne;

    private List<Consumer> consumers;

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
}
