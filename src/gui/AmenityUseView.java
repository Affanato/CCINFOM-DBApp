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
        amenityUseBack = new JButton();
        titleBar = new JFormattedTextField();
        goToUseAmenity = new JButton();
        goToReadSession = new JButton();
        label1 = new JLabel();
        readSessionFrame = new JFrame();
        sessionReadBack = new JButton();
        tablePane = new JScrollPane();
        sessionTable = new JTable();
        amenityUseReadSession = new JFormattedTextField();
        backgroundPicture3 = new JLabel();
        useAmenityFrame = new JFrame();
        useAmenity = new JButton();
        selectAmenity = new JFormattedTextField();
        selectAmenityBar = new JComboBox();
        selectMemberBar = new JComboBox();
        startTimeText = new JFormattedTextField();
        startTime = new JTextPane();
        usageHoursText = new JFormattedTextField();
        usageHours = new JTextPane();
        editorPane2 = new JEditorPane();
        useAmenityBack = new JButton();
        backgroundPicture2 = new JLabel();
        amenityUseUseAmenity = new JFormattedTextField();

        //======== amenityUseFrame ========
        {
            Container amenityUseFrameContentPane = amenityUseFrame.getContentPane();
            amenityUseFrameContentPane.setLayout(null);

            //---- amenityUseBack ----
            amenityUseBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            amenityUseBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            amenityUseBack.setBackground(new Color(0xc80f2e));
            amenityUseFrameContentPane.add(amenityUseBack);
            amenityUseBack.setBounds(5, 5, 95, 45);

            //---- titleBar ----
            titleBar.setText("Amenity Use");
            titleBar.setBackground(new Color(0xc80f2e));
            titleBar.setHorizontalAlignment(SwingConstants.CENTER);
            titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            titleBar.setForeground(Color.white);
            titleBar.setEditable(false);
            amenityUseFrameContentPane.add(titleBar);
            titleBar.setBounds(0, 0, 1200, 55);

            //---- goToUseAmenity ----
            goToUseAmenity.setText("USE AMENITY");
            goToUseAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToUseAmenity.setForeground(Color.white);
            goToUseAmenity.setBackground(new Color(0x3ca3cb));
            amenityUseFrameContentPane.add(goToUseAmenity);
            goToUseAmenity.setBounds(485, 230, 250, 55);

            //---- goToReadSession ----
            goToReadSession.setText("READ SESSION");
            goToReadSession.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToReadSession.setForeground(Color.white);
            goToReadSession.setBackground(new Color(0x3ca3cb));
            amenityUseFrameContentPane.add(goToReadSession);
            goToReadSession.setBounds(485, 455, 250, 55);

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
            amenityUseFrame.setLocationRelativeTo(null);
            amenityUseFrame.setVisible(true);
        }

        //======== readSessionFrame ========
        {
            Container readSessionFrameContentPane = readSessionFrame.getContentPane();
            readSessionFrameContentPane.setLayout(null);

            //---- sessionReadBack ----
            sessionReadBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            sessionReadBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            sessionReadBack.setBackground(new Color(0xc80f2e));
            readSessionFrameContentPane.add(sessionReadBack);
            sessionReadBack.setBounds(5, 5, 95, 45);

            //======== tablePane ========
            {

                //---- sessionTable ----
                sessionTable.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null, null, "", null},
                                {null, null, null, null, null, null},
                        },
                        new String[] {
                                "Amenity Log ID ", "Member ID  ", "Amenity ID ", "Start Time", "Start Use Time", "End Use Time"
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

        //======== useAmenityFrame ========
        {
            Container useAmenityFrameContentPane = useAmenityFrame.getContentPane();
            useAmenityFrameContentPane.setLayout(null);

            //---- useAmenity ----
            useAmenity.setText("USE AMENITY");
            useAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            useAmenity.setForeground(Color.white);
            useAmenity.setBackground(new Color(0x3ca3cb));
            useAmenityFrameContentPane.add(useAmenity);
            useAmenity.setBounds(490, 480, 250, 55);

            //---- selectAmenity ----
            selectAmenity.setText("Use Amenity");
            selectAmenity.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            selectAmenity.setEditable(false);
            selectAmenity.setHorizontalAlignment(SwingConstants.CENTER);
            useAmenityFrameContentPane.add(selectAmenity);
            selectAmenity.setBounds(370, 170, 485, 35);

            //---- selectAmenityBar ----
            selectAmenityBar.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            useAmenityFrameContentPane.add(selectAmenityBar);
            selectAmenityBar.setBounds(420, 220, 390, 40);

            //---- selectMemberBar ----
            selectMemberBar.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            useAmenityFrameContentPane.add(selectMemberBar);
            selectMemberBar.setBounds(420, 280, 390, 40);

            //---- startTimeText ----
            startTimeText.setText("Start Time");
            startTimeText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            startTimeText.setEditable(false);
            useAmenityFrameContentPane.add(startTimeText);
            startTimeText.setBounds(420, 350, 175, 35);

            //---- startTime ----
            startTime.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            useAmenityFrameContentPane.add(startTime);
            startTime.setBounds(635, 350, 175, 35);

            //---- usageHoursText ----
            usageHoursText.setText("Usage Hours");
            usageHoursText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            usageHoursText.setEditable(false);
            useAmenityFrameContentPane.add(usageHoursText);
            usageHoursText.setBounds(420, 415, 175, 35);

            //---- usageHours ----
            usageHours.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            useAmenityFrameContentPane.add(usageHours);
            usageHours.setBounds(635, 415, 175, 35);

            //---- editorPane2 ----
            editorPane2.setBackground(new Color(0xb5b9b8));
            editorPane2.setEditable(false);
            useAmenityFrameContentPane.add(editorPane2);
            editorPane2.setBounds(370, 205, 485, 365);

            //---- useAmenityBack ----
            useAmenityBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            useAmenityBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            useAmenityBack.setBackground(new Color(0xc80f2e));
            useAmenityFrameContentPane.add(useAmenityBack);
            useAmenityBack.setBounds(5, 5, 95, 45);

            //---- backgroundPicture2 ----
            backgroundPicture2.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            useAmenityFrameContentPane.add(backgroundPicture2);
            backgroundPicture2.setBounds(new Rectangle(new Point(0, 55), backgroundPicture2.getPreferredSize()));

            //---- amenityUseUseAmenity ----
            amenityUseUseAmenity.setText("Amenity Use: Use Amenity");
            amenityUseUseAmenity.setBackground(new Color(0xc80f2e));
            amenityUseUseAmenity.setHorizontalAlignment(SwingConstants.CENTER);
            amenityUseUseAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenityUseUseAmenity.setForeground(Color.white);
            amenityUseUseAmenity.setEditable(false);
            useAmenityFrameContentPane.add(amenityUseUseAmenity);
            amenityUseUseAmenity.setBounds(0, 0, 1200, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < useAmenityFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = useAmenityFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = useAmenityFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                useAmenityFrameContentPane.setMinimumSize(preferredSize);
                useAmenityFrameContentPane.setPreferredSize(preferredSize);
            }
            useAmenityFrame.pack();
            useAmenityFrame.setLocationRelativeTo(useAmenityFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
    private JFrame amenityUseFrame;
    private JButton amenityUseBack;
    private JFormattedTextField titleBar;
    private JButton goToUseAmenity;
    private JButton goToReadSession;
    private JLabel label1;
    private JFrame readSessionFrame;
    private JButton sessionReadBack;
    private JScrollPane tablePane;
    private JTable sessionTable;
    private JFormattedTextField amenityUseReadSession;
    private JLabel backgroundPicture3;
    private JFrame useAmenityFrame;
    private JButton useAmenity;
    private JFormattedTextField selectAmenity;
    private JComboBox selectAmenityBar;
    private JComboBox selectMemberBar;
    private JFormattedTextField startTimeText;
    private JTextPane startTime;
    private JFormattedTextField usageHoursText;
    private JTextPane usageHours;
    private JEditorPane editorPane2;
    private JButton useAmenityBack;
    private JLabel backgroundPicture2;
    private JFormattedTextField amenityUseUseAmenity;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    // Getters
    public JFrame getAmenityUseFrame() {
        return this.amenityUseFrame;
    }

    public JFrame getUseAmenityFrame() {
        return this.useAmenityFrame;
    }

    public JFrame getReadSessionFrame() {
        return this.readSessionFrame;
    }

    // Use Amenity

    public int getAmenityID(){
        return this.selectAmenityBar.getSelectedIndex() + 1;
    }

    public int getMemberID(){
        return this.selectMemberBar.getSelectedIndex() + 1;
    }

    public String getStartTime(){
        return this.startTime.getText();
    }

    public String getUsageHours(){
        return this.startTime.getText();
    }

    // Button Action Listeners

    public void amenityUseBackButton(ActionListener actionListener){
        this.amenityUseBack.addActionListener(actionListener);
    }

    public void goToUseAmenityButton(ActionListener actionListener){
        this.goToUseAmenity.addActionListener(actionListener);
    }

    public void goToReadSessionButton(ActionListener actionListener){
        this.goToReadSession.addActionListener(actionListener);
    }

    public void sessionReadBackButton(ActionListener actionListener){
        this.sessionReadBack.addActionListener(actionListener);
    }

    public void useAmenityBackButton(ActionListener actionListener){
        this.useAmenityBack.addActionListener(actionListener);
    }

    public void useAmenityButton(ActionListener actionListener){
        this.useAmenity.addActionListener(actionListener);
    }
}
