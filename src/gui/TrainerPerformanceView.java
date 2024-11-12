import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Mon Nov 11 00:23:26 PST 2024
 */



/**
 * @author Diane
 */
public class TrainerPerformanceView extends JFrame {
	public TrainerPerformanceView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
		updateTrainerFrame = new JFrame();
		updateTrainerBackButton = new JButton();
		titleBar4 = new JFormattedTextField();
		memIDTextField = new JFormattedTextField();
		membershipID = new JTextPane();
		perfRatingTextField = new JFormattedTextField();
		performanceRating = new JTextPane();
		updateRatingButton = new JButton();
		scrollPane1 = new JScrollPane();
		memberTrainerTable = new JTable();

		//======== updateTrainerFrame ========
		{
			Container updateTrainerFrameContentPane = updateTrainerFrame.getContentPane();
			updateTrainerFrameContentPane.setLayout(null);

			//---- updateTrainerBackButton ----
			updateTrainerBackButton.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\backButton.jpg"));
			updateTrainerBackButton.setBackground(new Color(0xc80f2e));
			updateTrainerFrameContentPane.add(updateTrainerBackButton);
			updateTrainerBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar4 ----
			titleBar4.setText("Update Trainer Performance Rating");
			titleBar4.setBackground(new Color(0xc80f2e));
			titleBar4.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar4.setForeground(Color.white);
			updateTrainerFrameContentPane.add(titleBar4);
			titleBar4.setBounds(0, 0, 1200, 55);

			//---- memIDTextField ----
			memIDTextField.setText("Membership ID:");
			memIDTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updateTrainerFrameContentPane.add(memIDTextField);
			memIDTextField.setBounds(455, 430, 170, 35);

			//---- membershipID ----
			membershipID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateTrainerFrameContentPane.add(membershipID);
			membershipID.setBounds(655, 430, 80, 35);

			//---- perfRatingTextField ----
			perfRatingTextField.setText("Performance Rating:");
			perfRatingTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			updateTrainerFrameContentPane.add(perfRatingTextField);
			perfRatingTextField.setBounds(455, 490, 170, 35);

			//---- performaceRating ----
			performanceRating.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateTrainerFrameContentPane.add(performanceRating);
			performanceRating.setBounds(655, 490, 80, 35);

			//---- updateRatingButton ----
			updateRatingButton.setText("UPDATE");
			updateRatingButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			updateRatingButton.setBackground(new Color(0x3ca3cb));
			updateRatingButton.setForeground(Color.white);
			updateTrainerFrameContentPane.add(updateRatingButton);


			//======== scrollPane1 ========
			{
				scrollPane1.setViewportView(memberTrainerTable);
			}
				updateTrainerFrameContentPane.add(scrollPane1);
				scrollPane1.setBounds(60, 85, 1075, 290);

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
				updateTrainerFrame.setSize(1200, 700);
				updateTrainerFrame.setLocationRelativeTo(null);
				updateTrainerFrame.setVisible(true);
			}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
	private JFrame updateTrainerFrame;
	private JButton updateTrainerBackButton;
	private JFormattedTextField titleBar4;
	private JFormattedTextField memIDTextField;
	private JTextPane membershipID;
	private JFormattedTextField perfRatingTextField;
	private JTextPane performanceRating;
	private JButton updateRatingButton;
	private JScrollPane scrollPane1;
	private JTable memberTrainerTable;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

	// button action listeners
	public void updateTrainerBackButtonListener(ActionListener actionListener) {
		this.updateTrainerBackButton.addActionListener(actionListener);
	}

	public void updateRatingButtonListener(ActionListener actionListener) {
		this.updateRatingButton.addActionListener(actionListener);
	}

	// getters
	public JFrame getUpdateTrainerFrame() {
		return this.updateTrainerFrame;
	}

	public String getPerformanceRating() {
		return this.performanceRating.getText();
	}

	public String getMembershipID() {
		return this.membershipID.getText();
	}

	// set table model
	public void setMemberTrainerTableData(Object[][] data, String[] columnNames) { 
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		memberTrainerTable.setModel(model);
		
		TableColumnModel cm = memberTrainerTable.getColumnModel();
		cm.getColumn(0).setMinWidth(110);
		cm.getColumn(0).setMaxWidth(150);
		cm.getColumn(3).setMaxWidth(80);
	}
}
