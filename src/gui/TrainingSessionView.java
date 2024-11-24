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
		DBUtils.getConnection();
		initComponents();
	}

	public void clearText() {
		subscriptionID.setSelectedIndex(0);
		trainerID.setSelectedIndex(0);
		startdatetime.setText("YYYY-MM-DD hh:mm:ss");
		enddatetime.setText("YYYY-MM-DD hh:mm:ss");
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Marxandrea Cabato
		trainingSessionFrame = new JFrame();
		trainingSessionBackButton = new JButton();
		titleBar = new JFormattedTextField();
		goToAdd = new JButton();
		goToDelete = new JButton();
		goToReadUpcoming = new JButton();
		goToReadAll = new JButton();
		goToUpdate = new JButton();
		label1 = new JLabel();
		schedulSessionFrame = new JFrame();
		subscriptionID = new JComboBox();
		trainerID = new JComboBox();
		startdatetime = new JTextPane();
		enddatetime = new JTextPane();
		scheduleSession = new JButton();
		trainingSessionText2 = new JFormattedTextField();
		trainingSessionText3 = new JFormattedTextField();
		trainingSessionText4 = new JFormattedTextField();
		trainingSessionText5 = new JFormattedTextField();
		editorPane1 = new JEditorPane();
		scheduleBack = new JButton();
		titleBar2 = new JFormattedTextField();
		label2 = new JLabel();
		cancelSessionFrame = new JFrame();
		trainingSessionText = new JFormattedTextField();
		trainingSessionID = new JComboBox();
		cancelSession = new JButton();
		editorPane2 = new JEditorPane();
		cancelBack = new JButton();
		titleBar3 = new JFormattedTextField();
		label3 = new JLabel();
		readSessionFrame = new JFrame();
		scrollPane1 = new JScrollPane();
		trainingSessionTable = new JTable();
		readAllBack = new JButton();
		titleBar4 = new JFormattedTextField();
		label4 = new JLabel();
		updateSessionFrame1 = new JFrame();
		trainingSessionText6 = new JFormattedTextField();
		updateTrainingSessionID = new JComboBox();
		proceedUpdate = new JButton();
		editorPane3 = new JEditorPane();
		updateBack1 = new JButton();
		titleBar5 = new JFormattedTextField();
		label5 = new JLabel();
		updateSessionFrame2 = new JFrame();
		updateTrainerID = new JComboBox();
		updateStartdatetime = new JTextPane();
		updateEnddatetime = new JTextPane();
		updateSession = new JButton();
		trainingSessionText7 = new JFormattedTextField();
		trainingSessionText8 = new JFormattedTextField();
		trainingSessionText9 = new JFormattedTextField();
		trainingSessionText10 = new JFormattedTextField();
		updateSubscriptionID = new JTextPane();
		editorPane4 = new JEditorPane();
		updateBack2 = new JButton();
		titleBar6 = new JFormattedTextField();
		label6 = new JLabel();
		readUpcomingSessionFrame = new JFrame();
		scrollPane2 = new JScrollPane();
		trainingSessionTable2 = new JTable();
		readUpcomingBack = new JButton();
		titleBar7 = new JFormattedTextField();
		label7 = new JLabel();

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
			goToAdd.setBounds(305, 195, 250, 55);

			//---- goToDelete ----
			goToDelete.setText("CANCEL SESSION");
			goToDelete.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToDelete.setForeground(Color.white);
			goToDelete.setBackground(new Color(0x3ca3cb));
			trainingSessionFrameContentPane.add(goToDelete);
			goToDelete.setBounds(650, 195, 250, 55);

			//---- goToReadUpcoming ----
			goToReadUpcoming.setText("READ UPCOMING SESSIONS");
			goToReadUpcoming.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToReadUpcoming.setForeground(Color.white);
			goToReadUpcoming.setBackground(new Color(0x3ca3cb));
			trainingSessionFrameContentPane.add(goToReadUpcoming);
			goToReadUpcoming.setBounds(650, 300, 250, 55);

			//---- goToReadAll ----
			goToReadAll.setText("READ ALL SESSIONS");
			goToReadAll.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToReadAll.setForeground(Color.white);
			goToReadAll.setBackground(new Color(0x3ca3cb));
			trainingSessionFrameContentPane.add(goToReadAll);
			goToReadAll.setBounds(305, 300, 250, 55);

			//---- goToUpdate ----
			goToUpdate.setText("UPDATE SESSION");
			goToUpdate.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			goToUpdate.setForeground(Color.white);
			goToUpdate.setBackground(new Color(0x3ca3cb));
			trainingSessionFrameContentPane.add(goToUpdate);
			goToUpdate.setBounds(485, 410, 250, 55);

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
			subscriptionID.setBounds(505, 175, 390, 40);

			//---- trainerID ----
			trainerID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			schedulSessionFrameContentPane.add(trainerID);
			trainerID.setBounds(505, 235, 390, 40);

			//---- startdatetime ----
			startdatetime.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			startdatetime.setText("YYYY-MM-DD hh:mm:ss");
			schedulSessionFrameContentPane.add(startdatetime);
			startdatetime.setBounds(505, 295, 390, 35);

			//---- enddatetime ----
			enddatetime.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			enddatetime.setText("YYYY-MM-DD hh:mm:ss");
			schedulSessionFrameContentPane.add(enddatetime);
			enddatetime.setBounds(505, 350, 390, 35);

			//---- scheduleSession ----
			scheduleSession.setText("SCHEDULE SESSION");
			scheduleSession.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			scheduleSession.setForeground(Color.white);
			scheduleSession.setBackground(new Color(0x3ca3cb));
			schedulSessionFrameContentPane.add(scheduleSession);
			scheduleSession.setBounds(470, 415, 250, 55);

			//---- trainingSessionText2 ----
			trainingSessionText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			trainingSessionText2.setText("Member ID");
			trainingSessionText2.setHorizontalAlignment(SwingConstants.LEFT);
			trainingSessionText2.setEditable(false);
			schedulSessionFrameContentPane.add(trainingSessionText2);
			trainingSessionText2.setBounds(315, 175, 175, 40);

			//---- trainingSessionText3 ----
			trainingSessionText3.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			trainingSessionText3.setText("Trainer ID");
			trainingSessionText3.setHorizontalAlignment(SwingConstants.LEFT);
			trainingSessionText3.setEditable(false);
			schedulSessionFrameContentPane.add(trainingSessionText3);
			trainingSessionText3.setBounds(315, 235, 175, 40);

			//---- trainingSessionText4 ----
			trainingSessionText4.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			trainingSessionText4.setText("Start Date and Time");
			trainingSessionText4.setHorizontalAlignment(SwingConstants.LEFT);
			trainingSessionText4.setEditable(false);
			schedulSessionFrameContentPane.add(trainingSessionText4);
			trainingSessionText4.setBounds(315, 295, 175, 35);

			//---- trainingSessionText5 ----
			trainingSessionText5.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			trainingSessionText5.setText("End Date and Time");
			trainingSessionText5.setHorizontalAlignment(SwingConstants.LEFT);
			trainingSessionText5.setEditable(false);
			schedulSessionFrameContentPane.add(trainingSessionText5);
			trainingSessionText5.setBounds(315, 350, 175, 35);

			//---- editorPane1 ----
			editorPane1.setBackground(new Color(0xb5b9b8));
			schedulSessionFrameContentPane.add(editorPane1);
			editorPane1.setBounds(295, 145, 640, 350);
			editorPane1.setEditable(false);

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
			trainingSessionText.setBounds(360, 215, 470, 35);

			//---- trainingSessionID ----
			trainingSessionID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			cancelSessionFrameContentPane.add(trainingSessionID);
			trainingSessionID.setBounds(400, 280, 390, 40);

			//---- cancelSession ----
			cancelSession.setText("CANCEL SESSION");
			cancelSession.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			cancelSession.setForeground(Color.white);
			cancelSession.setBackground(new Color(0x3ca3cb));
			cancelSessionFrameContentPane.add(cancelSession);
			cancelSession.setBounds(465, 360, 250, 55);

			//---- editorPane2 ----
			editorPane2.setBackground(new Color(0xb5b9b8));
			cancelSessionFrameContentPane.add(editorPane2);
			editorPane2.setBounds(360, 215, 470, 220);
			editorPane2.setEditable(false);

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
						"Training Session ID", "Subscription ID", "Trainer ID", "Start Date and Time", "End Date and Time"
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

			//---- readAllBack ----
			readAllBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			readAllBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			readAllBack.setBackground(new Color(0xc80f2e));
			readSessionFrameContentPane.add(readAllBack);
			readAllBack.setBounds(5, 5, readAllBack.getPreferredSize().width, 45);

			//---- titleBar4 ----
			titleBar4.setText("Training Session: Read All Sessions");
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

		//======== updateSessionFrame1 ========
		{
			Container updateSessionFrame1ContentPane = updateSessionFrame1.getContentPane();
			updateSessionFrame1ContentPane.setLayout(null);

			//---- trainingSessionText6 ----
			trainingSessionText6.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			trainingSessionText6.setText("Select Training Session");
			trainingSessionText6.setHorizontalAlignment(SwingConstants.CENTER);
			trainingSessionText6.setEditable(false);
			updateSessionFrame1ContentPane.add(trainingSessionText6);
			trainingSessionText6.setBounds(360, 215, 470, 35);

			//---- updateTrainingSessionID ----
			updateTrainingSessionID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateSessionFrame1ContentPane.add(updateTrainingSessionID);
			updateTrainingSessionID.setBounds(400, 280, 390, 40);

			//---- proceedUpdate ----
			proceedUpdate.setText("PROCEED");
			proceedUpdate.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			proceedUpdate.setForeground(Color.white);
			proceedUpdate.setBackground(new Color(0x3ca3cb));
			updateSessionFrame1ContentPane.add(proceedUpdate);
			proceedUpdate.setBounds(465, 360, 250, 55);

			//---- editorPane3 ----
			editorPane3.setBackground(new Color(0xb5b9b8));
			updateSessionFrame1ContentPane.add(editorPane3);
			editorPane3.setBounds(360, 215, 470, 220);
			editorPane3.setEditable(false);

			//---- updateBack1 ----
			updateBack1.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			updateBack1.setIcon(new ImageIcon("resource\\backButton.jpg"));
			updateBack1.setBackground(new Color(0xc80f2e));
			updateSessionFrame1ContentPane.add(updateBack1);
			updateBack1.setBounds(5, 5, updateBack1.getPreferredSize().width, 45);

			//---- titleBar5 ----
			titleBar5.setText("Training Session: Update a Session");
			titleBar5.setBackground(new Color(0xc80f2e));
			titleBar5.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar5.setForeground(Color.white);
			titleBar5.setEditable(false);
			updateSessionFrame1ContentPane.add(titleBar5);
			titleBar5.setBounds(0, 0, 1200, 55);

			//---- label5 ----
			label5.setIcon(new ImageIcon("resource\\trainers.jpg"));
			updateSessionFrame1ContentPane.add(label5);
			label5.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < updateSessionFrame1ContentPane.getComponentCount(); i++) {
					Rectangle bounds = updateSessionFrame1ContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = updateSessionFrame1ContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				updateSessionFrame1ContentPane.setMinimumSize(preferredSize);
				updateSessionFrame1ContentPane.setPreferredSize(preferredSize);
			}
			updateSessionFrame1.setSize(1200, 700);
			updateSessionFrame1.setLocationRelativeTo(null);
		}

		//======== updateSessionFrame2 ========
		{
			Container updateSessionFrame2ContentPane = updateSessionFrame2.getContentPane();
			updateSessionFrame2ContentPane.setLayout(null);

			//---- updateTrainerID ----
			updateTrainerID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateSessionFrame2ContentPane.add(updateTrainerID);
			updateTrainerID.setBounds(505, 235, 390, 40);

			//---- updateStartdatetime ----
			updateStartdatetime.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateStartdatetime.setText("YYYY-MM-DD hh:mm:ss");
			updateSessionFrame2ContentPane.add(updateStartdatetime);
			updateStartdatetime.setBounds(505, 295, 390, 35);

			//---- updateEnddatetime ----
			updateEnddatetime.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateEnddatetime.setText("YYYY-MM-DD hh:mm:ss");
			updateSessionFrame2ContentPane.add(updateEnddatetime);
			updateEnddatetime.setBounds(505, 350, 390, 35);

			//---- updateSession ----
			updateSession.setText("UPDATE SESSION");
			updateSession.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			updateSession.setForeground(Color.white);
			updateSession.setBackground(new Color(0x3ca3cb));
			updateSessionFrame2ContentPane.add(updateSession);
			updateSession.setBounds(470, 415, 250, 55);

			//---- trainingSessionText7 ----
			trainingSessionText7.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			trainingSessionText7.setText("Subscription ID");
			trainingSessionText7.setHorizontalAlignment(SwingConstants.LEFT);
			trainingSessionText7.setEditable(false);
			updateSessionFrame2ContentPane.add(trainingSessionText7);
			trainingSessionText7.setBounds(315, 175, 175, 40);

			//---- trainingSessionText8 ----
			trainingSessionText8.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			trainingSessionText8.setText("Trainer ID");
			trainingSessionText8.setHorizontalAlignment(SwingConstants.LEFT);
			trainingSessionText8.setEditable(false);
			updateSessionFrame2ContentPane.add(trainingSessionText8);
			trainingSessionText8.setBounds(315, 235, 175, 40);

			//---- trainingSessionText9 ----
			trainingSessionText9.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			trainingSessionText9.setText("Start Date and Time");
			trainingSessionText9.setHorizontalAlignment(SwingConstants.LEFT);
			trainingSessionText9.setEditable(false);
			updateSessionFrame2ContentPane.add(trainingSessionText9);
			trainingSessionText9.setBounds(315, 295, 175, 35);

			//---- trainingSessionText10 ----
			trainingSessionText10.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
			trainingSessionText10.setText("End Date and Time");
			trainingSessionText10.setHorizontalAlignment(SwingConstants.LEFT);
			trainingSessionText10.setEditable(false);
			updateSessionFrame2ContentPane.add(trainingSessionText10);
			trainingSessionText10.setBounds(315, 350, 175, 35);

			//---- updateSubscriptionID ----
			updateSubscriptionID.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
			updateSessionFrame2ContentPane.add(updateSubscriptionID);
			updateSubscriptionID.setBounds(505, 175, 390, 40);
			updateSubscriptionID.setEditable(false);

			//---- editorPane4 ----
			editorPane4.setBackground(new Color(0xb5b9b8));
			updateSessionFrame2ContentPane.add(editorPane4);
			editorPane4.setBounds(295, 145, 640, 350);
			editorPane4.setEditable(false);

			//---- updateBack2 ----
			updateBack2.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			updateBack2.setIcon(new ImageIcon("resource\\backButton.jpg"));
			updateBack2.setBackground(new Color(0xc80f2e));
			updateSessionFrame2ContentPane.add(updateBack2);
			updateBack2.setBounds(5, 5, updateBack2.getPreferredSize().width, 45);

			//---- titleBar6 ----
			titleBar6.setText("Training Session: Update a Session");
			titleBar6.setBackground(new Color(0xc80f2e));
			titleBar6.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar6.setForeground(Color.white);
			titleBar6.setEditable(false);
			updateSessionFrame2ContentPane.add(titleBar6);
			titleBar6.setBounds(0, 0, 1200, 55);

			//---- label6 ----
			label6.setIcon(new ImageIcon("resource\\trainers.jpg"));
			updateSessionFrame2ContentPane.add(label6);
			label6.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < updateSessionFrame2ContentPane.getComponentCount(); i++) {
					Rectangle bounds = updateSessionFrame2ContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = updateSessionFrame2ContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				updateSessionFrame2ContentPane.setMinimumSize(preferredSize);
				updateSessionFrame2ContentPane.setPreferredSize(preferredSize);
			}
			updateSessionFrame2.setSize(1200, 700);
			updateSessionFrame2.setLocationRelativeTo(null);
		}

		//======== readUpcomingSessionFrame ========
		{
			Container readUpcomingSessionFrameContentPane = readUpcomingSessionFrame.getContentPane();
			readUpcomingSessionFrameContentPane.setLayout(null);

			//======== scrollPane2 ========
			{

				//---- trainingSessionTable2 ----
				trainingSessionTable2.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null},
						{null, null, null, null, null},
					},
					new String[] {
						"Training Session ID", "Subscription ID", "Trainer ID", "Start Date and Time", "End Date and Time"
					}
				));
				{
					TableColumnModel cm = trainingSessionTable2.getColumnModel();
					cm.getColumn(0).setMinWidth(150);
					cm.getColumn(0).setMaxWidth(150);
					cm.getColumn(1).setMinWidth(150);
					cm.getColumn(1).setMaxWidth(150);
					cm.getColumn(2).setMinWidth(150);
					cm.getColumn(2).setMaxWidth(150);
				}
				trainingSessionTable2.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
				trainingSessionTable2.setEnabled(false);
				scrollPane2.setViewportView(trainingSessionTable2);
			}
			readUpcomingSessionFrameContentPane.add(scrollPane2);
			scrollPane2.setBounds(105, 115, 1000, 470);

			//---- readUpcomingBack ----
			readUpcomingBack.setSelectedIcon(new ImageIcon("resource\\backButton.jpg"));
			readUpcomingBack.setIcon(new ImageIcon("resource\\backButton.jpg"));
			readUpcomingBack.setBackground(new Color(0xc80f2e));
			readUpcomingSessionFrameContentPane.add(readUpcomingBack);
			readUpcomingBack.setBounds(5, 5, readUpcomingBack.getPreferredSize().width, 45);

			//---- titleBar7 ----
			titleBar7.setText("Training Session: Read Upcoming Sessions");
			titleBar7.setBackground(new Color(0xc80f2e));
			titleBar7.setHorizontalAlignment(SwingConstants.CENTER);
			titleBar7.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
			titleBar7.setForeground(Color.white);
			titleBar7.setEditable(false);
			readUpcomingSessionFrameContentPane.add(titleBar7);
			titleBar7.setBounds(0, 0, 1200, 55);

			//---- label7 ----
			label7.setIcon(new ImageIcon("resource\\trainers.jpg"));
			readUpcomingSessionFrameContentPane.add(label7);
			label7.setBounds(0, 55, 1200, 615);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < readUpcomingSessionFrameContentPane.getComponentCount(); i++) {
					Rectangle bounds = readUpcomingSessionFrameContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = readUpcomingSessionFrameContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				readUpcomingSessionFrameContentPane.setMinimumSize(preferredSize);
				readUpcomingSessionFrameContentPane.setPreferredSize(preferredSize);
			}
			readUpcomingSessionFrame.setSize(1200, 700);
			readUpcomingSessionFrame.setLocationRelativeTo(null);
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
	private JButton goToReadUpcoming;
	private JButton goToReadAll;
	private JButton goToUpdate;
	private JLabel label1;
	private JFrame schedulSessionFrame;
	private JComboBox subscriptionID;
	private JComboBox trainerID;
	private JTextPane startdatetime;
	private JTextPane enddatetime;
	private JButton scheduleSession;
	private JFormattedTextField trainingSessionText2;
	private JFormattedTextField trainingSessionText3;
	private JFormattedTextField trainingSessionText4;
	private JFormattedTextField trainingSessionText5;
	private JEditorPane editorPane1;
	private JButton scheduleBack;
	private JFormattedTextField titleBar2;
	private JLabel label2;
	private JFrame cancelSessionFrame;
	private JFormattedTextField trainingSessionText;
	private JComboBox trainingSessionID;
	private JButton cancelSession;
	private JEditorPane editorPane2;
	private JButton cancelBack;
	private JFormattedTextField titleBar3;
	private JLabel label3;
	private JFrame readSessionFrame;
	private JScrollPane scrollPane1;
	private JTable trainingSessionTable;
	private JButton readAllBack;
	private JFormattedTextField titleBar4;
	private JLabel label4;
	private JFrame updateSessionFrame1;
	private JFormattedTextField trainingSessionText6;
	private JComboBox updateTrainingSessionID;
	private JButton proceedUpdate;
	private JEditorPane editorPane3;
	private JButton updateBack1;
	private JFormattedTextField titleBar5;
	private JLabel label5;
	private JFrame updateSessionFrame2;
	private JComboBox updateTrainerID;
	private JTextPane updateStartdatetime;
	private JTextPane updateEnddatetime;
	private JButton updateSession;
	private JFormattedTextField trainingSessionText7;
	private JFormattedTextField trainingSessionText8;
	private JFormattedTextField trainingSessionText9;
	private JFormattedTextField trainingSessionText10;
	private JTextPane updateSubscriptionID;
	private JEditorPane editorPane4;
	private JButton updateBack2;
	private JFormattedTextField titleBar6;
	private JLabel label6;
	private JFrame readUpcomingSessionFrame;
	private JScrollPane scrollPane2;
	private JTable trainingSessionTable2;
	private JButton readUpcomingBack;
	private JFormattedTextField titleBar7;
	private JLabel label7;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


	// jcombobox getters
	public JComboBox<String> getSubscriptionIDComboBox() {
		return this.subscriptionID;
	}
	public JComboBox<String> getTrainerIDComboBox() {
		return this.trainerID;
	}

	public JComboBox<String> getUpdateTrainerIDComboBox() {
		return this.updateTrainerID;
	}

	public JComboBox<String> getTrainingSessionIDComboBox() {
		return this.trainingSessionID;
	}
	public JComboBox<String> getUpdateTrainingSessionIDComboBox() {
		return this.updateTrainingSessionID;
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
	public JFrame getReadUpcomingSessionFrame() {
		return this.readUpcomingSessionFrame;
	}
	public JFrame getUpdateSessionFrame1() {
		return this.updateSessionFrame1;
	}
	public JFrame getUpdateSessionFrame2() {
		return this.updateSessionFrame2;
	}

	// sched session
	public String getMemberID() {
		return (String) this.subscriptionID.getSelectedItem(); // might have to edit if list is only for active suusbcriptions
	}
	public String getTrainerID() {
		return (String) this.trainerID.getSelectedItem();
	}
	public String getStartDate() {
		return this.startdatetime.getText();
	}
	public String getEndDate() {
		return this.enddatetime.getText();
	}

	public String getTrainingSessionID() {
		return (String) this.trainingSessionID.getSelectedItem();
	}
	public JComboBox getMemberIDBox() {
		return this.subscriptionID; // might have to edit if list is only for active suusbcriptions
	}
	public JComboBox getTrainerIDBox() {
		return this.trainerID;
	}

	// update
	public String getUpdateTrainingSessionID() {
		return (String) this.updateTrainingSessionID.getSelectedItem();
	}

	public void setUpdateSubscriptionID(String text) {
		updateSubscriptionID.setText(text); // might have to edit if list is only for active suusbcriptions
	}
	public void setUpdateTrainerID(String text) {
		this.updateTrainerID.setSelectedItem(text);
	}
	public void setUpdateStartDate(String text) {
		this.updateStartdatetime.setText(text);
	}
	public void setUpdateEndDate(String text) {
		this.updateEnddatetime.setText(text);
	}

	public String getUpdateTrainerID() {
		return (String) this.updateTrainerID.getSelectedItem();
	}
	public String getUpdateStartDate() {
		return this.updateStartdatetime.getText();
	}
	public String getUpdateEndDate() {
		return this.updateEnddatetime.getText();
	}

	// buttons
	public void trainingSessionBackButton(ActionListener actionListener) {
		this.trainingSessionBackButton.addActionListener(actionListener);
	}

	public void goToAddButton(ActionListener actionListener) {
		this.goToAdd.addActionListener(actionListener);
	}
	public void goToReadAllButton(ActionListener actionListener) {
		this.goToReadAll.addActionListener(actionListener);
	}
	public void goToReadUpcomingButton(ActionListener actionListener) {
		this.goToReadUpcoming.addActionListener(actionListener);
	}
	public void goToDeleteButton(ActionListener actionListener) {
		this.goToDelete.addActionListener(actionListener);
	}
	public void goToUpdateButton(ActionListener actionListener) {
		this.goToUpdate.addActionListener(actionListener);
	}

	public void scheduleBackButton(ActionListener actionListener) {
		this.scheduleBack.addActionListener(actionListener);
	}
	public void cancelBackButton(ActionListener actionListener) {
		this.cancelBack.addActionListener(actionListener);
	}
	public void readAllBackButton(ActionListener actionListener) {
		this.readAllBack.addActionListener(actionListener);
	}
	public void readUpcomingBackButton(ActionListener actionListener) {
		this.readUpcomingBack.addActionListener(actionListener);
	}
	public void updateBackButton1(ActionListener actionListener) {
		this.updateBack1.addActionListener(actionListener);
	}
	public void updateBackButton2(ActionListener actionListener) {
		this.updateBack2.addActionListener(actionListener);
	}

	public void scheduleSessionButton(ActionListener actionListener) {
		this.scheduleSession.addActionListener(actionListener);
	}
	public void cancelSessionButton(ActionListener actionListener) {
		this.cancelSession.addActionListener(actionListener);
	}

	public void proceedUpdateButton(ActionListener actionListener) {
		this.proceedUpdate.addActionListener(actionListener);
	}
	public void updateTrainingSessionButton(ActionListener actionListener) {
		this.updateSession.addActionListener(actionListener);
	}
	

	// set table model
	public void setTrainerSessionTable(Object[][] data) { 
		String[] columnNames = {"Training Session ID", "Subscription ID", "Trainer ID", "Start Date and Time", "End Date and Time"};
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		trainingSessionTable.setModel(model);

		{
			TableColumnModel cm = trainingSessionTable.getColumnModel();
			cm.getColumn(0).setMinWidth(150);
			cm.getColumn(0).setMaxWidth(150);
			cm.getColumn(1).setMinWidth(150);
			cm.getColumn(1).setMaxWidth(150);
			cm.getColumn(2).setMinWidth(150);
			cm.getColumn(2).setMaxWidth(150);
		}
	}

	// set table model
	public void setTrainerSessionTable2(Object[][] data) { 
		String[] columnNames = {"Training Session ID", "Subscription ID", "Trainer ID", "Start Date and Time", "End Date and Time"};
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		trainingSessionTable2.setModel(model);

		{
			TableColumnModel cm = trainingSessionTable2.getColumnModel();
			cm.getColumn(0).setMinWidth(150);
			cm.getColumn(0).setMaxWidth(150);
			cm.getColumn(1).setMinWidth(150);
			cm.getColumn(1).setMaxWidth(150);
			cm.getColumn(2).setMinWidth(150);
			cm.getColumn(2).setMaxWidth(150);
		}
	}

	public static void main(String[] args) {
		new TrainingSessionController();
	}
}
