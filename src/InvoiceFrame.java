import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class InvoiceFrame extends JFrame {

    //Panels
    JPanel LeftPanel,MainPanel,TitlePanel, LineItemPanel,ProductPanel,CustomerPanel,InvoicePanel;
    //Buttons
    JButton QuitButton,AddLineItemButton,CreateInvoiceButton,AddCustInfo;
    //TextArea
    JTextArea InvoiceTextArea;
    //TextFields
    JTextField CustName,CustAddress,ProductName,ProductPrice;
    //Spinners
    JSpinner ProductQuantity;
    //ScrollPane
    JScrollPane InvoiceScrollPane;
    //JLabel
    JLabel Title,ProductNameField,ProductPriceField,ProductQuantityField,CustomerNameField,CustomerAddressField;

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();

    public InvoiceFrame() {
        setTitle("Invoice Maker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((int)(screenSize.width*.85),(int)(screenSize.height*.85));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        LeftPanel = new JPanel();
        add(LeftPanel, BorderLayout.WEST);
        CreateLineItemPanel();
        LeftPanel.add(LineItemPanel, BorderLayout.NORTH);




        setVisible(true);
    }

    public void CreateLineItemPanel() {
        LineItemPanel = new JPanel();
        LineItemPanel.setLayout(new GridLayout(2,1));
        LineItemPanel.setBorder(new TitledBorder(new EtchedBorder(),"Edit Line Items"));
        CreateCustomerPanel();
        CreateProductPanel();
        LineItemPanel.add(CustomerPanel);
        LineItemPanel.add(ProductPanel);



    }
    public void CreateProductPanel() {
        //Panel Creation
        ProductPanel = new JPanel();
        ProductPanel.setLayout(new GridLayout(2,3));
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
        ProductPanel.add(ProductPriceField);
        ProductPanel.add(ProductQuantityField);
        ProductPanel.add(AddLineItemButton);
        ProductPanel.add(ProductName);
        ProductPanel.add(ProductPrice);
        ProductPanel.add(ProductQuantity);
    }
    public void CreateCustomerPanel() {
        //Panel Creation
        CustomerPanel = new JPanel();
        CustomerPanel.setLayout(new GridLayout(2,3));
        CustomerPanel.setBorder(new TitledBorder(new EtchedBorder(),"Edit Customer"));
        //TextFields,Labels,and Button
        CustAddress = new JTextField();
        CustName = new JTextField();
        CustomerNameField = new JLabel("Customer Name");
        CustomerAddressField = new JLabel("Customer Address");
        AddCustInfo = new JButton("Add Customer Info");
        //Add to Panel
        CustomerPanel.add(CustomerNameField);
        CustomerPanel.add(CustomerAddressField);
        CustomerPanel.add(AddCustInfo);
        CustomerPanel.add(CustName);
        CustomerPanel.add(CustAddress);
    }

    public void CreateInvoicePanel() {
        InvoicePanel = new JPanel();
        InvoicePanel.setLayout(new GridLayout(2,3));
    }
    public void CreateTitlePanel() {

    }
    /*
    public void Create

     */

}
