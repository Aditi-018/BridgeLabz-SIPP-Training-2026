// Base Class
class Order {
    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}

// Subclass
class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate,
                        String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

// Subclass of ShippedOrder
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate,
                          String trackingNumber,
                          String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    public void displayInfo() {
        System.out.println("Order ID       : " + orderId);
        System.out.println("Order Date     : " + orderDate);
        System.out.println("Tracking No.   : " + trackingNumber);
        System.out.println("Delivery Date  : " + deliveryDate);
        System.out.println("Status         : " + getOrderStatus());
    }
}

// Main Class
public class OrderManagement {
    public static void main(String[] args) {

        DeliveredOrder order = new DeliveredOrder(
                101,
                "20-09-2025",
                "TRK12345",
                "25-09-2025");

        order.displayInfo();
    }
}