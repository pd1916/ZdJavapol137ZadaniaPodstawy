package pl.sdacademy.java.basic.exercises.day3.task9;

public class OrderItem {
    private String productName;
    private int quantity;
    private double price;

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice() {
        //return (quantity * price)*100/100; // wyświetlanie dwóch miejsc po przecinku
        return (quantity * price);
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isCorrect() {
        return quantity > 0 && !(price <= 0);
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append(productName).append("\t| ");
        sb.append(price).append(" ").append("zł").append("\t| ");
        sb.append(quantity).append(" ").append("pcs").append("\t| ");
        sb.append(getPrice()).append(" zł");
        System.out.println(sb);
    }
}