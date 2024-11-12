import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Sun Nov 10 15:54:41 PST 2024
 */



/**
 * @author Diane
 */
public class TrainerAvailabilityView {
	public TrainerAvailabilityView() {
		initComponents();
	}

	private void trainerAvailabilityBackButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void updateMouseClicked(MouseEvent e) {
		// TODO add your code here
	}


	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
		trainerAvailabilityFrame = new JFrame();
		trainerAvailabilityBackButton = new JButton();
		titleBar3 = new JFormattedTextField();
		trainerIDTextField = new JFormattedTextField();
		restockQuantityTextField = new JFormattedTextField();
		changeSched = new JTextPane();
		trainerID = new JTextPane();
		updateButton = new JButton();
		scrollPane1 = new JScrollPane();
		trainerTable = new JTable();

		//======== trainerAvailabilityFrame ========
		{
			Container trainerAvailabilityFrameContentPane = trainerAvailabilityFrame.getContentPane();
			trainerAvailabilityFrameContentPane.setLayout(null);

			//---- trainerAvailabilityBackButton ----
			trainerAvailabilityBackButton.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\backButton.jpg"));
			trainerAvailabilityBackButton.setBackground(new Color(0xc80f2e));
			trainerAvailabilityBackButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					trainerAvailabilityBackButtonMouseClicked(e);
				}
			});
			trainerAvailabilityFrameContentPane.add(trainerAvailabilityBackButton);
			trainerAvailabilityBackButton.setBounds(5, 5, 95, 45);

			//---- titleBar3 ----
			titleBar3.setText("Trainer Availability");
			titleBar3.setBackground(new Color(0xc80f2e));
			titleBar3.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar3.setForeground(Color.white);
			trainerAvailabilityFrameContentPane.add(titleBar3);
			titleBar3.setBounds(0, 0, 1200, 55);

			//---- trainerIDTextField ----
			trainerIDTextField.setText(" Trainer ID:");
			trainerIDTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			trainerAvailabilityFrameContentPane.add(trainerIDTextField);
			trainerIDTextField.setBounds(405, 445, 105, 35);

			//---- restockQuantityTextField ----
			restockQuantityTextField.setText(" Update Schedule to:");
			restockQuantityTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			trainerAvailabilityFrameContentPane.add(restockQuantityTextField);
			restockQuantityTextField.setBounds(405, 500, 190, 35);

			//---- changeSched ----
			changeSched.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			trainerAvailabilityFrameContentPane.add(changeSched);
			changeSched.setBounds(640, 500, 130, 35);

			//---- trainerID ----
			trainerID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			trainerAvailabilityFrameContentPane.add(trainerID);
			trainerID.setBounds(640, 445, 130, 35);

			//---- updateButton ----
			updateButton.setText("UPDATE");
			updateButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			updateButton.setBackground(new Color(0x3ca3cb));
			updateButton.setForeground(Color.white);
			updateButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					updateMouseClicked(e);
				}
			});
			trainerAvailabilityFrameContentPane.add(updateButton);
			updateButton.setBounds(505, 575, 180, 45);

			//======== scrollPane1 ========
			{

				//---- trainerTable ----
				
				scrollPane1.setViewportView(trainerTable);
			}
			trainerAvailabilityFrameContentPane.add(scrollPane1);
			scrollPane1.setBounds(90, 120, 1010, 290);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < trainerAvailabilityFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = trainerAvailabilityFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = trainerAvailabilityFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				trainerAvailabilityFrameContentPane.setMinimumSize(preferredSize);
				trainerAvailabilityFrameContentPane.setPreferredSize(preferredSize);
			}
			trainerAvailabilityFrame.pack();
			trainerAvailabilityFrame.setSize(1200, 700);
			trainerAvailabilityFrame.setLocationRelativeTo(null);
			trainerAvailabilityFrame.setVisible(true);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
	private JFrame trainerAvailabilityFrame;
	private JButton trainerAvailabilityBackButton;
	private JFormattedTextField titleBar3;
	private JFormattedTextField trainerIDTextField;
	private JFormattedTextField restockQuantityTextField;
	private JTextPane changeSched;
	private JTextPane trainerID;
	private JButton updateButton;
	private JScrollPane scrollPane1;
	private JTable trainerTable;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


	// button action listeners
	public void trainerAvailabilityBackButton(ActionListener actionListener) {
		this.trainerAvailabilityBackButton.addActionListener(actionListener);
	}

	public void updateButtonListener(ActionListener actionListener) {
		this.updateButton.addActionListener(actionListener);
	}

	// getters
	public JFrame getTrainerAvailabilityFrame() {
		return this.trainerAvailabilityFrame;
	}

	public String getChangeSched() {
		return this.changeSched.getText();
	}

	public String getTrainerID() {
		return this.trainerID.getText();
	}

	// set table model
	public void setTrainerTableData(Object[][] data, String[] columnNames) { 
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		trainerTable.setModel(model);
		{
			TableColumnModel cm = trainerTable.getColumnModel();
			cm.getColumn(0).setMinWidth(80);
			cm.getColumn(1).setMinWidth(200);
			cm.getColumn(2).setMinWidth(200);
			cm.getColumn(3).setMinWidth(150);
		}
	}
}
