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
		goToProductPurchases = new JButton();
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
		deleteProductID = new JComboBox<>();
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
		restockproductid = new JComboBox<>();
		editorPane4 = new JEditorPane();
		titleBar5 = new JFormattedTextField();
		background5 = new JLabel();
		sellProductFrame = new JFrame();
		sellBack = new JButton();
		titleBar6 = new JFormattedTextField();
		sellProduct = new JButton();
		sellquantity = new JTextPane();
		sellproductid = new JComboBox<>();
		sellproducttext = new JFormattedTextField();
		sellquantitytext = new JFormattedTextField();
		memberidtext = new JFormattedTextField();
		memberid = new JComboBox<>();
		editorPane5 = new JEditorPane();
		background6 = new JLabel();
		readProductFrame = new JFrame();
		readBack = new JButton();
		scrollPane1 = new JScrollPane();
		productTable = new JTable();
		titleBar7 = new JFormattedTextField();
		background7 = new JLabel();
		updateProduct1 = new JFrame();
		updateBack1 = new JButton();
		proceed = new JButton();
		productidtext2 = new JFormattedTextField();
		updateProductID1 = new JComboBox<>();
		editorPane6 = new JEditorPane();
		titleBar8 = new JFormattedTextField();
		background8 = new JLabel();
		readProductPurchasesFrame = new JFrame();
		readPurchasesBack = new JButton();
		titleBar9 = new JFormattedTextField();
		scrollPane2 = new JScrollPane();
		table1 = new JTable();
		background9 = new JLabel();
		productFrame2 = new JFrame();
		productPurchaseBackButton = new JButton();
		titleBar10 = new JFormattedTextField();
		goToAdd2 = new JButton();
		goToCancel2 = new JButton();
		goToRead2 = new JButton();
		goToUpdate2 = new JButton();
		goToDelete2 = new JButton();
		background10 = new JLabel();
		deleteProductPurchaseFrame = new JFrame();
		deletePurchaseBack = new JButton();
		deleteProductPurchase = new JButton();
		productidtext3 = new JFormattedTextField();
		deleteProductPurchaseID = new JComboBox<>();
		editorPane7 = new JEditorPane();
		titleBar11 = new JFormattedTextField();
		background11 = new JLabel();
		updateProductPurchaseFrame = new JFrame();
		updatePurchaseBack = new JButton();
		proceedUpdatePurchase = new JButton();
		productidtext4 = new JFormattedTextField();
		updateProductPurchaseID = new JComboBox<>();
		editorPane8 = new JEditorPane();
		titleBar12 = new JFormattedTextField();
		background12 = new JLabel();
		updateProductPurchase2 = new JFrame();
		updatePurchaseBack2 = new JButton();
		titleBar13 = new JFormattedTextField();
		updateProductPurchase = new JButton();
		quantityPurchase = new JTextPane();
		productPurchaseID = new JComboBox<>();
		sellproducttext2 = new JFormattedTextField();
		sellquantitytext2 = new JFormattedTextField();
		memberidtext2 = new JFormattedTextField();
		memberPurchaseID = new JComboBox<>();
		editorPane9 = new JEditorPane();
		background13 = new JLabel();
		deleteProductPurchaseFrame2 = new JFrame();
		cancelPurchaseBack = new JButton();
		cancelProductPurchase = new JButton();
		productidtext5 = new JFormattedTextField();
		cancelProductPurchaseID = new JComboBox<>();
		editorPane10 = new JEditorPane();
		titleBar14 = new JFormattedTextField();
		background14 = new JLabel();

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
			goToRead.setText("READ PRODUCTS");
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

			//---- goToProductPurchases ----
			goToProductPurchases.setText("PRODUCT PURCHASES");
			goToProductPurchases.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToProductPurchases.setForeground(Color.white);
			goToProductPurchases.setBackground(new Color(0x3ca3cb));
			productFrameContentPane.add(goToProductPurchases);
			goToProductPurchases.setBounds(290, 410, 250, 55);

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
			addBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
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
			deleteBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
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

			//---- deleteProductID ----
			deleteProductID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			deleteProductID.setModel(new DefaultComboBoxModel<>(new String[] {
				"Product"
			}));
			deleteProductFrameContentPane.add(deleteProductID);
			deleteProductID.setBounds(410, 315, 390, 35);

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
			updateBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
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
			restockBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
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
			restockproductid.setModel(new DefaultComboBoxModel<>(new String[] {
				"Product"
			}));
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
			sellBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
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
			sellproductid.setModel(new DefaultComboBoxModel<>(new String[] {
				"Product"
			}));
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
			memberid.setModel(new DefaultComboBoxModel<>(new String[] {
				"Product"
			}));
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
			readBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
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
						"Product ID", "Product Brand", "Product Name", "Product Description", "Product Price", "Available Quantity"
					}
				));
				{
					TableColumnModel cm = productTable.getColumnModel();
					cm.getColumn(0).setMaxWidth(80);
					cm.getColumn(1).setMinWidth(200);
					cm.getColumn(1).setMaxWidth(200);
					cm.getColumn(2).setMinWidth(200);
					cm.getColumn(2).setMaxWidth(200);
					cm.getColumn(4).setMinWidth(120);
					cm.getColumn(4).setMaxWidth(120);
					cm.getColumn(5).setMinWidth(150);
					cm.getColumn(5).setMaxWidth(150);
				}
				productTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				productTable.setEnabled(false);
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

		//======== updateProduct1 ========
		{
			Container updateProduct1ContentPane = updateProduct1.getContentPane();
			updateProduct1ContentPane.setLayout(null);

			//---- updateBack1 ----
			updateBack1.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			updateBack1.setIcon(new ImageIcon("resource\\backButton.jpg"));
			updateBack1.setBackground(new Color(0xc80f2e));
			updateProduct1ContentPane.add(updateBack1);
			updateBack1.setBounds(5, 5, 95, 45);

			//---- proceed ----
			proceed.setText("PROCEED");
			proceed.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			proceed.setForeground(Color.white);
			proceed.setBackground(new Color(0x3ca3cb));
			updateProduct1ContentPane.add(proceed);
			proceed.setBounds(475, 380, 250, 55);

			//---- productidtext2 ----
			productidtext2.setText("Select Product");
			productidtext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			productidtext2.setEditable(false);
			productidtext2.setHorizontalAlignment(SwingConstants.CENTER);
			updateProduct1ContentPane.add(productidtext2);
			productidtext2.setBounds(365, 235, 470, 35);

			//---- updateProductID1 ----
			updateProductID1.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateProductID1.setModel(new DefaultComboBoxModel<>(new String[] {
				"Product"
			}));
			updateProduct1ContentPane.add(updateProductID1);
			updateProductID1.setBounds(410, 315, 390, 35);

			//---- editorPane6 ----
			editorPane6.setBackground(new Color(0xb5b9b8));
			editorPane6.setEditable(false);
			updateProduct1ContentPane.add(editorPane6);
			editorPane6.setBounds(365, 235, 470, 240);

			//---- titleBar8 ----
			titleBar8.setText("Product: Update Product");
			titleBar8.setBackground(new Color(0xc80f2e));
			titleBar8.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar8.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar8.setForeground(Color.white);
			titleBar8.setEditable(false);
			updateProduct1ContentPane.add(titleBar8);
			titleBar8.setBounds(0, 0, 1200, 55);

			//---- background8 ----
			background8.setIcon(new ImageIcon("resource\\products.jpg"));
			updateProduct1ContentPane.add(background8);
			background8.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < updateProduct1ContentPane.getComponentCount(); i++) {
					Rectangle bounds = updateProduct1ContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = updateProduct1ContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				updateProduct1ContentPane.setMinimumSize(preferredSize);
				updateProduct1ContentPane.setPreferredSize(preferredSize);
			}
			updateProduct1.pack();
			updateProduct1.setLocationRelativeTo(updateProduct1.getOwner());
		}

		//======== readProductPurchasesFrame ========
		{
			Container readProductPurchasesFrameContentPane = readProductPurchasesFrame.getContentPane();
			readProductPurchasesFrameContentPane.setLayout(null);

			//---- readPurchasesBack ----
			readPurchasesBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			readPurchasesBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			readPurchasesBack.setBackground(new Color(0xc80f2e));
			readProductPurchasesFrameContentPane.add(readPurchasesBack);
			readPurchasesBack.setBounds(5, 5, 95, 45);

			//---- titleBar9 ----
			titleBar9.setText("Product: Read Product Purchases");
			titleBar9.setBackground(new Color(0xc80f2e));
			titleBar9.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar9.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar9.setForeground(Color.white);
			titleBar9.setEditable(false);
			readProductPurchasesFrameContentPane.add(titleBar9);
			titleBar9.setBounds(0, 0, 1200, 55);

			//======== scrollPane2 ========
			{

				//---- table1 ----
				table1.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null},
						{null, null, null, null, null},
					},
					new String[] {
						"Product Purchase ID", "Member ID", "Product ID", "Quantity Sold", "Purchase Date and Time"
					}
				));
				{
					TableColumnModel cm = table1.getColumnModel();
					cm.getColumn(4).setMinWidth(200);
				}
				table1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				scrollPane2.setViewportView(table1);
			}
			readProductPurchasesFrameContentPane.add(scrollPane2);
			scrollPane2.setBounds(70, 115, 1060, 490);

			//---- background9 ----
			background9.setIcon(new ImageIcon("resource\\products.jpg"));
			readProductPurchasesFrameContentPane.add(background9);
			background9.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < readProductPurchasesFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = readProductPurchasesFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = readProductPurchasesFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				readProductPurchasesFrameContentPane.setMinimumSize(preferredSize);
				readProductPurchasesFrameContentPane.setPreferredSize(preferredSize);
			}
			readProductPurchasesFrame.pack();
			readProductPurchasesFrame.setLocationRelativeTo(readProductPurchasesFrame.getOwner());
		}

		//======== productFrame2 ========
		{
			Container productFrame2ContentPane = productFrame2.getContentPane();
			productFrame2ContentPane.setLayout(null);

			//---- productPurchaseBackButton ----
			productPurchaseBackButton.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			productPurchaseBackButton.setIcon(new ImageIcon("resource\\backButton.jpg"));
			productPurchaseBackButton.setBackground(new Color(0xc80f2e));
			productFrame2ContentPane.add(productPurchaseBackButton);
			productPurchaseBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar10 ----
			titleBar10.setText("Product: Product Purchases");
			titleBar10.setBackground(new Color(0xc80f2e));
			titleBar10.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar10.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar10.setForeground(Color.white);
			titleBar10.setEditable(false);
			productFrame2ContentPane.add(titleBar10);
			titleBar10.setBounds(0, 0, 1200, 55);

			//---- goToAdd2 ----
			goToAdd2.setText("ADD PURCHASE");
			goToAdd2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToAdd2.setForeground(Color.white);
			goToAdd2.setBackground(new Color(0x3ca3cb));
			productFrame2ContentPane.add(goToAdd2);
			goToAdd2.setBounds(280, 205, 250, 55);

			//---- goToCancel2 ----
			goToCancel2.setText("CANCEL PURCHASE");
			goToCancel2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToCancel2.setForeground(Color.white);
			goToCancel2.setBackground(new Color(0x3ca3cb));
			productFrame2ContentPane.add(goToCancel2);
			goToCancel2.setBounds(470, 425, 250, 55);

			//---- goToRead2 ----
			goToRead2.setText("READ PURCHASES");
			goToRead2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToRead2.setForeground(Color.white);
			goToRead2.setBackground(new Color(0x3ca3cb));
			productFrame2ContentPane.add(goToRead2);
			goToRead2.setBounds(640, 205, 250, 55);

			//---- goToUpdate2 ----
			goToUpdate2.setText("UPDATE PURCHASE");
			goToUpdate2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToUpdate2.setForeground(Color.white);
			goToUpdate2.setBackground(new Color(0x3ca3cb));
			productFrame2ContentPane.add(goToUpdate2);
			goToUpdate2.setBounds(280, 315, 250, 55);

			//---- goToDelete2 ----
			goToDelete2.setText("DELETE PURCHASE");
			goToDelete2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToDelete2.setForeground(Color.white);
			goToDelete2.setBackground(new Color(0x3ca3cb));
			productFrame2ContentPane.add(goToDelete2);
			goToDelete2.setBounds(640, 315, 250, 55);

			//---- background10 ----
			background10.setIcon(new ImageIcon("resource\\products.jpg"));
			productFrame2ContentPane.add(background10);
			background10.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < productFrame2ContentPane.getComponentCount(); i++) {
					Rectangle bounds = productFrame2ContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = productFrame2ContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				productFrame2ContentPane.setMinimumSize(preferredSize);
				productFrame2ContentPane.setPreferredSize(preferredSize);
			}
			productFrame2.pack();
			productFrame2.setLocationRelativeTo(productFrame2.getOwner());
		}

		//======== deleteProductPurchaseFrame ========
		{
			Container deleteProductPurchaseFrameContentPane = deleteProductPurchaseFrame.getContentPane();
			deleteProductPurchaseFrameContentPane.setLayout(null);

			//---- deletePurchaseBack ----
			deletePurchaseBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			deletePurchaseBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			deletePurchaseBack.setBackground(new Color(0xc80f2e));
			deleteProductPurchaseFrameContentPane.add(deletePurchaseBack);
			deletePurchaseBack.setBounds(5, 5, 95, 45);

			//---- deleteProductPurchase ----
			deleteProductPurchase.setText("DELETE PURCHASE");
			deleteProductPurchase.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			deleteProductPurchase.setForeground(Color.white);
			deleteProductPurchase.setBackground(new Color(0x3ca3cb));
			deleteProductPurchaseFrameContentPane.add(deleteProductPurchase);
			deleteProductPurchase.setBounds(475, 380, 250, 55);

			//---- productidtext3 ----
			productidtext3.setText("Select Product Purchase");
			productidtext3.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			productidtext3.setEditable(false);
			productidtext3.setHorizontalAlignment(SwingConstants.CENTER);
			deleteProductPurchaseFrameContentPane.add(productidtext3);
			productidtext3.setBounds(365, 235, 470, 35);

			//---- deleteProductPurchaseID ----
			deleteProductPurchaseID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			deleteProductPurchaseID.setModel(new DefaultComboBoxModel<>(new String[] {
				"Product"
			}));
			deleteProductPurchaseFrameContentPane.add(deleteProductPurchaseID);
			deleteProductPurchaseID.setBounds(410, 315, 390, 35);

			//---- editorPane7 ----
			editorPane7.setBackground(new Color(0xb5b9b8));
			editorPane7.setEditable(false);
			deleteProductPurchaseFrameContentPane.add(editorPane7);
			editorPane7.setBounds(365, 235, 470, 240);

			//---- titleBar11 ----
			titleBar11.setText("Product: Delete Product Purchase");
			titleBar11.setBackground(new Color(0xc80f2e));
			titleBar11.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar11.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar11.setForeground(Color.white);
			titleBar11.setEditable(false);
			deleteProductPurchaseFrameContentPane.add(titleBar11);
			titleBar11.setBounds(0, 0, 1200, 55);

			//---- background11 ----
			background11.setIcon(new ImageIcon("resource\\products.jpg"));
			deleteProductPurchaseFrameContentPane.add(background11);
			background11.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < deleteProductPurchaseFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = deleteProductPurchaseFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = deleteProductPurchaseFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				deleteProductPurchaseFrameContentPane.setMinimumSize(preferredSize);
				deleteProductPurchaseFrameContentPane.setPreferredSize(preferredSize);
			}
			deleteProductPurchaseFrame.pack();
			deleteProductPurchaseFrame.setLocationRelativeTo(deleteProductPurchaseFrame.getOwner());
		}

		//======== updateProductPurchaseFrame ========
		{
			Container updateProductPurchaseFrameContentPane = updateProductPurchaseFrame.getContentPane();
			updateProductPurchaseFrameContentPane.setLayout(null);

			//---- updatePurchaseBack ----
			updatePurchaseBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			updatePurchaseBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			updatePurchaseBack.setBackground(new Color(0xc80f2e));
			updateProductPurchaseFrameContentPane.add(updatePurchaseBack);
			updatePurchaseBack.setBounds(5, 5, 95, 45);

			//---- proceedUpdatePurchase ----
			proceedUpdatePurchase.setText("PROCEED");
			proceedUpdatePurchase.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			proceedUpdatePurchase.setForeground(Color.white);
			proceedUpdatePurchase.setBackground(new Color(0x3ca3cb));
			updateProductPurchaseFrameContentPane.add(proceedUpdatePurchase);
			proceedUpdatePurchase.setBounds(475, 380, 250, 55);

			//---- productidtext4 ----
			productidtext4.setText("Select Product Purchase");
			productidtext4.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			productidtext4.setEditable(false);
			productidtext4.setHorizontalAlignment(SwingConstants.CENTER);
			updateProductPurchaseFrameContentPane.add(productidtext4);
			productidtext4.setBounds(365, 235, 470, 35);

			//---- updateProductPurchaseID ----
			updateProductPurchaseID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateProductPurchaseID.setModel(new DefaultComboBoxModel<>(new String[] {
				"Product"
			}));
			updateProductPurchaseFrameContentPane.add(updateProductPurchaseID);
			updateProductPurchaseID.setBounds(410, 315, 390, 35);

			//---- editorPane8 ----
			editorPane8.setBackground(new Color(0xb5b9b8));
			editorPane8.setEditable(false);
			updateProductPurchaseFrameContentPane.add(editorPane8);
			editorPane8.setBounds(365, 235, 470, 240);

			//---- titleBar12 ----
			titleBar12.setText("Product: Update Product Purchase");
			titleBar12.setBackground(new Color(0xc80f2e));
			titleBar12.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar12.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar12.setForeground(Color.white);
			titleBar12.setEditable(false);
			updateProductPurchaseFrameContentPane.add(titleBar12);
			titleBar12.setBounds(0, 0, 1200, 55);

			//---- background12 ----
			background12.setIcon(new ImageIcon("resource\\products.jpg"));
			updateProductPurchaseFrameContentPane.add(background12);
			background12.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < updateProductPurchaseFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = updateProductPurchaseFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = updateProductPurchaseFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				updateProductPurchaseFrameContentPane.setMinimumSize(preferredSize);
				updateProductPurchaseFrameContentPane.setPreferredSize(preferredSize);
			}
			updateProductPurchaseFrame.pack();
			updateProductPurchaseFrame.setLocationRelativeTo(updateProductPurchaseFrame.getOwner());
		}

		//======== updateProductPurchase2 ========
		{
			Container updateProductPurchase2ContentPane = updateProductPurchase2.getContentPane();
			updateProductPurchase2ContentPane.setLayout(null);

			//---- updatePurchaseBack2 ----
			updatePurchaseBack2.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			updatePurchaseBack2.setIcon(new ImageIcon("resource\\backButton.jpg"));
			updatePurchaseBack2.setBackground(new Color(0xc80f2e));
			updateProductPurchase2ContentPane.add(updatePurchaseBack2);
			updatePurchaseBack2.setBounds(5, 5, 95, 45);

			//---- titleBar13 ----
			titleBar13.setText("Product: Update Product Purchase");
			titleBar13.setBackground(new Color(0xc80f2e));
			titleBar13.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar13.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar13.setForeground(Color.white);
			titleBar13.setEditable(false);
			updateProductPurchase2ContentPane.add(titleBar13);
			titleBar13.setBounds(0, 0, 1200, 55);

			//---- updateProductPurchase ----
			updateProductPurchase.setText("UPDATE PURCHASE");
			updateProductPurchase.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			updateProductPurchase.setForeground(Color.white);
			updateProductPurchase.setBackground(new Color(0x3ca3cb));
			updateProductPurchase2ContentPane.add(updateProductPurchase);
			updateProductPurchase.setBounds(480, 410, 250, 55);

			//---- quantityPurchase ----
			quantityPurchase.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateProductPurchase2ContentPane.add(quantityPurchase);
			quantityPurchase.setBounds(480, 340, 380, 35);

			//---- productPurchaseID ----
			productPurchaseID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			productPurchaseID.setModel(new DefaultComboBoxModel<>(new String[] {
				"Product"
			}));
			updateProductPurchase2ContentPane.add(productPurchaseID);
			productPurchaseID.setBounds(480, 280, 405, 35);

			//---- sellproducttext2 ----
			sellproducttext2.setText("Select Product");
			sellproducttext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			sellproducttext2.setEditable(false);
			sellproducttext2.setHorizontalAlignment(SwingConstants.LEFT);
			updateProductPurchase2ContentPane.add(sellproducttext2);
			sellproducttext2.setBounds(330, 280, 130, 35);

			//---- sellquantitytext2 ----
			sellquantitytext2.setText("Quantity");
			sellquantitytext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			sellquantitytext2.setEditable(false);
			sellquantitytext2.setHorizontalAlignment(SwingConstants.LEFT);
			updateProductPurchase2ContentPane.add(sellquantitytext2);
			sellquantitytext2.setBounds(330, 340, 130, 35);

			//---- memberidtext2 ----
			memberidtext2.setText("Select Member");
			memberidtext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			memberidtext2.setEditable(false);
			memberidtext2.setHorizontalAlignment(SwingConstants.LEFT);
			updateProductPurchase2ContentPane.add(memberidtext2);
			memberidtext2.setBounds(330, 220, 130, 35);

			//---- memberPurchaseID ----
			memberPurchaseID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			memberPurchaseID.setModel(new DefaultComboBoxModel<>(new String[] {
				"Product"
			}));
			updateProductPurchase2ContentPane.add(memberPurchaseID);
			memberPurchaseID.setBounds(480, 220, 405, 35);

			//---- editorPane9 ----
			editorPane9.setBackground(new Color(0xb5b9b8));
			editorPane9.setEditable(false);
			updateProductPurchase2ContentPane.add(editorPane9);
			editorPane9.setBounds(305, 195, 610, 290);

			//---- background13 ----
			background13.setIcon(new ImageIcon("resource\\products.jpg"));
			updateProductPurchase2ContentPane.add(background13);
			background13.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < updateProductPurchase2ContentPane.getComponentCount(); i++) {
					Rectangle bounds = updateProductPurchase2ContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = updateProductPurchase2ContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				updateProductPurchase2ContentPane.setMinimumSize(preferredSize);
				updateProductPurchase2ContentPane.setPreferredSize(preferredSize);
			}
			updateProductPurchase2.pack();
			updateProductPurchase2.setLocationRelativeTo(updateProductPurchase2.getOwner());
		}

		//======== deleteProductPurchaseFrame2 ========
		{
			Container deleteProductPurchaseFrame2ContentPane = deleteProductPurchaseFrame2.getContentPane();
			deleteProductPurchaseFrame2ContentPane.setLayout(null);

			//---- cancelPurchaseBack ----
			cancelPurchaseBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			cancelPurchaseBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			cancelPurchaseBack.setBackground(new Color(0xc80f2e));
			deleteProductPurchaseFrame2ContentPane.add(cancelPurchaseBack);
			cancelPurchaseBack.setBounds(5, 5, 95, 45);

			//---- cancelProductPurchase ----
			cancelProductPurchase.setText("CANCEL PRODUCT");
			cancelProductPurchase.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			cancelProductPurchase.setForeground(Color.white);
			cancelProductPurchase.setBackground(new Color(0x3ca3cb));
			deleteProductPurchaseFrame2ContentPane.add(cancelProductPurchase);
			cancelProductPurchase.setBounds(475, 380, 250, 55);

			//---- productidtext5 ----
			productidtext5.setText("Select Product Purchase");
			productidtext5.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			productidtext5.setEditable(false);
			productidtext5.setHorizontalAlignment(SwingConstants.CENTER);
			deleteProductPurchaseFrame2ContentPane.add(productidtext5);
			productidtext5.setBounds(365, 235, 470, 35);

			//---- cancelProductPurchaseID ----
			cancelProductPurchaseID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			cancelProductPurchaseID.setModel(new DefaultComboBoxModel<>(new String[] {
				"Product"
			}));
			deleteProductPurchaseFrame2ContentPane.add(cancelProductPurchaseID);
			cancelProductPurchaseID.setBounds(410, 315, 390, 35);

			//---- editorPane10 ----
			editorPane10.setBackground(new Color(0xb5b9b8));
			editorPane10.setEditable(false);
			deleteProductPurchaseFrame2ContentPane.add(editorPane10);
			editorPane10.setBounds(365, 235, 470, 240);

			//---- titleBar14 ----
			titleBar14.setText("Product: Cancel Product Purchase");
			titleBar14.setBackground(new Color(0xc80f2e));
			titleBar14.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar14.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar14.setForeground(Color.white);
			titleBar14.setEditable(false);
			deleteProductPurchaseFrame2ContentPane.add(titleBar14);
			titleBar14.setBounds(0, 0, 1200, 55);

			//---- background14 ----
			background14.setIcon(new ImageIcon("resource\\products.jpg"));
			deleteProductPurchaseFrame2ContentPane.add(background14);
			background14.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < deleteProductPurchaseFrame2ContentPane.getComponentCount(); i++) {
					Rectangle bounds = deleteProductPurchaseFrame2ContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = deleteProductPurchaseFrame2ContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				deleteProductPurchaseFrame2ContentPane.setMinimumSize(preferredSize);
				deleteProductPurchaseFrame2ContentPane.setPreferredSize(preferredSize);
			}
			deleteProductPurchaseFrame2.pack();
			deleteProductPurchaseFrame2.setLocationRelativeTo(deleteProductPurchaseFrame2.getOwner());
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
	private JButton goToProductPurchases;
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
	private JComboBox<String> deleteProductID;
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
	private JComboBox<String> restockproductid;
	private JEditorPane editorPane4;
	private JFormattedTextField titleBar5;
	private JLabel background5;
	private JFrame sellProductFrame;
	private JButton sellBack;
	private JFormattedTextField titleBar6;
	private JButton sellProduct;
	private JTextPane sellquantity;
	private JComboBox<String> sellproductid;
	private JFormattedTextField sellproducttext;
	private JFormattedTextField sellquantitytext;
	private JFormattedTextField memberidtext;
	private JComboBox<String> memberid;
	private JEditorPane editorPane5;
	private JLabel background6;
	private JFrame readProductFrame;
	private JButton readBack;
	private JScrollPane scrollPane1;
	private JTable productTable;
	private JFormattedTextField titleBar7;
	private JLabel background7;
	private JFrame updateProduct1;
	private JButton updateBack1;
	private JButton proceed;
	private JFormattedTextField productidtext2;
	private JComboBox<String> updateProductID1;
	private JEditorPane editorPane6;
	private JFormattedTextField titleBar8;
	private JLabel background8;
	private JFrame readProductPurchasesFrame;
	private JButton readPurchasesBack;
	private JFormattedTextField titleBar9;
	private JScrollPane scrollPane2;
	private JTable table1;
	private JLabel background9;
	private JFrame productFrame2;
	private JButton productPurchaseBackButton;
	private JFormattedTextField titleBar10;
	private JButton goToAdd2;
	private JButton goToCancel2;
	private JButton goToRead2;
	private JButton goToUpdate2;
	private JButton goToDelete2;
	private JLabel background10;
	private JFrame deleteProductPurchaseFrame;
	private JButton deletePurchaseBack;
	private JButton deleteProductPurchase;
	private JFormattedTextField productidtext3;
	private JComboBox<String> deleteProductPurchaseID;
	private JEditorPane editorPane7;
	private JFormattedTextField titleBar11;
	private JLabel background11;
	private JFrame updateProductPurchaseFrame;
	private JButton updatePurchaseBack;
	private JButton proceedUpdatePurchase;
	private JFormattedTextField productidtext4;
	private JComboBox<String> updateProductPurchaseID;
	private JEditorPane editorPane8;
	private JFormattedTextField titleBar12;
	private JLabel background12;
	private JFrame updateProductPurchase2;
	private JButton updatePurchaseBack2;
	private JFormattedTextField titleBar13;
	private JButton updateProductPurchase;
	private JTextPane quantityPurchase;
	private JComboBox<String> productPurchaseID;
	private JFormattedTextField sellproducttext2;
	private JFormattedTextField sellquantitytext2;
	private JFormattedTextField memberidtext2;
	private JComboBox<String> memberPurchaseID;
	private JEditorPane editorPane9;
	private JLabel background13;
	private JFrame deleteProductPurchaseFrame2;
	private JButton cancelPurchaseBack;
	private JButton cancelProductPurchase;
	private JFormattedTextField productidtext5;
	private JComboBox<String> cancelProductPurchaseID;
	private JEditorPane editorPane10;
	private JFormattedTextField titleBar14;
	private JLabel background14;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

	// jcombobox getters
	public JComboBox<String> getSellProductIDJComboBox() {
		return this.sellproductid;
	}
	public JComboBox<String> getMemberIDJComboBox() {
		return this.memberid;
	}
	public JComboBox<String> getRestockProductIDJComboBox() {
		return this.restockproductid;
	}
	public JComboBox<String> getProductIDJComboBox() {
		return this.deleteProductID;
	}
	public JComboBox<String> getUpdateProductPurchaseID() {
		return this.updateProductPurchaseID;
	}
	public JComboBox<String> getMemberPurchaseID() {
		return this.memberPurchaseID;
	}
	public JComboBox<String> getProductPurchaseID() {
		return this.productPurchaseID;
	}
	public JComboBox<String> getDeleteProductPurchaseID() {
		return this.deleteProductPurchaseID;
	}
	public JComboBox<String> getCancelProductPurchaseID() {
		return this.cancelProductPurchaseID;
	}
	public void setQuantityPurchase(String text) {
		this.quantityPurchase.setText(text);
	}
	public String getQuantityPurchase() {
		return this.quantityPurchase.getText();
	}

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
	public JFrame getUpdateProductFrame1() {
		return this.updateProduct1;
	}
	public JFrame getProductPurchasesFrame() {
		return this.productFrame2;
	}
	public JFrame getAddProductPurchaseFrame() {
		return this.sellProductFrame;
	}
	public JFrame getDeleteProductPurchaseFrame() {
		return this.deleteProductPurchaseFrame;
	}
	public JFrame getCancelProductPurchaseFrame() {
		return this.deleteProductPurchaseFrame2;
	}
	public JFrame getUpdateProductPurchaseFrame() {
		return this.updateProductPurchaseFrame;
	}
	public JFrame getUpdateProductPurchaseFrame1() {
		return this.updateProductPurchase2;
	}
	public JFrame getReadProductPurchasesFrame() {
		return this.readProductPurchasesFrame;
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
	public String getDeleteProductID() {
		return (String) this.deleteProductID.getSelectedItem();
	}

	// update
	public String getUpdateProductID() {
		return (String) this.updateProductID1.getSelectedItem();
	}
	public JComboBox getUpdateProductIDComboBox() {
		return this.updateProductID1;
	}
	public String getUpdateProductPrice() {
		return this.updateProductPrice.getText();
	}
	public String getUpdateProductDescription() {
		return this.updateProductDescription.getText();
	}
	public void setProductName(String name) {
		this.updateProductName.setText(name);
	}
	public void setProductBrand(String name) {
		this.updateProductBrand.setText(name);
	}
	public void setProductPrice(String name) {
		this.updateProductPrice.setText(name);
	}
	public void setAvailableQuantity(String name) {
		this.updateAvailableQuantity.setText(name);
	}
	public void setProductDescription(String name) {
		this.updateProductDescription.setText(name);
	}

	// sell
	public String getSellProductID() {
		return (String) this.sellproductid.getSelectedItem();
	}
	public JComboBox getSellProductIDComboBox() {
		return this.sellproductid;
	}
	public String getSellMemberID() {
		return (String) this.memberid.getSelectedItem();
	}
	public JComboBox getSellMemberIDComboBox() {
		return this.memberid;
	}
	public String getSellQuantity() {
		return this.sellquantity.getText();
	}

	// restock
	public String getRestockProductID() {
		return (String) this.restockproductid.getSelectedItem();
	}
	public JComboBox getRestockProductIDComboBox() {
		return this.restockproductid;
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
	public void goToProductPurchasesButton(ActionListener actionListener) {
		this.goToProductPurchases.addActionListener(actionListener);
	}

	public void productPurchaseBackButton(ActionListener actionListener) {
		this.productPurchaseBackButton.addActionListener(actionListener);
	}
	public void goToAddButton2(ActionListener actionListener) {
		this.goToAdd2.addActionListener(actionListener);
	}
	public void goToReadButton2(ActionListener actionListener) {
		this.goToRead2.addActionListener(actionListener);
	}
	public void goToDeleteButton2(ActionListener actionListener) {
		this.goToDelete2.addActionListener(actionListener);
	}
	public void goToUpdateButton2(ActionListener actionListener) {
		this.goToUpdate2.addActionListener(actionListener);
	}
	public void goToCancelButton2(ActionListener actionListener) {
		this.goToCancel2.addActionListener(actionListener);
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

	public void addPurchaseBackButton(ActionListener actionListener) {
		this.sellBack.addActionListener(actionListener);
	}
	public void addPurchaseProductButton(ActionListener actionListener) {
		this.sellProduct.addActionListener(actionListener);
	}
	public void deletePurchaseProductButton(ActionListener actionListener) {
		this.deleteProductPurchase.addActionListener(actionListener);
	}
	public void deletePurchaseBackButton(ActionListener actionListener) {
		this.deletePurchaseBack.addActionListener(actionListener);
	}
	public void cancelPurchaseProductButton(ActionListener actionListener) {
		this.cancelProductPurchase.addActionListener(actionListener);
	}
	public void cancelPurchaseBackButton(ActionListener actionListener) {
		this.cancelPurchaseBack.addActionListener(actionListener);
	}
	public void proceedUpdatePurchaseProductButton(ActionListener actionListener) {
		this.proceedUpdatePurchase.addActionListener(actionListener);
	}
	public void updatePurchaseProductButton(ActionListener actionListener) {
		this.updateProductPurchase.addActionListener(actionListener);
	}
	public void updatePurchaseBackButton(ActionListener actionListener) {
		this.updatePurchaseBack.addActionListener(actionListener);
	}
	public void updatePurchaseBackButton1(ActionListener actionListener) {
		this.updatePurchaseBack2.addActionListener(actionListener);
	}
	public void readPurchaseBackButton(ActionListener actionListener) {
		this.readPurchasesBack.addActionListener(actionListener);
	}

	public void updateBackButton1(ActionListener actionListener) {
		this.updateBack1.addActionListener(actionListener);
	}
	public void proceedButton(ActionListener actionListener) {
		this.proceed.addActionListener(actionListener);
	}

	public void setProductTable(Object[][] data) { 
		String[] columnNames = {"Product ID", "Product Brand", "Product Name", "Product Description", "Product Price", "Available Quantity"};
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		productTable.setModel(model);
	}

	public void setPurchasesTable(Object[][] data) { 
		String[] columnNames = {"Product Purchase ID", "Member ID", "Product ID", "Quantity Sold", "Purchase Date and Time"};
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		table1.setModel(model);
	}
}
