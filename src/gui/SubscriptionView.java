import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Thu Nov 14 23:09:44 PST 2024
 */



/**
 * @author Diane
 */
public class SubscriptionView  {
	public SubscriptionView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
		membershipFrame = new JFrame();
		membershipBackButton = new JButton();
		titleBar = new JFormattedTextField();
		goToAdd = new JButton();
		goToRead = new JButton();
		goToDelete = new JButton();
		goToTerminate = new JButton();
		background = new JLabel();
		addMembershipFrame = new JFrame();
		addBack = new JButton();
		titleBar2 = new JFormattedTextField();
		memberidtext = new JFormattedTextField();
		typetext = new JFormattedTextField();
		trainerID = new JComboBox<>();
		memberID = new JComboBox<>();
		membershiptype = new JComboBox<>();
		startdate = new JTextPane();
		traineridtext = new JFormattedTextField();
		startdatetext = new JFormattedTextField();
		addMembership = new JButton();
		editorPane3 = new JEditorPane();
		background2 = new JLabel();
		deleteMembershipFrame = new JFrame();
		deleteBack = new JButton();
		deleteMembership = new JButton();
		membershipID = new JComboBox<>();
		membershipidtext = new JFormattedTextField();
		editorPane2 = new JEditorPane();
		titleBar3 = new JFormattedTextField();
		background3 = new JLabel();
		readMembershipFrame = new JFrame();
		readBack = new JButton();
		tablePane = new JScrollPane();
		membershipTable = new JTable();
		titleBar4 = new JFormattedTextField();
		background4 = new JLabel();
		terminateMembershipFrame = new JFrame();
		terminateBack = new JButton();
		terminateMembership = new JButton();
		terminateMembershipID = new JComboBox<>();
		membershipidtext2 = new JFormattedTextField();
		editorPane4 = new JEditorPane();
		titleBar5 = new JFormattedTextField();
		background5 = new JLabel();

		//======== membershipFrame ========
		{
			Container membershipFrameContentPane = membershipFrame.getContentPane();
			membershipFrameContentPane.setLayout(null);

			//---- membershipBackButton ----
			membershipBackButton.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			membershipBackButton.setIcon(new ImageIcon("resource\\backButton.jpg"));
			membershipBackButton.setBackground(new Color(0xc80f2e));
			membershipFrameContentPane.add(membershipBackButton);
			membershipBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar ----
			titleBar.setText("Subscription");
			titleBar.setBackground(new Color(0xc80f2e));
			titleBar.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar.setForeground(Color.white);
			titleBar.setEditable(false);
			membershipFrameContentPane.add(titleBar);
			titleBar.setBounds(0, 0, 1200, 55);

			//---- goToAdd ----
			goToAdd.setText("ADD SUBSCRIPTION");
			goToAdd.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToAdd.setForeground(Color.white);
			goToAdd.setBackground(new Color(0x3ca3cb));
			membershipFrameContentPane.add(goToAdd);
			goToAdd.setBounds(475, 175, 250, 55);

			//---- goToRead ----
			goToRead.setText("READ SUBSCRIPTION");
			goToRead.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToRead.setForeground(Color.white);
			goToRead.setBackground(new Color(0x3ca3cb));
			membershipFrameContentPane.add(goToRead);
			goToRead.setBounds(475, 270, 250, 55);

			//---- goToDelete ----
			goToDelete.setText("DELETE SUBSCRIPTION");
			goToDelete.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToDelete.setForeground(Color.white);
			goToDelete.setBackground(new Color(0x3ca3cb));
			membershipFrameContentPane.add(goToDelete);
			goToDelete.setBounds(475, 365, 250, 55);

			//---- goToTerminate ----
			goToTerminate.setText("TERMINATE SUBSCRIPTION");
			goToTerminate.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToTerminate.setForeground(Color.white);
			goToTerminate.setBackground(new Color(0x3ca3cb));
			membershipFrameContentPane.add(goToTerminate);
			goToTerminate.setBounds(475, 460, 250, 55);

			//---- background ----
			background.setIcon(new ImageIcon("resource\\membership.jpg"));
			membershipFrameContentPane.add(background);
			background.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < membershipFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = membershipFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = membershipFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				membershipFrameContentPane.setMinimumSize(preferredSize);
				membershipFrameContentPane.setPreferredSize(preferredSize);
			}
			membershipFrame.pack();
			membershipFrame.setSize(1200, 700);
			membershipFrame.setLocationRelativeTo(null);
			membershipFrame.setVisible(true);
		}

		//======== addMembershipFrame ========
		{
			Container addMembershipFrameContentPane = addMembershipFrame.getContentPane();
			addMembershipFrameContentPane.setLayout(null);

			//---- addBack ----
			addBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			addBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			addBack.setBackground(new Color(0xc80f2e));
			addMembershipFrameContentPane.add(addBack);
			addBack.setBounds(5, 5, 95, 45);

			//---- titleBar2 ----
			titleBar2.setText("Subscription: Add Subscription");
			titleBar2.setBackground(new Color(0xc80f2e));
			titleBar2.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar2.setForeground(Color.white);
			titleBar2.setEditable(false);
			addMembershipFrameContentPane.add(titleBar2);
			titleBar2.setBounds(0, 0, 1200, 55);

			//---- memberidtext ----
			memberidtext.setText("Member ID");
			memberidtext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			memberidtext.setEditable(false);
			addMembershipFrameContentPane.add(memberidtext);
			memberidtext.setBounds(340, 190, 115, 35);

			//---- typetext ----
			typetext.setText("Type");
			typetext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			typetext.setEditable(false);
			addMembershipFrameContentPane.add(typetext);
			typetext.setBounds(340, 315, 115, 35);

			//---- trainerID ----
			trainerID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addMembershipFrameContentPane.add(trainerID);
			trainerID.setBounds(510, 250, 340, 35);

			//---- memberID ----
			memberID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addMembershipFrameContentPane.add(memberID);
			memberID.setBounds(510, 190, 340, 35);

			//---- membershiptype ----
			membershiptype.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addMembershipFrameContentPane.add(membershiptype);
			membershiptype.setBounds(510, 315, 340, 35);

			//---- startdate ----
			startdate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			addMembershipFrameContentPane.add(startdate);
			startdate.setBounds(510, 375, 320, 35);

			//---- traineridtext ----
			traineridtext.setText("Trainer ID");
			traineridtext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			traineridtext.setEditable(false);
			addMembershipFrameContentPane.add(traineridtext);
			traineridtext.setBounds(340, 250, 115, 35);

			//---- startdatetext ----
			startdatetext.setText("Start Date");
			startdatetext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			startdatetext.setEditable(false);
			addMembershipFrameContentPane.add(startdatetext);
			startdatetext.setBounds(340, 375, 115, 35);

			//---- addMembership ----
			addMembership.setText("ADD SUBSCRIPTION");
			addMembership.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			addMembership.setForeground(Color.white);
			addMembership.setBackground(new Color(0x3ca3cb));
			addMembershipFrameContentPane.add(addMembership);
			addMembership.setBounds(475, 450, 250, 55);

			//---- editorPane3 ----
			editorPane3.setBackground(new Color(0xb5b9b8));
			editorPane3.setEditable(false);
			editorPane3.setEnabled(false);
			addMembershipFrameContentPane.add(editorPane3);
			editorPane3.setBounds(300, 160, 595, 380);

			//---- background2 ----
			background2.setIcon(new ImageIcon("resource\\membership.jpg"));
			addMembershipFrameContentPane.add(background2);
			background2.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < addMembershipFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = addMembershipFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = addMembershipFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				addMembershipFrameContentPane.setMinimumSize(preferredSize);
				addMembershipFrameContentPane.setPreferredSize(preferredSize);
			}
			addMembershipFrame.pack();
			addMembershipFrame.setLocationRelativeTo(addMembershipFrame.getOwner());
		}

		//======== deleteMembershipFrame ========
		{
			Container deleteMembershipFrameContentPane = deleteMembershipFrame.getContentPane();
			deleteMembershipFrameContentPane.setLayout(null);

			//---- deleteBack ----
			deleteBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			deleteBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			deleteBack.setBackground(new Color(0xc80f2e));
			deleteMembershipFrameContentPane.add(deleteBack);
			deleteBack.setBounds(5, 5, 95, 45);

			//---- deleteMembership ----
			deleteMembership.setText("DELETE SUBSCRIPTION");
			deleteMembership.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			deleteMembership.setForeground(Color.white);
			deleteMembership.setBackground(new Color(0x3ca3cb));
			deleteMembershipFrameContentPane.add(deleteMembership);
			deleteMembership.setBounds(470, 390, 250, 55);

			//---- membershipID ----
			membershipID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			deleteMembershipFrameContentPane.add(membershipID);
			membershipID.setBounds(345, 295, 500, 35);

			//---- membershipidtext ----
			membershipidtext.setText("Select Subscription");
			membershipidtext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			membershipidtext.setEditable(false);
			membershipidtext.setHorizontalAlignment(SwingConstants.CENTER);
			deleteMembershipFrameContentPane.add(membershipidtext);
			membershipidtext.setBounds(300, 215, 595, 35);

			//---- editorPane2 ----
			editorPane2.setBackground(new Color(0xb5b9b8));
			editorPane2.setEditable(false);
			editorPane2.setEnabled(false);
			deleteMembershipFrameContentPane.add(editorPane2);
			editorPane2.setBounds(300, 215, 595, 255);

			//---- titleBar3 ----
			titleBar3.setText("Subscription: Delete Subscription");
			titleBar3.setBackground(new Color(0xc80f2e));
			titleBar3.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar3.setForeground(Color.white);
			titleBar3.setEditable(false);
			deleteMembershipFrameContentPane.add(titleBar3);
			titleBar3.setBounds(0, 0, 1200, 55);

			//---- background3 ----
			background3.setIcon(new ImageIcon("resource\\membership.jpg"));
			deleteMembershipFrameContentPane.add(background3);
			background3.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < deleteMembershipFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = deleteMembershipFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = deleteMembershipFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				deleteMembershipFrameContentPane.setMinimumSize(preferredSize);
				deleteMembershipFrameContentPane.setPreferredSize(preferredSize);
			}
			deleteMembershipFrame.pack();
			deleteMembershipFrame.setLocationRelativeTo(deleteMembershipFrame.getOwner());
		}

		//======== readMembershipFrame ========
		{
			Container readMembershipFrameContentPane = readMembershipFrame.getContentPane();
			readMembershipFrameContentPane.setLayout(null);

			//---- readBack ----
			readBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			readBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			readBack.setBackground(new Color(0xc80f2e));
			readMembershipFrameContentPane.add(readBack);
			readBack.setBounds(5, 5, 95, 45);

			//======== tablePane ========
			{

				//---- membershipTable ----
				membershipTable.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, "", null, null},
						{null, null, null, null, null, null},
					},
					new String[] {
						"Subscription ID", "Member ID", "Subscription Type", "Start Date", "End Date"
					}
				));
				{
					TableColumnModel cm = membershipTable.getColumnModel();
					cm.getColumn(0).setMaxWidth(100);
					cm.getColumn(1).setMaxWidth(100);
					cm.getColumn(2).setMaxWidth(340);
					cm.getColumn(3).setMaxWidth(220);
					cm.getColumn(4).setMaxWidth(220);
				}
				membershipTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				membershipTable.setEnabled(false);
				tablePane.setViewportView(membershipTable);
			}
			readMembershipFrameContentPane.add(tablePane);
			tablePane.setBounds(110, 140, 970, 435);

			//---- titleBar4 ----
			titleBar4.setText("Subscription: Read Subscription");
			titleBar4.setBackground(new Color(0xc80f2e));
			titleBar4.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar4.setForeground(Color.white);
			titleBar4.setEditable(false);
			readMembershipFrameContentPane.add(titleBar4);
			titleBar4.setBounds(0, 0, 1200, 55);

			//---- background4 ----
			background4.setIcon(new ImageIcon("resource\\membership.jpg"));
			readMembershipFrameContentPane.add(background4);
			background4.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < readMembershipFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = readMembershipFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = readMembershipFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				readMembershipFrameContentPane.setMinimumSize(preferredSize);
				readMembershipFrameContentPane.setPreferredSize(preferredSize);
			}
			readMembershipFrame.pack();
			readMembershipFrame.setLocationRelativeTo(readMembershipFrame.getOwner());
		}

		//======== terminateMembershipFrame ========
		{
			Container terminateMembershipFrameContentPane = terminateMembershipFrame.getContentPane();
			terminateMembershipFrameContentPane.setLayout(null);

			//---- terminateBack ----
			terminateBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			terminateBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			terminateBack.setBackground(new Color(0xc80f2e));
			terminateMembershipFrameContentPane.add(terminateBack);
			terminateBack.setBounds(5, 5, 95, 45);

			//---- terminateMembership ----
			terminateMembership.setText("TERMINATE SUBSCRIPTION");
			terminateMembership.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			terminateMembership.setForeground(Color.white);
			terminateMembership.setBackground(new Color(0x3ca3cb));
			terminateMembershipFrameContentPane.add(terminateMembership);
			terminateMembership.setBounds(480, 395, 250, 55);

			//---- terminateMembershipID ----
			terminateMembershipID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			terminateMembershipFrameContentPane.add(terminateMembershipID);
			terminateMembershipID.setBounds(360, 310, 475, 35);

			//---- membershipidtext2 ----
			membershipidtext2.setText("Select Subscription");
			membershipidtext2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			membershipidtext2.setEditable(false);
			membershipidtext2.setHorizontalAlignment(SwingConstants.CENTER);
			terminateMembershipFrameContentPane.add(membershipidtext2);
			membershipidtext2.setBounds(300, 225, 595, 35);

			//---- editorPane4 ----
			editorPane4.setBackground(new Color(0xb5b9b8));
			editorPane4.setEditable(false);
			editorPane4.setEnabled(false);
			terminateMembershipFrameContentPane.add(editorPane4);
			editorPane4.setBounds(300, 225, 595, 260);

			//---- titleBar5 ----
			titleBar5.setText("Subscription: Terminate Subscription");
			titleBar5.setBackground(new Color(0xc80f2e));
			titleBar5.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar5.setForeground(Color.white);
			titleBar5.setEditable(false);
			terminateMembershipFrameContentPane.add(titleBar5);
			titleBar5.setBounds(0, 0, 1200, 55);

			//---- background5 ----
			background5.setIcon(new ImageIcon("resource\\membership.jpg"));
			terminateMembershipFrameContentPane.add(background5);
			background5.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < terminateMembershipFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = terminateMembershipFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = terminateMembershipFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				terminateMembershipFrameContentPane.setMinimumSize(preferredSize);
				terminateMembershipFrameContentPane.setPreferredSize(preferredSize);
			}
			terminateMembershipFrame.pack();
			terminateMembershipFrame.setLocationRelativeTo(terminateMembershipFrame.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
	private JFrame membershipFrame;
	private JButton membershipBackButton;
	private JFormattedTextField titleBar;
	private JButton goToAdd;
	private JButton goToRead;
	private JButton goToDelete;
	private JButton goToTerminate;
	private JLabel background;
	private JFrame addMembershipFrame;
	private JButton addBack;
	private JFormattedTextField titleBar2;
	private JFormattedTextField memberidtext;
	private JFormattedTextField typetext;
	private JComboBox<String> trainerID;
	private JComboBox<String> memberID;
	private JComboBox<String> membershiptype;
	private JTextPane startdate;
	private JFormattedTextField traineridtext;
	private JFormattedTextField startdatetext;
	private JButton addMembership;
	private JEditorPane editorPane3;
	private JLabel background2;
	private JFrame deleteMembershipFrame;
	private JButton deleteBack;
	private JButton deleteMembership;
	private JComboBox<String> membershipID;
	private JFormattedTextField membershipidtext;
	private JEditorPane editorPane2;
	private JFormattedTextField titleBar3;
	private JLabel background3;
	private JFrame readMembershipFrame;
	private JButton readBack;
	private JScrollPane tablePane;
	private JTable membershipTable;
	private JFormattedTextField titleBar4;
	private JLabel background4;
	private JFrame terminateMembershipFrame;
	private JButton terminateBack;
	private JButton terminateMembership;
	private JComboBox<String> terminateMembershipID;
	private JFormattedTextField membershipidtext2;
	private JEditorPane editorPane4;
	private JFormattedTextField titleBar5;
	private JLabel background5;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


	// jcombobox getters
	public JComboBox<String> getMemberIDComboBox() {
		return this.memberID;
	}
	public JComboBox<String> getTrainerIDComboBox() {
		return this.trainerID;
	}
	public JComboBox<String> getMembershipTypeComboBox() {
		return this.membershiptype;
	}
	public JComboBox<String> getMembershipIDComboBox() {
		return this.membershipID;
	}
	public JComboBox<String> getTerminateMembershipIDComboBox() {
		return this.terminateMembershipID;
	}

	// getters
	public JFrame getSubscriptionFrame() {
		return this.membershipFrame;
	}
	public JFrame getAddSubscriptionFrame() {
		return this.addMembershipFrame;
	}
	public JFrame getDeleteSubscriptionFrame() {
		return this.deleteMembershipFrame;
	}
	public JFrame getReadSubscriptionFrame() {
		return this.readMembershipFrame;
	}
	public JFrame getTerminateSubscriptionFrame() {
		return this.terminateMembershipFrame;
	}

	public int getMemberID() {
		return this.memberID.getSelectedIndex() + 1;
	}
	public String getSubscriptionType() {
		return (String) this.membershiptype.getSelectedItem();
	}
	public String getStartDate() {
		return this.startdate.getText();
	}
	public int getTrainerID() {
		return this.trainerID.getSelectedIndex() + 1;
	}
	public int getSubscriptionID() {
		return this.membershipID.getSelectedIndex() + 1;
	}
	public int getTerminateSubscriptionID() {
		return this.terminateMembershipID.getSelectedIndex() + 1;
	}

	// button listeners
	public void memberBackButton(ActionListener actionListener) {
		this.membershipBackButton.addActionListener(actionListener);
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
	public void goToTerminateButton(ActionListener actionListener) {
		this.goToTerminate.addActionListener(actionListener);
	}

	public void addBackButton(ActionListener actionListener) {
		this.addBack.addActionListener(actionListener);
	}
	public void addSubscriptionButton(ActionListener actionListener) {
		this.addMembership.addActionListener(actionListener);
	}
	public void deleteBackButton(ActionListener actionListener) {
		this.deleteBack.addActionListener(actionListener);
	}
	public void deleteSubscriptionButton(ActionListener actionListener) {
		this.deleteMembership.addActionListener(actionListener);
	}
	public void readBackButton(ActionListener actionListener) {
		this.readBack.addActionListener(actionListener);
	}
	public void terminateBackButton(ActionListener actionListener) {
		this.terminateBack.addActionListener(actionListener);
	}
	public void terminateSubscriptionButton(ActionListener actionListener) {
		this.terminateMembership.addActionListener(actionListener);
	}
	
	// set table model
	public void setMemberTable(Object[][] data) { 
		String[] columnNames = {"Subscription ID", "Member ID", "Subscription Type", "Start Date", "End Date"};
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		membershipTable.setModel(model);
		{
			TableColumnModel cm = membershipTable.getColumnModel();
			cm.getColumn(0).setMaxWidth(100);
			cm.getColumn(1).setMaxWidth(80);
			cm.getColumn(2).setMaxWidth(300);
			cm.getColumn(3).setMaxWidth(220);
			cm.getColumn(4).setMaxWidth(220);
		}
	}
}
