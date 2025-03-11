import java.util.ArrayList;

public class Invoice{
    //Fields
    private ArrayList<LineItem> LineItems;
    private double Total;
    private Customer Customer;
    //Constructor
    public Invoice(){
        LineItems = new ArrayList<>();
        Total = 0;
        Customer = null;
    }
    //Methods

    public void addLineItem(LineItem lineItem){
        LineItems.add(lineItem);
    }
    public void removeLineItem(int index){
        LineItems.remove(index);
    }
    public void getInvoiceTotal(){
        for (LineItem lineItem : LineItems){
            Total += lineItem.getLineTotal();
        }
    }
    public void SetCustomer(Customer Customer){
        Customer = this.Customer;
    }
    public Customer getCustomer(){
        return Customer;
    }
}
