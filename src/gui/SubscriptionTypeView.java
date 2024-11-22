import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Fri Nov 15 00:12:13 PST 2024
 */



/**
 * @author Diane
 */
public class SubscriptionTypeView {
	public SubscriptionTypeView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
		subscriptionTypeFrame = new JFrame();
		subscriptionTypeBackButton = new JButton();
		titleBar = new JFormattedTextField();
		goToAdd = new JButton();
		goToRead = new JButton();
		goToUpdate = new JButton();
		goToDelete = new JButton();
		background = new JLabel();
		addSubscriptionTypeFrame = new JFrame();
		addBack = new JButton();
		titleBar2 = new JFormattedTextField();
		addSubscriptionType = new JButton();
		membershipTypeNameText2 = new JFormattedTextField();
		membershipTypeNameText = new JFormattedTextField();
		subscriptionTypePrice = new JTextPane();
		subscriptionTypeName = new JTextPane();
		editorPane1 = new JEditorPane();
		background2 = new JLabel();
		deleteSubscriptionTypeFrame = new JFrame();
		deleteBack = new JButton();
		titleBar4 = new JFormattedTextField();
		membershipTypeIDText = new JFormattedTextField();
		subscriptionTypeID = new JComboBox<>();
		deleteSubscriptionType = new JButton();
		editorPane2 = new JEditorPane();
		background4 = new JLabel();
		updateSubscriptionTypeFrame1 = new JFrame();
		updateBack1 = new JButton();
		titleBar5 = new JFormattedTextField();
		membershipTypeIDText2 = new JFormattedTextField();
		updateSubscriptionName = new JComboBox<>();
		proceedUpdate = new JButton();
		editorPane3 = new JEditorPane();
		background5 = new JLabel();
		updateSubscriptionTypeFrame2 = new JFrame();
		updateBack2 = new JButton();
		updateSubscriptionType = new JButton();
		updateSubscriptionTypePrice = new JTextPane();
		updateSubscriptionTypeName = new JTextPane();
		membershipTypeNameText3 = new JFormattedTextField();
		membershipTypeNameText4 = new JFormattedTextField();
		goToAddAmenity = new JButton();
		goToRemoveAmenity = new JButton();
		goToReadAmenity = new JButton();
		editorPane4 = new JEditorPane();
		editorPane6 = new JEditorPane();
		titleBar6 = new JFormattedTextField();
		background6 = new JLabel();
		addAmenityFrame = new JFrame();
		addAmenityBack = new JButton();
		titleBar7 = new JFormattedTextField();
		membershipTypeIDText3 = new JFormattedTextField();
		addAmenityID = new JComboBox<>();
		addAmenity = new JButton();
		editorPane5 = new JEditorPane();
		background7 = new JLabel();
		removeAmenityFrame = new JFrame();
		removeAmenityBack = new JButton();
		titleBar8 = new JFormattedTextField();
		membershipTypeIDText4 = new JFormattedTextField();
		removeAmenityID = new JComboBox<>();
		removeAmenity = new JButton();
		editorPane7 = new JEditorPane();
		background8 = new JLabel();
		readAmenityFrame = new JFrame();
		scrollPane1 = new JScrollPane();
		amenityTable = new JTable();
		readAmenityBack = new JButton();
		titleBar10 = new JFormattedTextField();
		amenitySubscriptionTypeName = new JFormattedTextField();
		editorPane8 = new JEditorPane();
		background10 = new JLabel();
		readSubscriptionTypeFrame = new JFrame();
		scrollPane2 = new JScrollPane();
		subscriptionTypeTable = new JTable();
		readBack = new JButton();
		titleBar11 = new JFormattedTextField();
		background11 = new JLabel();

		//======== subscriptionTypeFrame ========
		{
			Container subscriptionTypeFrameContentPane = subscriptionTypeFrame.getContentPane();
			subscriptionTypeFrameContentPane.setLayout(null);

			//---- subscriptionTypeBackButton ----
			subscriptionTypeBackButton.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			subscriptionTypeBackButton.setIcon(new ImageIcon("resource\\backButton.jpg"));
			subscriptionTypeBackButton.setBackground(new Color(0xc80f2e));
			subscriptionTypeFrameContentPane.add(subscriptionTypeBackButton);
			subscriptionTypeBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar ----
			titleBar.setText("Subscription Type");
			titleBar.setBackground(new Color(0xc80f2e));
			titleBar.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar.setForeground(Color.white);
			titleBar.setEditable(false);
			subscriptionTypeFrameContentPane.add(titleBar);
			titleBar.setBounds(0, 0, 1200, 55);

			//---- goToAdd ----
			goToAdd.setText("ADD SUBSCRIPTION TYPE");
			goToAdd.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToAdd.setForeground(Color.white);
			goToAdd.setBackground(new Color(0x3ca3cb));
			subscriptionTypeFrameContentPane.add(goToAdd);
			goToAdd.setBounds(455, 180, 280, 55);

			//---- goToRead ----
			goToRead.setText("READ SUBSCRIPTION TYPE");
			goToRead.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToRead.setForeground(Color.white);
			goToRead.setBackground(new Color(0x3ca3cb));
			subscriptionTypeFrameContentPane.add(goToRead);
			goToRead.setBounds(455, 270, 280, 55);

			//---- goToUpdate ----
			goToUpdate.setText("UPDATE SUBSCRIPTION TYPE");
			goToUpdate.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToUpdate.setForeground(Color.white);
			goToUpdate.setBackground(new Color(0x3ca3cb));
			subscriptionTypeFrameContentPane.add(goToUpdate);
			goToUpdate.setBounds(455, 360, 280, 55);

			//---- goToDelete ----
			goToDelete.setText("DELETE SUBSCRIPTION TYPE");
			goToDelete.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToDelete.setForeground(Color.white);
			goToDelete.setBackground(new Color(0x3ca3cb));
			subscriptionTypeFrameContentPane.add(goToDelete);
			goToDelete.setBounds(455, 450, 280, 55);

			//---- background ----
			background.setIcon(new ImageIcon("resource\\membershiptype.jpg"));
			subscriptionTypeFrameContentPane.add(background);
			background.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < subscriptionTypeFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = subscriptionTypeFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = subscriptionTypeFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				subscriptionTypeFrameContentPane.setMinimumSize(preferredSize);
				subscriptionTypeFrameContentPane.setPreferredSize(preferredSize);
			}
			subscriptionTypeFrame.pack();  
			subscriptionTypeFrame.setSize(1200, 700);
			subscriptionTypeFrame.setLocationRelativeTo(null);
			subscriptionTypeFrame.setVisible(true);
		}

		//======== addSubscriptionTypeFrame ========
		{
			Container addSubscriptionTypeFrameContentPane = addSubscriptionTypeFrame.getContentPane();
			addSubscriptionTypeFrameContentPane.setLayout(null);

			//---- addBack ----
			addBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			addBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			addBack.setBackground(new Color(0xc80f2e));
			addSubscriptionTypeFrameContentPane.add(addBack);
			addBack.setBounds(5, 5, 95, 45);

			//---- titleBar2 ----
			titleBar2.setText("Subscription Type: Add Subscription Type");
			titleBar2.setBackground(new Color(0xc80f2e));
			titleBar2.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar2.setForeground(Color.white);
			titleBar2.setEditable(false);
			addSubscriptionTypeFrameContentPane.add(titleBar2);
			titleBar2.setBounds(0, 0, 1200, 55);

			//---- addSubscriptionType ----
			addSubscriptionType.setText("ADD SUBSCRIPTION TYPE");
			addSubscriptionType.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			addSubscriptionType.setForeground(Color.white);
			addSubscriptionType.setBackground(new Color(0x3ca3cb));
			addSubscriptionTypeFrameContentPane.add(addSubscriptionType);
			addSubscriptionType.setBounds(480, 385, 250, 55);

			//---- membershipTypeNameText2 ----
			membershipTypeNameText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			membershipTypeNameText2.setText("Price of Subscription");
			membershipTypeNameText2.setHorizontalAlignment(SwingConstants.LEFT);
			membershipTypeNameText2.setEditable(false);
			addSubscriptionTypeFrameContentPane.add(membershipTypeNameText2);
			membershipTypeNameText2.setBounds(280, 315, 230, 35);

			//---- membershipTypeNameText ----
			membershipTypeNameText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			membershipTypeNameText.setText("Name of Subscription Type");
			membershipTypeNameText.setHorizontalAlignment(SwingConstants.LEFT);
			membershipTypeNameText.setEditable(false);
			addSubscriptionTypeFrameContentPane.add(membershipTypeNameText);
			membershipTypeNameText.setBounds(280, 255, 230, 35);

			//---- subscriptionTypePrice ----
			subscriptionTypePrice.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addSubscriptionTypeFrameContentPane.add(subscriptionTypePrice);
			subscriptionTypePrice.setBounds(560, 315, 375, 35);

			//---- subscriptionTypeName ----
			subscriptionTypeName.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addSubscriptionTypeFrameContentPane.add(subscriptionTypeName);
			subscriptionTypeName.setBounds(560, 255, 375, 35);

			//---- editorPane1 ----
			editorPane1.setBackground(new Color(0xb5b9b8));
			addSubscriptionTypeFrameContentPane.add(editorPane1);
			editorPane1.setBounds(250, 225, 715, 245);

			//---- background2 ----
			background2.setIcon(new ImageIcon("resource\\membershiptype.jpg"));
			addSubscriptionTypeFrameContentPane.add(background2);
			background2.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < addSubscriptionTypeFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = addSubscriptionTypeFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = addSubscriptionTypeFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				addSubscriptionTypeFrameContentPane.setMinimumSize(preferredSize);
				addSubscriptionTypeFrameContentPane.setPreferredSize(preferredSize);
			}
			addSubscriptionTypeFrame.pack();
			addSubscriptionTypeFrame.setLocationRelativeTo(addSubscriptionTypeFrame.getOwner());
		}

		//======== deleteSubscriptionTypeFrame ========
		{
			Container deleteSubscriptionTypeFrameContentPane = deleteSubscriptionTypeFrame.getContentPane();
			deleteSubscriptionTypeFrameContentPane.setLayout(null);

			//---- deleteBack ----
			deleteBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			deleteBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			deleteBack.setBackground(new Color(0xc80f2e));
			deleteSubscriptionTypeFrameContentPane.add(deleteBack);
			deleteBack.setBounds(5, 5, 95, 45);

			//---- titleBar4 ----
			titleBar4.setText("Subscription Type: Delete Subscription Type");
			titleBar4.setBackground(new Color(0xc80f2e));
			titleBar4.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar4.setForeground(Color.white);
			titleBar4.setEditable(false);
			deleteSubscriptionTypeFrameContentPane.add(titleBar4);
			titleBar4.setBounds(0, 0, 1200, 55);

			//---- membershipTypeIDText ----
			membershipTypeIDText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			membershipTypeIDText.setText("Select Subscription Type");
			membershipTypeIDText.setHorizontalAlignment(SwingConstants.CENTER);
			membershipTypeIDText.setEditable(false);
			deleteSubscriptionTypeFrameContentPane.add(membershipTypeIDText);
			membershipTypeIDText.setBounds(355, 235, 490, 35);

			//---- subscriptionTypeID ----
			subscriptionTypeID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			deleteSubscriptionTypeFrameContentPane.add(subscriptionTypeID);
			subscriptionTypeID.setBounds(415, 325, 370, 35);

			//---- deleteSubscriptionType ----
			deleteSubscriptionType.setText("DELETE SUBSCRIPTION TYPE");
			deleteSubscriptionType.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			deleteSubscriptionType.setForeground(Color.white);
			deleteSubscriptionType.setBackground(new Color(0x3ca3cb));
			deleteSubscriptionTypeFrameContentPane.add(deleteSubscriptionType);
			deleteSubscriptionType.setBounds(475, 395, 250, 55);

			//---- editorPane2 ----
			editorPane2.setBackground(new Color(0xb5b9b8));
			editorPane2.setEditable(false);
			deleteSubscriptionTypeFrameContentPane.add(editorPane2);
			editorPane2.setBounds(355, 235, 490, 235);

			//---- background4 ----
			background4.setIcon(new ImageIcon("resource\\membershiptype.jpg"));
			deleteSubscriptionTypeFrameContentPane.add(background4);
			background4.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < deleteSubscriptionTypeFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = deleteSubscriptionTypeFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = deleteSubscriptionTypeFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				deleteSubscriptionTypeFrameContentPane.setMinimumSize(preferredSize);
				deleteSubscriptionTypeFrameContentPane.setPreferredSize(preferredSize);
			}
			deleteSubscriptionTypeFrame.pack();
			deleteSubscriptionTypeFrame.setLocationRelativeTo(deleteSubscriptionTypeFrame.getOwner());
		}

		//======== updateSubscriptionTypeFrame1 ========
		{
			Container updateSubscriptionTypeFrame1ContentPane = updateSubscriptionTypeFrame1.getContentPane();
			updateSubscriptionTypeFrame1ContentPane.setLayout(null);

			//---- updateBack1 ----
			updateBack1.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			updateBack1.setIcon(new ImageIcon("resource\\backButton.jpg"));
			updateBack1.setBackground(new Color(0xc80f2e));
			updateSubscriptionTypeFrame1ContentPane.add(updateBack1);
			updateBack1.setBounds(5, 5, 95, 45);

			//---- titleBar5 ----
			titleBar5.setText("Subscription Type: Update Subscription Type");
			titleBar5.setBackground(new Color(0xc80f2e));
			titleBar5.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar5.setForeground(Color.white);
			titleBar5.setEditable(false);
			updateSubscriptionTypeFrame1ContentPane.add(titleBar5);
			titleBar5.setBounds(0, 0, 1200, 55);

			//---- membershipTypeIDText2 ----
			membershipTypeIDText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			membershipTypeIDText2.setText("Select Subscription Type");
			membershipTypeIDText2.setHorizontalAlignment(SwingConstants.CENTER);
			membershipTypeIDText2.setEditable(false);
			updateSubscriptionTypeFrame1ContentPane.add(membershipTypeIDText2);
			membershipTypeIDText2.setBounds(355, 235, 490, 35);

			//---- updateSubscriptionName ----
			updateSubscriptionName.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateSubscriptionTypeFrame1ContentPane.add(updateSubscriptionName);
			updateSubscriptionName.setBounds(415, 325, 370, 35);

			//---- proceedUpdate ----
			proceedUpdate.setText("PROCEED");
			proceedUpdate.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			proceedUpdate.setForeground(Color.white);
			proceedUpdate.setBackground(new Color(0x3ca3cb));
			updateSubscriptionTypeFrame1ContentPane.add(proceedUpdate);
			proceedUpdate.setBounds(475, 395, 250, 55);

			//---- editorPane3 ----
			editorPane3.setEditable(false);
			editorPane3.setBackground(new Color(0xb5b9b8));
			updateSubscriptionTypeFrame1ContentPane.add(editorPane3);
			editorPane3.setBounds(355, 235, 490, 235);

			//---- background5 ----
			background5.setIcon(new ImageIcon("resource\\membershiptype.jpg"));
			updateSubscriptionTypeFrame1ContentPane.add(background5);
			background5.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < updateSubscriptionTypeFrame1ContentPane.getComponentCount(); i++) {
					Rectangle bounds = updateSubscriptionTypeFrame1ContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = updateSubscriptionTypeFrame1ContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				updateSubscriptionTypeFrame1ContentPane.setMinimumSize(preferredSize);
				updateSubscriptionTypeFrame1ContentPane.setPreferredSize(preferredSize);
			}
			updateSubscriptionTypeFrame1.pack();
			updateSubscriptionTypeFrame1.setLocationRelativeTo(updateSubscriptionTypeFrame1.getOwner());
		}

		//======== updateSubscriptionTypeFrame2 ========
		{
			Container updateSubscriptionTypeFrame2ContentPane = updateSubscriptionTypeFrame2.getContentPane();
			updateSubscriptionTypeFrame2ContentPane.setLayout(null);

			//---- updateBack2 ----
			updateBack2.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			updateBack2.setIcon(new ImageIcon("resource\\backButton.jpg"));
			updateBack2.setBackground(new Color(0xc80f2e));
			updateSubscriptionTypeFrame2ContentPane.add(updateBack2);
			updateBack2.setBounds(5, 5, 95, 45);

			//---- updateSubscriptionType ----
			updateSubscriptionType.setText("UPDATE SUBSCRIPTION TYPE");
			updateSubscriptionType.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			updateSubscriptionType.setForeground(Color.white);
			updateSubscriptionType.setBackground(new Color(0x3ca3cb));
			updateSubscriptionTypeFrame2ContentPane.add(updateSubscriptionType);
			updateSubscriptionType.setBounds(450, 275, 300, 55);

			//---- updateSubscriptionTypePrice ----
			updateSubscriptionTypePrice.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateSubscriptionTypeFrame2ContentPane.add(updateSubscriptionTypePrice);
			updateSubscriptionTypePrice.setBounds(555, 205, 375, 35);

			//---- updateSubscriptionTypeName ----
			updateSubscriptionTypeName.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateSubscriptionTypeFrame2ContentPane.add(updateSubscriptionTypeName);
			updateSubscriptionTypeName.setBounds(555, 145, 375, 35);

			//---- membershipTypeNameText3 ----
			membershipTypeNameText3.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			membershipTypeNameText3.setText("Name of Subscription Type");
			membershipTypeNameText3.setHorizontalAlignment(SwingConstants.LEFT);
			membershipTypeNameText3.setEditable(false);
			updateSubscriptionTypeFrame2ContentPane.add(membershipTypeNameText3);
			membershipTypeNameText3.setBounds(275, 145, 230, 35);

			//---- membershipTypeNameText4 ----
			membershipTypeNameText4.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			membershipTypeNameText4.setText("Price of Subscription");
			membershipTypeNameText4.setHorizontalAlignment(SwingConstants.LEFT);
			membershipTypeNameText4.setEditable(false);
			updateSubscriptionTypeFrame2ContentPane.add(membershipTypeNameText4);
			membershipTypeNameText4.setBounds(275, 205, 230, 35);

			//---- goToAddAmenity ----
			goToAddAmenity.setText("ADD AMENITY");
			goToAddAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToAddAmenity.setForeground(Color.white);
			goToAddAmenity.setBackground(new Color(0x3ca3cb));
			updateSubscriptionTypeFrame2ContentPane.add(goToAddAmenity);
			goToAddAmenity.setBounds(275, 495, 180, 55);

			//---- goToRemoveAmenity ----
			goToRemoveAmenity.setText("REMOVE AMENITY");
			goToRemoveAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToRemoveAmenity.setForeground(Color.white);
			goToRemoveAmenity.setBackground(new Color(0x3ca3cb));
			updateSubscriptionTypeFrame2ContentPane.add(goToRemoveAmenity);
			goToRemoveAmenity.setBounds(510, 495, 180, 55);

			//---- goToReadAmenity ----
			goToReadAmenity.setText("READ AMENITIES");
			goToReadAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToReadAmenity.setForeground(Color.white);
			goToReadAmenity.setBackground(new Color(0x3ca3cb));
			updateSubscriptionTypeFrame2ContentPane.add(goToReadAmenity);
			goToReadAmenity.setBounds(750, 495, 180, 55);

			//---- editorPane4 ----
			editorPane4.setBackground(new Color(0xb5b9b8));
			updateSubscriptionTypeFrame2ContentPane.add(editorPane4);
			editorPane4.setBounds(245, 115, 715, 245);

			//---- editorPane6 ----
			editorPane6.setBackground(new Color(0xb5b9b8));
			updateSubscriptionTypeFrame2ContentPane.add(editorPane6);
			editorPane6.setBounds(245, 465, 715, 115);

			//---- titleBar6 ----
			titleBar6.setText("Subscription Type: Update Subscription Type");
			titleBar6.setBackground(new Color(0xc80f2e));
			titleBar6.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar6.setForeground(Color.white);
			titleBar6.setEditable(false);
			updateSubscriptionTypeFrame2ContentPane.add(titleBar6);
			titleBar6.setBounds(0, 0, 1200, 55);

			//---- background6 ----
			background6.setIcon(new ImageIcon("resource\\membershiptype.jpg"));
			updateSubscriptionTypeFrame2ContentPane.add(background6);
			background6.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < updateSubscriptionTypeFrame2ContentPane.getComponentCount(); i++) {
					Rectangle bounds = updateSubscriptionTypeFrame2ContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = updateSubscriptionTypeFrame2ContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				updateSubscriptionTypeFrame2ContentPane.setMinimumSize(preferredSize);
				updateSubscriptionTypeFrame2ContentPane.setPreferredSize(preferredSize);
			}
			updateSubscriptionTypeFrame2.pack();
			updateSubscriptionTypeFrame2.setLocationRelativeTo(updateSubscriptionTypeFrame2.getOwner());
		}

		//======== addAmenityFrame ========
		{
			Container addAmenityFrameContentPane = addAmenityFrame.getContentPane();
			addAmenityFrameContentPane.setLayout(null);

			//---- addAmenityBack ----
			addAmenityBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			addAmenityBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			addAmenityBack.setBackground(new Color(0xc80f2e));
			addAmenityFrameContentPane.add(addAmenityBack);
			addAmenityBack.setBounds(5, 5, 95, 45);

			//---- titleBar7 ----
			titleBar7.setText("Subscription Type: Add Amenity to Subscription");
			titleBar7.setBackground(new Color(0xc80f2e));
			titleBar7.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar7.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar7.setForeground(Color.white);
			titleBar7.setEditable(false);
			addAmenityFrameContentPane.add(titleBar7);
			titleBar7.setBounds(0, 0, 1200, 55);

			//---- membershipTypeIDText3 ----
			membershipTypeIDText3.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			membershipTypeIDText3.setText("Select Amenity");
			membershipTypeIDText3.setHorizontalAlignment(SwingConstants.CENTER);
			membershipTypeIDText3.setEditable(false);
			addAmenityFrameContentPane.add(membershipTypeIDText3);
			membershipTypeIDText3.setBounds(355, 235, 490, 35);

			//---- addAmenityID ----
			addAmenityID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addAmenityFrameContentPane.add(addAmenityID);
			addAmenityID.setBounds(415, 325, 370, 35);

			//---- addAmenity ----
			addAmenity.setText("ADD AMENITY");
			addAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			addAmenity.setForeground(Color.white);
			addAmenity.setBackground(new Color(0x3ca3cb));
			addAmenityFrameContentPane.add(addAmenity);
			addAmenity.setBounds(475, 395, 250, 55);

			//---- editorPane5 ----
			editorPane5.setBackground(new Color(0xb5b9b8));
			editorPane5.setEditable(false);
			addAmenityFrameContentPane.add(editorPane5);
			editorPane5.setBounds(355, 235, 490, 235);

			//---- background7 ----
			background7.setIcon(new ImageIcon("resource\\membershiptype.jpg"));
			addAmenityFrameContentPane.add(background7);
			background7.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < addAmenityFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = addAmenityFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = addAmenityFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				addAmenityFrameContentPane.setMinimumSize(preferredSize);
				addAmenityFrameContentPane.setPreferredSize(preferredSize);
			}
			addAmenityFrame.pack();
			addAmenityFrame.setLocationRelativeTo(addAmenityFrame.getOwner());
		}

		//======== removeAmenityFrame ========
		{
			Container removeAmenityFrameContentPane = removeAmenityFrame.getContentPane();
			removeAmenityFrameContentPane.setLayout(null);

			//---- removeAmenityBack ----
			removeAmenityBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			removeAmenityBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			removeAmenityBack.setBackground(new Color(0xc80f2e));
			removeAmenityFrameContentPane.add(removeAmenityBack);
			removeAmenityBack.setBounds(5, 5, 95, 45);

			//---- titleBar8 ----
			titleBar8.setText("Subscription Type: Remove Amenity from Subscription");
			titleBar8.setBackground(new Color(0xc80f2e));
			titleBar8.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar8.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar8.setForeground(Color.white);
			titleBar8.setEditable(false);
			removeAmenityFrameContentPane.add(titleBar8);
			titleBar8.setBounds(0, 0, 1200, 55);

			//---- membershipTypeIDText4 ----
			membershipTypeIDText4.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			membershipTypeIDText4.setText("Select Amenity");
			membershipTypeIDText4.setHorizontalAlignment(SwingConstants.CENTER);
			membershipTypeIDText4.setEditable(false);
			removeAmenityFrameContentPane.add(membershipTypeIDText4);
			membershipTypeIDText4.setBounds(355, 235, 490, 35);

			//---- removeAmenityID ----
			removeAmenityID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			removeAmenityFrameContentPane.add(removeAmenityID);
			removeAmenityID.setBounds(415, 325, 370, 35);

			//---- removeAmenity ----
			removeAmenity.setText("REMOVE AMENITY");
			removeAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			removeAmenity.setForeground(Color.white);
			removeAmenity.setBackground(new Color(0x3ca3cb));
			removeAmenityFrameContentPane.add(removeAmenity);
			removeAmenity.setBounds(475, 395, 250, 55);

			//---- editorPane7 ----
			editorPane7.setBackground(new Color(0xb5b9b8));
			editorPane7.setEditable(false);
			removeAmenityFrameContentPane.add(editorPane7);
			editorPane7.setBounds(355, 235, 490, 235);

			//---- background8 ----
			background8.setIcon(new ImageIcon("resource\\membershiptype.jpg"));
			removeAmenityFrameContentPane.add(background8);
			background8.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < removeAmenityFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = removeAmenityFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = removeAmenityFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				removeAmenityFrameContentPane.setMinimumSize(preferredSize);
				removeAmenityFrameContentPane.setPreferredSize(preferredSize);
			}
			removeAmenityFrame.pack();
			removeAmenityFrame.setLocationRelativeTo(removeAmenityFrame.getOwner());
		}

		//======== readAmenityFrame ========
		{
			Container readAmenityFrameContentPane = readAmenityFrame.getContentPane();
			readAmenityFrameContentPane.setLayout(null);

			//======== scrollPane1 ========
			{

				//---- amenityTable ----
				amenityTable.setModel(new DefaultTableModel(
					new Object[][] {
						{null},
						{null},
					},
					new String[] {
						"List of Amenities"
					}
				));
				amenityTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				amenityTable.setEnabled(false);
				scrollPane1.setViewportView(amenityTable);
			}
			readAmenityFrameContentPane.add(scrollPane1);
			scrollPane1.setBounds(385, 265, 430, 250);

			//---- readAmenityBack ----
			readAmenityBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			readAmenityBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			readAmenityBack.setBackground(new Color(0xc80f2e));
			readAmenityFrameContentPane.add(readAmenityBack);
			readAmenityBack.setBounds(5, 5, 95, 45);

			//---- titleBar10 ----
			titleBar10.setText("Subscription Type: Read Subscription Amenities");
			titleBar10.setBackground(new Color(0xc80f2e));
			titleBar10.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar10.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar10.setForeground(Color.white);
			titleBar10.setEditable(false);
			readAmenityFrameContentPane.add(titleBar10);
			titleBar10.setBounds(0, 0, 1200, 55);

			//---- amenitySubscriptionTypeName ----
			amenitySubscriptionTypeName.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			amenitySubscriptionTypeName.setText("Subscription Type");
			amenitySubscriptionTypeName.setHorizontalAlignment(SwingConstants.CENTER);
			amenitySubscriptionTypeName.setEditable(false);
			readAmenityFrameContentPane.add(amenitySubscriptionTypeName);
			amenitySubscriptionTypeName.setBounds(355, 190, 490, 35);

			//---- editorPane8 ----
			editorPane8.setBackground(new Color(0xb5b9b8));
			editorPane8.setEditable(false);
			readAmenityFrameContentPane.add(editorPane8);
			editorPane8.setBounds(355, 190, 490, 350);

			//---- background10 ----
			background10.setIcon(new ImageIcon("resource\\membershiptype.jpg"));
			readAmenityFrameContentPane.add(background10);
			background10.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < readAmenityFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = readAmenityFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = readAmenityFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				readAmenityFrameContentPane.setMinimumSize(preferredSize);
				readAmenityFrameContentPane.setPreferredSize(preferredSize);
			}
			readAmenityFrame.pack();
			readAmenityFrame.setLocationRelativeTo(readAmenityFrame.getOwner());
		}

		//======== readSubscriptionTypeFrame ========
		{
			Container readSubscriptionTypeFrameContentPane = readSubscriptionTypeFrame.getContentPane();
			readSubscriptionTypeFrameContentPane.setLayout(null);

			//======== scrollPane2 ========
			{

				//---- subscriptionTypeTable ----
				subscriptionTypeTable.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null},
						{null, null, null},
					},
					new String[] {
						"Subscription Type ID", "Subscription Type Name", "Subscription Type Price"
					}
				));
				subscriptionTypeTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				subscriptionTypeTable.setEnabled(false);
				scrollPane2.setViewportView(subscriptionTypeTable);
			}
			readSubscriptionTypeFrameContentPane.add(scrollPane2);
			scrollPane2.setBounds(105, 140, 990, 445);

			//---- readBack ----
			readBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			readBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			readBack.setBackground(new Color(0xc80f2e));
			readSubscriptionTypeFrameContentPane.add(readBack);
			readBack.setBounds(5, 5, 95, 45);

			//---- titleBar11 ----
			titleBar11.setText("Subscription Type: Read Subscription Types");
			titleBar11.setBackground(new Color(0xc80f2e));
			titleBar11.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar11.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar11.setForeground(Color.white);
			titleBar11.setEditable(false);
			readSubscriptionTypeFrameContentPane.add(titleBar11);
			titleBar11.setBounds(0, 0, 1200, 55);

			//---- background11 ----
			background11.setIcon(new ImageIcon("resource\\membershiptype.jpg"));
			readSubscriptionTypeFrameContentPane.add(background11);
			background11.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < readSubscriptionTypeFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = readSubscriptionTypeFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = readSubscriptionTypeFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				readSubscriptionTypeFrameContentPane.setMinimumSize(preferredSize);
				readSubscriptionTypeFrameContentPane.setPreferredSize(preferredSize);
			}
			readSubscriptionTypeFrame.pack();
			readSubscriptionTypeFrame.setLocationRelativeTo(readSubscriptionTypeFrame.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
	private JFrame subscriptionTypeFrame;
	private JButton subscriptionTypeBackButton;
	private JFormattedTextField titleBar;
	private JButton goToAdd;
	private JButton goToRead;
	private JButton goToUpdate;
	private JButton goToDelete;
	private JLabel background;
	private JFrame addSubscriptionTypeFrame;
	private JButton addBack;
	private JFormattedTextField titleBar2;
	private JButton addSubscriptionType;
	private JFormattedTextField membershipTypeNameText2;
	private JFormattedTextField membershipTypeNameText;
	private JTextPane subscriptionTypePrice;
	private JTextPane subscriptionTypeName;
	private JEditorPane editorPane1;
	private JLabel background2;
	private JFrame deleteSubscriptionTypeFrame;
	private JButton deleteBack;
	private JFormattedTextField titleBar4;
	private JFormattedTextField membershipTypeIDText;
	private JComboBox<String> subscriptionTypeID;
	private JButton deleteSubscriptionType;
	private JEditorPane editorPane2;
	private JLabel background4;
	private JFrame updateSubscriptionTypeFrame1;
	private JButton updateBack1;
	private JFormattedTextField titleBar5;
	private JFormattedTextField membershipTypeIDText2;
	private JComboBox<String> updateSubscriptionName;
	private JButton proceedUpdate;
	private JEditorPane editorPane3;
	private JLabel background5;
	private JFrame updateSubscriptionTypeFrame2;
	private JButton updateBack2;
	private JButton updateSubscriptionType;
	private JTextPane updateSubscriptionTypePrice;
	private JTextPane updateSubscriptionTypeName;
	private JFormattedTextField membershipTypeNameText3;
	private JFormattedTextField membershipTypeNameText4;
	private JButton goToAddAmenity;
	private JButton goToRemoveAmenity;
	private JButton goToReadAmenity;
	private JEditorPane editorPane4;
	private JEditorPane editorPane6;
	private JFormattedTextField titleBar6;
	private JLabel background6;
	private JFrame addAmenityFrame;
	private JButton addAmenityBack;
	private JFormattedTextField titleBar7;
	private JFormattedTextField membershipTypeIDText3;
	private JComboBox<String> addAmenityID;
	private JButton addAmenity;
	private JEditorPane editorPane5;
	private JLabel background7;
	private JFrame removeAmenityFrame;
	private JButton removeAmenityBack;
	private JFormattedTextField titleBar8;
	private JFormattedTextField membershipTypeIDText4;
	private JComboBox<String> removeAmenityID;
	private JButton removeAmenity;
	private JEditorPane editorPane7;
	private JLabel background8;
	private JFrame readAmenityFrame;
	private JScrollPane scrollPane1;
	private JTable amenityTable;
	private JButton readAmenityBack;
	private JFormattedTextField titleBar10;
	private JFormattedTextField amenitySubscriptionTypeName;
	private JEditorPane editorPane8;
	private JLabel background10;
	private JFrame readSubscriptionTypeFrame;
	private JScrollPane scrollPane2;
	private JTable subscriptionTypeTable;
	private JButton readBack;
	private JFormattedTextField titleBar11;
	private JLabel background11;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

	// jcombobox getters
	public JComboBox<String> getSubscriptionTypeIDJComboBox() {
		return this.subscriptionTypeID;
	}
	public JComboBox<String> getUpdateSubscriptionNameJComboBox() {
		return this.updateSubscriptionName;
	}
	public JComboBox<String> getAddAmenityIDJComboBox() {
		return this.addAmenityID;
	}
	public JComboBox<String> getRemoveAmenityIDJComboBox() {
		return this.removeAmenityID;
	}

	// getters
	public JFrame getSubscriptionTypeFrame() {
		return this.subscriptionTypeFrame;
	}
	public JFrame getAddSubscriptionTypeFrame() {
		return this.addSubscriptionTypeFrame;
	}
	public JFrame getDeleteSubscriptionTypeFrame() {
		return this.deleteSubscriptionTypeFrame;
	}
	public JFrame getReadSubscriptionTypeFrame() {
		return this.readSubscriptionTypeFrame;
	}
	public JFrame getUpdateSubscriptionTypeFrame1() {
		return this.updateSubscriptionTypeFrame1;
	}
	public JFrame getUpdateSubscriptionTypeFrame2() {
		return this.updateSubscriptionTypeFrame2;
	}
	public JFrame getAddAmenityFrame() {
		return this.addAmenityFrame;
	}
	public JFrame getRemoveAmenityFrame() {
		return this.removeAmenityFrame;
	}
	public JFrame getReadAmenityFrame() {
		return this.readAmenityFrame;
	}

	// add
	public String getSubscriptionTypeName() {
		return this.subscriptionTypeName.getText();
	}
	public String getSubscriptionTypePrice() {
		return this.subscriptionTypePrice.getText();
	}

	// delete
	public String getSubscriptionTypeID() {
		return (String) this.subscriptionTypeID.getSelectedItem();
	}

	// update
	public String getUpdateSubscriptionName() {
		return (String) this.updateSubscriptionName.getSelectedItem();
	}

	public String getUpdateSubscriptionTypeName() {
		return this.updateSubscriptionTypeName.getText().trim();
	}
	public String getUpdateSubscriptionTypePrice() {
		return this.updateSubscriptionTypePrice.getText().trim();
	}

	public int getAddAmenityID() {
		return this.addAmenityID.getSelectedIndex() + 1;
	}
	public int getRemoveAmenityID() {
		return this.removeAmenityID.getSelectedIndex() + 1;
	}

	// setters
	public void setUpdateSubscriptionTypeName(String name) {
		updateSubscriptionTypeName.setText(name);
	}
	public void setUpdateSubscriptionTypePrice(String name) {
		updateSubscriptionTypePrice.setText(name);
	}
	public void setAmenitySubscriptionTypePrice(String name) {
		amenitySubscriptionTypeName.setText(name);
	}

	// button listeners
	public void memberBackButton(ActionListener actionListener) {
		this.subscriptionTypeBackButton.addActionListener(actionListener);
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

	public void addBackButton(ActionListener actionListener) {
		this.addBack.addActionListener(actionListener);
	}
	public void addSubscriptionTypeButton(ActionListener actionListener) {
		this.addSubscriptionType.addActionListener(actionListener);
	}
	public void deleteBackButton(ActionListener actionListener) {
		this.deleteBack.addActionListener(actionListener);
	}
	public void deleteSubscriptionTypeButton(ActionListener actionListener) {
		this.deleteSubscriptionType.addActionListener(actionListener);
	}
	public void updateBackButton1(ActionListener actionListener) {
		this.updateBack1.addActionListener(actionListener);
	}
	public void proceedUpdateButton(ActionListener actionListener) {
		this.proceedUpdate.addActionListener(actionListener);
	}
	public void updateBackButton2(ActionListener actionListener) {
		this.updateBack2.addActionListener(actionListener);
	}

	public void updateSubscriptionTypeButton(ActionListener actionListener) {
		this.updateSubscriptionType.addActionListener(actionListener);
	}
	public void goToAddAmenityButton(ActionListener actionListener) {
		this.goToAddAmenity.addActionListener(actionListener);
	}
	public void goToRemoveAmenityButton(ActionListener actionListener) {
		this.goToRemoveAmenity.addActionListener(actionListener);
	}
	public void goToReadAmenityButton(ActionListener actionListener) {
		this.goToReadAmenity.addActionListener(actionListener);
	}

	public void addAmenityBackButton(ActionListener actionListener) {
		this.addAmenityBack.addActionListener(actionListener);
	}
	public void addAmenityButton(ActionListener actionListener) {
		this.addAmenity.addActionListener(actionListener);
	}
	public void removeAmenityBackButton(ActionListener actionListener) {
		this.removeAmenityBack.addActionListener(actionListener);
	}
	public void removeAmenityButton(ActionListener actionListener) {
		this.removeAmenity.addActionListener(actionListener);
	}
	public void readAmenityBackButton(ActionListener actionListener) {
		this.readAmenityBack.addActionListener(actionListener);
	}
	public void readBackButton(ActionListener actionListener) {
		this.readBack.addActionListener(actionListener);
	}

	// set table model
	public void setMemberTable(Object[][] data) { 
		String[] columnNames = {"Subscription Type ID", "Subscription Type Name", "Subscription Type Price"};
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		subscriptionTypeTable.setModel(model);
	}

	public void setAmenityTable(Object[][] data) { 
		String[] columnNames = {"List of Amenities"};
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		amenityTable.setModel(model);
	}
}

