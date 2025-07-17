package vivint.poc.debugging.services;

import vivint.poc.debugging.models.Order;
import vivint.poc.debugging.models.Item;
import java.math.BigDecimal;

public class OrderProcessingService {

    public void addItem(Order order, Item item) {
        order.getItems().add(item);
    }

    public void applyDiscount(Order order, BigDecimal discountPercentage) {
        if (order.getItems().size() >= 3) { // discount only applies if there are 3 or more items
            order.setDiscount(discountPercentage);
            order.setTotal(order.getTotal().subtract(order.getTotal().multiply(order.getDiscount())));
        }
    }

    public void processOrder(Order order) {
        applyDiscount(order, new BigDecimal("10")); // Apply a 10% discount if conditions are met
        
        System.out.println("Order Total: $" + order.getTotal() + ", Discount: " + order.getDiscount() + "%");
    }
}
