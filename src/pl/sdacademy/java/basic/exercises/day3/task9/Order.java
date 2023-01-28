package pl.sdacademy.java.basic.exercises.day3.task9;

public class Order {
    private int nextIndex = 0;
    private int maxOrderItem;
    private OrderItem[] orderItems;

    public Order(int maxOrderItem) {
        this.maxOrderItem = maxOrderItem;
        orderItems = new OrderItem[maxOrderItem];
    }

    public boolean addItem(OrderItem orderItem) {
        if(nextIndex >= maxOrderItem) {
            System.out.println("order is full");
            return false;
        }
        if(!orderItem.isCorrect()) {
            System.out.println("item is incorrect");
            return false;
        }
        orderItems[nextIndex] = orderItem;
        nextIndex++;
        return true;
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for(OrderItem orderItem : orderItems) {
            if(orderItem != null) {
                totalAmount += orderItem.getPrice();
            }
        }
        return totalAmount;
        /*totalAmount =  Math.round(totalAmount * 100); // wyświetlanie dwóch miejsc po przecinku
        return totalAmount/100;*/
    }

    public int getItemsCount() {
        int total = 0;
        for(OrderItem orderItem : orderItems) {
            if(orderItem != null) {
                total += orderItem.getQuantity();
            }
        }
        return total;
    }

    public void print() {
        for(OrderItem orderItem : orderItems) {
            if(orderItem != null) {
                orderItem.print();
            }
        }
        System.out.println("Total amount: " + getTotalAmount());
        System.out.println("Count: " + getItemsCount());
    }
}