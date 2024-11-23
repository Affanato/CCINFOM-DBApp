import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;


/**
 * @author Diane
 */
public class MemberView {
	public MemberView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
		memberFrame = new JFrame();
		memberBackButton = new JButton();
		titleBar = new JFormattedTextField();
		goToAdd = new JButton();
		goToRead = new JButton();
		goToUpdate = new JButton();
		goToDelete = new JButton();
		background = new JLabel();
		addMemberFrame = new JFrame();
		lastnametext = new JFormattedTextField();
		sextext = new JFormattedTextField();
		firstnametext = new JFormattedTextField();
		birthdatetext = new JFormattedTextField();
		phonenumtext = new JFormattedTextField();
		streettext = new JFormattedTextField();
		barangaytext = new JFormattedTextField();
		citytext = new JFormattedTextField();
		provincetext = new JFormattedTextField();
		sex = new JComboBox<>();
		lastName = new JTextPane();
		firstName = new JTextPane();
		birthDate = new JTextPane();
		phoneNumber = new JTextPane();
		street = new JTextPane();
		barangay = new JTextPane();
		city = new JTextPane();
		province = new JTextPane();
		addBack = new JButton();
		editorPane1 = new JEditorPane();
		titleBar2 = new JFormattedTextField();
		addMember = new JButton();
		background2 = new JLabel();
		deleteMemberFrame = new JFrame();
		deleteMember = new JButton();
		memberidtext = new JFormattedTextField();
		memberid = new JComboBox<>();
		editorPane2 = new JEditorPane();
		deleteBack = new JButton();
		titleBar3 = new JFormattedTextField();
		background3 = new JLabel();
		readMemberFrame = new JFrame();
		readBack = new JButton();
		tablePane = new JScrollPane();
		memberTable = new JTable();
		titleBar4 = new JFormattedTextField();
		background4 = new JLabel();
		updateMemberFrame = new JFrame();
		lastnametext2 = new JFormattedTextField();
		sextext2 = new JFormattedTextField();
		firstnametext2 = new JFormattedTextField();
		birthdatetext2 = new JFormattedTextField();
		phonenumtext2 = new JFormattedTextField();
		streettext2 = new JFormattedTextField();
		barangaytext2 = new JFormattedTextField();
		citytext2 = new JFormattedTextField();
		provincetext2 = new JFormattedTextField();
		updateLastName = new JTextPane();
		updateSex = new JComboBox<>();
		updateFirstName = new JTextPane();
		updateBirthDate = new JTextPane();
		updatePhoneNumber = new JTextPane();
		updateStreet = new JTextPane();
		updateBarangay = new JTextPane();
		updateCity = new JTextPane();
		updateProvince = new JTextPane();
		updateBack = new JButton();
		editorPane3 = new JEditorPane();
		titleBar5 = new JFormattedTextField();
		updateMember = new JButton();
		background5 = new JLabel();
		updateMemberIDFrame = new JFrame();
		proceedUpdate = new JButton();
		updateMemberIDtext = new JFormattedTextField();
		updateMemberID = new JComboBox<>();
		editorPane4 = new JEditorPane();
		updateMemberIDBack = new JButton();
		titleBar6 = new JFormattedTextField();
		background6 = new JLabel();

		//======== memberFrame ========
		{
			Container memberFrameContentPane = memberFrame.getContentPane();
			memberFrameContentPane.setLayout(null);

			//---- memberBackButton ----
			memberBackButton.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			memberBackButton.setIcon(new ImageIcon("resource\\backButton.jpg"));
			memberBackButton.setBackground(new Color(0xc80f2e));
			memberFrameContentPane.add(memberBackButton);
			memberBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar ----
			titleBar.setText("Member");
			titleBar.setBackground(new Color(0xc80f2e));
			titleBar.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar.setForeground(Color.white);
			titleBar.setEditable(false);
			memberFrameContentPane.add(titleBar);
			titleBar.setBounds(0, 0, 1200, 55);

			//---- goToAdd ----
			goToAdd.setText("ADD MEMBER");
			goToAdd.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToAdd.setForeground(Color.white);
			goToAdd.setBackground(new Color(0x3ca3cb));
			memberFrameContentPane.add(goToAdd);
			goToAdd.setBounds(475, 180, 250, 55);

			//---- goToRead ----
			goToRead.setText("READ MEMBER");
			goToRead.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToRead.setForeground(Color.white);
			goToRead.setBackground(new Color(0x3ca3cb));
			memberFrameContentPane.add(goToRead);
			goToRead.setBounds(475, 270, 250, 55);

			//---- goToUpdate ----
			goToUpdate.setText("UPDATE MEMBER");
			goToUpdate.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToUpdate.setForeground(Color.white);
			goToUpdate.setBackground(new Color(0x3ca3cb));
			memberFrameContentPane.add(goToUpdate);
			goToUpdate.setBounds(475, 360, 250, 55);

			//---- goToDelete ----
			goToDelete.setText("DELETE MEMBER");
			goToDelete.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToDelete.setForeground(Color.white);
			goToDelete.setBackground(new Color(0x3ca3cb));
			memberFrameContentPane.add(goToDelete);
			goToDelete.setBounds(475, 450, 250, 55);

			//---- background ----
			background.setIcon(new ImageIcon("resource\\memberBG.jpg"));
			memberFrameContentPane.add(background);
			background.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < memberFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = memberFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = memberFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				memberFrameContentPane.setMinimumSize(preferredSize);
				memberFrameContentPane.setPreferredSize(preferredSize);
			}
			memberFrame.pack();  
			memberFrame.setSize(1200, 700);
			memberFrame.setLocationRelativeTo(null);
			memberFrame.setVisible(true);
		}

		//======== addMemberFrame ========
		{
			Container addMemberFrameContentPane = addMemberFrame.getContentPane();
			addMemberFrameContentPane.setLayout(null);

			//---- lastnametext ----
			lastnametext.setText("Last Name");
			lastnametext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			lastnametext.setEditable(false);
			addMemberFrameContentPane.add(lastnametext);
			lastnametext.setBounds(140, 200, 115, 35);

			//---- sextext ----
			sextext.setText("Sex");
			sextext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			sextext.setEditable(false);
			addMemberFrameContentPane.add(sextext);
			sextext.setBounds(875, 200, 60, 35);

			//---- firstnametext ----
			firstnametext.setText("First Name");
			firstnametext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			firstnametext.setEditable(false);
			addMemberFrameContentPane.add(firstnametext);
			firstnametext.setBounds(520, 200, 125, 35);

			//---- birthdatetext ----
			birthdatetext.setText("Birth Date");
			birthdatetext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			birthdatetext.setEditable(false);
			addMemberFrameContentPane.add(birthdatetext);
			birthdatetext.setBounds(255, 275, 115, 35);

			//---- phonenumtext ----
			phonenumtext.setText("Phone Number");
			phonenumtext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			phonenumtext.setBackground(new Color(0xf2f2f2));
			addMemberFrameContentPane.add(phonenumtext);
			phonenumtext.setBounds(635, 275, 125, 35);

			//---- streettext ----
			streettext.setText("Street");
			streettext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			streettext.setEditable(false);
			addMemberFrameContentPane.add(streettext);
			streettext.setBounds(255, 335, 115, 35);

			//---- barangaytext ----
			barangaytext.setText("Barangay");
			barangaytext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			barangaytext.setEditable(false);
			addMemberFrameContentPane.add(barangaytext);
			barangaytext.setBounds(635, 335, 125, 35);

			//---- citytext ----
			citytext.setText("City");
			citytext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			citytext.setEditable(false);
			addMemberFrameContentPane.add(citytext);
			citytext.setBounds(255, 395, 115, 35);

			//---- provincetext ----
			provincetext.setText("Province");
			provincetext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			provincetext.setEditable(false);
			addMemberFrameContentPane.add(provincetext);
			provincetext.setBounds(635, 395, 125, 35);

			//---- sex ----
			sex.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			sex.setModel(new DefaultComboBoxModel<>(Sex.getPossibleValues()));
			sex.setSelectedIndex(0);
			addMemberFrameContentPane.add(sex);
			sex.setBounds(950, 200, 120, 35);

			//---- lastName ----
			lastName.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addMemberFrameContentPane.add(lastName);
			lastName.setBounds(275, 200, 170, 35);

			//---- firstName ----
			firstName.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addMemberFrameContentPane.add(firstName);
			firstName.setBounds(665, 200, 170, 35);

			//---- birthDate ----
			birthDate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addMemberFrameContentPane.add(birthDate);
			birthDate.setBounds(390, 275, 170, 35);

			//---- phoneNumber ----
			phoneNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addMemberFrameContentPane.add(phoneNumber);
			phoneNumber.setBounds(780, 275, 170, 35);

			//---- street ----
			street.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addMemberFrameContentPane.add(street);
			street.setBounds(390, 335, 170, 35);

			//---- barangay ----
			barangay.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addMemberFrameContentPane.add(barangay);
			barangay.setBounds(780, 335, 170, 35);

			//---- city ----
			city.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addMemberFrameContentPane.add(city);
			city.setBounds(390, 395, 170, 35);

			//---- province ----
			province.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addMemberFrameContentPane.add(province);
			province.setBounds(780, 395, 170, 35);

			//---- addBack ----
			addBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			addBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			addBack.setBackground(new Color(0xc80f2e));
			addMemberFrameContentPane.add(addBack);
			addBack.setBounds(5, 5, 95, 45);

			//---- editorPane1 ----
			editorPane1.setBackground(new Color(0xb5b9b8));
			editorPane1.setEditable(false);
			addMemberFrameContentPane.add(editorPane1);
			editorPane1.setBounds(115, 170, 975, 315);

			//---- titleBar2 ----
			titleBar2.setText("Member: Add Member");
			titleBar2.setBackground(new Color(0xc80f2e));
			titleBar2.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar2.setForeground(Color.white);
			titleBar2.setEditable(false);
			addMemberFrameContentPane.add(titleBar2);
			titleBar2.setBounds(0, 0, 1200, 55);

			//---- addMember ----
			addMember.setText("ADD MEMBER");
			addMember.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			addMember.setForeground(Color.white);
			addMember.setBackground(new Color(0x3ca3cb));
			addMemberFrameContentPane.add(addMember);
			addMember.setBounds(475, 510, 250, 55);

			//---- background2 ----
			background2.setIcon(new ImageIcon("resource\\memberBG.jpg"));
			addMemberFrameContentPane.add(background2);
			background2.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < addMemberFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = addMemberFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = addMemberFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				addMemberFrameContentPane.setMinimumSize(preferredSize);
				addMemberFrameContentPane.setPreferredSize(preferredSize);
			}
			addMemberFrame.pack();
			addMemberFrame.setLocationRelativeTo(addMemberFrame.getOwner());
		}

		//======== deleteMemberFrame ========
		{
			Container deleteMemberFrameContentPane = deleteMemberFrame.getContentPane();
			deleteMemberFrameContentPane.setLayout(null);

			//---- deleteMember ----
			deleteMember.setText("DELETE MEMBER");
			deleteMember.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			deleteMember.setForeground(Color.white);
			deleteMember.setBackground(new Color(0x3ca3cb));
			deleteMemberFrameContentPane.add(deleteMember);
			deleteMember.setBounds(490, 395, 250, 55);

			//---- memberidtext ----
			memberidtext.setText("Select Member");
			memberidtext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			memberidtext.setEditable(false);
			memberidtext.setHorizontalAlignment(SwingConstants.CENTER);
			deleteMemberFrameContentPane.add(memberidtext);
			memberidtext.setBounds(370, 235, 485, 35);

			//---- memberid ----
			memberid.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			memberid.setModel(new DefaultComboBoxModel<>(new String[] {
				"test"
			}));
			deleteMemberFrameContentPane.add(memberid);
			memberid.setBounds(420, 320, 390, 40);

			//---- editorPane2 ----
			editorPane2.setBackground(new Color(0xb5b9b8));
			editorPane2.setEditable(false);
			deleteMemberFrameContentPane.add(editorPane2);
			editorPane2.setBounds(370, 235, 485, 240);

			//---- deleteBack ----
			deleteBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			deleteBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			deleteBack.setBackground(new Color(0xc80f2e));
			deleteMemberFrameContentPane.add(deleteBack);
			deleteBack.setBounds(5, 5, 95, 45);

			//---- titleBar3 ----
			titleBar3.setText("Member: Delete Member");
			titleBar3.setBackground(new Color(0xc80f2e));
			titleBar3.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar3.setForeground(Color.white);
			titleBar3.setEditable(false);
			deleteMemberFrameContentPane.add(titleBar3);
			titleBar3.setBounds(0, 0, 1200, 55);

			//---- background3 ----
			background3.setIcon(new ImageIcon("resource\\memberBG.jpg"));
			deleteMemberFrameContentPane.add(background3);
			background3.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < deleteMemberFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = deleteMemberFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = deleteMemberFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				deleteMemberFrameContentPane.setMinimumSize(preferredSize);
				deleteMemberFrameContentPane.setPreferredSize(preferredSize);
			}
			deleteMemberFrame.pack();
			deleteMemberFrame.setLocationRelativeTo(deleteMemberFrame.getOwner());
		}

		//======== readMemberFrame ========
		{
			Container readMemberFrameContentPane = readMemberFrame.getContentPane();
			readMemberFrameContentPane.setLayout(null);

			//---- readBack ----
			readBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			readBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			readBack.setBackground(new Color(0xc80f2e));
			readMemberFrameContentPane.add(readBack);
			readBack.setBounds(5, 5, 95, 45);

			//======== tablePane ========
			{

				//---- memberTable ----
				memberTable.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, "", null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null},
					},
					new String[] {
						"Member ID", "Last Name", "First Name", "Birth Date", "Sex", "Phone Number", "Street", "Barangay", "City", "Province"
					}
				));
				{
					TableColumnModel cm = memberTable.getColumnModel();
					cm.getColumn(0).setMinWidth(80);
					cm.getColumn(0).setMaxWidth(80);
					cm.getColumn(1).setMinWidth(150);
					cm.getColumn(2).setMinWidth(150);
					cm.getColumn(3).setMinWidth(150);
					cm.getColumn(4).setMinWidth(80);
					cm.getColumn(4).setMaxWidth(80);
					cm.getColumn(5).setMinWidth(120);
					cm.getColumn(6).setMinWidth(150);
					cm.getColumn(7).setMinWidth(150);
					cm.getColumn(8).setMinWidth(150);
					cm.getColumn(9).setMinWidth(150);
				}
				memberTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				memberTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				memberTable.setEnabled(false);
				tablePane.setViewportView(memberTable);
			}
			readMemberFrameContentPane.add(tablePane);
			tablePane.setBounds(105, 140, 970, 435);

			//---- titleBar4 ----
			titleBar4.setText("Member: Read Member");
			titleBar4.setBackground(new Color(0xc80f2e));
			titleBar4.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar4.setForeground(Color.white);
			titleBar4.setEditable(false);
			readMemberFrameContentPane.add(titleBar4);
			titleBar4.setBounds(0, 0, 1200, 55);

			//---- background4 ----
			background4.setIcon(new ImageIcon("resource\\memberBG.jpg"));
			readMemberFrameContentPane.add(background4);
			background4.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < readMemberFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = readMemberFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = readMemberFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				readMemberFrameContentPane.setMinimumSize(preferredSize);
				readMemberFrameContentPane.setPreferredSize(preferredSize);
			}
			readMemberFrame.pack();
			readMemberFrame.setLocationRelativeTo(readMemberFrame.getOwner());
		}

		//======== updateMemberFrame ========
		{
			Container updateMemberFrameContentPane = updateMemberFrame.getContentPane();
			updateMemberFrameContentPane.setLayout(null);

			//---- lastnametext2 ----
			lastnametext2.setText("Last Name");
			lastnametext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			lastnametext2.setEditable(false);
			updateMemberFrameContentPane.add(lastnametext2);
			lastnametext2.setBounds(140, 200, 115, 35);

			//---- sextext2 ----
			sextext2.setText("Sex");
			sextext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			sextext2.setEditable(false);
			updateMemberFrameContentPane.add(sextext2);
			sextext2.setBounds(875, 200, 60, 35);

			//---- firstnametext2 ----
			firstnametext2.setText("First Name");
			firstnametext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			firstnametext2.setEditable(false);
			updateMemberFrameContentPane.add(firstnametext2);
			firstnametext2.setBounds(520, 200, 125, 35);

			//---- birthdatetext2 ----
			birthdatetext2.setText("Birth Date");
			birthdatetext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			birthdatetext2.setEditable(false);
			updateMemberFrameContentPane.add(birthdatetext2);
			birthdatetext2.setBounds(250, 270, 115, 35);

			//---- phonenumtext2 ----
			phonenumtext2.setText("Phone Number");
			phonenumtext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			phonenumtext2.setBackground(new Color(0xf2f2f2));
			updateMemberFrameContentPane.add(phonenumtext2);
			phonenumtext2.setBounds(630, 270, 125, 35);

			//---- streettext2 ----
			streettext2.setText("Street");
			streettext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			streettext2.setEditable(false);
			updateMemberFrameContentPane.add(streettext2);
			streettext2.setBounds(250, 335, 115, 35);

			//---- barangaytext2 ----
			barangaytext2.setText("Barangay");
			barangaytext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			barangaytext2.setEditable(false);
			updateMemberFrameContentPane.add(barangaytext2);
			barangaytext2.setBounds(630, 335, 120, 35);

			//---- citytext2 ----
			citytext2.setText("City");
			citytext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			citytext2.setEditable(false);
			updateMemberFrameContentPane.add(citytext2);
			citytext2.setBounds(250, 400, 115, 35);

			//---- provincetext2 ----
			provincetext2.setText("Province");
			provincetext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			provincetext2.setEditable(false);
			updateMemberFrameContentPane.add(provincetext2);
			provincetext2.setBounds(630, 400, 120, 35);

			//---- updateLastName ----
			updateLastName.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateMemberFrameContentPane.add(updateLastName);
			updateLastName.setBounds(275, 200, 170, 35);

			//---- updateSex ----
			updateSex.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateSex.setModel(new DefaultComboBoxModel<>(Sex.getPossibleValues()));
			updateSex.setEditable(false);
			updateMemberFrameContentPane.add(updateSex);
			updateSex.setBounds(950, 200, 120, 35);

			//---- updateFirstName ----
			updateFirstName.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateFirstName.setEditable(false);
			updateMemberFrameContentPane.add(updateFirstName);
			updateFirstName.setBounds(670, 200, 170, 35);

			//---- updateBirthDate ----
			updateBirthDate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateBirthDate.setEditable(false);
			updateMemberFrameContentPane.add(updateBirthDate);
			updateBirthDate.setBounds(385, 270, 170, 35);

			//---- updatePhoneNumber ----
			updatePhoneNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateMemberFrameContentPane.add(updatePhoneNumber);
			updatePhoneNumber.setBounds(780, 270, 170, 35);

			//---- updateStreet ----
			updateStreet.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateMemberFrameContentPane.add(updateStreet);
			updateStreet.setBounds(385, 335, 170, 35);

			//---- updateBarangay ----
			updateBarangay.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateMemberFrameContentPane.add(updateBarangay);
			updateBarangay.setBounds(780, 335, 170, 35);

			//---- updateCity ----
			updateCity.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateMemberFrameContentPane.add(updateCity);
			updateCity.setBounds(385, 400, 170, 35);

			//---- updateProvince ----
			updateProvince.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateMemberFrameContentPane.add(updateProvince);
			updateProvince.setBounds(780, 400, 170, 35);

			//---- updateBack ----
			updateBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			updateBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			updateBack.setBackground(new Color(0xc80f2e));
			updateMemberFrameContentPane.add(updateBack);
			updateBack.setBounds(5, 5, 95, 45);

			//---- editorPane3 ----
			editorPane3.setBackground(new Color(0xb5b9b8));
			editorPane3.setEditable(false);
			updateMemberFrameContentPane.add(editorPane3);
			editorPane3.setBounds(115, 170, 975, 315);

			//---- titleBar5 ----
			titleBar5.setText("Member: Update Member");
			titleBar5.setBackground(new Color(0xc80f2e));
			titleBar5.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar5.setForeground(Color.white);
			titleBar5.setEditable(false);
			updateMemberFrameContentPane.add(titleBar5);
			titleBar5.setBounds(0, 0, 1200, 55);

			//---- updateMember ----
			updateMember.setText("UPDATE MEMBER");
			updateMember.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			updateMember.setForeground(Color.white);
			updateMember.setBackground(new Color(0x3ca3cb));
			updateMemberFrameContentPane.add(updateMember);
			updateMember.setBounds(475, 510, 250, 55);

			//---- background5 ----
			background5.setIcon(new ImageIcon("resource\\memberBG.jpg"));
			updateMemberFrameContentPane.add(background5);
			background5.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < updateMemberFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = updateMemberFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = updateMemberFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				updateMemberFrameContentPane.setMinimumSize(preferredSize);
				updateMemberFrameContentPane.setPreferredSize(preferredSize);
			}
			updateMemberFrame.pack();
			updateMemberFrame.setLocationRelativeTo(updateMemberFrame.getOwner());
		}

		//======== updateMemberIDFrame ========
		{
			Container updateMemberIDFrameContentPane = updateMemberIDFrame.getContentPane();
			updateMemberIDFrameContentPane.setLayout(null);

			//---- proceedUpdate ----
			proceedUpdate.setText("PROCEED");
			proceedUpdate.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			proceedUpdate.setForeground(Color.white);
			proceedUpdate.setBackground(new Color(0x3ca3cb));
			updateMemberIDFrameContentPane.add(proceedUpdate);
			proceedUpdate.setBounds(475, 390, 250, 55);

			//---- updateMemberIDtext ----
			updateMemberIDtext.setText("Member ID");
			updateMemberIDtext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updateMemberIDtext.setEditable(false);
			updateMemberIDtext.setHorizontalAlignment(SwingConstants.CENTER);
			updateMemberIDFrameContentPane.add(updateMemberIDtext);
			updateMemberIDtext.setBounds(355, 235, 485, 35);

			//---- updateMemberID ----
			updateMemberID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateMemberID.setModel(new DefaultComboBoxModel<>(new String[] {
				"test"
			}));
			updateMemberIDFrameContentPane.add(updateMemberID);
			updateMemberID.setBounds(410, 315, 390, 40);

			//---- editorPane4 ----
			editorPane4.setBackground(new Color(0xb5b9b8));
			editorPane4.setEditable(false);
			updateMemberIDFrameContentPane.add(editorPane4);
			editorPane4.setBounds(355, 235, 485, 240);

			//---- updateMemberIDBack ----
			updateMemberIDBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			updateMemberIDBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			updateMemberIDBack.setBackground(new Color(0xc80f2e));
			updateMemberIDFrameContentPane.add(updateMemberIDBack);
			updateMemberIDBack.setBounds(5, 5, 95, 45);

			//---- titleBar6 ----
			titleBar6.setText("Member: Update Member");
			titleBar6.setBackground(new Color(0xc80f2e));
			titleBar6.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar6.setForeground(Color.white);
			titleBar6.setEditable(false);
			updateMemberIDFrameContentPane.add(titleBar6);
			titleBar6.setBounds(0, 0, 1200, 55);

			//---- background6 ----
			background6.setIcon(new ImageIcon("resource\\memberBG.jpg"));
			updateMemberIDFrameContentPane.add(background6);
			background6.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < updateMemberIDFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = updateMemberIDFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = updateMemberIDFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				updateMemberIDFrameContentPane.setMinimumSize(preferredSize);
				updateMemberIDFrameContentPane.setPreferredSize(preferredSize);
			}
			updateMemberIDFrame.pack();
			updateMemberIDFrame.setLocationRelativeTo(updateMemberIDFrame.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
	private JFrame memberFrame;
	private JButton memberBackButton;
	private JFormattedTextField titleBar;
	private JButton goToAdd;
	private JButton goToRead;
	private JButton goToUpdate;
	private JButton goToDelete;
	private JLabel background;
	private JFrame addMemberFrame;
	private JFormattedTextField lastnametext;
	private JFormattedTextField sextext;
	private JFormattedTextField firstnametext;
	private JFormattedTextField birthdatetext;
	private JFormattedTextField phonenumtext;
	private JFormattedTextField streettext;
	private JFormattedTextField barangaytext;
	private JFormattedTextField citytext;
	private JFormattedTextField provincetext;
	private JComboBox<String> sex;
	private JTextPane lastName;
	private JTextPane firstName;
	private JTextPane birthDate;
	private JTextPane phoneNumber;
	private JTextPane street;
	private JTextPane barangay;
	private JTextPane city;
	private JTextPane province;
	private JButton addBack;
	private JEditorPane editorPane1;
	private JFormattedTextField titleBar2;
	private JButton addMember;
	private JLabel background2;
	private JFrame deleteMemberFrame;
	private JButton deleteMember;
	private JFormattedTextField memberidtext;
	private JComboBox<String> memberid;
	private JEditorPane editorPane2;
	private JButton deleteBack;
	private JFormattedTextField titleBar3;
	private JLabel background3;
	private JFrame readMemberFrame;
	private JButton readBack;
	private JScrollPane tablePane;
	private JTable memberTable;
	private JFormattedTextField titleBar4;
	private JLabel background4;
	private JFrame updateMemberFrame;
	private JFormattedTextField lastnametext2;
	private JFormattedTextField sextext2;
	private JFormattedTextField firstnametext2;
	private JFormattedTextField birthdatetext2;
	private JFormattedTextField phonenumtext2;
	private JFormattedTextField streettext2;
	private JFormattedTextField barangaytext2;
	private JFormattedTextField citytext2;
	private JFormattedTextField provincetext2;
	private JTextPane updateLastName;
	private JComboBox<String> updateSex;
	private JTextPane updateFirstName;
	private JTextPane updateBirthDate;
	private JTextPane updatePhoneNumber;
	private JTextPane updateStreet;
	private JTextPane updateBarangay;
	private JTextPane updateCity;
	private JTextPane updateProvince;
	private JButton updateBack;
	private JEditorPane editorPane3;
	private JFormattedTextField titleBar5;
	private JButton updateMember;
	private JLabel background5;
	private JFrame updateMemberIDFrame;
	private JButton proceedUpdate;
	private JFormattedTextField updateMemberIDtext;
	private JComboBox<String> updateMemberID;
	private JEditorPane editorPane4;
	private JButton updateMemberIDBack;
	private JFormattedTextField titleBar6;
	private JLabel background6;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


	// jcombobox getters
	public JComboBox<String> getUpdateMemberIDJComboBox() {
		return this.updateMemberID;
	}
	public JComboBox<String> getMemberIDJComboBox() {
		return this.memberid;
	}

	// getters
	public JFrame getMemberFrame() {
		return this.memberFrame;
	}
	public JFrame getAddMemberFrame() {
		return this.addMemberFrame;
	}
	public JFrame getDeleteMemberFrame() {
		return this.deleteMemberFrame;
	}
	public JFrame getReadMemberFrame() {
		return this.readMemberFrame;
	}
	public JFrame getUpdateMemberFrame() {
		return this.updateMemberFrame;
	}
	public JFrame getUpdateMemberIDFrame() {
		return this.updateMemberIDFrame;
	}
	
	// get from add members
	public String getLastName() {
		return this.lastName.getText();
	}

	public String getSex() {
		return (String) this.sex.getSelectedItem();
	}
	
	public String getFirstName() {
		return this.firstName.getText();
	}

	public String getBirthDate() {
		return this.birthDate.getText();
	}

	public String getPhoneNumber() {
		return this.phoneNumber.getText();
	}

	public String getStreet() {
		return this.street.getText();
	}

	public String getBarangay() {
		return this.barangay.getText();
	}

	public String getCity() {
		return this.city.getText();
	}

	public String getProvince() {
		return this.province.getText();
	}

	public int getMemberID() {
		return this.memberid.getSelectedIndex() + 1;
	}

	// get from update members
	public String getUpdateLastName() {
		return this.updateLastName.getText();
	}

	public String getUpdatePhoneNumber() {
		return this.updatePhoneNumber.getText();
	}

	public String getUpdateStreet() {
		return this.updateStreet.getText();
	}

	public String getUpdateBarangay() {
		return this.updateBarangay.getText();
	}

	public String getUpdateCity() {
		return this.updateCity.getText();
	}

	public String getUpdateProvince() {
		return this.updateProvince.getText();
	}

	public int getUpdateMemberID() {
		return this.updateMemberID.getSelectedIndex() + 1;
	}

	// set fixed fields
	public void setUpdateFirstName(String name) {
		this.updateFirstName.setText(name);
	}

	public void setUpdateSex(String sex) {
		this.updateSex.setSelectedItem(sex);
	}

	public void setUpdateBirthDate(String date) {
		this.updateBirthDate.setText(date);
	}

	// set editabe fields
	public void setUpdateLastName(String name) {
		this.updateLastName.setText(name);
	}

	public void getUpdatePhoneNumber(String number) {
		this.updatePhoneNumber.setText(number);
	}

	public void getUpdateStreet(String street) {
		this.updateStreet.setText(street);
	}

	public void getUpdateBarangay(String barangay) {
		this.updateBarangay.setText(barangay);
	}

	public void getUpdateCity(String city) {
		this.updateCity.setText(city);
	}

	public void getUpdateProvince(String province) {
		this.updateProvince.setText(province);
	}

	// button listeners
	public void memberBackButton(ActionListener actionListener) {
		this.memberBackButton.addActionListener(actionListener);
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
	public void addMemberButton(ActionListener actionListener) {
		this.addMember.addActionListener(actionListener);
	}
	public void deleteBackButton(ActionListener actionListener) {
		this.deleteBack.addActionListener(actionListener);
	}
	public void deleteMemberButton(ActionListener actionListener) {
		this.deleteMember.addActionListener(actionListener);
	}
	public void readBackButton(ActionListener actionListener) {
		this.readBack.addActionListener(actionListener);
	}

	public void updateMemberIDBackButton(ActionListener actionListener) {
		this.updateMemberIDBack.addActionListener(actionListener);
	}
	public void proceedUpdateButton(ActionListener actionListener) {
		this.proceedUpdate.addActionListener(actionListener);
	}
	public void updateBackButton(ActionListener actionListener) {
		this.updateBack.addActionListener(actionListener);
	}
	public void updateMemberButton(ActionListener actionListener) {
		this.updateMember.addActionListener(actionListener);
	}

	// set table model
	public void setMemberTable(Object[][] data) { 
		String[] columnNames = {"Member ID", "Last Name", "First Name", "Birth Date", "Sex", "Phone Number", "Street", "Barangay", "City", "Province"};
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		memberTable.setModel(model);

		{
			TableColumnModel cm = memberTable.getColumnModel();
			cm.getColumn(0).setMinWidth(80);
			cm.getColumn(0).setMaxWidth(80);
			cm.getColumn(1).setMinWidth(150);
			cm.getColumn(2).setMinWidth(150);
			cm.getColumn(3).setMinWidth(150);
			cm.getColumn(4).setMinWidth(80);
			cm.getColumn(4).setMaxWidth(80);
			cm.getColumn(5).setMinWidth(120);
			cm.getColumn(6).setMinWidth(150);
			cm.getColumn(7).setMinWidth(150);
			cm.getColumn(8).setMinWidth(150);
			cm.getColumn(9).setMinWidth(150);
		}
	}
}
