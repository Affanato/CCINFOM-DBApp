import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Sun Nov 10 22:30:39 PST 2024
 */



/**
 * @author Diane
 */
public class BranchInformationView extends JFrame {
	public BranchInformationView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
		branchInfoFrame = new JFrame();
		branchBackButton = new JButton();
		titleBar = new JFormattedTextField();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		memTypeButton = new JButton();
		trainerButton = new JButton();
		productButton = new JButton();
		productsFrame = new JFrame();
		productsBackButton = new JButton();
		titleBar2 = new JFormattedTextField();
		scrollPane1 = new JScrollPane();
		productsTable = new JTable();
		trainersFrame = new JFrame();
		trainersBackButton = new JButton();
		titleBar3 = new JFormattedTextField();
		scrollPane2 = new JScrollPane();
		trainersTable = new JTable();
		membershipsFrame = new JFrame();
		membershipBackButton = new JButton();
		titleBar4 = new JFormattedTextField();
		formattedTextField1 = new JFormattedTextField();
		editorPane2 = new JEditorPane();
		formattedTextField2 = new JFormattedTextField();
		editorPane3 = new JEditorPane();

		//======== branchInfoFrame ========
		{
			Container branchInfoFrameContentPane = branchInfoFrame.getContentPane();
			branchInfoFrameContentPane.setLayout(null);

			//---- branchBackButton ----
			branchBackButton.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\backButton.jpg"));
			branchBackButton.setBackground(new Color(0xc80f2e));
			branchInfoFrameContentPane.add(branchBackButton);
			branchBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar ----
			titleBar.setText("Branch Information");
			titleBar.setBackground(new Color(0xc80f2e));
			titleBar.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar.setForeground(Color.white);
			branchInfoFrameContentPane.add(titleBar);
			titleBar.setBounds(0, 0, 1200, 55);

			//---- label1 ----
			label1.setText("image here!");
			label1.setBackground(Color.blue);
			label1.setHorizontalAlignment(SwingConstants.CENTER);
			label1.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\availability.jpg"));
			branchInfoFrameContentPane.add(label1);
			label1.setBounds(70, 130, 305, 370);

			//---- label2 ----
			label2.setText("image here!");
			label2.setBackground(Color.blue);
			label2.setHorizontalAlignment(SwingConstants.CENTER);
			label2.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\recordsales.jpg"));
			branchInfoFrameContentPane.add(label2);
			label2.setBounds(455, 130, 305, 370);

			//---- label3 ----
			label3.setText("image here!");
			label3.setBackground(Color.blue);
			label3.setHorizontalAlignment(SwingConstants.CENTER);
			label3.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\restock.jpg"));
			branchInfoFrameContentPane.add(label3);
			label3.setBounds(845, 130, 305, 370);

			//---- memTypeButtons ----
			memTypeButton.setText("VIEW MEMBERSHIP TYPES");
			memTypeButton.setSelectedIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\gym.jpg"));
			memTypeButton.setBackground(new Color(0x3ca3cb));
			memTypeButton.setForeground(Color.white);
			memTypeButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			branchInfoFrameContentPane.add(memTypeButton);
			memTypeButton.setBounds(870, 540, 250, 55);

			//---- trainerButtons ----
			trainerButton.setText("VIEW ALL TRAINERS");
			trainerButton.setSelectedIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\gym.jpg"));
			trainerButton.setBackground(new Color(0x3ca3cb));
			trainerButton.setForeground(Color.white);
			trainerButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			branchInfoFrameContentPane.add(trainerButton);
			trainerButton.setBounds(480, 540, 250, 55);

			//---- productButton ----
			productButton.setText("VIEW ALL PRODUCTS");
			productButton.setSelectedIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\gym.jpg"));
			productButton.setBackground(new Color(0x3ca3cb));
			productButton.setForeground(Color.white);
			productButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			branchInfoFrameContentPane.add(productButton);
			productButton.setBounds(90, 540, 250, 55);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < branchInfoFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = branchInfoFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = branchInfoFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				branchInfoFrameContentPane.setMinimumSize(preferredSize);
				branchInfoFrameContentPane.setPreferredSize(preferredSize);
			}
			branchInfoFrame.pack();
			branchInfoFrame.setSize(1200, 700);
			branchInfoFrame.setLocationRelativeTo(null);
			branchInfoFrame.setVisible(true);
		}

		//======== productsFrame ========
		{
			Container productsFrameContentPane = productsFrame.getContentPane();
			productsFrameContentPane.setLayout(null);

			//---- productsBackButton ----
			productsBackButton.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\backButton.jpg"));
			productsBackButton.setBackground(new Color(0xc80f2e));
			productsFrameContentPane.add(productsBackButton);
			productsBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar2 ----
			titleBar2.setText("Branch Information: View All Products");
			titleBar2.setBackground(new Color(0xc80f2e));
			titleBar2.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar2.setForeground(Color.white);
			productsFrameContentPane.add(titleBar2);
			titleBar2.setBounds(0, 0, 1200, 55);

			//======== scrollPane1 ========
			{

				//---- productsTable ----
				scrollPane1.setViewportView(productsTable);
			}
			productsFrameContentPane.add(scrollPane1);
			scrollPane1.setBounds(90, 120, 1010, 500);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < productsFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = productsFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = productsFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				productsFrameContentPane.setMinimumSize(preferredSize);
				productsFrameContentPane.setPreferredSize(preferredSize);
			}
			productsFrame.setSize(1200, 700);
			productsFrame.setLocationRelativeTo(null);
		}

		//======== trainersFrame ========
		{
			Container trainersFrameContentPane = trainersFrame.getContentPane();
			trainersFrameContentPane.setLayout(null);

			//---- trainersBackButton ----
			trainersBackButton.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\backButton.jpg"));
			trainersBackButton.setBackground(new Color(0xc80f2e));
			trainersFrameContentPane.add(trainersBackButton);
			trainersBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar3 ----
			titleBar3.setText("Branch Information: View All Trainers");
			titleBar3.setBackground(new Color(0xc80f2e));
			titleBar3.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar3.setForeground(Color.white);
			trainersFrameContentPane.add(titleBar3);
			titleBar3.setBounds(0, 0, 1200, 55);

			//======== scrollPane2 ========
			{

				//---- trainersTable ----
				
				scrollPane2.setViewportView(trainersTable);
			}
			trainersFrameContentPane.add(scrollPane2);
			scrollPane2.setBounds(90, 120, 1010, 500);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < trainersFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = trainersFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = trainersFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				trainersFrameContentPane.setMinimumSize(preferredSize);
				trainersFrameContentPane.setPreferredSize(preferredSize);
			}
			trainersFrame.setSize(1200, 700);
			trainersFrame.setLocationRelativeTo(null);
		}

		//======== membershipsFrame ========
		{
			Container membershipsFrameContentPane = membershipsFrame.getContentPane();
			membershipsFrameContentPane.setLayout(null);

			//---- membershipBackButton ----
			membershipBackButton.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\backButton.jpg"));
			membershipBackButton.setBackground(new Color(0xc80f2e));
			membershipsFrameContentPane.add(membershipBackButton);
			membershipBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar4 ----
			titleBar4.setText("Branch Information: View Membership Types");
			titleBar4.setBackground(new Color(0xc80f2e));
			titleBar4.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar4.setForeground(Color.white);
			membershipsFrameContentPane.add(titleBar4);
			titleBar4.setBounds(0, 0, 1200, 55);

			//---- formattedTextField1 ----
			formattedTextField1.setBackground(new Color(0x3ca3cb));
			formattedTextField1.setText("STANDARD");
			formattedTextField1.setFont(new Font("Tw Cen MT", Font.BOLD, 22));
			formattedTextField1.setForeground(Color.white);
			formattedTextField1.setHorizontalAlignment(SwingConstants.CENTER);
			membershipsFrameContentPane.add(formattedTextField1);
			formattedTextField1.setBounds(150, 135, 370, 50);

			//---- editorPane2 ----
			editorPane2.setBackground(Color.white);
			membershipsFrameContentPane.add(editorPane2);
			editorPane2.setBounds(150, 135, 370, 450);

			//---- formattedTextField2 ----
			formattedTextField2.setBackground(new Color(0x3ca3cb));
			formattedTextField2.setText("PREMIUM");
			formattedTextField2.setFont(new Font("Tw Cen MT", Font.BOLD, 22));
			formattedTextField2.setForeground(Color.white);
			formattedTextField2.setHorizontalAlignment(SwingConstants.CENTER);
			membershipsFrameContentPane.add(formattedTextField2);
			formattedTextField2.setBounds(665, 135, 370, 50);

			//---- editorPane3 ----
			editorPane3.setBackground(Color.white);
			membershipsFrameContentPane.add(editorPane3);
			editorPane3.setBounds(665, 135, 370, 450);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < membershipsFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = membershipsFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = membershipsFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				membershipsFrameContentPane.setMinimumSize(preferredSize);
				membershipsFrameContentPane.setPreferredSize(preferredSize);
			}
			membershipsFrame.setSize(1200, 700);
			membershipsFrame.setLocationRelativeTo(null);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
	private JFrame branchInfoFrame;
	private JButton branchBackButton;
	private JFormattedTextField titleBar;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JButton memTypeButton;
	private JButton trainerButton;
	private JButton productButton;
	private JFrame productsFrame;
	private JButton productsBackButton;
	private JFormattedTextField titleBar2;
	private JScrollPane scrollPane1;
	private JTable productsTable;
	private JFrame trainersFrame;
	private JButton trainersBackButton;
	private JFormattedTextField titleBar3;
	private JScrollPane scrollPane2;
	private JTable trainersTable;
	private JFrame membershipsFrame;
	private JButton membershipBackButton;
	private JFormattedTextField titleBar4;
	private JFormattedTextField formattedTextField1;
	private JEditorPane editorPane2;
	private JFormattedTextField formattedTextField2;
	private JEditorPane editorPane3;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

	// button action listeners
	public void branchBackButtonListener(ActionListener actionListener) {
		this.branchBackButton.addActionListener(actionListener);
	}

	public void memTypeButtonListener(ActionListener actionListener) {
		this.memTypeButton.addActionListener(actionListener);
	}

	public void trainerButtonListener(ActionListener actionListener) {
		this.trainerButton.addActionListener(actionListener);
	}

	public void productButtonListener(ActionListener actionListener) {
		this.productButton.addActionListener(actionListener);
	}

	public void productsBackButtonListener(ActionListener actionListener) {
		this.productsBackButton.addActionListener(actionListener);
	}

	public void trainersBackButtonListener(ActionListener actionListener) {
		this.trainersBackButton.addActionListener(actionListener);
	}

	public void membershipBackButtonListener(ActionListener actionListener) {
		this.membershipBackButton.addActionListener(actionListener);
	}

	// getters
	public JFrame getBranchInfoFrame() {
		return this.branchInfoFrame;
	}

	public JFrame getProductsFrame() {
		return this.productsFrame;
	}

	public JFrame getMembershipsFrame() {
		return this.membershipsFrame;
	}

	public JFrame getTrainersFrame() {
		return this.trainersFrame;
	}

	// set table model
	public void setTrainersTableData(Object[][] data, String[] columnNames) { 
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		trainersTable.setModel(model);
		
		{
			TableColumnModel cm = trainersTable.getColumnModel();
			cm.getColumn(0).setMinWidth(80);
			cm.getColumn(1).setMinWidth(200);
			cm.getColumn(2).setMinWidth(200);
			cm.getColumn(3).setMinWidth(200);
			cm.getColumn(4).setMinWidth(150);
		}
	}

	public void setProductsTableData(Object[][] data, String[] columnNames) { 
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		productsTable.setModel(model);
		
		{
			TableColumnModel cm = productsTable.getColumnModel();
			cm.getColumn(0).setMinWidth(80);
			cm.getColumn(1).setMinWidth(200);
			cm.getColumn(2).setMinWidth(350);
			cm.getColumn(2).setMaxWidth(450);
			cm.getColumn(3).setMinWidth(200);
			cm.getColumn(4).setMinWidth(150);
		}
	}
}
