package baryczka.billofsale.model;

import java.util.Date;
import java.util.List;

public class BillOfSale {

    private Long id;

    private Date date;

    private List<BillItem> billItems;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<BillItem> getBillItems() {
        return billItems;
    }

    public void setBillItems(List<BillItem> billItems) {
        this.billItems = billItems;
    }
}
