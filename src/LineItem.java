public class LineItem{

    //Fields
    private Product product;
    private int quantity;
    private double LineTotal;
    //Constructor
    LineItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }
    //Setters and Getters
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //Special Methods
    public double getLineTotal() {
        LineTotal = quantity * product.getPrice();
        return LineTotal;
    }
}
