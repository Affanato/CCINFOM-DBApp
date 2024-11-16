import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Thu Nov 14 23:31:22 PST 2024
 */



/**
 * @author Diane
 */
public class ProductView {
	public ProductView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
		productFrame = new JFrame();
		productBackButton = new JButton();
		titleBar = new JFormattedTextField();
		goToAdd = new JButton();
		goToRead = new JButton();
		goToUpdate = new JButton();
		goToDelete = new JButton();
		goToSell = new JButton();
		goToRestock = new JButton();
		background = new JLabel();
		addProductFrame = new JFrame();
		addBack = new JButton();
		titleBar2 = new JFormattedTextField();
		addProduct = new JButton();
		productnametext = new JFormattedTextField();
		productName = new JTextPane();
		productBrand = new JTextPane();
		productbrandtext = new JFormattedTextField();
		productpricetext = new JFormattedTextField();
		productPrice = new JTextPane();
		availablequantitytext = new JFormattedTextField();
		availableQuantity = new JTextPane();
		descriptiontext = new JFormattedTextField();
		productDescription = new JTextPane();
		editorPane1 = new JEditorPane();
		background2 = new JLabel();
		deleteProductFrame = new JFrame();
		deleteBack = new JButton();
		deleteProduct = new JButton();
		productidtext = new JFormattedTextField();
		productID = new JComboBox();
		editorPane2 = new JEditorPane();
		titleBar3 = new JFormattedTextField();
		background3 = new JLabel();
		updateProductFrame = new JFrame();
		updateBack = new JButton();
		titleBar4 = new JFormattedTextField();
		updateProduct = new JButton();
		productnametext2 = new JFormattedTextField();
		updateProductName = new JTextPane();
		updateProductBrand = new JTextPane();
		productbrandtext2 = new JFormattedTextField();
		productpricetext2 = new JFormattedTextField();
		updateProductPrice = new JTextPane();
		availablequantitytext2 = new JFormattedTextField();
		updateAvailableQuantity = new JTextPane();
		descriptiontext2 = new JFormattedTextField();
		updateProductDescription = new JTextPane();
		editorPane3 = new JEditorPane();
		background4 = new JLabel();
		restockProductFrame = new JFrame();
		restockBack = new JButton();
		restockProduct = new JButton();
		restockproducttext = new JFormattedTextField();
		restockquantitytext = new JFormattedTextField();
		restockquantity = new JTextPane();
		restockproductid = new JComboBox();
		editorPane4 = new JEditorPane();
		titleBar5 = new JFormattedTextField();
		background5 = new JLabel();
		sellProductFrame = new JFrame();
		sellBack = new JButton();
		titleBar6 = new JFormattedTextField();
		sellProduct = new JButton();
		sellquantity = new JTextPane();
		sellproductid = new JComboBox();
		sellproducttext = new JFormattedTextField();
		sellquantitytext = new JFormattedTextField();
		memberidtext = new JFormattedTextField();
		memberid = new JComboBox();
		editorPane5 = new JEditorPane();
		background6 = new JLabel();
		readProductFrame = new JFrame();
		readBack = new JButton();
		scrollPane1 = new JScrollPane();
		productTable = new JTable();
		titleBar7 = new JFormattedTextField();
		background7 = new JLabel();

		//======== productFrame ========
		{
			Container productFrameContentPane = productFrame.getContentPane();
			productFrameContentPane.setLayout(null);

			//---- productBackButton ----
			productBackButton.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			productBackButton.setIcon(new ImageIcon("resource\\backButton.jpg"));
			productBackButton.setBackground(new Color(0xc80f2e));
			productFrameContentPane.add(productBackButton);
			productBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar ----
			titleBar.setText("Product");
			titleBar.setBackground(new Color(0xc80f2e));
			titleBar.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar.setForeground(Color.white);
			titleBar.setEditable(false);
			productFrameContentPane.add(titleBar);
			titleBar.setBounds(0, 0, 1200, 55);

			//---- goToAdd ----
			goToAdd.setText("ADD PRODUCT");
			goToAdd.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToAdd.setForeground(Color.white);
			goToAdd.setBackground(new Color(0x3ca3cb));
			productFrameContentPane.add(goToAdd);
			goToAdd.setBounds(290, 205, 250, 55);

			//---- goToRead ----
			goToRead.setText("READ PRODUCT");
			goToRead.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToRead.setForeground(Color.white);
			goToRead.setBackground(new Color(0x3ca3cb));
			productFrameContentPane.add(goToRead);
			goToRead.setBounds(660, 205, 250, 55);

			//---- goToUpdate ----
			goToUpdate.setText("UPDATE PRODUCT");
			goToUpdate.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToUpdate.setForeground(Color.white);
			goToUpdate.setBackground(new Color(0x3ca3cb));
			productFrameContentPane.add(goToUpdate);
			goToUpdate.setBounds(290, 310, 250, 55);

			//---- goToDelete ----
			goToDelete.setText("DELETE PRODUCT");
			goToDelete.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToDelete.setForeground(Color.white);
			goToDelete.setBackground(new Color(0x3ca3cb));
			productFrameContentPane.add(goToDelete);
			goToDelete.setBounds(660, 310, 250, 55);

			//---- goToSell ----
			goToSell.setText("SELL PRODUCT");
			goToSell.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToSell.setForeground(Color.white);
			goToSell.setBackground(new Color(0x3ca3cb));
			productFrameContentPane.add(goToSell);
			goToSell.setBounds(290, 410, 250, 55);

			//---- goToRestock ----
			goToRestock.setText("RESTOCK PRODUCT");
			goToRestock.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToRestock.setForeground(Color.white);
			goToRestock.setBackground(new Color(0x3ca3cb));
			productFrameContentPane.add(goToRestock);
			goToRestock.setBounds(660, 410, 250, 55);

			//---- background ----
			background.setIcon(new ImageIcon("resource\\products.jpg"));
			productFrameContentPane.add(background);
			background.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < productFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = productFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = productFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				productFrameContentPane.setMinimumSize(preferredSize);
				productFrameContentPane.setPreferredSize(preferredSize);
			}
			productFrame.pack();  
			productFrame.setSize(1200, 700);
			productFrame.setLocationRelativeTo(null);
			productFrame.setVisible(true);
		}

		//======== addProductFrame ========
		{
			Container addProductFrameContentPane = addProductFrame.getContentPane();
			addProductFrameContentPane.setLayout(null);

			//---- addBack ----
			addBack.setSelectedIcon(new ImageIcon("resources\\backButton.jpg"));
			addBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			addBack.setBackground(new Color(0xc80f2e));
			addProductFrameContentPane.add(addBack);
			addBack.setBounds(5, 5, 95, 45);

			//---- titleBar2 ----
			titleBar2.setText("Product: Add Product");
			titleBar2.setBackground(new Color(0xc80f2e));
			titleBar2.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar2.setForeground(Color.white);
			titleBar2.setEditable(false);
			addProductFrameContentPane.add(titleBar2);
			titleBar2.setBounds(0, 0, 1200, 55);

			//---- addProduct ----
			addProduct.setText("ADD PRODUCT");
			addProduct.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			addProduct.setForeground(Color.white);
			addProduct.setBackground(new Color(0x3ca3cb));
			addProductFrameContentPane.add(addProduct);
			addProduct.setBounds(475, 515, 250, 55);

			//---- productnametext ----
			productnametext.setText("Product Name");
			productnametext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			productnametext.setEditable(false);
			addProductFrameContentPane.add(productnametext);
			productnametext.setBounds(145, 195, 125, 35);

			//---- productName ----
			productName.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addProductFrameContentPane.add(productName);
			productName.setBounds(290, 195, 295, 35);

			//---- productBrand ----
			productBrand.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addProductFrameContentPane.add(productBrand);
			productBrand.setBounds(795, 195, 260, 35);

			//---- productbrandtext ----
			productbrandtext.setText("Product Brand");
			productbrandtext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			productbrandtext.setEditable(false);
			addProductFrameContentPane.add(productbrandtext);
			productbrandtext.setBounds(650, 195, 125, 35);

			//---- productpricetext ----
			productpricetext.setText("Product Price");
			productpricetext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			productpricetext.setEditable(false);
			addProductFrameContentPane.add(productpricetext);
			productpricetext.setBounds(145, 260, 125, 35);

			//---- productPrice ----
			productPrice.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addProductFrameContentPane.add(productPrice);
			productPrice.setBounds(290, 260, 295, 35);

			//---- availablequantitytext ----
			availablequantitytext.setText("Available Quantity");
			availablequantitytext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			availablequantitytext.setEditable(false);
			addProductFrameContentPane.add(availablequantitytext);
			availablequantitytext.setBounds(650, 260, 160, 35);

			//---- availableQuantity ----
			availableQuantity.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addProductFrameContentPane.add(availableQuantity);
			availableQuantity.setBounds(830, 260, 225, 35);

			//---- descriptiontext ----
			descriptiontext.setText("Description");
			descriptiontext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			descriptiontext.setEditable(false);
			addProductFrameContentPane.add(descriptiontext);
			descriptiontext.setBounds(145, 330, 125, 35);

			//---- productDescription ----
			productDescription.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addProductFrameContentPane.add(productDescription);
			productDescription.setBounds(290, 330, 770, 115);

			//---- editorPane1 ----
			editorPane1.setBackground(new Color(0xb5b9b8));
			editorPane1.setEditable(false);
			addProductFrameContentPane.add(editorPane1);
			editorPane1.setBounds(115, 165, 975, 315);

			//---- background2 ----
			background2.setIcon(new ImageIcon("resource\\products.jpg"));
			addProductFrameContentPane.add(background2);
			background2.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < addProductFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = addProductFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = addProductFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				addProductFrameContentPane.setMinimumSize(preferredSize);
				addProductFrameContentPane.setPreferredSize(preferredSize);
			}
			addProductFrame.pack();
			addProductFrame.setLocationRelativeTo(addProductFrame.getOwner());
		}

		//======== deleteProductFrame ========
		{
			Container deleteProductFrameContentPane = deleteProductFrame.getContentPane();
			deleteProductFrameContentPane.setLayout(null);

			//---- deleteBack ----
			deleteBack.setSelectedIcon(new ImageIcon("resources\\backButton.jpg"));
			deleteBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			deleteBack.setBackground(new Color(0xc80f2e));
			deleteProductFrameContentPane.add(deleteBack);
			deleteBack.setBounds(5, 5, 95, 45);

			//---- deleteProduct ----
			deleteProduct.setText("DELETE PRODUCT");
			deleteProduct.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			deleteProduct.setForeground(Color.white);
			deleteProduct.setBackground(new Color(0x3ca3cb));
			deleteProductFrameContentPane.add(deleteProduct);
			deleteProduct.setBounds(475, 380, 250, 55);

			//---- productidtext ----
			productidtext.setText("Select Product");
			productidtext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			productidtext.setEditable(false);
			productidtext.setHorizontalAlignment(SwingConstants.CENTER);
			deleteProductFrameContentPane.add(productidtext);
			productidtext.setBounds(365, 235, 470, 35);

			//---- productID ----
			productID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			deleteProductFrameContentPane.add(productID);
			productID.setBounds(410, 315, 390, 35);

			//---- editorPane2 ----
			editorPane2.setBackground(new Color(0xb5b9b8));
			editorPane2.setEditable(false);
			deleteProductFrameContentPane.add(editorPane2);
			editorPane2.setBounds(365, 235, 470, 240);

			//---- titleBar3 ----
			titleBar3.setText("Product: Delete Product");
			titleBar3.setBackground(new Color(0xc80f2e));
			titleBar3.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar3.setForeground(Color.white);
			titleBar3.setEditable(false);
			deleteProductFrameContentPane.add(titleBar3);
			titleBar3.setBounds(0, 0, 1200, 55);

			//---- background3 ----
			background3.setIcon(new ImageIcon("resource\\products.jpg"));
			deleteProductFrameContentPane.add(background3);
			background3.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < deleteProductFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = deleteProductFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = deleteProductFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				deleteProductFrameContentPane.setMinimumSize(preferredSize);
				deleteProductFrameContentPane.setPreferredSize(preferredSize);
			}
			deleteProductFrame.pack();
			deleteProductFrame.setLocationRelativeTo(deleteProductFrame.getOwner());
		}

		//======== updateProductFrame ========
		{
			Container updateProductFrameContentPane = updateProductFrame.getContentPane();
			updateProductFrameContentPane.setLayout(null);

			//---- updateBack ----
			updateBack.setSelectedIcon(new ImageIcon("resources\\backButton.jpg"));
			updateBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			updateBack.setBackground(new Color(0xc80f2e));
			updateProductFrameContentPane.add(updateBack);
			updateBack.setBounds(5, 5, 95, 45);

			//---- titleBar4 ----
			titleBar4.setText("Product: Update Product");
			titleBar4.setBackground(new Color(0xc80f2e));
			titleBar4.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar4.setForeground(Color.white);
			titleBar4.setEditable(false);
			updateProductFrameContentPane.add(titleBar4);
			titleBar4.setBounds(0, 0, 1200, 55);

			//---- updateProduct ----
			updateProduct.setText("UPDATE PRODUCT");
			updateProduct.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			updateProduct.setForeground(Color.white);
			updateProduct.setBackground(new Color(0x3ca3cb));
			updateProductFrameContentPane.add(updateProduct);
			updateProduct.setBounds(475, 515, 250, 55);

			//---- productnametext2 ----
			productnametext2.setText("Product Name");
			productnametext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			productnametext2.setEditable(false);
			updateProductFrameContentPane.add(productnametext2);
			productnametext2.setBounds(145, 195, 125, 35);

			//---- updateProductName ----
			updateProductName.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateProductName.setEditable(false);
			updateProductFrameContentPane.add(updateProductName);
			updateProductName.setBounds(290, 195, 295, 35);

			//---- updateProductBrand ----
			updateProductBrand.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateProductBrand.setEditable(false);
			updateProductFrameContentPane.add(updateProductBrand);
			updateProductBrand.setBounds(795, 195, 260, 35);

			//---- productbrandtext2 ----
			productbrandtext2.setText("Product Brand");
			productbrandtext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			productbrandtext2.setEditable(false);
			updateProductFrameContentPane.add(productbrandtext2);
			productbrandtext2.setBounds(650, 195, 125, 35);

			//---- productpricetext2 ----
			productpricetext2.setText("Product Price");
			productpricetext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			productpricetext2.setEditable(false);
			updateProductFrameContentPane.add(productpricetext2);
			productpricetext2.setBounds(145, 260, 125, 35);

			//---- updateProductPrice ----
			updateProductPrice.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateProductFrameContentPane.add(updateProductPrice);
			updateProductPrice.setBounds(290, 260, 295, 35);

			//---- availablequantitytext2 ----
			availablequantitytext2.setText("Available Quantity");
			availablequantitytext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			availablequantitytext2.setEditable(false);
			updateProductFrameContentPane.add(availablequantitytext2);
			availablequantitytext2.setBounds(650, 260, 165, 35);

			//---- updateAvailableQuantity ----
			updateAvailableQuantity.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateAvailableQuantity.setEditable(false);
			updateProductFrameContentPane.add(updateAvailableQuantity);
			updateAvailableQuantity.setBounds(835, 260, 220, 35);

			//---- descriptiontext2 ----
			descriptiontext2.setText("Description");
			descriptiontext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			descriptiontext2.setEditable(false);
			updateProductFrameContentPane.add(descriptiontext2);
			descriptiontext2.setBounds(145, 330, 125, 35);

			//---- updateProductDescription ----
			updateProductDescription.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateProductFrameContentPane.add(updateProductDescription);
			updateProductDescription.setBounds(290, 330, 770, 115);

			//---- editorPane3 ----
			editorPane3.setBackground(new Color(0xb5b9b8));
			editorPane3.setEditable(false);
			updateProductFrameContentPane.add(editorPane3);
			editorPane3.setBounds(115, 165, 975, 315);

			//---- background4 ----
			background4.setIcon(new ImageIcon("resource\\products.jpg"));
			updateProductFrameContentPane.add(background4);
			background4.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < updateProductFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = updateProductFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = updateProductFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				updateProductFrameContentPane.setMinimumSize(preferredSize);
				updateProductFrameContentPane.setPreferredSize(preferredSize);
			}
			updateProductFrame.pack();
			updateProductFrame.setLocationRelativeTo(updateProductFrame.getOwner());
		}

		//======== restockProductFrame ========
		{
			Container restockProductFrameContentPane = restockProductFrame.getContentPane();
			restockProductFrameContentPane.setLayout(null);

			//---- restockBack ----
			restockBack.setSelectedIcon(new ImageIcon("resources\\backButton.jpg"));
			restockBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			restockBack.setBackground(new Color(0xc80f2e));
			restockProductFrameContentPane.add(restockBack);
			restockBack.setBounds(5, 5, 95, 45);

			//---- restockProduct ----
			restockProduct.setText("RESTOCK PRODUCT");
			restockProduct.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			restockProduct.setForeground(Color.white);
			restockProduct.setBackground(new Color(0x3ca3cb));
			restockProductFrameContentPane.add(restockProduct);
			restockProduct.setBounds(475, 380, 250, 55);

			//---- restockproducttext ----
			restockproducttext.setText("Select Product");
			restockproducttext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			restockproducttext.setEditable(false);
			restockproducttext.setHorizontalAlignment(SwingConstants.LEFT);
			restockProductFrameContentPane.add(restockproducttext);
			restockproducttext.setBounds(325, 260, 130, 35);

			//---- restockquantitytext ----
			restockquantitytext.setText("Quantity");
			restockquantitytext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			restockquantitytext.setEditable(false);
			restockquantitytext.setHorizontalAlignment(SwingConstants.LEFT);
			restockProductFrameContentPane.add(restockquantitytext);
			restockquantitytext.setBounds(325, 320, 130, 35);

			//---- restockquantity ----
			restockquantity.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			restockProductFrameContentPane.add(restockquantity);
			restockquantity.setBounds(475, 320, 380, 35);

			//---- restockproductid ----
			restockproductid.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			restockProductFrameContentPane.add(restockproductid);
			restockproductid.setBounds(475, 260, 405, 35);

			//---- editorPane4 ----
			editorPane4.setBackground(new Color(0xb5b9b8));
			editorPane4.setEditable(false);
			restockProductFrameContentPane.add(editorPane4);
			editorPane4.setBounds(300, 235, 610, 240);

			//---- titleBar5 ----
			titleBar5.setText("Product: Restock Product");
			titleBar5.setBackground(new Color(0xc80f2e));
			titleBar5.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar5.setForeground(Color.white);
			titleBar5.setEditable(false);
			restockProductFrameContentPane.add(titleBar5);
			titleBar5.setBounds(0, 0, 1200, 55);

			//---- background5 ----
			background5.setIcon(new ImageIcon("resource\\products.jpg"));
			restockProductFrameContentPane.add(background5);
			background5.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < restockProductFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = restockProductFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = restockProductFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				restockProductFrameContentPane.setMinimumSize(preferredSize);
				restockProductFrameContentPane.setPreferredSize(preferredSize);
			}
			restockProductFrame.pack();
			restockProductFrame.setLocationRelativeTo(restockProductFrame.getOwner());
		}

		//======== sellProductFrame ========
		{
			Container sellProductFrameContentPane = sellProductFrame.getContentPane();
			sellProductFrameContentPane.setLayout(null);

			//---- sellBack ----
			sellBack.setSelectedIcon(new ImageIcon("resources\\backButton.jpg"));
			sellBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			sellBack.setBackground(new Color(0xc80f2e));
			sellProductFrameContentPane.add(sellBack);
			sellBack.setBounds(5, 5, 95, 45);

			//---- titleBar6 ----
			titleBar6.setText("Product: Sell Product");
			titleBar6.setBackground(new Color(0xc80f2e));
			titleBar6.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar6.setForeground(Color.white);
			titleBar6.setEditable(false);
			sellProductFrameContentPane.add(titleBar6);
			titleBar6.setBounds(0, 0, 1200, 55);

			//---- sellProduct ----
			sellProduct.setText("SELL PRODUCT");
			sellProduct.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			sellProduct.setForeground(Color.white);
			sellProduct.setBackground(new Color(0x3ca3cb));
			sellProductFrameContentPane.add(sellProduct);
			sellProduct.setBounds(480, 410, 250, 55);

			//---- sellquantity ----
			sellquantity.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			sellProductFrameContentPane.add(sellquantity);
			sellquantity.setBounds(480, 345, 380, 35);

			//---- sellproductid ----
			sellproductid.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			sellProductFrameContentPane.add(sellproductid);
			sellproductid.setBounds(480, 280, 405, 35);

			//---- sellproducttext ----
			sellproducttext.setText("Select Product");
			sellproducttext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			sellproducttext.setEditable(false);
			sellproducttext.setHorizontalAlignment(SwingConstants.LEFT);
			sellProductFrameContentPane.add(sellproducttext);
			sellproducttext.setBounds(330, 280, 130, 35);

			//---- sellquantitytext ----
			sellquantitytext.setText("Quantity");
			sellquantitytext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			sellquantitytext.setEditable(false);
			sellquantitytext.setHorizontalAlignment(SwingConstants.LEFT);
			sellProductFrameContentPane.add(sellquantitytext);
			sellquantitytext.setBounds(330, 345, 130, 35);

			//---- memberidtext ----
			memberidtext.setText("Select Member");
			memberidtext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			memberidtext.setEditable(false);
			memberidtext.setHorizontalAlignment(SwingConstants.LEFT);
			sellProductFrameContentPane.add(memberidtext);
			memberidtext.setBounds(330, 220, 130, 35);

			//---- memberid ----
			memberid.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			sellProductFrameContentPane.add(memberid);
			memberid.setBounds(480, 220, 405, 35);

			//---- editorPane5 ----
			editorPane5.setBackground(new Color(0xb5b9b8));
			editorPane5.setEditable(false);
			sellProductFrameContentPane.add(editorPane5);
			editorPane5.setBounds(305, 195, 610, 290);

			//---- background6 ----
			background6.setIcon(new ImageIcon("resource\\products.jpg"));
			sellProductFrameContentPane.add(background6);
			background6.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < sellProductFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = sellProductFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = sellProductFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				sellProductFrameContentPane.setMinimumSize(preferredSize);
				sellProductFrameContentPane.setPreferredSize(preferredSize);
			}
			sellProductFrame.pack();
			sellProductFrame.setLocationRelativeTo(sellProductFrame.getOwner());
		}

		//======== readProductFrame ========
		{
			Container readProductFrameContentPane = readProductFrame.getContentPane();
			readProductFrameContentPane.setLayout(null);

			//---- readBack ----
			readBack.setSelectedIcon(new ImageIcon("resources\\backButton.jpg"));
			readBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			readBack.setBackground(new Color(0xc80f2e));
			readProductFrameContentPane.add(readBack);
			readBack.setBounds(5, 5, 95, 45);

			//======== scrollPane1 ========
			{

				//---- productTable ----
				productTable.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
					},
					new String[] {
						"Product ID", "Product Name", "Product Description", "Product Brand", "Product Price", "Available Quantity"
					}
				));
				{
					TableColumnModel cm = productTable.getColumnModel();
					cm.getColumn(0).setMaxWidth(80);
					cm.getColumn(1).setMinWidth(200);
					cm.getColumn(1).setMaxWidth(200);
					cm.getColumn(3).setMinWidth(200);
					cm.getColumn(3).setMaxWidth(200);
					cm.getColumn(4).setMinWidth(120);
					cm.getColumn(4).setMaxWidth(120);
					cm.getColumn(5).setMinWidth(150);
					cm.getColumn(5).setMaxWidth(150);
				}
				productTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				scrollPane1.setViewportView(productTable);
			}
			readProductFrameContentPane.add(scrollPane1);
			scrollPane1.setBounds(70, 115, 1060, 490);

			//---- titleBar7 ----
			titleBar7.setText("Product: Read Product");
			titleBar7.setBackground(new Color(0xc80f2e));
			titleBar7.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar7.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar7.setForeground(Color.white);
			titleBar7.setEditable(false);
			readProductFrameContentPane.add(titleBar7);
			titleBar7.setBounds(0, 0, 1200, 55);

			//---- background7 ----
			background7.setIcon(new ImageIcon("resource\\products.jpg"));
			readProductFrameContentPane.add(background7);
			background7.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < readProductFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = readProductFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = readProductFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				readProductFrameContentPane.setMinimumSize(preferredSize);
				readProductFrameContentPane.setPreferredSize(preferredSize);
			}
			readProductFrame.pack();
			readProductFrame.setLocationRelativeTo(readProductFrame.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
	private JFrame productFrame;
	private JButton productBackButton;
	private JFormattedTextField titleBar;
	private JButton goToAdd;
	private JButton goToRead;
	private JButton goToUpdate;
	private JButton goToDelete;
	private JButton goToSell;
	private JButton goToRestock;
	private JLabel background;
	private JFrame addProductFrame;
	private JButton addBack;
	private JFormattedTextField titleBar2;
	private JButton addProduct;
	private JFormattedTextField productnametext;
	private JTextPane productName;
	private JTextPane productBrand;
	private JFormattedTextField productbrandtext;
	private JFormattedTextField productpricetext;
	private JTextPane productPrice;
	private JFormattedTextField availablequantitytext;
	private JTextPane availableQuantity;
	private JFormattedTextField descriptiontext;
	private JTextPane productDescription;
	private JEditorPane editorPane1;
	private JLabel background2;
	private JFrame deleteProductFrame;
	private JButton deleteBack;
	private JButton deleteProduct;
	private JFormattedTextField productidtext;
	private JComboBox productID;
	private JEditorPane editorPane2;
	private JFormattedTextField titleBar3;
	private JLabel background3;
	private JFrame updateProductFrame;
	private JButton updateBack;
	private JFormattedTextField titleBar4;
	private JButton updateProduct;
	private JFormattedTextField productnametext2;
	private JTextPane updateProductName;
	private JTextPane updateProductBrand;
	private JFormattedTextField productbrandtext2;
	private JFormattedTextField productpricetext2;
	private JTextPane updateProductPrice;
	private JFormattedTextField availablequantitytext2;
	private JTextPane updateAvailableQuantity;
	private JFormattedTextField descriptiontext2;
	private JTextPane updateProductDescription;
	private JEditorPane editorPane3;
	private JLabel background4;
	private JFrame restockProductFrame;
	private JButton restockBack;
	private JButton restockProduct;
	private JFormattedTextField restockproducttext;
	private JFormattedTextField restockquantitytext;
	private JTextPane restockquantity;
	private JComboBox restockproductid;
	private JEditorPane editorPane4;
	private JFormattedTextField titleBar5;
	private JLabel background5;
	private JFrame sellProductFrame;
	private JButton sellBack;
	private JFormattedTextField titleBar6;
	private JButton sellProduct;
	private JTextPane sellquantity;
	private JComboBox sellproductid;
	private JFormattedTextField sellproducttext;
	private JFormattedTextField sellquantitytext;
	private JFormattedTextField memberidtext;
	private JComboBox memberid;
	private JEditorPane editorPane5;
	private JLabel background6;
	private JFrame readProductFrame;
	private JButton readBack;
	private JScrollPane scrollPane1;
	private JTable productTable;
	private JFormattedTextField titleBar7;
	private JLabel background7;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

	// getters
	public JFrame getProductFrame() {
		return this.productFrame;
	}
	public JFrame getAddProductFrame() {
		return this.addProductFrame;
	}
	public JFrame getDeleteProductFrame() {
		return this.deleteProductFrame;
	}
	public JFrame getUpdateProductFrame() {
		return this.updateProductFrame;
	}
	public JFrame getRestockProductFrame() {
		return this.restockProductFrame;
	}
	public JFrame getSellProductFrame() {
		return this.sellProductFrame;
	}
	public JFrame getReadProductFrame() {
		return this.readProductFrame;
	}

	// add
	public String getProductName() {
		return this.productName.getText();
	}
	public String getProductPrice() {
		return this.productPrice.getText();
	}
	public String getProductBrand() {
		return this.productBrand.getText();
	}
	public String getAvailableQuantity() {
		return this.availableQuantity.getText();
	}
	public String getProductDescription() {
		return this.productDescription.getText();
	}

	// delete
	public int getProductID() {
		return this.productID.getSelectedIndex() + 1;
	}

	// update
	public String getUpdateProductPrice() {
		return this.updateProductPrice.getText();
	}
	public String getUpdateProductDescription() {
		return this.updateProductDescription.getText();
	}
	public void setProductName(String name) {
		this.productName.setText(name);
	}
	public void setProductBrand(String name) {
		this.productBrand.setText(name);
	}
	public void setProductPrice(String name) {
		this.productPrice.setText(name);
	}
	public void setAvailableQuantity(String name) {
		this.availableQuantity.setText(name);
	}
	public void setProductDescription(String name) {
		this.productDescription.setText(name);
	}

	// sell
	public int getSellProductID() {
		return this.sellproductid.getSelectedIndex() + 1;
	}
	public int getSellMemberID() {
		return this.memberid.getSelectedIndex() + 1;
	}
	public String getSellQuantity() {
		return this.sellquantity.getText();
	}

	// restock
	public int getRestockProductID() {
		return this.restockproductid.getSelectedIndex() + 1;
	}
	public String getRestockQuantity() {
		return this.restockquantity.getText();
	}



	// button listeners
	public void productBackButton(ActionListener actionListener) {
		this.productBackButton.addActionListener(actionListener);
	}

	public void goToAddButton(ActionListener actionListener) {
		this.goToAdd.addActionListener(actionListener);
	}
	public void goToReadButton(ActionListener actionListener) {
		this.goToRead.addActionListener(actionListener);
	}
	public void goToDeleteButton(ActionListener actionListener) {
		this.goToDelete.addActionListener(actionListener);
	}
	public void goToUpdateButton(ActionListener actionListener) {
		this.goToUpdate.addActionListener(actionListener);
	}
	public void goToRestockButton(ActionListener actionListener) {
		this.goToRestock.addActionListener(actionListener);
	}
	public void goToSellButton(ActionListener actionListener) {
		this.goToSell.addActionListener(actionListener);
	}

	public void addBackButton(ActionListener actionListener) {
		this.addBack.addActionListener(actionListener);
	}
	public void addProductButton(ActionListener actionListener) {
		this.addProduct.addActionListener(actionListener);
	}
	public void deleteProductButton(ActionListener actionListener) {
		this.deleteProduct.addActionListener(actionListener);
	}
	public void deleteBackButton(ActionListener actionListener) {
		this.deleteBack.addActionListener(actionListener);
	}
	public void updateProductButton(ActionListener actionListener) {
		this.updateProduct.addActionListener(actionListener);
	}
	public void updateBackButton(ActionListener actionListener) {
		this.updateBack.addActionListener(actionListener);
	}
	public void restockProductButton(ActionListener actionListener) {
		this.restockProduct.addActionListener(actionListener);
	}
	public void restockBackButton(ActionListener actionListener) {
		this.restockBack.addActionListener(actionListener);
	}
	public void sellProductButton(ActionListener actionListener) {
		this.sellProduct.addActionListener(actionListener);
	}
	public void sellBackButton(ActionListener actionListener) {
		this.sellBack.addActionListener(actionListener);
	}
	public void readBackButton(ActionListener actionListener) {
		this.readBack.addActionListener(actionListener);
	}

	public static void main(String[] args) {
		new ProductController();
	}
}