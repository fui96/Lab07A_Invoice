import java.util.ArrayList;

public class Invoice{
    //Fields
    private ArrayList<LineItem> LineItems;
    private int Total;
    //Constructor
    public Invoice(){
        LineItems = new ArrayList<>();
        Total = 0;
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

}
