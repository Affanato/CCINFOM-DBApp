import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Sun Nov 10 14:02:37 PST 2024
 */



/**
 * @author Diane
 */
public class PurchaseProducts extends JFrame {
	public PurchaseProducts() {
		initComponents();
	}

	private void purchaseBackButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void recordSalesMouseClicked(MouseEvent e) {
		// TODO add your code here
		recordSalesFrame.setVisible(true);
		purchaseProductsFrame.dispose();
	}

	private void availableProdMouseClicked(MouseEvent e) {
		// TODO add your code here
		availableProductsFrame.setVisible(true);
		purchaseProductsFrame.dispose();
	}

	private void restockProductsMouseClicked(MouseEvent e) {
		// TODO add your code here
		restockProductsFrame.setVisible(true);
		purchaseProductsFrame.dispose();
	}

	private void availableProductsBackButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
		purchaseProductsFrame.setVisible(true);
		availableProductsFrame.dispose();
	}

	private void restockProductsBackButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
		purchaseProductsFrame.setVisible(true);
		restockProductsFrame.dispose();
	}

	private void restockButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void recordSalesBackButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
		purchaseProductsFrame.setVisible(true);
		recordSalesFrame.dispose();
	}

	private void recordButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void backButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void recordSales2MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void backButton2MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void button1MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void restockButton(MouseEvent e) {
		// TODO add your code here
	}

	private void restockMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void recordMouseClicked(MouseEvent e) {
		// TODO add your code here
	}



	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
		purchaseProductsFrame = new JFrame();
		purchaseBackButton = new JButton();
		titleBar = new JFormattedTextField();
		recordSales = new JButton();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		availableProd = new JButton();
		restockProducts = new JButton();
		availableProductsFrame = new JFrame();
		availableProductsBackButton = new JButton();
		titleBar2 = new JFormattedTextField();
		scrollPane1 = new JScrollPane();
		table1 = new JTable();
		restockProductsFrame = new JFrame();
		restockProductsBackButton = new JButton();
		titleBar3 = new JFormattedTextField();
		scrollPane2 = new JScrollPane();
		table2 = new JTable();
		button1 = new JButton();
		prodIDTextField = new JFormattedTextField();
		restockQuantityTextField = new JFormattedTextField();
		restockProdID = new JTextPane();
		restockQuantity = new JTextPane();
		recordSalesFrame = new JFrame();
		recordSalesBackButton = new JButton();
		titleBar4 = new JFormattedTextField();
		scrollPane3 = new JScrollPane();
		table3 = new JTable();
		button2 = new JButton();
		prodIDTextField1 = new JFormattedTextField();
		quantitySoldTextField = new JFormattedTextField();
		recordProdID = new JTextPane();
		recordQuantity = new JTextPane();
		scrollPane4 = new JScrollPane();
		table4 = new JTable();
		memberIDTextField = new JFormattedTextField();
		recordMemberID = new JTextPane();

		//======== purchaseProductsFrame ========
		{
			purchaseProductsFrame.setBackground(Color.white);
			Container purchaseProductsFrameContentPane = purchaseProductsFrame.getContentPane();
			purchaseProductsFrameContentPane.setLayout(null);

			//---- purchaseBackButton ----
			purchaseBackButton.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\backButton.jpg"));
			purchaseBackButton.setBackground(new Color(0xc80f2e));
			purchaseBackButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					backButtonMouseClicked(e);
					purchaseBackButtonMouseClicked(e);
				}
			});
			purchaseProductsFrameContentPane.add(purchaseBackButton);
			purchaseBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar ----
			titleBar.setText("Purchase Products");
			titleBar.setBackground(new Color(0xc80f2e));
			titleBar.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar.setForeground(Color.white);
			purchaseProductsFrameContentPane.add(titleBar);
			titleBar.setBounds(0, 0, 1200, 55);

			//---- recordSales ----
			recordSales.setText("RECORD A SALE");
			recordSales.setSelectedIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\gym.jpg"));
			recordSales.setBackground(new Color(0x3ca3cb));
			recordSales.setForeground(Color.white);
			recordSales.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			recordSales.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					recordSalesMouseClicked(e);
					recordSalesMouseClicked(e);
				}
			});
			purchaseProductsFrameContentPane.add(recordSales);
			recordSales.setBounds(480, 540, 250, 55);

			//---- label1 ----
			label1.setText("image here!");
			label1.setBackground(Color.blue);
			label1.setHorizontalAlignment(SwingConstants.CENTER);
			label1.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\availability.jpg"));
			purchaseProductsFrameContentPane.add(label1);
			label1.setBounds(70, 130, 305, 370);

			//---- label2 ----
			label2.setText("image here!");
			label2.setBackground(Color.blue);
			label2.setHorizontalAlignment(SwingConstants.CENTER);
			label2.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\recordsales.jpg"));
			purchaseProductsFrameContentPane.add(label2);
			label2.setBounds(455, 130, 305, 370);

			//---- label3 ----
			label3.setText("image here!");
			label3.setBackground(Color.blue);
			label3.setHorizontalAlignment(SwingConstants.CENTER);
			label3.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\restock.jpg"));
			purchaseProductsFrameContentPane.add(label3);
			label3.setBounds(845, 130, 305, 370);

			//---- availableProd ----
			availableProd.setText("READ AVAILABLE PRODUCTS");
			availableProd.setSelectedIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\gym.jpg"));
			availableProd.setBackground(new Color(0x3ca3cb));
			availableProd.setForeground(Color.white);
			availableProd.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			availableProd.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					recordSales2MouseClicked(e);
					availableProdMouseClicked(e);
					availableProdMouseClicked(e);
				}
			});
			purchaseProductsFrameContentPane.add(availableProd);
			availableProd.setBounds(90, 540, 250, 55);

			//---- restockProducts ----
			restockProducts.setText("RESTOCK PRODUCTS");
			restockProducts.setSelectedIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\gym.jpg"));
			restockProducts.setBackground(new Color(0x3ca3cb));
			restockProducts.setForeground(Color.white);
			restockProducts.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			restockProducts.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					restockProductsMouseClicked(e);
					restockProductsMouseClicked(e);
					restockProductsMouseClicked(e);
				}
			});
			purchaseProductsFrameContentPane.add(restockProducts);
			restockProducts.setBounds(870, 540, 250, 55);

			purchaseProductsFrameContentPane.setPreferredSize(new Dimension(1200, 700));
			purchaseProductsFrame.setSize(1200, 700);
			purchaseProductsFrame.setLocationRelativeTo(null);
			purchaseProductsFrame.setVisible(true);
		}

		//======== availableProductsFrame ========
		{
			Container availableProductsFrameContentPane = availableProductsFrame.getContentPane();
			availableProductsFrameContentPane.setLayout(null);

			//---- availableProductsBackButton ----
			availableProductsBackButton.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\backButton.jpg"));
			availableProductsBackButton.setBackground(new Color(0xc80f2e));
			availableProductsBackButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					backButtonMouseClicked(e);
					availableProductsBackButtonMouseClicked(e);
				}
			});
			availableProductsFrameContentPane.add(availableProductsBackButton);
			availableProductsBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar2 ----
			titleBar2.setText("Purchase Products: Read Available Products");
			titleBar2.setBackground(new Color(0xc80f2e));
			titleBar2.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar2.setForeground(Color.white);
			availableProductsFrameContentPane.add(titleBar2);
			titleBar2.setBounds(0, 0, 1200, 55);

			//======== scrollPane1 ========
			{

				//---- table1 ----
				table1.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
					},
					new String[] {
						"Product ID", "Product Name", "Product Description", "Brand", "Available Quantity"
					}
				));
				{
					TableColumnModel cm = table1.getColumnModel();
					cm.getColumn(0).setMinWidth(80);
					cm.getColumn(1).setMinWidth(200);
					cm.getColumn(2).setMinWidth(350);
					cm.getColumn(2).setMaxWidth(450);
					cm.getColumn(3).setMinWidth(200);
					cm.getColumn(4).setMinWidth(150);
				}
				scrollPane1.setViewportView(table1);
			}
			availableProductsFrameContentPane.add(scrollPane1);
			scrollPane1.setBounds(90, 120, 1010, 500);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < availableProductsFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = availableProductsFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = availableProductsFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				availableProductsFrameContentPane.setMinimumSize(preferredSize);
				availableProductsFrameContentPane.setPreferredSize(preferredSize);
			}
			availableProductsFrame.setSize(1200, 700);
			availableProductsFrame.setLocationRelativeTo(null);
		}

		//======== restockProductsFrame ========
		{
			Container restockProductsFrameContentPane = restockProductsFrame.getContentPane();
			restockProductsFrameContentPane.setLayout(null);

			//---- restockProductsBackButton ----
			restockProductsBackButton.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\backButton.jpg"));
			restockProductsBackButton.setBackground(new Color(0xc80f2e));
			restockProductsBackButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					backButton2MouseClicked(e);
					restockProductsBackButtonMouseClicked(e);
				}
			});
			restockProductsFrameContentPane.add(restockProductsBackButton);
			restockProductsBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar3 ----
			titleBar3.setText("Purchase Products: Restock Products");
			titleBar3.setBackground(new Color(0xc80f2e));
			titleBar3.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar3.setForeground(Color.white);
			restockProductsFrameContentPane.add(titleBar3);
			titleBar3.setBounds(0, 0, 1200, 55);

			//======== scrollPane2 ========
			{

				//---- table2 ----
				table2.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null},
						{null, null, null, null, null},
					},
					new String[] {
						"Product ID", "Product Name", "Product Description", "Brand", "Available Quantity"
					}
				));
				{
					TableColumnModel cm = table2.getColumnModel();
					cm.getColumn(0).setMinWidth(80);
					cm.getColumn(1).setMinWidth(200);
					cm.getColumn(2).setMinWidth(350);
					cm.getColumn(2).setMaxWidth(450);
					cm.getColumn(3).setMinWidth(200);
					cm.getColumn(4).setMinWidth(150);
				}
				table2.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 12));
				scrollPane2.setViewportView(table2);
			}
			restockProductsFrameContentPane.add(scrollPane2);
			scrollPane2.setBounds(90, 120, 1010, 290);

			//---- button1 ----
			button1.setText("RESTOCK");
			button1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			button1.setBackground(new Color(0x3ca3cb));
			button1.setForeground(Color.white);
			button1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					button1MouseClicked(e);
					restockButton(e);
					restockButtonMouseClicked(e);
					restockMouseClicked(e);
				}
			});
			restockProductsFrameContentPane.add(button1);
			button1.setBounds(505, 575, 180, 45);

			//---- prodIDTextField ----
			prodIDTextField.setText("Product ID:");
			prodIDTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			restockProductsFrameContentPane.add(prodIDTextField);
			prodIDTextField.setBounds(450, 445, 105, 35);

			//---- restockQuantityTextField ----
			restockQuantityTextField.setText("Restock Quantity:");
			restockQuantityTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			restockProductsFrameContentPane.add(restockQuantityTextField);
			restockQuantityTextField.setBounds(450, 500, 165, 35);

			//---- restockProdID ----
			restockProdID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			restockProductsFrameContentPane.add(restockProdID);
			restockProdID.setBounds(650, 445, 65, 35);

			//---- restockQuantity ----
			restockQuantity.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			restockProductsFrameContentPane.add(restockQuantity);
			restockQuantity.setBounds(650, 500, 65, 35);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < restockProductsFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = restockProductsFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = restockProductsFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				restockProductsFrameContentPane.setMinimumSize(preferredSize);
				restockProductsFrameContentPane.setPreferredSize(preferredSize);
			}
			restockProductsFrame.setSize(1200, 700);
			restockProductsFrame.setLocationRelativeTo(null);
		}

		//======== recordSalesFrame ========
		{
			Container recordSalesFrameContentPane = recordSalesFrame.getContentPane();
			recordSalesFrameContentPane.setLayout(null);

			//---- recordSalesBackButton ----
			recordSalesBackButton.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\backButton.jpg"));
			recordSalesBackButton.setBackground(new Color(0xc80f2e));
			recordSalesBackButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					recordSalesBackButtonMouseClicked(e);
				}
			});
			recordSalesFrameContentPane.add(recordSalesBackButton);
			recordSalesBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar4 ----
			titleBar4.setText("Purchase Products: Record Sales");
			titleBar4.setBackground(new Color(0xc80f2e));
			titleBar4.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar4.setForeground(Color.white);
			recordSalesFrameContentPane.add(titleBar4);
			titleBar4.setBounds(0, 0, 1200, 55);

			//======== scrollPane3 ========
			{

				//---- table3 ----
				table3.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null},
						{null, null, null, null},
					},
					new String[] {
						"Product ID", "Product Name", "Available Quantity", "Price"
					}
				));
				{
					TableColumnModel cm = table3.getColumnModel();
					cm.getColumn(0).setMinWidth(80);
					cm.getColumn(1).setMinWidth(200);
					cm.getColumn(2).setMinWidth(150);
					cm.getColumn(3).setPreferredWidth(120);
				}
				table3.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 12));
				scrollPane3.setViewportView(table3);
			}
			recordSalesFrameContentPane.add(scrollPane3);
			scrollPane3.setBounds(85, 110, 545, 290);

			//---- button2 ----
			button2.setText("RECORD");
			button2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			button2.setBackground(new Color(0x3ca3cb));
			button2.setForeground(Color.white);
			button2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					recordButtonMouseClicked(e);
					recordMouseClicked(e);
				}
			});
			recordSalesFrameContentPane.add(button2);
			button2.setBounds(505, 575, 180, 45);

			//---- prodIDTextField1 ----
			prodIDTextField1.setText("Product ID:");
			prodIDTextField1.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			recordSalesFrameContentPane.add(prodIDTextField1);
			prodIDTextField1.setBounds(170, 475, 105, 35);

			//---- quantitySoldTextField ----
			quantitySoldTextField.setText("Quantity Sold:");
			quantitySoldTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			recordSalesFrameContentPane.add(quantitySoldTextField);
			quantitySoldTextField.setBounds(840, 475, 130, 35);

			//---- recordProdID ----
			recordProdID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			recordSalesFrameContentPane.add(recordProdID);
			recordProdID.setBounds(305, 475, 65, 35);

			//---- recordQuantity ----
			recordQuantity.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			recordSalesFrameContentPane.add(recordQuantity);
			recordQuantity.setBounds(1000, 475, 65, 35);

			//======== scrollPane4 ========
			{

				//---- table4 ----
				table4.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null},
						{null, null, null},
					},
					new String[] {
						"Member ID", "Last Name", "First Name"
					}
				));
				{
					TableColumnModel cm = table4.getColumnModel();
					cm.getColumn(0).setMinWidth(80);
					cm.getColumn(1).setMinWidth(150);
					cm.getColumn(2).setMinWidth(150);
					cm.getColumn(2).setMaxWidth(450);
				}
				table4.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 12));
				scrollPane4.setViewportView(table4);
			}
			recordSalesFrameContentPane.add(scrollPane4);
			scrollPane4.setBounds(715, 110, 380, 290);

			//---- memberIDTextField ----
			memberIDTextField.setText("Member ID:");
			memberIDTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			recordSalesFrameContentPane.add(memberIDTextField);
			memberIDTextField.setBounds(495, 475, 105, 35);

			//---- recordMemberID ----
			recordMemberID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			recordSalesFrameContentPane.add(recordMemberID);
			recordMemberID.setBounds(630, 475, 65, 35);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < recordSalesFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = recordSalesFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = recordSalesFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				recordSalesFrameContentPane.setMinimumSize(preferredSize);
				recordSalesFrameContentPane.setPreferredSize(preferredSize);
			}
			recordSalesFrame.setSize(1200, 700);
			recordSalesFrame.setLocationRelativeTo(null);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
	private JFrame purchaseProductsFrame;
	private JButton purchaseBackButton;
	private JFormattedTextField titleBar;
	private JButton recordSales;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JButton availableProd;
	private JButton restockProducts;
	private JFrame availableProductsFrame;
	private JButton availableProductsBackButton;
	private JFormattedTextField titleBar2;
	private JScrollPane scrollPane1;
	private JTable table1;
	private JFrame restockProductsFrame;
	private JButton restockProductsBackButton;
	private JFormattedTextField titleBar3;
	private JScrollPane scrollPane2;
	private JTable table2;
	private JButton button1;
	private JFormattedTextField prodIDTextField;
	private JFormattedTextField restockQuantityTextField;
	private JTextPane restockProdID;
	private JTextPane restockQuantity;
	private JFrame recordSalesFrame;
	private JButton recordSalesBackButton;
	private JFormattedTextField titleBar4;
	private JScrollPane scrollPane3;
	private JTable table3;
	private JButton button2;
	private JFormattedTextField prodIDTextField1;
	private JFormattedTextField quantitySoldTextField;
	private JTextPane recordProdID;
	private JTextPane recordQuantity;
	private JScrollPane scrollPane4;
	private JTable table4;
	private JFormattedTextField memberIDTextField;
	private JTextPane recordMemberID;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

	public static void main(String[] args) {
		// Create an instance of the frame
		PurchaseProducts purchprod = new PurchaseProducts();

	}
}
