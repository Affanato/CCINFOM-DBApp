import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Sun Nov 10 23:32:20 PST 2024
 */



/**
 * @author Diane
 */
public class MembershipSubscription extends JFrame {
	public MembershipSubscription() {
		initComponents();
	}

	private void membershipBackMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void recordSubscriptionButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void backButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void availableProductsBackButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void trainersBackButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
	}


	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
		membershipBack = new JButton();
		titleBar3 = new JFormattedTextField();
		scrollPane1 = new JScrollPane();
		memberTable = new JTable();
		scrollPane2 = new JScrollPane();
		trainerTable = new JTable();
		memberIDTextField = new JFormattedTextField();
		memberID = new JTextPane();
		membershipType = new JComboBox<>();
		memTypeTextField = new JFormattedTextField();
		startDateTextField = new JFormattedTextField();
		trainerIDTextFied = new JFormattedTextField();
		trainerID = new JTextPane();
		startDate = new JTextPane();
		recordSubscriptionButton = new JButton();
		editorPane1 = new JEditorPane();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//---- membershipBack ----
		membershipBack.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\backButton.jpg"));
		membershipBack.setBackground(new Color(0xc80f2e));
		membershipBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				backButtonMouseClicked(e);
				availableProductsBackButtonMouseClicked(e);
				trainersBackButtonMouseClicked(e);
				membershipBackMouseClicked(e);
			}
		});
		contentPane.add(membershipBack);
		membershipBack.setBounds(5, 5, 95, 45);

		//---- titleBar3 ----
		titleBar3.setText("Record Membership Subscription");
		titleBar3.setBackground(new Color(0xc80f2e));
		titleBar3.setHorizontalAlignment(SwingConstants.CENTER);
		titleBar3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
		titleBar3.setForeground(Color.white);
		contentPane.add(titleBar3);
		titleBar3.setBounds(0, 0, 1200, 55);

		//======== scrollPane1 ========
		{

			//---- memberTable ----
			memberTable.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, ""},
					{null, null, null},
				},
				new String[] {
					"Member ID", "Last Name", "First Name"
				}
			));
			{
				TableColumnModel cm = memberTable.getColumnModel();
				cm.getColumn(0).setMinWidth(80);
				cm.getColumn(0).setMaxWidth(80);
			}
			scrollPane1.setViewportView(memberTable);
		}
		contentPane.add(scrollPane1);
		scrollPane1.setBounds(45, 85, 565, 250);

		//======== scrollPane2 ========
		{

			//---- trainerTable ----
			trainerTable.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null},
					{null, null, null, null, null},
				},
				new String[] {
					"Trainer ID", "Last Name", "First Name", "Speciality", "Availability"
				}
			));
			{
				TableColumnModel cm = trainerTable.getColumnModel();
				cm.getColumn(0).setMaxWidth(80);
			}
			scrollPane2.setViewportView(trainerTable);
		}
		contentPane.add(scrollPane2);
		scrollPane2.setBounds(45, 360, 565, 270);

		//---- memberIDTextField ----
		memberIDTextField.setText(" Member ID:");
		memberIDTextField.setFont(new Font("Tw Cen MT", Font.BOLD, 19));
		memberIDTextField.setBackground(new Color(0x3ca3cb));
		memberIDTextField.setForeground(Color.white);
		contentPane.add(memberIDTextField);
		memberIDTextField.setBounds(715, 190, 110, 35);

		//---- memberID ----
		memberID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		contentPane.add(memberID);
		memberID.setBounds(960, 190, 160, 35);

		//---- membershipType ----
		membershipType.setModel(new DefaultComboBoxModel<>(new String[] {
			"Standard",
			"Premium"
		}));
		membershipType.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		contentPane.add(membershipType);
		membershipType.setBounds(960, 255, 160, 35);

		//---- memTypeTextField ----
		memTypeTextField.setText(" Membership Type:");
		memTypeTextField.setFont(new Font("Tw Cen MT", Font.BOLD, 19));
		memTypeTextField.setBackground(new Color(0x3ca3cb));
		memTypeTextField.setForeground(Color.white);
		contentPane.add(memTypeTextField);
		memTypeTextField.setBounds(715, 255, 170, 35);

		//---- startDateTextField ----
		startDateTextField.setText(" Start Date (mm-dd-yyyy):");
		startDateTextField.setFont(new Font("Tw Cen MT", Font.BOLD, 19));
		startDateTextField.setBackground(new Color(0x3ca3cb));
		startDateTextField.setForeground(Color.white);
		contentPane.add(startDateTextField);
		startDateTextField.setBounds(715, 320, 220, 35);

		//---- trainerIDTextFied ----
		trainerIDTextFied.setText(" Trainer ID:");
		trainerIDTextFied.setFont(new Font("Tw Cen MT", Font.BOLD, 19));
		trainerIDTextFied.setBackground(new Color(0x3ca3cb));
		trainerIDTextFied.setForeground(Color.white);
		contentPane.add(trainerIDTextFied);
		trainerIDTextFied.setBounds(715, 385, 105, 35);

		//---- trainerID ----
		trainerID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		contentPane.add(trainerID);
		trainerID.setBounds(960, 385, 160, 35);

		//---- startDate ----
		startDate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		contentPane.add(startDate);
		startDate.setBounds(960, 320, 160, 35);

		//---- recordSubscriptionButton ----
		recordSubscriptionButton.setText("RECORD SUBSCRIPTION");
		recordSubscriptionButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		recordSubscriptionButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				recordSubscriptionButtonMouseClicked(e);
			}
		});
		contentPane.add(recordSubscriptionButton);
		recordSubscriptionButton.setBounds(800, 460, 235, 50);

		//---- editorPane1 ----
		editorPane1.setBackground(new Color(0x3ca3cb));
		contentPane.add(editorPane1);
		editorPane1.setBounds(690, 160, 460, 370);

		{
			// compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
	private JButton membershipBack;
	private JFormattedTextField titleBar3;
	private JScrollPane scrollPane1;
	private JTable memberTable;
	private JScrollPane scrollPane2;
	private JTable trainerTable;
	private JFormattedTextField memberIDTextField;
	private JTextPane memberID;
	private JComboBox<String> membershipType;
	private JFormattedTextField memTypeTextField;
	private JFormattedTextField startDateTextField;
	private JFormattedTextField trainerIDTextFied;
	private JTextPane trainerID;
	private JTextPane startDate;
	private JButton recordSubscriptionButton;
	private JEditorPane editorPane1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

	public static void main(String[] args) {
		MembershipSubscription test = new MembershipSubscription();
	}
}
