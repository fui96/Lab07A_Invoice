import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class InvoiceFrame extends JFrame {

    //Panels
    JPanel MainPanel, TitlePanel, LineItemPanel,ProductPanel,CustomerPanel,InvoicePanel;
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
    JLabel Title,ProductNameField,ProductPriceField,ProductQuantityField;

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();

    public InvoiceFrame() {
        setTitle("Invoice Maker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((int)(screenSize.width*.85),(int)(screenSize.height*.85));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        MainPanel = new JPanel();
        add(MainPanel, BorderLayout.CENTER);


        setVisible(true);
    }

    public void CreateLineItemPanel() {
        LineItemPanel = new JPanel();
        LineItemPanel.setLayout(new GridLayout(2,1));
        LineItemPanel.setBorder(new TitledBorder(new EtchedBorder(),"Edit Line Items"));




    }
    public void CreateProductPanel() {
        //Panel Creation
        ProductPanel = new JPanel();
        ProductPanel.setLayout(new GridLayout(2,3));
        ProductPanel.setBorder(new TitledBorder(new EtchedBorder(),"Edit Products"));
        //Text Fields and Labels
        ProductName = new JTextField();
        ProductPrice = new JTextField();
        ProductQuantity = new JSpinner(new SpinnerNumberModel(0,1,100,1));
        ProductNameField = new JLabel("Product Name");
        ProductPriceField = new JLabel("Product Price");
        ProductQuantityField = new JLabel("Product Quantity");
        //Add to Panel
        ProductPanel.add(ProductNameField);
        ProductPanel.add(ProductPriceField);
        ProductPanel.add(ProductQuantityField);
        ProductPanel.add(ProductName);
        ProductPanel.add(ProductPrice);
        ProductPanel.add(ProductQuantity);

    }
    public void CreateCustomerPanel() {
        CustomerPanel = new JPanel();
    }

    public void CreateInvoicePanel() {

    }
    public void CreateTitlePanel() {

    }

}
