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
    public double getInvoiceTotal(){
        for (LineItem lineItem : LineItems){
            Total += lineItem.getLineTotal();
        }
        return Total;
    }
    public void SetCustomer(Customer Customer){
        Customer = this.Customer;
    }
    public Customer getCustomer(){
        return Customer;
    }
    public String FullCustomer(){
        return Customer.FullCustomer();
    }
    public ArrayList<LineItem> getLineItems(){
        return LineItems;
    }
    public void ClearLineItems(){
        LineItems.clear();
    }
}
