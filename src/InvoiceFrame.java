import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class InvoiceFrame extends JFrame {

    //Panels
    JPanel LeftPanel,MainPanel, LineItemPanel,ProductPanel,CustomerPanel,InvoicePanel,InvoiceControlPanel,ButtonPanel;
    //Buttons
    JButton QuitButton,AddLineItemButton,CreateInvoiceButton,ResetInvoiceButton,AddCustInfo;
    //TextArea
    JTextArea InvoiceTextArea,LineItemTextArea;
    //TextFields
    JTextField CustName,CustAddress,ProductName,ProductPrice;
    //Spinners
    JSpinner ProductQuantity;
    //ScrollPane
    JScrollPane InvoiceScrollPane;
    //JLabel
    JLabel ProductNameField,ProductPriceField,ProductQuantityField,CustomerNameField,CustomerAddressField;
    //ComboBox


    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    Invoice Invoice = new Invoice();
    public InvoiceFrame() {
        setTitle("Invoice Maker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((int)(screenSize.width*.85),(int)(screenSize.height*.85));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        LeftPanel = new JPanel();
        LeftPanel.setLayout(new BorderLayout());
        add(LeftPanel, BorderLayout.WEST);
        CreateLineItemPanel();
        LeftPanel.add(LineItemPanel, BorderLayout.NORTH);
        CreateInvoiceControlPanel();
        LeftPanel.add(InvoiceControlPanel, BorderLayout.CENTER);
        CreateInvoicePanel();
        add(InvoicePanel, BorderLayout.CENTER);


        setVisible(true);
    }

    public void CreateLineItemPanel() {
        LineItemPanel = new JPanel();
        LineItemPanel.setLayout(new GridLayout(2,1));
        LineItemPanel.setBorder(new TitledBorder(new EtchedBorder(),"Edit Items and Customer"));
        CreateCustomerPanel();
        CreateProductPanel();
        LineItemPanel.add(CustomerPanel);
        LineItemPanel.add(ProductPanel);



    }
    public void CreateProductPanel() {
        //Panel Creation
        ProductPanel = new JPanel();
        ProductPanel.setLayout(new GridLayout(6,1));
        ProductPanel.setBorder(new TitledBorder(new EtchedBorder(),"Edit Product"));
        //Text Fields, Labels, and Button
        ProductName = new JTextField();
        ProductPrice = new JTextField();
        ProductQuantity = new JSpinner(new SpinnerNumberModel(1,1,100,1));
        ProductNameField = new JLabel("Product Name");
        ProductPriceField = new JLabel("Product Price");
        ProductQuantityField = new JLabel("Product Quantity");
        AddLineItemButton = new JButton("Add Line Item");
        //Add to Panel
        ProductPanel.add(ProductNameField);
        ProductPanel.add(ProductName);
        ProductPanel.add(ProductPriceField);
        ProductPanel.add(ProductPrice);
        ProductPanel.add(ProductQuantityField);
        ProductPanel.add(ProductQuantity);
        ProductPanel.add(AddLineItemButton);
    }
    public void CreateCustomerPanel() {
        //Panel Creation
        CustomerPanel = new JPanel();
        CustomerPanel.setLayout(new GridLayout(5,1));
        CustomerPanel.setBorder(new TitledBorder(new EtchedBorder(),"Edit Customer"));
        //TextFields,Labels,and Button
        CustAddress = new JTextField();
        CustName = new JTextField();
        CustomerNameField = new JLabel("Customer Name");
        CustomerAddressField = new JLabel("Customer Address");
        AddCustInfo = new JButton("Add Customer Info");
        //Add to Panel
        CustomerPanel.add(CustomerNameField);
        CustomerPanel.add(CustName);
        CustomerPanel.add(CustomerAddressField);
        CustomerPanel.add(CustAddress);
        CustomerPanel.add(AddCustInfo);

    }

    public void CreateInvoiceControlPanel() {
        //Create Panel
        InvoiceControlPanel = new JPanel();
        InvoiceControlPanel.setLayout(new BoxLayout(InvoiceControlPanel,BoxLayout.Y_AXIS));
        InvoiceControlPanel.setBorder(new TitledBorder(new EtchedBorder(),"Edit Invoice"));
        ButtonPanel = new JPanel();
        ButtonPanel.setLayout(new GridLayout(1,2));
        //Buttons, TextArea
        LineItemTextArea = new JTextArea();
        LineItemTextArea.setEditable(false);
        LineItemTextArea.setLineWrap(true);
        ResetInvoiceButton = new JButton("Reset Invoice");
        CreateInvoiceButton = new JButton("Create Invoice");
        //Add to Panel
        InvoiceControlPanel.add(LineItemTextArea);
        ButtonPanel.add(ResetInvoiceButton);
        ButtonPanel.add(CreateInvoiceButton);
        InvoiceControlPanel.add(ButtonPanel);
        InvoiceControlPanel.add(Box.createVerticalStrut(50));


    }
    public void CreateInvoicePanel(){
        //Create Panel
        InvoicePanel = new JPanel();
        InvoicePanel.setLayout(new GridLayout(1,1));
        InvoicePanel.setBorder(new TitledBorder(new EtchedBorder(),"Invoice"));
        //TextArea
        InvoiceTextArea = new JTextArea();
        LineItemTextArea.setEditable(false);
        LineItemTextArea.setLineWrap(true);
        //Add to Panel
        InvoicePanel.add(InvoiceTextArea);

    }

    //Validations
    public boolean ValidateCust(){
        if(!CustName.getText().trim().isEmpty() && !CustAddress.getText().trim().isEmpty()){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null,"Please enter a valid Customer Name or Address");
            return false;
        }
    }
    public boolean ValidateLineItem(){
        if(!ProductName.getText().trim().isEmpty() && !ProductPrice.getText().trim().isEmpty() && ((int)ProductQuantity.getValue() > 0)){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null,"Please enter a valid Product Name");
            return false;
        }
    }

    //Button actions
    public void CreateInvoiceAction(){
        StringBuilder sb  = new StringBuilder();
        sb.append();
    }
    public void ResetInvoiceAction(){

    }
    public void addCustinfoAction(){
        if(ValidateCust()){
            Customer Cust = new Customer(CustName.getText(),CustAddress.getText());
            Invoice.SetCustomer(Cust);
        }
    }
    public void addLineItemAction(){
        if(ValidateLineItem()){
            double price = Double.parseDouble(ProductPrice.getText());
            int quantity = (int)ProductQuantity.getValue();
            Product Prod = new Product(ProductName.getText(),price);
            LineItem lineItem = new LineItem(Prod,quantity);
            Invoice.addLineItem(lineItem);
        }
    }






}
