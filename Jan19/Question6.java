package Jan19;

public class Question6 {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("ORD001", "2026-01-01"),
                new ShippedOrder("ORD002", "2026-01-02", "TRK123"),
                new DeliveredOrder("ORD003", "2026-01-03", "TRK456", "2026-01-05")
        };

        for (Order order : orders) {
            System.out.println(order.orderId + " → " + order.getOrderStatus());
        }
    }
}

class Order {
    protected String orderId, orderDate;
    public Order(String id, String date) {
        this.orderId = id; this.orderDate = date;
    }
    public String getOrderStatus() { return "Order Placed"; }
}

class ShippedOrder extends Order {
    private String trackingNumber;
    public ShippedOrder(String id, String date, String tracking) {
        super(id, date); this.trackingNumber = tracking;
    }
    @Override public String getOrderStatus() {
        return "Shipped | Tracking: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;
    public DeliveredOrder(String id, String date, String tracking, String delDate) {
        super(id, date, tracking); this.deliveryDate = delDate;
    }
    @Override public String getOrderStatus() {
        return "Delivered | Date: " + deliveryDate;
    }
}