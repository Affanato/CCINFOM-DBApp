import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Sat Nov 16 09:29:31 PST 2024
 */



/**
 * @author Diane
 */
public class TrainingSessionView {
	public TrainingSessionView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
		trainingSessionFrame = new JFrame();
		trainingSessionBackButton = new JButton();
		titleBar = new JFormattedTextField();
		goToAdd = new JButton();
		goToDelete = new JButton();
		goToRead = new JButton();
		label1 = new JLabel();
		schedulSessionFrame = new JFrame();
		subscriptionID = new JComboBox<>();
		trainerID = new JComboBox<>();
		startdatetime = new JTextPane();
		enddatetime = new JTextPane();
		scheduleSession = new JButton();
		editorPane1 = new JEditorPane();
		scheduleBack = new JButton();
		titleBar2 = new JFormattedTextField();
		label2 = new JLabel();
		cancelSessionFrame = new JFrame();
		trainingSessionText = new JFormattedTextField();
		trainingSessionID = new JComboBox<>();
		cancelSession = new JButton();
		editorPane2 = new JEditorPane();
		cancelBack = new JButton();
		titleBar3 = new JFormattedTextField();
		label3 = new JLabel();
		readSessionFrame = new JFrame();
		scrollPane1 = new JScrollPane();
		trainingSessionTable = new JTable();
		readBack = new JButton();
		titleBar4 = new JFormattedTextField();
		label4 = new JLabel();

		//======== trainingSessionFrame ========
		{
			Container trainingSessionFrameContentPane = trainingSessionFrame.getContentPane();
			trainingSessionFrameContentPane.setLayout(null);

			//---- trainingSessionBackButton ----
			trainingSessionBackButton.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			trainingSessionBackButton.setIcon(new ImageIcon("resource\\backButton.jpg"));
			trainingSessionBackButton.setBackground(new Color(0xc80f2e));
			trainingSessionFrameContentPane.add(trainingSessionBackButton);
			trainingSessionBackButton.setBounds(5, 5, trainingSessionBackButton.getPreferredSize().width, 45);

			//---- titleBar ----
			titleBar.setText("Training Session");
			titleBar.setBackground(new Color(0xc80f2e));
			titleBar.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar.setForeground(Color.white);
			titleBar.setEditable(false);
			trainingSessionFrameContentPane.add(titleBar);
			titleBar.setBounds(0, 0, 1195, 55);

			//---- goToAdd ----
			goToAdd.setText("SCHEDULE SESSION");
			goToAdd.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToAdd.setForeground(Color.white);
			goToAdd.setBackground(new Color(0x3ca3cb));
			trainingSessionFrameContentPane.add(goToAdd);
			goToAdd.setBounds(470, 225, 250, 55);

			//---- goToDelete ----
			goToDelete.setText("CANCEL SESSION");
			goToDelete.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToDelete.setForeground(Color.white);
			goToDelete.setBackground(new Color(0x3ca3cb));
			trainingSessionFrameContentPane.add(goToDelete);
			goToDelete.setBounds(470, 310, 250, 55);

			//---- goToRead ----
			goToRead.setText("READ SESSIONS");
			goToRead.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToRead.setForeground(Color.white);
			goToRead.setBackground(new Color(0x3ca3cb));
			trainingSessionFrameContentPane.add(goToRead);
			goToRead.setBounds(470, 395, 250, 55);

			//---- label1 ----
			label1.setIcon(new ImageIcon("resource\\trainers.jpg"));
			trainingSessionFrameContentPane.add(label1);
			label1.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < trainingSessionFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = trainingSessionFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = trainingSessionFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				trainingSessionFrameContentPane.setMinimumSize(preferredSize);
				trainingSessionFrameContentPane.setPreferredSize(preferredSize);
			}
			trainingSessionFrame.pack();  
			trainingSessionFrame.setSize(1200, 700);
			trainingSessionFrame.setLocationRelativeTo(null);
			trainingSessionFrame.setVisible(true);
		}

		//======== schedulSessionFrame ========
		{
			Container schedulSessionFrameContentPane = schedulSessionFrame.getContentPane();
			schedulSessionFrameContentPane.setLayout(null);

			//---- subscriptionID ----
			subscriptionID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			schedulSessionFrameContentPane.add(subscriptionID);
			subscriptionID.setBounds(405, 205, 390, 40);

			//---- trainerID ----
			trainerID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			schedulSessionFrameContentPane.add(trainerID);
			trainerID.setBounds(405, 265, 390, 40);

			//---- startdatetime ----
			startdatetime.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			schedulSessionFrameContentPane.add(startdatetime);
			startdatetime.setBounds(405, 325, 175, 35);

			//---- enddatetime ----
			enddatetime.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			schedulSessionFrameContentPane.add(enddatetime);
			enddatetime.setBounds(620, 325, 175, 35);

			//---- scheduleSession ----
			scheduleSession.setText("SCHEDULE SESSION");
			scheduleSession.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			scheduleSession.setForeground(Color.white);
			scheduleSession.setBackground(new Color(0x3ca3cb));
			schedulSessionFrameContentPane.add(scheduleSession);
			scheduleSession.setBounds(470, 385, 250, 55);

			//---- editorPane1 ----
			editorPane1.setBackground(new Color(0xb5b9b8));
			schedulSessionFrameContentPane.add(editorPane1);
			editorPane1.setBounds(365, 175, 470, 285);

			//---- scheduleBack ----
			scheduleBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			scheduleBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			scheduleBack.setBackground(new Color(0xc80f2e));
			schedulSessionFrameContentPane.add(scheduleBack);
			scheduleBack.setBounds(5, 5, scheduleBack.getPreferredSize().width, 45);

			//---- titleBar2 ----
			titleBar2.setText("Training Session: Schedule a Session");
			titleBar2.setBackground(new Color(0xc80f2e));
			titleBar2.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar2.setForeground(Color.white);
			titleBar2.setEditable(false);
			schedulSessionFrameContentPane.add(titleBar2);
			titleBar2.setBounds(0, 0, 1200, 55);

			//---- label2 ----
			label2.setIcon(new ImageIcon("resource\\trainers.jpg"));
			schedulSessionFrameContentPane.add(label2);
			label2.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < schedulSessionFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = schedulSessionFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = schedulSessionFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				schedulSessionFrameContentPane.setMinimumSize(preferredSize);
				schedulSessionFrameContentPane.setPreferredSize(preferredSize);
			}
			schedulSessionFrame.setSize(1200, 700);
			schedulSessionFrame.setLocationRelativeTo(null);
		}

		//======== cancelSessionFrame ========
		{
			Container cancelSessionFrameContentPane = cancelSessionFrame.getContentPane();
			cancelSessionFrameContentPane.setLayout(null);

			//---- trainingSessionText ----
			trainingSessionText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			trainingSessionText.setText("Select Training Session");
			trainingSessionText.setHorizontalAlignment(SwingConstants.CENTER);
			trainingSessionText.setEditable(false);
			cancelSessionFrameContentPane.add(trainingSessionText);
			trainingSessionText.setBounds(350, 210, 470, 35);

			//---- trainingSessionID ----
			trainingSessionID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			cancelSessionFrameContentPane.add(trainingSessionID);
			trainingSessionID.setBounds(390, 275, 390, 40);

			//---- cancelSession ----
			cancelSession.setText("CANCEL SESSION");
			cancelSession.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			cancelSession.setForeground(Color.white);
			cancelSession.setBackground(new Color(0x3ca3cb));
			cancelSessionFrameContentPane.add(cancelSession);
			cancelSession.setBounds(455, 355, 250, 55);

			//---- editorPane2 ----
			editorPane2.setBackground(new Color(0xb5b9b8));
			cancelSessionFrameContentPane.add(editorPane2);
			editorPane2.setBounds(350, 210, 470, 220);

			//---- cancelBack ----
			cancelBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			cancelBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			cancelBack.setBackground(new Color(0xc80f2e));
			cancelSessionFrameContentPane.add(cancelBack);
			cancelBack.setBounds(5, 5, cancelBack.getPreferredSize().width, 45);

			//---- titleBar3 ----
			titleBar3.setText("Training Session: Cancel a Session");
			titleBar3.setBackground(new Color(0xc80f2e));
			titleBar3.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar3.setForeground(Color.white);
			titleBar3.setEditable(false);
			cancelSessionFrameContentPane.add(titleBar3);
			titleBar3.setBounds(0, 0, 1200, 55);

			//---- label3 ----
			label3.setIcon(new ImageIcon("resource\\trainers.jpg"));
			cancelSessionFrameContentPane.add(label3);
			label3.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < cancelSessionFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = cancelSessionFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = cancelSessionFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				cancelSessionFrameContentPane.setMinimumSize(preferredSize);
				cancelSessionFrameContentPane.setPreferredSize(preferredSize);
			}
			cancelSessionFrame.setSize(1200, 700);
			cancelSessionFrame.setLocationRelativeTo(null);
		}

		//======== readSessionFrame ========
		{
			Container readSessionFrameContentPane = readSessionFrame.getContentPane();
			readSessionFrameContentPane.setLayout(null);

			//======== scrollPane1 ========
			{

				//---- trainingSessionTable ----
				trainingSessionTable.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null},
						{null, null, null, null, null},
					},
					new String[] {
						"Training Session ID", "Membership ID", "Trainer ID", "Start Date and Time", "End Date and Time"
					}
				));
				{
					TableColumnModel cm = trainingSessionTable.getColumnModel();
					cm.getColumn(0).setMinWidth(150);
					cm.getColumn(0).setMaxWidth(150);
					cm.getColumn(1).setMinWidth(150);
					cm.getColumn(1).setMaxWidth(150);
					cm.getColumn(2).setMinWidth(150);
					cm.getColumn(2).setMaxWidth(150);
				}
				trainingSessionTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				trainingSessionTable.setEnabled(false);
				scrollPane1.setViewportView(trainingSessionTable);
			}
			readSessionFrameContentPane.add(scrollPane1);
			scrollPane1.setBounds(105, 115, 1000, 470);

			//---- readBack ----
			readBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			readBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			readBack.setBackground(new Color(0xc80f2e));
			readSessionFrameContentPane.add(readBack);
			readBack.setBounds(5, 5, readBack.getPreferredSize().width, 45);

			//---- titleBar4 ----
			titleBar4.setText("Training Session: Read Sessions");
			titleBar4.setBackground(new Color(0xc80f2e));
			titleBar4.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar4.setForeground(Color.white);
			titleBar4.setEditable(false);
			readSessionFrameContentPane.add(titleBar4);
			titleBar4.setBounds(0, 0, 1200, 55);

			//---- label4 ----
			label4.setIcon(new ImageIcon("resource\\trainers.jpg"));
			readSessionFrameContentPane.add(label4);
			label4.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < readSessionFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = readSessionFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = readSessionFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				readSessionFrameContentPane.setMinimumSize(preferredSize);
				readSessionFrameContentPane.setPreferredSize(preferredSize);
			}
			readSessionFrame.setSize(1200, 700);
			readSessionFrame.setLocationRelativeTo(null);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
	private JFrame trainingSessionFrame;
	private JButton trainingSessionBackButton;
	private JFormattedTextField titleBar;
	private JButton goToAdd;
	private JButton goToDelete;
	private JButton goToRead;
	private JLabel label1;
	private JFrame schedulSessionFrame;
	private JComboBox<String> subscriptionID;
	private JComboBox<String> trainerID;
	private JTextPane startdatetime;
	private JTextPane enddatetime;
	private JButton scheduleSession;
	private JEditorPane editorPane1;
	private JButton scheduleBack;
	private JFormattedTextField titleBar2;
	private JLabel label2;
	private JFrame cancelSessionFrame;
	private JFormattedTextField trainingSessionText;
	private JComboBox<String> trainingSessionID;
	private JButton cancelSession;
	private JEditorPane editorPane2;
	private JButton cancelBack;
	private JFormattedTextField titleBar3;
	private JLabel label3;
	private JFrame readSessionFrame;
	private JScrollPane scrollPane1;
	private JTable trainingSessionTable;
	private JButton readBack;
	private JFormattedTextField titleBar4;
	private JLabel label4;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


	// jcombobox getters
	public JComboBox<String> getSubscriptionIDComboBox() {
		return this.subscriptionID;
	}
	public JComboBox<String> getTrainerIDComboBox() {
		return this.trainerID;
	}
	public JComboBox<String> getTrainingSessionIDComboBox() {
		return this.trainingSessionID;
	}

	// getters
	public JFrame getTrainingSessionFrame() {
		return this.trainingSessionFrame;
	}
	public JFrame getScheduleSessionFrame() {
		return this.schedulSessionFrame;
	}
	public JFrame getCancelSessionFrame() {
		return this.cancelSessionFrame;
	}
	public JFrame getReadSessionFrame() {
		return this.readSessionFrame;
	}

	public int getSubscriptionID() {
		return this.subscriptionID.getSelectedIndex() + 1; // might have to edit if list is only for active suusbcriptions
	}

	public int getTrainerID() {
		return this.trainerID.getSelectedIndex() + 1;
	}

	public String getStartDate() {
		return this.startdatetime.getText();
	}

	public String getEndDate() {
		return this.enddatetime.getText();
	}

	public int getTrainingSessionID() {
		return this.trainingSessionID.getSelectedIndex() + 1;
	}

	// buttons
	public void trainingSessionBackButton(ActionListener actionListener) {
		this.trainingSessionBackButton.addActionListener(actionListener);
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

	public void scheduleBackButton(ActionListener actionListener) {
		this.scheduleBack.addActionListener(actionListener);
	}
	public void cancelBackButton(ActionListener actionListener) {
		this.cancelBack.addActionListener(actionListener);
	}
	public void readBackButton(ActionListener actionListener) {
		this.readBack.addActionListener(actionListener);
	}

	public void scheduleSessionButton(ActionListener actionListener) {
		this.scheduleSession.addActionListener(actionListener);
	}
	public void cancelSessionButton(ActionListener actionListener) {
		this.cancelSession.addActionListener(actionListener);
	}
}
