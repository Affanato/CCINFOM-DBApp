import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;

/*
 * Created by JFormDesigner on Mon Nov 18 21:57:03 PST 2024
 */



/**
 * @author USER
 */
public class AmenityUseView extends JFrame {
    public AmenityUseView() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
        amenityUseFrame = new JFrame();
        amenityUseBackButton = new JButton();
        titleBar = new JFormattedTextField();
        goToAddSession = new JButton();
        goToReadSession = new JButton();
        goToUpdateSession = new JButton();
        goToDeleteSession = new JButton();
        label1 = new JLabel();
        addSessionFrame = new JFrame();
        addSession = new JButton();
        addSessionTitle = new JFormattedTextField();
        memberIDText = new JFormattedTextField();
        selectMemberBar = new JComboBox<>();
        amenityIDText = new JFormattedTextField();
        selectAmenityBar = new JComboBox();
        startTimeText = new JFormattedTextField();
        startTime = new JTextPane();
        usageHoursText = new JFormattedTextField();
        usageHours = new JTextPane();
        editorPane2 = new JEditorPane();
        addSessionBack = new JButton();
        backgroundPicture2 = new JLabel();
        amenityUseUseAmenity = new JFormattedTextField();
        readSessionFrame = new JFrame();
        readSessionBack = new JButton();
        tablePane = new JScrollPane();
        sessionTable = new JTable();
        amenityUseReadSession = new JFormattedTextField();
        backgroundPicture3 = new JLabel();
        deleteSessionFrame = new JFrame();
        deleteSession = new JButton();
        deleteSessionTitle = new JFormattedTextField();
        selectDelete = new JComboBox<>();
        editorPane3 = new JEditorPane();
        deleteSessionBack = new JButton();
        backgroundPicture4 = new JLabel();
        amenityUseUseAmenity2 = new JFormattedTextField();
        updateSelectSession = new JFrame();
        updateSessionSelect = new JButton();
        updateSessionTitle = new JFormattedTextField();
        selectUpdate = new JComboBox<>();
        editorPane4 = new JEditorPane();
        updateSelectBackk = new JButton();
        backgroundPicture5 = new JLabel();
        amenityUseUseAmenity3 = new JFormattedTextField();
        updateDetailsSessionFrame = new JFrame();
        updateSession = new JButton();
        selectAmenity4 = new JFormattedTextField();
        memberIDText2 = new JFormattedTextField();
        selectMemberBar2 = new JComboBox<>();
        amenityIDText2 = new JFormattedTextField();
        selectAmenityBar2 = new JComboBox<>();
        startTimeText2 = new JFormattedTextField();
        startTime2 = new JTextPane();
        usageHoursText2 = new JFormattedTextField();
        usageHours2 = new JTextPane();
        editorPane5 = new JEditorPane();
        updateSessionDetailsBack = new JButton();
        backgroundPicture6 = new JLabel();
        amenityUseUseAmenity4 = new JFormattedTextField();

        //======== amenityUseFrame ========
        {
            Container amenityUseFrameContentPane = amenityUseFrame.getContentPane();
            amenityUseFrameContentPane.setLayout(null);

            //---- amenityUseBackButton ----
            amenityUseBackButton.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            amenityUseBackButton.setIcon(new ImageIcon("resource/backButton.jpg"));
            amenityUseBackButton.setBackground(new Color(0xc80f2e));
            amenityUseFrameContentPane.add(amenityUseBackButton);
            amenityUseBackButton.setBounds(5, 5, 95, 45);

            //---- titleBar ----
            titleBar.setText("Amenity Use");
            titleBar.setBackground(new Color(0xc80f2e));
            titleBar.setHorizontalAlignment(SwingConstants.CENTER);
            titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            titleBar.setForeground(Color.white);
            titleBar.setEditable(false);
            amenityUseFrameContentPane.add(titleBar);
            titleBar.setBounds(0, 0, 1200, 55);

            //---- goToAddSession ----
            goToAddSession.setText("ADD SESSION");
            goToAddSession.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToAddSession.setForeground(Color.white);
            goToAddSession.setBackground(new Color(0x3ca3cb));
            amenityUseFrameContentPane.add(goToAddSession);
            goToAddSession.setBounds(485, 190, 250, 55);

            //---- goToReadSession ----
            goToReadSession.setText("READ SESSION");
            goToReadSession.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToReadSession.setForeground(Color.white);
            goToReadSession.setBackground(new Color(0x3ca3cb));
            amenityUseFrameContentPane.add(goToReadSession);
            goToReadSession.setBounds(485, 300, 250, 55);

            //---- goToUpdateSession ----
            goToUpdateSession.setText("UPDATE SESSION");
            goToUpdateSession.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToUpdateSession.setForeground(Color.white);
            goToUpdateSession.setBackground(new Color(0x3ca3cb));
            amenityUseFrameContentPane.add(goToUpdateSession);
            goToUpdateSession.setBounds(485, 415, 250, 55);

            //---- goToDeleteSession ----
            goToDeleteSession.setText("DELETE SESSION");
            goToDeleteSession.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToDeleteSession.setForeground(Color.white);
            goToDeleteSession.setBackground(new Color(0x3ca3cb));
            amenityUseFrameContentPane.add(goToDeleteSession);
            goToDeleteSession.setBounds(485, 525, 250, 55);

            //---- label1 ----
            label1.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            amenityUseFrameContentPane.add(label1);
            label1.setBounds(0, 50, 1200, 620);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < amenityUseFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = amenityUseFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = amenityUseFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                amenityUseFrameContentPane.setMinimumSize(preferredSize);
                amenityUseFrameContentPane.setPreferredSize(preferredSize);
            }
            amenityUseFrame.pack();
            amenityUseFrame.setSize(1200, 700);
            amenityUseFrame.setLocationRelativeTo(amenityUseFrame.getOwner());
            amenityUseFrame.setVisible(true);
        }

        //======== addSessionFrame ========
        {
            Container addSessionFrameContentPane = addSessionFrame.getContentPane();
            addSessionFrameContentPane.setLayout(null);

            //---- addSession ----
            addSession.setText("ADD SESSION");
            addSession.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            addSession.setForeground(Color.white);
            addSession.setBackground(new Color(0x3ca3cb));
            addSessionFrameContentPane.add(addSession);
            addSession.setBounds(490, 480, 250, 55);

            //---- addSessionTitle ----
            addSessionTitle.setText("Add Session");
            addSessionTitle.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            addSessionTitle.setEditable(false);
            addSessionTitle.setHorizontalAlignment(SwingConstants.CENTER);
            addSessionFrameContentPane.add(addSessionTitle);
            addSessionTitle.setBounds(250, 170, 700, 35);

            //---- memberIDText ----
            memberIDText.setText("Member ID");
            memberIDText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            memberIDText.setEditable(false);
            addSessionFrameContentPane.add(memberIDText);
            memberIDText.setBounds(285, 220, 310, 40);

            //---- selectMemberBar ----
            selectMemberBar.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            selectMemberBar.setEditable(true);
            addSessionFrameContentPane.add(selectMemberBar);
            selectMemberBar.setBounds(635, 220, 275, 40);

            //---- amenityIDText ----
            amenityIDText.setText("Amenity ID");
            amenityIDText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            amenityIDText.setEditable(false);
            addSessionFrameContentPane.add(amenityIDText);
            amenityIDText.setBounds(285, 280, 310, 40);

            //---- selectAmenityBar ----
            selectAmenityBar.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            selectAmenityBar.setEditable(true);
            addSessionFrameContentPane.add(selectAmenityBar);
            selectAmenityBar.setBounds(635, 280, 275, 40);

            //---- startTimeText ----
            startTimeText.setText("Start Date & Time");
            startTimeText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            startTimeText.setEditable(false);
            addSessionFrameContentPane.add(startTimeText);
            startTimeText.setBounds(285, 350, 310, 35);

            //---- startTime ----
            startTime.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            startTime.setText("YYYY-MM-DD hh:mm:ss");
            addSessionFrameContentPane.add(startTime);
            startTime.setBounds(635, 350, 275, 35);

            //---- usageHoursText ----
            usageHoursText.setText("Usage Hours");
            usageHoursText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            usageHoursText.setEditable(false);
            addSessionFrameContentPane.add(usageHoursText);
            usageHoursText.setBounds(285, 415, 310, 35);

            //---- usageHours ----
            usageHours.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            addSessionFrameContentPane.add(usageHours);
            usageHours.setBounds(635, 415, 275, 35);

            //---- editorPane2 ----
            editorPane2.setBackground(new Color(0xb5b9b8));
            editorPane2.setEditable(false);
            addSessionFrameContentPane.add(editorPane2);
            editorPane2.setBounds(250, 205, 700, 365);

            //---- addSessionBack ----
            addSessionBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            addSessionBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            addSessionBack.setBackground(new Color(0xc80f2e));
            addSessionFrameContentPane.add(addSessionBack);
            addSessionBack.setBounds(5, 5, 95, 45);

            //---- backgroundPicture2 ----
            backgroundPicture2.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            addSessionFrameContentPane.add(backgroundPicture2);
            backgroundPicture2.setBounds(new Rectangle(new Point(0, 55), backgroundPicture2.getPreferredSize()));

            //---- amenityUseUseAmenity ----
            amenityUseUseAmenity.setText("Amenity Use: Add Session");
            amenityUseUseAmenity.setBackground(new Color(0xc80f2e));
            amenityUseUseAmenity.setHorizontalAlignment(SwingConstants.CENTER);
            amenityUseUseAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenityUseUseAmenity.setForeground(Color.white);
            amenityUseUseAmenity.setEditable(false);
            addSessionFrameContentPane.add(amenityUseUseAmenity);
            amenityUseUseAmenity.setBounds(0, 0, 1200, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < addSessionFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = addSessionFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = addSessionFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                addSessionFrameContentPane.setMinimumSize(preferredSize);
                addSessionFrameContentPane.setPreferredSize(preferredSize);
            }
            addSessionFrame.pack();
            addSessionFrame.setLocationRelativeTo(addSessionFrame.getOwner());
        }

        //======== readSessionFrame ========
        {
            Container readSessionFrameContentPane = readSessionFrame.getContentPane();
            readSessionFrameContentPane.setLayout(null);

            //---- readSessionBack ----
            readSessionBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            readSessionBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            readSessionBack.setBackground(new Color(0xc80f2e));
            readSessionFrameContentPane.add(readSessionBack);
            readSessionBack.setBounds(5, 5, 95, 45);

            //======== tablePane ========
            {

                //---- sessionTable ----
                sessionTable.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null, "", "", null},
                                {null, null, null, null, null, null},
                        },
                        new String[] {
                                "Amenity Log ID", "Member ID", "Amenity ID", "Start Date & Time", "Usage Hours", "Total Price"
                        }
                ));
                {
                    TableColumnModel cm = sessionTable.getColumnModel();
                    cm.getColumn(0).setMinWidth(100);
                    cm.getColumn(1).setMinWidth(100);
                    cm.getColumn(2).setMinWidth(100);
                    cm.getColumn(3).setMinWidth(150);
                    cm.getColumn(4).setMinWidth(150);
                    cm.getColumn(5).setMinWidth(150);
                }
                sessionTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                sessionTable.setEnabled(false);
                tablePane.setViewportView(sessionTable);
            }
            readSessionFrameContentPane.add(tablePane);
            tablePane.setBounds(115, 145, 970, 435);

            //---- amenityUseReadSession ----
            amenityUseReadSession.setText("Amenity Use: Read Session");
            amenityUseReadSession.setBackground(new Color(0xc80f2e));
            amenityUseReadSession.setHorizontalAlignment(SwingConstants.CENTER);
            amenityUseReadSession.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenityUseReadSession.setForeground(Color.white);
            amenityUseReadSession.setEditable(false);
            readSessionFrameContentPane.add(amenityUseReadSession);
            amenityUseReadSession.setBounds(0, 0, 1200, 55);

            //---- backgroundPicture3 ----
            backgroundPicture3.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            readSessionFrameContentPane.add(backgroundPicture3);
            backgroundPicture3.setBounds(0, 55, 1200, 620);

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
            readSessionFrame.pack();
            readSessionFrame.setLocationRelativeTo(readSessionFrame.getOwner());
        }

        //======== deleteSessionFrame ========
        {
            Container deleteSessionFrameContentPane = deleteSessionFrame.getContentPane();
            deleteSessionFrameContentPane.setLayout(null);

            //---- deleteSession ----
            deleteSession.setText("DELETE SESSION");
            deleteSession.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            deleteSession.setForeground(Color.white);
            deleteSession.setBackground(new Color(0x3ca3cb));
            deleteSessionFrameContentPane.add(deleteSession);
            deleteSession.setBounds(490, 480, 250, 55);

            //---- deleteSessionTitle ----
            deleteSessionTitle.setText("Delete Session");
            deleteSessionTitle.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            deleteSessionTitle.setEditable(false);
            deleteSessionTitle.setHorizontalAlignment(SwingConstants.CENTER);
            deleteSessionFrameContentPane.add(deleteSessionTitle);
            deleteSessionTitle.setBounds(370, 170, 485, 35);

            //---- selectDelete ----
            selectDelete.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            deleteSessionFrameContentPane.add(selectDelete);
            selectDelete.setBounds(425, 335, 390, 40);

            //---- editorPane3 ----
            editorPane3.setBackground(new Color(0xb5b9b8));
            editorPane3.setEditable(false);
            deleteSessionFrameContentPane.add(editorPane3);
            editorPane3.setBounds(370, 205, 485, 365);

            //---- deleteSessionBack ----
            deleteSessionBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            deleteSessionBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            deleteSessionBack.setBackground(new Color(0xc80f2e));
            deleteSessionFrameContentPane.add(deleteSessionBack);
            deleteSessionBack.setBounds(5, 5, 95, 45);

            //---- backgroundPicture4 ----
            backgroundPicture4.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            deleteSessionFrameContentPane.add(backgroundPicture4);
            backgroundPicture4.setBounds(new Rectangle(new Point(0, 55), backgroundPicture4.getPreferredSize()));

            //---- amenityUseUseAmenity2 ----
            amenityUseUseAmenity2.setText("Amenity Use: Delete Session");
            amenityUseUseAmenity2.setBackground(new Color(0xc80f2e));
            amenityUseUseAmenity2.setHorizontalAlignment(SwingConstants.CENTER);
            amenityUseUseAmenity2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenityUseUseAmenity2.setForeground(Color.white);
            amenityUseUseAmenity2.setEditable(false);
            deleteSessionFrameContentPane.add(amenityUseUseAmenity2);
            amenityUseUseAmenity2.setBounds(0, 0, 1200, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < deleteSessionFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = deleteSessionFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = deleteSessionFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                deleteSessionFrameContentPane.setMinimumSize(preferredSize);
                deleteSessionFrameContentPane.setPreferredSize(preferredSize);
            }
            deleteSessionFrame.pack();
            deleteSessionFrame.setLocationRelativeTo(deleteSessionFrame.getOwner());
        }

        //======== updateSelectSession ========
        {
            Container updateSelectSessionContentPane = updateSelectSession.getContentPane();
            updateSelectSessionContentPane.setLayout(null);

            //---- updateSessionSelect ----
            updateSessionSelect.setText("UPDATE SESSION");
            updateSessionSelect.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            updateSessionSelect.setForeground(Color.white);
            updateSessionSelect.setBackground(new Color(0x3ca3cb));
            updateSelectSessionContentPane.add(updateSessionSelect);
            updateSessionSelect.setBounds(490, 480, 250, 55);

            //---- updateSessionTitle ----
            updateSessionTitle.setText("Update Session");
            updateSessionTitle.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            updateSessionTitle.setEditable(false);
            updateSessionTitle.setHorizontalAlignment(SwingConstants.CENTER);
            updateSelectSessionContentPane.add(updateSessionTitle);
            updateSessionTitle.setBounds(370, 170, 485, 35);

            //---- selectUpdate ----
            selectUpdate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            selectUpdate.setModel(new DefaultComboBoxModel<>(new String[] {
				"8",
				"3",
				"-"
			}));
            updateSelectSessionContentPane.add(selectUpdate);
            selectUpdate.setBounds(425, 335, 390, 40);

            //---- editorPane4 ----
            editorPane4.setBackground(new Color(0xb5b9b8));
            editorPane4.setEditable(false);
            updateSelectSessionContentPane.add(editorPane4);
            editorPane4.setBounds(370, 205, 485, 365);

            //---- updateSelectBackk ----
            updateSelectBackk.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            updateSelectBackk.setIcon(new ImageIcon("resource/backButton.jpg"));
            updateSelectBackk.setBackground(new Color(0xc80f2e));
            updateSelectSessionContentPane.add(updateSelectBackk);
            updateSelectBackk.setBounds(5, 5, 95, 45);

            //---- backgroundPicture5 ----
            backgroundPicture5.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            updateSelectSessionContentPane.add(backgroundPicture5);
            backgroundPicture5.setBounds(new Rectangle(new Point(0, 55), backgroundPicture5.getPreferredSize()));

            //---- amenityUseUseAmenity3 ----
            amenityUseUseAmenity3.setText("Amenity Use: Update Session");
            amenityUseUseAmenity3.setBackground(new Color(0xc80f2e));
            amenityUseUseAmenity3.setHorizontalAlignment(SwingConstants.CENTER);
            amenityUseUseAmenity3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenityUseUseAmenity3.setForeground(Color.white);
            amenityUseUseAmenity3.setEditable(false);
            updateSelectSessionContentPane.add(amenityUseUseAmenity3);
            amenityUseUseAmenity3.setBounds(0, 0, 1200, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < updateSelectSessionContentPane.getComponentCount(); i++) {
                    Rectangle bounds = updateSelectSessionContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = updateSelectSessionContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                updateSelectSessionContentPane.setMinimumSize(preferredSize);
                updateSelectSessionContentPane.setPreferredSize(preferredSize);
            }
            updateSelectSession.pack();
            updateSelectSession.setLocationRelativeTo(updateSelectSession.getOwner());
        }

        //======== updateDetailsSessionFrame ========
        {
            Container updateDetailsSessionFrameContentPane = updateDetailsSessionFrame.getContentPane();
            updateDetailsSessionFrameContentPane.setLayout(null);

            //---- updateSession ----
            updateSession.setText("UPDATE SESSION");
            updateSession.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            updateSession.setForeground(Color.white);
            updateSession.setBackground(new Color(0x3ca3cb));
            updateDetailsSessionFrameContentPane.add(updateSession);
            updateSession.setBounds(490, 480, 250, 55);

            //---- selectAmenity4 ----
            selectAmenity4.setText("Update Session");
            selectAmenity4.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            selectAmenity4.setEditable(false);
            selectAmenity4.setHorizontalAlignment(SwingConstants.CENTER);
            updateDetailsSessionFrameContentPane.add(selectAmenity4);
            selectAmenity4.setBounds(250, 170, 700, 35);

            //---- memberIDText2 ----
            memberIDText2.setText("Member ID");
            memberIDText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            memberIDText2.setEditable(false);
            updateDetailsSessionFrameContentPane.add(memberIDText2);
            memberIDText2.setBounds(285, 220, 310, 40);

            //---- selectMemberBar2 ----
            selectMemberBar2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            updateDetailsSessionFrameContentPane.add(selectMemberBar2);
            selectMemberBar2.setBounds(635, 220, 280, 40);

            //---- amenityIDText2 ----
            amenityIDText2.setText("Amenity ID");
            amenityIDText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            amenityIDText2.setEditable(false);
            updateDetailsSessionFrameContentPane.add(amenityIDText2);
            amenityIDText2.setBounds(285, 280, 310, 40);

            //---- selectAmenityBar2 ----
            selectAmenityBar2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            updateDetailsSessionFrameContentPane.add(selectAmenityBar2);
            selectAmenityBar2.setBounds(635, 280, 280, 40);

            //---- startTimeText2 ----
            startTimeText2.setText("Start Date & Time");
            startTimeText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            startTimeText2.setEditable(false);
            updateDetailsSessionFrameContentPane.add(startTimeText2);
            startTimeText2.setBounds(285, 350, 310, 35);

            //---- startTime2 ----
            startTime2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            startTime2.setText("YYYY-MM-DD hh:mm:ss");
            updateDetailsSessionFrameContentPane.add(startTime2);
            startTime2.setBounds(635, 350, 280, 35);

            //---- usageHoursText2 ----
            usageHoursText2.setText("Usage Hours");
            usageHoursText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            usageHoursText2.setEditable(false);
            updateDetailsSessionFrameContentPane.add(usageHoursText2);
            usageHoursText2.setBounds(285, 415, 310, 35);

            //---- usageHours2 ----
            usageHours2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            updateDetailsSessionFrameContentPane.add(usageHours2);
            usageHours2.setBounds(635, 415, 280, 35);

            //---- editorPane5 ----
            editorPane5.setBackground(new Color(0xb5b9b8));
            editorPane5.setEditable(false);
            updateDetailsSessionFrameContentPane.add(editorPane5);
            editorPane5.setBounds(250, 205, 700, 365);

            //---- updateSessionDetailsBack ----
            updateSessionDetailsBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            updateSessionDetailsBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            updateSessionDetailsBack.setBackground(new Color(0xc80f2e));
            updateDetailsSessionFrameContentPane.add(updateSessionDetailsBack);
            updateSessionDetailsBack.setBounds(5, 5, 95, 45);

            //---- backgroundPicture6 ----
            backgroundPicture6.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            updateDetailsSessionFrameContentPane.add(backgroundPicture6);
            backgroundPicture6.setBounds(new Rectangle(new Point(0, 55), backgroundPicture6.getPreferredSize()));

            //---- amenityUseUseAmenity4 ----
            amenityUseUseAmenity4.setText("Amenity Use: Update Session");
            amenityUseUseAmenity4.setBackground(new Color(0xc80f2e));
            amenityUseUseAmenity4.setHorizontalAlignment(SwingConstants.CENTER);
            amenityUseUseAmenity4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenityUseUseAmenity4.setForeground(Color.white);
            amenityUseUseAmenity4.setEditable(false);
            updateDetailsSessionFrameContentPane.add(amenityUseUseAmenity4);
            amenityUseUseAmenity4.setBounds(0, 0, 1200, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < updateDetailsSessionFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = updateDetailsSessionFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = updateDetailsSessionFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                updateDetailsSessionFrameContentPane.setMinimumSize(preferredSize);
                updateDetailsSessionFrameContentPane.setPreferredSize(preferredSize);
            }
            updateDetailsSessionFrame.pack();
            updateDetailsSessionFrame.setLocationRelativeTo(updateDetailsSessionFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
    private JFrame amenityUseFrame;
    private JButton amenityUseBackButton;
    private JFormattedTextField titleBar;
    private JButton goToAddSession;
    private JButton goToReadSession;
    private JButton goToUpdateSession;
    private JButton goToDeleteSession;
    private JLabel label1;
    private JFrame addSessionFrame;
    private JButton addSession;
    private JFormattedTextField addSessionTitle;
    private JFormattedTextField memberIDText;
    private JComboBox<String> selectMemberBar;
    private JFormattedTextField amenityIDText;
    private JComboBox<String> selectAmenityBar;
    private JFormattedTextField startTimeText;
    private JTextPane startTime;
    private JFormattedTextField usageHoursText;
    private JTextPane usageHours;
    private JEditorPane editorPane2;
    private JButton addSessionBack;
    private JLabel backgroundPicture2;
    private JFormattedTextField amenityUseUseAmenity;
    private JFrame readSessionFrame;
    private JButton readSessionBack;
    private JScrollPane tablePane;
    private JTable sessionTable;
    private JFormattedTextField amenityUseReadSession;
    private JLabel backgroundPicture3;
    private JFrame deleteSessionFrame;
    private JButton deleteSession;
    private JFormattedTextField deleteSessionTitle;
    private JComboBox<String> selectDelete;
    private JEditorPane editorPane3;
    private JButton deleteSessionBack;
    private JLabel backgroundPicture4;
    private JFormattedTextField amenityUseUseAmenity2;
    private JFrame updateSelectSession;
    private JButton updateSessionSelect;
    private JFormattedTextField updateSessionTitle;
    private JComboBox<String> selectUpdate;
    private JEditorPane editorPane4;
    private JButton updateSelectBackk;
    private JLabel backgroundPicture5;
    private JFormattedTextField amenityUseUseAmenity3;
    private JFrame updateDetailsSessionFrame;
    private JButton updateSession;
    private JFormattedTextField selectAmenity4;
    private JFormattedTextField memberIDText2;
    private JComboBox<String> selectMemberBar2;
    private JFormattedTextField amenityIDText2;
    private JComboBox<String> selectAmenityBar2;
    private JFormattedTextField startTimeText2;
    private JTextPane startTime2;
    private JFormattedTextField usageHoursText2;
    private JTextPane usageHours2;
    private JEditorPane editorPane5;
    private JButton updateSessionDetailsBack;
    private JLabel backgroundPicture6;
    private JFormattedTextField amenityUseUseAmenity4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    // Getters
    public JFrame getAmenityUseFrame() {
        return this.amenityUseFrame;
    }

    public JFrame getAddSessionFrame() {
        return this.addSessionFrame;
    }

    public JFrame getReadSessionFrame() {
        return this.readSessionFrame;
    }

    public JFrame getUpdateSelectSession() {
        return this.updateSelectSession;
    }

    public JFrame getUpdateDetailsSessionFrame() {
        return this.updateDetailsSessionFrame;
    }

    public JFrame getDeleteSessionFrame() {
        return this.deleteSessionFrame;
    }

    public JComboBox<String> getUpdateSession() {
        return this.selectUpdate;
    }

    public JComboBox<String> getDeleteSession() {
        return this.selectDelete;
    }

    public JComboBox<String> getMemberBar() {
        return this.selectMemberBar;
    }

    public JComboBox<String> getAmenityBar() {
        return this.selectAmenityBar;
    }


    // Add Session
    public String getSelectMemberBar() {
        return (String) this.selectMemberBar.getSelectedItem();
    }

    public String getSelectAmenityBar() {
        return (String) this.selectAmenityBar.getSelectedItem();
    }

    public String getStartTime() {
        return this.startTime.getText();
    }

    public String getUsageHours() {
        return this.usageHours.getText();
    }

    // Delete Session
    public String getSelectDelete() {
        return (String) this.selectDelete.getSelectedItem();
    }

    // Select Update
    public String getSelectUpdate() {
        return (String) this.selectUpdate.getSelectedItem();
    }

    // Update Details
    public JComboBox<String> getMemberBar2() {
        return this.selectMemberBar2;
    }
    public JComboBox<String> getAmenityBar2() {
        return this.selectAmenityBar2;
    }
    public String getStartTime2() {
        return this.startTime2.getText();
    }
    public String getUsageHours2() {
        return this.usageHours2.getText();
    }

    // Setters
    public void setSelectMemberBar2(int index) {
        selectMemberBar2.setSelectedItem(index);
    }

    public void setSelectAmenityBar2(int index) {
        selectAmenityBar2.setSelectedItem(index);
    }

    public void setStartTime2(String text) {
        startTime2.setText(text);
    }

    public void setUsageHours2(String text) {
        usageHours2.setText(text);
    }

    // Button Action Listeners
    public void amenityUseBackButtonButton(ActionListener actionListener) {
        this.amenityUseBackButton.addActionListener(actionListener);
    }

    public void goToAddSessionButton(ActionListener actionListener) {
        this.goToAddSession.addActionListener(actionListener);
    }

    public void goToReadSessionButton(ActionListener actionListener) {
        this.goToReadSession.addActionListener(actionListener);
    }

    public void goToUpdateSessionButton(ActionListener actionListener) {
        this.goToUpdateSession.addActionListener(actionListener);
    }

    public void goToDeleteSessionButton(ActionListener actionListener) {
        this.goToDeleteSession.addActionListener(actionListener);
    }

    public void addSessionButton(ActionListener actionListener) {
        this.addSession.addActionListener(actionListener);
    }

    public void addSessionBackButton(ActionListener actionListener) {
        this.addSessionBack.addActionListener(actionListener);
    }

    public void readSessionBackButton(ActionListener actionListener) {
        this.readSessionBack.addActionListener(actionListener);
    }

    public void deleteSessionButton(ActionListener actionListener) {
        this.deleteSession.addActionListener(actionListener);
    }

    public void deleteSessionBackButton(ActionListener actionListener) {
        this.deleteSessionBack.addActionListener(actionListener);
    }

    public void updateSessionSelectButton(ActionListener actionListener) {
        this.updateSessionSelect.addActionListener(actionListener);
    }

    public void updateSelectBackButton(ActionListener actionListener) {
        this.updateSelectBackk.addActionListener(actionListener);
    }

    public void updateSessionButton(ActionListener actionListener) {
        this.updateSession.addActionListener(actionListener);
    }

    public void updateSessionDetailsBackButton(ActionListener actionListener) {
        this.updateSessionDetailsBack.addActionListener(actionListener);
    }

    // Table Setters
    public void setSessionTable(Object[][] data) {
        String[] columnNames = {
            "Amenity Log ID", "Member ID", "Amenity ID", "Start Date & Time", "Usage Hours", "Total Price"
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        sessionTable.setModel(model);
    
        TableColumnModel cm = sessionTable.getColumnModel();
        cm.getColumn(0).setMinWidth(100);
        cm.getColumn(1).setMinWidth(100);
        cm.getColumn(2).setMinWidth(100);
        cm.getColumn(3).setMinWidth(150);
        cm.getColumn(4).setMinWidth(150);
        cm.getColumn(5).setMinWidth(150);

    }
}
