package vivint.poc.debugging.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Item> items = new ArrayList<>();
    private BigDecimal total;
    private BigDecimal discount;

    // Default constructor
    public Order() {
    }

    // Getter for items (read-only access to the list)
    public List<Item> getItems() {
        return items;
    }

    // Getter for total
    public BigDecimal getTotal() {
        return total;
    }

    // Setter for total
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    // Getter for discount
    public BigDecimal getDiscount() {
        return discount;
    }

    // Setter for discount
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}
