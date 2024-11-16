import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Thu Nov 14 23:39:10 PST 2024
 */



/**
 * @author Diane
 */
public class TrainerView {
	public TrainerView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
		trainerFrame = new JFrame();
		trainerBackButton = new JButton();
		titleBar = new JFormattedTextField();
		goToAdd = new JButton();
		goToRead = new JButton();
		goToUpdate = new JButton();
		goToDelete = new JButton();
		goToUpdateStatus = new JButton();
		background = new JLabel();
		addTrainerFrame = new JFrame();
		addBack = new JButton();
		titleBar2 = new JFormattedTextField();
		lastnametext = new JFormattedTextField();
		firstnametext = new JFormattedTextField();
		birthdatetext = new JFormattedTextField();
		phonenumtext = new JFormattedTextField();
		lastName = new JTextPane();
		firstName = new JTextPane();
		birthDate = new JTextPane();
		phoneNumber = new JTextPane();
		availability = new JTextPane();
		availabilitytext = new JFormattedTextField();
		speciality = new JTextPane();
		specialitytext = new JFormattedTextField();
		citytext = new JFormattedTextField();
		city = new JTextPane();
		street = new JTextPane();
		streettext = new JFormattedTextField();
		barangaytext = new JFormattedTextField();
		provincetext = new JFormattedTextField();
		barangay = new JTextPane();
		province = new JTextPane();
		sextext = new JFormattedTextField();
		sex = new JTextPane();
		startdatetext = new JFormattedTextField();
		startdate = new JTextPane();
		editorPane1 = new JEditorPane();
		addTrainer = new JButton();
		background2 = new JLabel();
		deleteTrainerFrame = new JFrame();
		deleteBack = new JButton();
		deleteTrainer = new JButton();
		traineridtext = new JFormattedTextField();
		trainerID = new JComboBox();
		editorPane2 = new JEditorPane();
		titleBar3 = new JFormattedTextField();
		background3 = new JLabel();
		readTrainerFrame = new JFrame();
		readBack = new JButton();
		tablePane = new JScrollPane();
		trainerTable = new JTable();
		titleBar4 = new JFormattedTextField();
		background4 = new JLabel();
		updateStatusFrame = new JFrame();
		updateStatusBack = new JButton();
		updateStatus = new JButton();
		updatetrainerstatustext = new JFormattedTextField();
		updatestatustext = new JFormattedTextField();
		updateStatusTrainerID = new JComboBox();
		updateTrainerStatus = new JComboBox();
		editorPane3 = new JEditorPane();
		titleBar5 = new JFormattedTextField();
		background5 = new JLabel();
		updateTrainerFrame = new JFrame();
		updateBack = new JButton();
		titleBar6 = new JFormattedTextField();
		updatelastnametext = new JFormattedTextField();
		updatefirstnametext = new JFormattedTextField();
		upatebirthdatetext = new JFormattedTextField();
		updatephonenumbertext = new JFormattedTextField();
		updateLastName = new JTextPane();
		updateFirstname = new JTextPane();
		updateBirthDate = new JTextPane();
		updatePhoneNumber = new JTextPane();
		updateAvailability = new JTextPane();
		updateavailabilitytext = new JFormattedTextField();
		updateSpeciality = new JTextPane();
		updatespecialitytext = new JFormattedTextField();
		updatecitytext = new JFormattedTextField();
		updateCity = new JTextPane();
		updateStreet = new JTextPane();
		updatestreettext = new JFormattedTextField();
		updatebarangaytext = new JFormattedTextField();
		updateprovincetext = new JFormattedTextField();
		updateBarangay = new JTextPane();
		updateProvince = new JTextPane();
		updatesextext = new JFormattedTextField();
		updateSex = new JTextPane();
		updatestartdatetext = new JFormattedTextField();
		updateStartDate = new JTextPane();
		editorPane4 = new JEditorPane();
		updateTrainer = new JButton();
		background6 = new JLabel();

		//======== trainerFrame ========
		{
			Container trainerFrameContentPane = trainerFrame.getContentPane();
			trainerFrameContentPane.setLayout(null);

			//---- trainerBackButton ----
			trainerBackButton.setSelectedIcon(new ImageIcon("resources\\backButton.jpg"));
			trainerBackButton.setIcon(new ImageIcon("resource\\backButton.jpg"));
			trainerBackButton.setBackground(new Color(0xc80f2e));
			trainerFrameContentPane.add(trainerBackButton);
			trainerBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar ----
			titleBar.setText("Trainer");
			titleBar.setBackground(new Color(0xc80f2e));
			titleBar.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar.setForeground(Color.white);
			trainerFrameContentPane.add(titleBar);
			titleBar.setBounds(0, 0, 1200, 55);

			//---- goToAdd ----
			goToAdd.setText("ADD TRAINER");
			goToAdd.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToAdd.setForeground(Color.white);
			goToAdd.setBackground(new Color(0x3ca3cb));
			trainerFrameContentPane.add(goToAdd);
			goToAdd.setBounds(305, 200, 250, 55);

			//---- goToRead ----
			goToRead.setText("READ TRAINER");
			goToRead.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToRead.setForeground(Color.white);
			goToRead.setBackground(new Color(0x3ca3cb));
			trainerFrameContentPane.add(goToRead);
			goToRead.setBounds(655, 200, 250, 55);

			//---- goToUpdate ----
			goToUpdate.setText("UPDATE TRAINER");
			goToUpdate.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToUpdate.setForeground(Color.white);
			goToUpdate.setBackground(new Color(0x3ca3cb));
			trainerFrameContentPane.add(goToUpdate);
			goToUpdate.setBounds(305, 300, 250, 55);

			//---- goToDelete ----
			goToDelete.setText("DELETE TRAINER");
			goToDelete.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToDelete.setForeground(Color.white);
			goToDelete.setBackground(new Color(0x3ca3cb));
			trainerFrameContentPane.add(goToDelete);
			goToDelete.setBounds(655, 300, 250, 55);

			//---- goToUpdateStatus ----
			goToUpdateStatus.setText("UPDATE TRAINER STATUS");
			goToUpdateStatus.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToUpdateStatus.setForeground(Color.white);
			goToUpdateStatus.setBackground(new Color(0x3ca3cb));
			trainerFrameContentPane.add(goToUpdateStatus);
			goToUpdateStatus.setBounds(485, 405, 250, 55);

			//---- background ----
			background.setIcon(new ImageIcon("resource\\trainersbg.jpg"));
			trainerFrameContentPane.add(background);
			background.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < trainerFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = trainerFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = trainerFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				trainerFrameContentPane.setMinimumSize(preferredSize);
				trainerFrameContentPane.setPreferredSize(preferredSize);
			}
			trainerFrame.pack();  
			trainerFrame.setSize(1200, 700);
			trainerFrame.setLocationRelativeTo(null);
			trainerFrame.setVisible(true);
		}

		//======== addTrainerFrame ========
		{
			Container addTrainerFrameContentPane = addTrainerFrame.getContentPane();
			addTrainerFrameContentPane.setLayout(null);

			//---- addBack ----
			addBack.setSelectedIcon(new ImageIcon("resources\\backButton.jpg"));
			addBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			addBack.setBackground(new Color(0xc80f2e));
			addTrainerFrameContentPane.add(addBack);
			addBack.setBounds(5, 5, 95, 45);

			//---- titleBar2 ----
			titleBar2.setText("Trainer: Add Trainer");
			titleBar2.setBackground(new Color(0xc80f2e));
			titleBar2.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar2.setForeground(Color.white);
			addTrainerFrameContentPane.add(titleBar2);
			titleBar2.setBounds(0, 0, 1200, 55);

			//---- lastnametext ----
			lastnametext.setText("Last Name");
			lastnametext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			lastnametext.setEditable(false);
			addTrainerFrameContentPane.add(lastnametext);
			lastnametext.setBounds(130, 150, 110, 35);

			//---- firstnametext ----
			firstnametext.setText("First Name");
			firstnametext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			firstnametext.setEditable(false);
			addTrainerFrameContentPane.add(firstnametext);
			firstnametext.setBounds(480, 150, 125, 35);

			//---- birthdatetext ----
			birthdatetext.setText("Birth Date");
			birthdatetext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			birthdatetext.setEditable(false);
			addTrainerFrameContentPane.add(birthdatetext);
			birthdatetext.setBounds(130, 210, 110, 35);

			//---- phonenumtext ----
			phonenumtext.setText("Phone Number");
			phonenumtext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			phonenumtext.setEditable(false);
			addTrainerFrameContentPane.add(phonenumtext);
			phonenumtext.setBounds(480, 210, 125, 35);

			//---- lastName ----
			lastName.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addTrainerFrameContentPane.add(lastName);
			lastName.setBounds(265, 150, 170, 35);

			//---- firstName ----
			firstName.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addTrainerFrameContentPane.add(firstName);
			firstName.setBounds(630, 150, 170, 35);

			//---- birthDate ----
			birthDate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addTrainerFrameContentPane.add(birthDate);
			birthDate.setBounds(265, 210, 170, 35);

			//---- phoneNumber ----
			phoneNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addTrainerFrameContentPane.add(phoneNumber);
			phoneNumber.setBounds(630, 210, 170, 35);

			//---- availability ----
			availability.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addTrainerFrameContentPane.add(availability);
			availability.setBounds(785, 410, 170, 35);

			//---- availabilitytext ----
			availabilitytext.setText("Availability");
			availabilitytext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			availabilitytext.setEditable(false);
			addTrainerFrameContentPane.add(availabilitytext);
			availabilitytext.setBounds(630, 410, 125, 35);

			//---- speciality ----
			speciality.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addTrainerFrameContentPane.add(speciality);
			speciality.setBounds(375, 410, 170, 35);

			//---- specialitytext ----
			specialitytext.setText("Speciality");
			specialitytext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			specialitytext.setEditable(false);
			addTrainerFrameContentPane.add(specialitytext);
			specialitytext.setBounds(240, 410, 110, 35);

			//---- citytext ----
			citytext.setText("City");
			citytext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			citytext.setEditable(false);
			addTrainerFrameContentPane.add(citytext);
			citytext.setBounds(240, 350, 110, 35);

			//---- city ----
			city.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addTrainerFrameContentPane.add(city);
			city.setBounds(375, 350, 170, 35);

			//---- street ----
			street.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addTrainerFrameContentPane.add(street);
			street.setBounds(375, 285, 170, 35);

			//---- streettext ----
			streettext.setText("Street");
			streettext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			streettext.setEditable(false);
			addTrainerFrameContentPane.add(streettext);
			streettext.setBounds(240, 285, 110, 35);

			//---- barangaytext ----
			barangaytext.setText("Barangay");
			barangaytext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			barangaytext.setEditable(false);
			addTrainerFrameContentPane.add(barangaytext);
			barangaytext.setBounds(630, 285, 125, 35);

			//---- provincetext ----
			provincetext.setText("Province");
			provincetext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			provincetext.setEditable(false);
			addTrainerFrameContentPane.add(provincetext);
			provincetext.setBounds(630, 350, 125, 35);

			//---- barangay ----
			barangay.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addTrainerFrameContentPane.add(barangay);
			barangay.setBounds(785, 285, 170, 35);

			//---- province ----
			province.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addTrainerFrameContentPane.add(province);
			province.setBounds(785, 350, 170, 35);

			//---- sextext ----
			sextext.setText("Sex");
			sextext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			sextext.setEditable(false);
			addTrainerFrameContentPane.add(sextext);
			sextext.setBounds(840, 150, 100, 35);

			//---- sex ----
			sex.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addTrainerFrameContentPane.add(sex);
			sex.setBounds(960, 150, 55, 35);

			//---- startdatetext ----
			startdatetext.setText("Start Date");
			startdatetext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			startdatetext.setEditable(false);
			addTrainerFrameContentPane.add(startdatetext);
			startdatetext.setBounds(840, 210, 100, 35);

			//---- startdate ----
			startdate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addTrainerFrameContentPane.add(startdate);
			startdate.setBounds(955, 210, 110, 35);

			//---- editorPane1 ----
			editorPane1.setBackground(new Color(0xb5b9b8));
			editorPane1.setEditable(false);
			addTrainerFrameContentPane.add(editorPane1);
			editorPane1.setBounds(95, 115, 1000, 375);

			//---- addTrainer ----
			addTrainer.setText("ADD TRAINER");
			addTrainer.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			addTrainer.setForeground(Color.white);
			addTrainer.setBackground(new Color(0x3ca3cb));
			addTrainerFrameContentPane.add(addTrainer);
			addTrainer.setBounds(490, 515, 250, 55);

			//---- background2 ----
			background2.setIcon(new ImageIcon("resource\\trainersbg.jpg"));
			addTrainerFrameContentPane.add(background2);
			background2.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < addTrainerFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = addTrainerFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = addTrainerFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				addTrainerFrameContentPane.setMinimumSize(preferredSize);
				addTrainerFrameContentPane.setPreferredSize(preferredSize);
			}
			addTrainerFrame.pack();
			addTrainerFrame.setLocationRelativeTo(addTrainerFrame.getOwner());
		}

		//======== deleteTrainerFrame ========
		{
			Container deleteTrainerFrameContentPane = deleteTrainerFrame.getContentPane();
			deleteTrainerFrameContentPane.setLayout(null);

			//---- deleteBack ----
			deleteBack.setSelectedIcon(new ImageIcon("resources\\backButton.jpg"));
			deleteBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			deleteBack.setBackground(new Color(0xc80f2e));
			deleteTrainerFrameContentPane.add(deleteBack);
			deleteBack.setBounds(5, 5, 95, 45);

			//---- deleteTrainer ----
			deleteTrainer.setText("DELETE TRAINER");
			deleteTrainer.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			deleteTrainer.setForeground(Color.white);
			deleteTrainer.setBackground(new Color(0x3ca3cb));
			deleteTrainerFrameContentPane.add(deleteTrainer);
			deleteTrainer.setBounds(470, 365, 250, 55);

			//---- traineridtext ----
			traineridtext.setText("Select Trainer");
			traineridtext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			traineridtext.setEditable(false);
			traineridtext.setHorizontalAlignment(SwingConstants.CENTER);
			deleteTrainerFrameContentPane.add(traineridtext);
			traineridtext.setBounds(350, 220, 495, 35);

			//---- trainerID ----
			trainerID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			deleteTrainerFrameContentPane.add(trainerID);
			trainerID.setBounds(395, 305, 405, 35);

			//---- editorPane2 ----
			editorPane2.setBackground(new Color(0xb5b9b8));
			editorPane2.setEditable(false);
			deleteTrainerFrameContentPane.add(editorPane2);
			editorPane2.setBounds(350, 220, 495, 240);

			//---- titleBar3 ----
			titleBar3.setText("Trainer: Delete Trainer");
			titleBar3.setBackground(new Color(0xc80f2e));
			titleBar3.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar3.setForeground(Color.white);
			deleteTrainerFrameContentPane.add(titleBar3);
			titleBar3.setBounds(0, 0, 1200, 55);

			//---- background3 ----
			background3.setIcon(new ImageIcon("resource\\trainersbg.jpg"));
			deleteTrainerFrameContentPane.add(background3);
			background3.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < deleteTrainerFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = deleteTrainerFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = deleteTrainerFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				deleteTrainerFrameContentPane.setMinimumSize(preferredSize);
				deleteTrainerFrameContentPane.setPreferredSize(preferredSize);
			}
			deleteTrainerFrame.pack();
			deleteTrainerFrame.setLocationRelativeTo(deleteTrainerFrame.getOwner());
		}

		//======== readTrainerFrame ========
		{
			Container readTrainerFrameContentPane = readTrainerFrame.getContentPane();
			readTrainerFrameContentPane.setLayout(null);

			//---- readBack ----
			readBack.setSelectedIcon(new ImageIcon("resources\\backButton.jpg"));
			readBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			readBack.setBackground(new Color(0xc80f2e));
			readTrainerFrameContentPane.add(readBack);
			readBack.setBounds(5, 5, 95, 45);

			//======== tablePane ========
			{

				//---- trainerTable ----
				trainerTable.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, "", null, null, ""},
						{null, null, null, null, null, null, null},
					},
					new String[] {
						"Member ID", "Last Name", "First Name", "Specialty", "Availability", "Start Date", "End Date"
					}
				));
				{
					TableColumnModel cm = trainerTable.getColumnModel();
					cm.getColumn(0).setMaxWidth(80);
					cm.getColumn(3).setMinWidth(150);
					cm.getColumn(3).setMaxWidth(220);
					cm.getColumn(4).setMinWidth(150);
					cm.getColumn(4).setMaxWidth(150);
					cm.getColumn(5).setMinWidth(120);
					cm.getColumn(5).setMaxWidth(160);
					cm.getColumn(6).setMinWidth(120);
					cm.getColumn(6).setMaxWidth(160);
				}
				tablePane.setViewportView(trainerTable);
			}
			readTrainerFrameContentPane.add(tablePane);
			tablePane.setBounds(105, 140, 970, 435);

			//---- titleBar4 ----
			titleBar4.setText("Trainer: Read Trainer");
			titleBar4.setBackground(new Color(0xc80f2e));
			titleBar4.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar4.setForeground(Color.white);
			readTrainerFrameContentPane.add(titleBar4);
			titleBar4.setBounds(0, 0, 1200, 55);

			//---- background4 ----
			background4.setIcon(new ImageIcon("resource\\trainersbg.jpg"));
			readTrainerFrameContentPane.add(background4);
			background4.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < readTrainerFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = readTrainerFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = readTrainerFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				readTrainerFrameContentPane.setMinimumSize(preferredSize);
				readTrainerFrameContentPane.setPreferredSize(preferredSize);
			}
			readTrainerFrame.pack();
			readTrainerFrame.setLocationRelativeTo(readTrainerFrame.getOwner());
		}

		//======== updateStatusFrame ========
		{
			Container updateStatusFrameContentPane = updateStatusFrame.getContentPane();
			updateStatusFrameContentPane.setLayout(null);

			//---- updateStatusBack ----
			updateStatusBack.setSelectedIcon(new ImageIcon("resources\\backButton.jpg"));
			updateStatusBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			updateStatusBack.setBackground(new Color(0xc80f2e));
			updateStatusFrameContentPane.add(updateStatusBack);
			updateStatusBack.setBounds(5, 5, 95, 45);

			//---- updateStatus ----
			updateStatus.setText("UPDATE STATUS");
			updateStatus.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			updateStatus.setForeground(Color.white);
			updateStatus.setBackground(new Color(0x3ca3cb));
			updateStatusFrameContentPane.add(updateStatus);
			updateStatus.setBounds(470, 380, 250, 55);

			//---- updatetrainerstatustext ----
			updatetrainerstatustext.setText("Select Trainer");
			updatetrainerstatustext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updatetrainerstatustext.setEditable(false);
			updatetrainerstatustext.setHorizontalAlignment(SwingConstants.LEFT);
			updateStatusFrameContentPane.add(updatetrainerstatustext);
			updatetrainerstatustext.setBounds(370, 250, 135, 35);

			//---- updatestatustext ----
			updatestatustext.setText("Update Status");
			updatestatustext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updatestatustext.setEditable(false);
			updatestatustext.setHorizontalAlignment(SwingConstants.LEFT);
			updateStatusFrameContentPane.add(updatestatustext);
			updatestatustext.setBounds(370, 310, 135, 35);

			//---- updateStatusTrainerID ----
			updateStatusTrainerID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateStatusFrameContentPane.add(updateStatusTrainerID);
			updateStatusTrainerID.setBounds(525, 250, 295, 35);

			//---- updateTrainerStatus ----
			updateTrainerStatus.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateStatusFrameContentPane.add(updateTrainerStatus);
			updateTrainerStatus.setBounds(525, 310, 295, 35);

			//---- editorPane3 ----
			editorPane3.setBackground(new Color(0xb5b9b8));
			editorPane3.setEditable(false);
			updateStatusFrameContentPane.add(editorPane3);
			editorPane3.setBounds(350, 220, 495, 240);

			//---- titleBar5 ----
			titleBar5.setText("Trainer: Update Trainer Status");
			titleBar5.setBackground(new Color(0xc80f2e));
			titleBar5.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar5.setForeground(Color.white);
			updateStatusFrameContentPane.add(titleBar5);
			titleBar5.setBounds(0, 0, 1200, 55);

			//---- background5 ----
			background5.setIcon(new ImageIcon("resource\\trainersbg.jpg"));
			updateStatusFrameContentPane.add(background5);
			background5.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < updateStatusFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = updateStatusFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = updateStatusFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				updateStatusFrameContentPane.setMinimumSize(preferredSize);
				updateStatusFrameContentPane.setPreferredSize(preferredSize);
			}
			updateStatusFrame.pack();
			updateStatusFrame.setLocationRelativeTo(updateStatusFrame.getOwner());
		}

		//======== updateTrainerFrame ========
		{
			Container updateTrainerFrameContentPane = updateTrainerFrame.getContentPane();
			updateTrainerFrameContentPane.setLayout(null);

			//---- updateBack ----
			updateBack.setSelectedIcon(new ImageIcon("resources\\backButton.jpg"));
			updateBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			updateBack.setBackground(new Color(0xc80f2e));
			updateTrainerFrameContentPane.add(updateBack);
			updateBack.setBounds(5, 5, 95, 45);

			//---- titleBar6 ----
			titleBar6.setText("Trainer: Update Trainer");
			titleBar6.setBackground(new Color(0xc80f2e));
			titleBar6.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar6.setForeground(Color.white);
			updateTrainerFrameContentPane.add(titleBar6);
			titleBar6.setBounds(0, 0, 1200, 55);

			//---- updatelastnametext ----
			updatelastnametext.setText("Last Name");
			updatelastnametext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updatelastnametext.setEditable(false);
			updateTrainerFrameContentPane.add(updatelastnametext);
			updatelastnametext.setBounds(130, 150, 110, 35);

			//---- updatefirstnametext ----
			updatefirstnametext.setText("First Name");
			updatefirstnametext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updatefirstnametext.setEditable(false);
			updateTrainerFrameContentPane.add(updatefirstnametext);
			updatefirstnametext.setBounds(480, 150, 125, 35);

			//---- upatebirthdatetext ----
			upatebirthdatetext.setText("Birth Date");
			upatebirthdatetext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			upatebirthdatetext.setEditable(false);
			updateTrainerFrameContentPane.add(upatebirthdatetext);
			upatebirthdatetext.setBounds(130, 210, 110, 35);

			//---- updatephonenumbertext ----
			updatephonenumbertext.setText("Phone Number");
			updatephonenumbertext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updatephonenumbertext.setEditable(false);
			updateTrainerFrameContentPane.add(updatephonenumbertext);
			updatephonenumbertext.setBounds(480, 210, 125, 35);

			//---- updateLastName ----
			updateLastName.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateTrainerFrameContentPane.add(updateLastName);
			updateLastName.setBounds(265, 150, 170, 35);

			//---- updateFirstname ----
			updateFirstname.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateFirstname.setEditable(false);
			updateTrainerFrameContentPane.add(updateFirstname);
			updateFirstname.setBounds(630, 150, 170, 35);

			//---- updateBirthDate ----
			updateBirthDate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateBirthDate.setEditable(false);
			updateTrainerFrameContentPane.add(updateBirthDate);
			updateBirthDate.setBounds(265, 210, 170, 35);

			//---- updatePhoneNumber ----
			updatePhoneNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateTrainerFrameContentPane.add(updatePhoneNumber);
			updatePhoneNumber.setBounds(630, 210, 170, 35);

			//---- updateAvailability ----
			updateAvailability.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateTrainerFrameContentPane.add(updateAvailability);
			updateAvailability.setBounds(785, 410, 170, 35);

			//---- updateavailabilitytext ----
			updateavailabilitytext.setText("Availability");
			updateavailabilitytext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updateavailabilitytext.setEditable(false);
			updateTrainerFrameContentPane.add(updateavailabilitytext);
			updateavailabilitytext.setBounds(630, 410, 125, 35);

			//---- updateSpeciality ----
			updateSpeciality.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateTrainerFrameContentPane.add(updateSpeciality);
			updateSpeciality.setBounds(375, 410, 170, 35);

			//---- updatespecialitytext ----
			updatespecialitytext.setText("Speciality");
			updatespecialitytext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updatespecialitytext.setEditable(false);
			updateTrainerFrameContentPane.add(updatespecialitytext);
			updatespecialitytext.setBounds(240, 410, 110, 35);

			//---- updatecitytext ----
			updatecitytext.setText("City");
			updatecitytext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updatecitytext.setEditable(false);
			updateTrainerFrameContentPane.add(updatecitytext);
			updatecitytext.setBounds(240, 350, 110, 35);

			//---- updateCity ----
			updateCity.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateTrainerFrameContentPane.add(updateCity);
			updateCity.setBounds(375, 350, 170, 35);

			//---- updateStreet ----
			updateStreet.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateTrainerFrameContentPane.add(updateStreet);
			updateStreet.setBounds(375, 285, 170, 35);

			//---- updatestreettext ----
			updatestreettext.setText("Street");
			updatestreettext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updatestreettext.setEditable(false);
			updateTrainerFrameContentPane.add(updatestreettext);
			updatestreettext.setBounds(240, 285, 110, 35);

			//---- updatebarangaytext ----
			updatebarangaytext.setText("Barangay");
			updatebarangaytext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updatebarangaytext.setEditable(false);
			updateTrainerFrameContentPane.add(updatebarangaytext);
			updatebarangaytext.setBounds(630, 285, 125, 35);

			//---- updateprovincetext ----
			updateprovincetext.setText("Province");
			updateprovincetext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updateprovincetext.setEditable(false);
			updateTrainerFrameContentPane.add(updateprovincetext);
			updateprovincetext.setBounds(630, 350, 125, 35);

			//---- updateBarangay ----
			updateBarangay.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateTrainerFrameContentPane.add(updateBarangay);
			updateBarangay.setBounds(785, 285, 170, 35);

			//---- updateProvince ----
			updateProvince.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateTrainerFrameContentPane.add(updateProvince);
			updateProvince.setBounds(785, 350, 170, 35);

			//---- updatesextext ----
			updatesextext.setText("Sex");
			updatesextext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updatesextext.setEditable(false);
			updateTrainerFrameContentPane.add(updatesextext);
			updatesextext.setBounds(840, 150, 100, 35);

			//---- updateSex ----
			updateSex.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateSex.setEditable(false);
			updateTrainerFrameContentPane.add(updateSex);
			updateSex.setBounds(960, 150, 55, 35);

			//---- updatestartdatetext ----
			updatestartdatetext.setText("Start Date");
			updatestartdatetext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updatestartdatetext.setEditable(false);
			updateTrainerFrameContentPane.add(updatestartdatetext);
			updatestartdatetext.setBounds(840, 210, 100, 35);

			//---- updateStartDate ----
			updateStartDate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateStartDate.setEditable(false);
			updateTrainerFrameContentPane.add(updateStartDate);
			updateStartDate.setBounds(955, 210, 110, 35);

			//---- editorPane4 ----
			editorPane4.setBackground(new Color(0xb5b9b8));
			editorPane4.setEditable(false);
			updateTrainerFrameContentPane.add(editorPane4);
			editorPane4.setBounds(95, 115, 1000, 375);

			//---- updateTrainer ----
			updateTrainer.setText("UPDATE TRAINER");
			updateTrainer.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			updateTrainer.setForeground(Color.white);
			updateTrainer.setBackground(new Color(0x3ca3cb));
			updateTrainerFrameContentPane.add(updateTrainer);
			updateTrainer.setBounds(490, 515, 250, 55);

			//---- background6 ----
			background6.setIcon(new ImageIcon("resource\\trainersbg.jpg"));
			updateTrainerFrameContentPane.add(background6);
			background6.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < updateTrainerFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = updateTrainerFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = updateTrainerFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				updateTrainerFrameContentPane.setMinimumSize(preferredSize);
				updateTrainerFrameContentPane.setPreferredSize(preferredSize);
			}
			updateTrainerFrame.pack();
			updateTrainerFrame.setLocationRelativeTo(updateTrainerFrame.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
	private JFrame trainerFrame;
	private JButton trainerBackButton;
	private JFormattedTextField titleBar;
	private JButton goToAdd;
	private JButton goToRead;
	private JButton goToUpdate;
	private JButton goToDelete;
	private JButton goToUpdateStatus;
	private JLabel background;
	private JFrame addTrainerFrame;
	private JButton addBack;
	private JFormattedTextField titleBar2;
	private JFormattedTextField lastnametext;
	private JFormattedTextField firstnametext;
	private JFormattedTextField birthdatetext;
	private JFormattedTextField phonenumtext;
	private JTextPane lastName;
	private JTextPane firstName;
	private JTextPane birthDate;
	private JTextPane phoneNumber;
	private JTextPane availability;
	private JFormattedTextField availabilitytext;
	private JTextPane speciality;
	private JFormattedTextField specialitytext;
	private JFormattedTextField citytext;
	private JTextPane city;
	private JTextPane street;
	private JFormattedTextField streettext;
	private JFormattedTextField barangaytext;
	private JFormattedTextField provincetext;
	private JTextPane barangay;
	private JTextPane province;
	private JFormattedTextField sextext;
	private JTextPane sex;
	private JFormattedTextField startdatetext;
	private JTextPane startdate;
	private JEditorPane editorPane1;
	private JButton addTrainer;
	private JLabel background2;
	private JFrame deleteTrainerFrame;
	private JButton deleteBack;
	private JButton deleteTrainer;
	private JFormattedTextField traineridtext;
	private JComboBox trainerID;
	private JEditorPane editorPane2;
	private JFormattedTextField titleBar3;
	private JLabel background3;
	private JFrame readTrainerFrame;
	private JButton readBack;
	private JScrollPane tablePane;
	private JTable trainerTable;
	private JFormattedTextField titleBar4;
	private JLabel background4;
	private JFrame updateStatusFrame;
	private JButton updateStatusBack;
	private JButton updateStatus;
	private JFormattedTextField updatetrainerstatustext;
	private JFormattedTextField updatestatustext;
	private JComboBox updateStatusTrainerID;
	private JComboBox updateTrainerStatus;
	private JEditorPane editorPane3;
	private JFormattedTextField titleBar5;
	private JLabel background5;
	private JFrame updateTrainerFrame;
	private JButton updateBack;
	private JFormattedTextField titleBar6;
	private JFormattedTextField updatelastnametext;
	private JFormattedTextField updatefirstnametext;
	private JFormattedTextField upatebirthdatetext;
	private JFormattedTextField updatephonenumbertext;
	private JTextPane updateLastName;
	private JTextPane updateFirstname;
	private JTextPane updateBirthDate;
	private JTextPane updatePhoneNumber;
	private JTextPane updateAvailability;
	private JFormattedTextField updateavailabilitytext;
	private JTextPane updateSpeciality;
	private JFormattedTextField updatespecialitytext;
	private JFormattedTextField updatecitytext;
	private JTextPane updateCity;
	private JTextPane updateStreet;
	private JFormattedTextField updatestreettext;
	private JFormattedTextField updatebarangaytext;
	private JFormattedTextField updateprovincetext;
	private JTextPane updateBarangay;
	private JTextPane updateProvince;
	private JFormattedTextField updatesextext;
	private JTextPane updateSex;
	private JFormattedTextField updatestartdatetext;
	private JTextPane updateStartDate;
	private JEditorPane editorPane4;
	private JButton updateTrainer;
	private JLabel background6;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


	// getters
	public JFrame getTrainerFrame() {
		return this.trainerFrame;
	}
	public JFrame getAddTrainerFrame() {
		return this.addTrainerFrame;
	}
	public JFrame getDeleteTrainerFrame() {
		return this.deleteTrainerFrame;
	}
	public JFrame getReadTrainerFrame() {
		return this.readTrainerFrame;
	}
	public JFrame getUpdateTrainerFrame() {
		return this.updateTrainerFrame;
	}
	public JFrame getUpdateStatusTrainerFrame() {
		return this.updateStatusFrame;
	}

	// add
	public String getLastName() {
		return this.lastName.getText();
	}
	public String getSex() {
		return this.sex.getText();
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
	public String getAvailability() {
		return this.availability.getText();
	}
	public String getSpeciality() {
		return this.speciality.getText();
	}
	public String getStartDate() {
		return this.startdate.getText();
	}

	// update
	public String getUpdateFirstName() {
		return this.updateFirstname.getText();
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
	public String getUpdateAvailability() {
		return this.updateAvailability.getText();
	}
	public String getUpdateSpeciality() {
		return this.updateSpeciality.getText();
	}

	public void setUpdateFirstName(String name) {
		updateFirstname.setText(name);
	}
	public void setUpdateLastName(String name) {
		updateLastName.setText(name);
	}
	public void setUpdateSex(String name) {
		updateSex.setText(name);
	}
	public void setBirthDate(String name) {
		updateBirthDate.setText(name);
	}
	public void setPhoneNumber(String name) {
		updatePhoneNumber.setText(name);
	}
	public void setStartDate(String name) {
		updateStartDate.setText(name);
	}
	public void setStreet(String name) {
		updateStreet.setText(name);
	}
	public void setBarangay(String name) {
		updateBarangay.setText(name);
	}
	public void setCity(String name) {
		updateCity.setText(name);
	}
	public void setProvince(String name) {
		updateProvince.setText(name);
	}
	public void setSpeciality(String name) {
		updateSpeciality.setText(name);
	}
	public void setavailability(String name) {
		updateAvailability.setText(name);
	}

	// delete
	public int getTrainerID() {
		return this.trainerID.getSelectedIndex();
	}

	// update status
	public int getUpdateStatusTrainerID() {
		return this.updateStatusTrainerID.getSelectedIndex();
	}

	public String getUpdateTrainerStatus() {
		return (String) this.updateTrainerStatus.getSelectedItem();
	}

	// button listeners
	public void trainerBackButton(ActionListener actionListener) {
		this.trainerBackButton.addActionListener(actionListener);
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
	public void goToUpdateStatusButton(ActionListener actionListener) {
		this.goToUpdateStatus.addActionListener(actionListener);
	}

	public void addBackButton(ActionListener actionListener) {
		this.addBack.addActionListener(actionListener);
	}
	public void deleteBackButton(ActionListener actionListener) {
		this.deleteBack.addActionListener(actionListener);
	}
	public void readBackButton(ActionListener actionListener) {
		this.readBack.addActionListener(actionListener);
	}
	public void updateBackButton(ActionListener actionListener) {
		this.updateBack.addActionListener(actionListener);
	}
	public void updateStatusBackButton(ActionListener actionListener) {
		this.updateStatusBack.addActionListener(actionListener);
	}

	public void addTrainerButton(ActionListener actionListener) {
		this.addTrainer.addActionListener(actionListener);
	}
	public void deleteTrainerButton(ActionListener actionListener) {
		this.deleteTrainer.addActionListener(actionListener);
	}
	public void updateTrainerButton(ActionListener actionListener) {
		this.updateTrainer.addActionListener(actionListener);
	}
	public void updateStatusButton(ActionListener actionListener) {
		this.updateStatus.addActionListener(actionListener);
	}

	// set table model
	public void setMemberTable(Object[][] data) { 
		String[] columnNames = {"Member ID", "Last Name", "First Name", "Specialty", "Availability", "Start Date", "End Date"};
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		trainerTable.setModel(model);
		{
			TableColumnModel cm = trainerTable.getColumnModel();
			cm.getColumn(0).setMaxWidth(80);
			cm.getColumn(3).setMinWidth(150);
			cm.getColumn(3).setMaxWidth(220);
			cm.getColumn(4).setMinWidth(150);
			cm.getColumn(4).setMaxWidth(150);
		}
	}


	public static void main(String[] args) {
		new TrainerController();
	}
}
