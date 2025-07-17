import vivint.poc.debugging.models.Order;
import vivint.poc.debugging.models.Item;
import vivint.poc.debugging.services.OrderProcessingService;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        OrderProcessingService orderProcessingService = new OrderProcessingService();

        orderProcessingService.addItem(order, new Item("Item 1", new BigDecimal("100")));
        orderProcessingService.addItem(order, new Item("Item 2", new BigDecimal("50")));
        orderProcessingService.addItem(order, new Item("Item 3", new BigDecimal("25")));

        orderProcessingService.processOrder(order);
    }
}
