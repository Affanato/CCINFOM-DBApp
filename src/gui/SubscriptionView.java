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
		goToReadAll = new JButton();
		goToDelete = new JButton();
		goToTerminate = new JButton();
		goToReadActive = new JButton();
		background = new JLabel();
		addMembershipFrame = new JFrame();
		addBack = new JButton();
		titleBar2 = new JFormattedTextField();
		memberidtext = new JFormattedTextField();
		typetext = new JFormattedTextField();
		memberID = new JComboBox<>();
		membershiptype = new JComboBox<>();
		startdate = new JTextPane();
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
		readAllBack = new JButton();
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
		readMembershipFrame2 = new JFrame();
		readActiveBack = new JButton();
		tablePane2 = new JScrollPane();
		membershipTable2 = new JTable();
		titleBar6 = new JFormattedTextField();
		background6 = new JLabel();

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
			goToAdd.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 19));
			goToAdd.setForeground(Color.white);
			goToAdd.setBackground(new Color(0x3ca3cb));
			membershipFrameContentPane.add(goToAdd);
			goToAdd.setBounds(295, 195, 250, 55);

			//---- goToReadAll ----
			goToReadAll.setText("READ ALL SUBSCRIPTIONS");
			goToReadAll.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 19));
			goToReadAll.setForeground(Color.white);
			goToReadAll.setBackground(new Color(0x3ca3cb));
			membershipFrameContentPane.add(goToReadAll);
			goToReadAll.setBounds(295, 300, 250, 55);

			//---- goToDelete ----
			goToDelete.setText("DELETE SUBSCRIPTION");
			goToDelete.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 19));
			goToDelete.setForeground(Color.white);
			goToDelete.setBackground(new Color(0x3ca3cb));
			membershipFrameContentPane.add(goToDelete);
			goToDelete.setBounds(650, 195, 250, 55);

			//---- goToTerminate ----
			goToTerminate.setText("TERMINATE SUBSCRIPTION");
			goToTerminate.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 19));
			goToTerminate.setForeground(Color.white);
			goToTerminate.setBackground(new Color(0x3ca3cb));
			membershipFrameContentPane.add(goToTerminate);
			goToTerminate.setBounds(480, 410, 250, 55);

			//---- goToReadActive ----
			goToReadActive.setText("READ ACTIVE SUBSCRIPTIONS");
			goToReadActive.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 19));
			goToReadActive.setForeground(Color.white);
			goToReadActive.setBackground(new Color(0x3ca3cb));
			membershipFrameContentPane.add(goToReadActive);
			goToReadActive.setBounds(650, 300, 250, 55);

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
			memberidtext.setBounds(340, 220, 115, 35);

			//---- typetext ----
			typetext.setText("Type");
			typetext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			typetext.setEditable(false);
			addMembershipFrameContentPane.add(typetext);
			typetext.setBounds(340, 280, 115, 35);

			//---- memberID ----
			memberID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			memberID.setModel(new DefaultComboBoxModel<>(new String[] {
				"ID"
			}));
			addMembershipFrameContentPane.add(memberID);
			memberID.setBounds(510, 220, 340, 35);

			//---- membershiptype ----
			membershiptype.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			membershiptype.setModel(new DefaultComboBoxModel<>(new String[] {
				"ID"
			}));
			addMembershipFrameContentPane.add(membershiptype);
			membershiptype.setBounds(510, 280, 340, 35);

			//---- startdate ----
			startdate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			startdate.setText("YYYY-MM-DD");
			addMembershipFrameContentPane.add(startdate);
			startdate.setBounds(510, 340, 320, 35);

			//---- startdatetext ----
			startdatetext.setText("Start Date");
			startdatetext.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			startdatetext.setEditable(false);
			addMembershipFrameContentPane.add(startdatetext);
			startdatetext.setBounds(340, 340, 115, 35);

			//---- addMembership ----
			addMembership.setText("ADD SUBSCRIPTION");
			addMembership.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			addMembership.setForeground(Color.white);
			addMembership.setBackground(new Color(0x3ca3cb));
			addMembershipFrameContentPane.add(addMembership);
			addMembership.setBounds(475, 415, 250, 55);

			//---- editorPane3 ----
			editorPane3.setBackground(new Color(0xb5b9b8));
			editorPane3.setEditable(false);
			editorPane3.setEnabled(false);
			addMembershipFrameContentPane.add(editorPane3);
			editorPane3.setBounds(300, 185, 595, 320);

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
			membershipID.setModel(new DefaultComboBoxModel<>(new String[] {
				"ID"
			}));
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

			//---- readAllBack ----
			readAllBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			readAllBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			readAllBack.setBackground(new Color(0xc80f2e));
			readMembershipFrameContentPane.add(readAllBack);
			readAllBack.setBounds(5, 5, 95, 45);

			//======== tablePane ========
			{

				//---- membershipTable ----
				membershipTable.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, "", null, null},
						{null, null, null, null, null, null},
					},
					new String[] {
						"Subscription ID", "Member ID", "Trainer ID", "Subscription Type ID", "Start Date", "End Date"
					}
				));
				{
					TableColumnModel cm = membershipTable.getColumnModel();
					cm.getColumn(0).setMinWidth(100);
					cm.getColumn(1).setMinWidth(100);
					cm.getColumn(2).setMinWidth(100);
					cm.getColumn(3).setMinWidth(100);
					cm.getColumn(4).setMinWidth(220);
					cm.getColumn(5).setMinWidth(220);
				}
				membershipTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				membershipTable.setEnabled(false);
				tablePane.setViewportView(membershipTable);
			}
			readMembershipFrameContentPane.add(tablePane);
			tablePane.setBounds(110, 140, 970, 435);

			//---- titleBar4 ----
			titleBar4.setText("Subscription: Read All Subscriptions");
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
			terminateMembershipID.setModel(new DefaultComboBoxModel<>(new String[] {
				"ID"
			}));
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

		//======== readMembershipFrame2 ========
		{
			Container readMembershipFrame2ContentPane = readMembershipFrame2.getContentPane();
			readMembershipFrame2ContentPane.setLayout(null);

			//---- readActiveBack ----
			readActiveBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			readActiveBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			readActiveBack.setBackground(new Color(0xc80f2e));
			readMembershipFrame2ContentPane.add(readActiveBack);
			readActiveBack.setBounds(5, 5, 95, 45);

			//======== tablePane2 ========
			{

				//---- membershipTable2 ----
				membershipTable2.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, "", null, null},
						{null, null, null, null, null, null},
					},
					new String[] {
						"Subscription ID", "Member ID", "Subscription Type ID", "Start Date", "End Date"
					}
				));
				{
					TableColumnModel cm = membershipTable2.getColumnModel();
					cm.getColumn(0).setMinWidth(100);
					cm.getColumn(1).setMinWidth(100);
					cm.getColumn(2).setMinWidth(100);
					cm.getColumn(3).setMinWidth(220);
					cm.getColumn(4).setMinWidth(220);

				}
				membershipTable2.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				membershipTable2.setEnabled(false);
				tablePane2.setViewportView(membershipTable2);
			}
			readMembershipFrame2ContentPane.add(tablePane2);
			tablePane2.setBounds(110, 140, 970, 435);

			//---- titleBar6 ----
			titleBar6.setText("Subscription: Read Active Subscriptions");
			titleBar6.setBackground(new Color(0xc80f2e));
			titleBar6.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar6.setForeground(Color.white);
			titleBar6.setEditable(false);
			readMembershipFrame2ContentPane.add(titleBar6);
			titleBar6.setBounds(0, 0, 1200, 55);

			//---- background6 ----
			background6.setIcon(new ImageIcon("resource\\membership.jpg"));
			readMembershipFrame2ContentPane.add(background6);
			background6.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < readMembershipFrame2ContentPane.getComponentCount(); i++) {
					Rectangle bounds = readMembershipFrame2ContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = readMembershipFrame2ContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				readMembershipFrame2ContentPane.setMinimumSize(preferredSize);
				readMembershipFrame2ContentPane.setPreferredSize(preferredSize);
			}
			readMembershipFrame2.pack();
			readMembershipFrame2.setLocationRelativeTo(readMembershipFrame2.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
	private JFrame membershipFrame;
	private JButton membershipBackButton;
	private JFormattedTextField titleBar;
	private JButton goToAdd;
	private JButton goToReadAll;
	private JButton goToDelete;
	private JButton goToTerminate;
	private JButton goToReadActive;
	private JLabel background;
	private JFrame addMembershipFrame;
	private JButton addBack;
	private JFormattedTextField titleBar2;
	private JFormattedTextField memberidtext;
	private JFormattedTextField typetext;
	private JComboBox<String> memberID;
	private JComboBox<String> membershiptype;
	private JTextPane startdate;
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
	private JButton readAllBack;
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
	private JFrame readMembershipFrame2;
	private JButton readActiveBack;
	private JScrollPane tablePane2;
	private JTable membershipTable2;
	private JFormattedTextField titleBar6;
	private JLabel background6;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


	// jcombobox getters
	public JComboBox<String> getMemberIDComboBox() {
		return this.memberID;
	} //add
	public JComboBox<String> getMembershipTypeComboBox() {
		return this.membershiptype;
	} //add
	public JComboBox<String> getMembershipIDComboBox() {
		return this.membershipID;
	} // delete
	public JComboBox<String> getTerminateMembershipIDComboBox() {
		return this.terminateMembershipID;
	} // terminate

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
	public JFrame getReadAllSubscriptionFrame() {
		return this.readMembershipFrame;
	}
	public JFrame getReadActiveSubscriptionFrame() {
		return this.readMembershipFrame2;
	}
	public JFrame getTerminateSubscriptionFrame() {
		return this.terminateMembershipFrame;
	}

	public int getMemberID() {
		return this.memberID.getSelectedIndex();
	}
	public String getSubscriptionType() {
		return (String) this.membershiptype.getSelectedItem();
	}
	public String getStartDate() {
		return this.startdate.getText();
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
	public void goToReadAllButton(ActionListener actionListener) {
		this.goToReadAll.addActionListener(actionListener);
	}
	public void goToReadActiveButton(ActionListener actionListener) {
		this.goToReadActive.addActionListener(actionListener);
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
	public void readAllBackButton(ActionListener actionListener) {
		this.readAllBack.addActionListener(actionListener);
	}
	public void readActiveBackButton(ActionListener actionListener) {
		this.readActiveBack.addActionListener(actionListener);
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
			cm.getColumn(0).setMinWidth(100);
			cm.getColumn(1).setMinWidth(80);
			cm.getColumn(2).setMinWidth(300);
			cm.getColumn(3).setMinWidth(220);
			cm.getColumn(4).setMinWidth(220);
		}
	}

	public void setActiveTable(Object[][] data) {
		String[] columnNames = {
				"Subscription ID", "Member ID", "Subscription Type ID", "Start Date", "End Date"
		};
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		membershipTable2.setModel(model);

		{
			TableColumnModel cm = membershipTable2.getColumnModel();
			cm.getColumn(0).setMinWidth(100);
			cm.getColumn(1).setMinWidth(100);
			cm.getColumn(2).setMinWidth(100);
			cm.getColumn(3).setMinWidth(220);
			cm.getColumn(4).setMinWidth(220);
		}
	}

}
