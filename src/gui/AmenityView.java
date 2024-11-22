import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Created by JFormDesigner on Thu Nov 21 22:09:11 PST 2024
 */



/**
 * @author USER
 */
public class AmenityView  {
    public AmenityView() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
        amenityFrame = new JFrame();
        amenityBack = new JButton();
        titleBar = new JFormattedTextField();
        goToAddAmenity = new JButton();
        goToReadAmenity = new JButton();
        goToUpdateAmenity = new JButton();
        goToDeleteAmenity = new JButton();
        label1 = new JLabel();
        addAmenityFrame = new JFrame();
        addAmenity = new JButton();
        addAmenityTitle = new JFormattedTextField();
        nameText = new JFormattedTextField();
        name = new JTextPane();
        statusText = new JFormattedTextField();
        selectStatus = new JComboBox();
        walkInPriceText = new JFormattedTextField();
        walkinPrice = new JTextPane();
        timeOpenText = new JFormattedTextField();
        timeOpen = new JTextPane();
        timeCloseText = new JFormattedTextField();
        timeClose = new JTextPane();
        editorPane2 = new JEditorPane();
        addAmenityBack = new JButton();
        backgroundPicture2 = new JLabel();
        amenityAddAmenity = new JFormattedTextField();
        readAmenityFrame = new JFrame();
        readAmenityBack = new JButton();
        tablePane = new JScrollPane();
        sessionTable = new JTable();
        amenityReadAmenity = new JFormattedTextField();
        backgroundPicture3 = new JLabel();
        deleteAmenityFrame = new JFrame();
        deleteAmenity = new JButton();
        deleteAmenityTitle = new JFormattedTextField();
        selectDelete = new JComboBox();
        editorPane3 = new JEditorPane();
        deleteAmenityBack = new JButton();
        backgroundPicture4 = new JLabel();
        amenityDeleteAmenity = new JFormattedTextField();
        updateSelectAmenityFrame = new JFrame();
        updateAmenity = new JButton();
        updateAmenityTitle = new JFormattedTextField();
        selectUpdate = new JComboBox();
        editorPane4 = new JEditorPane();
        updateSelectAmenityBack = new JButton();
        backgroundPicture5 = new JLabel();
        amenityUpdateAmenity2 = new JFormattedTextField();
        updateAmenityDetailsFrame = new JFrame();
        updateAmenity2 = new JButton();
        updateAmenityTitle2 = new JFormattedTextField();
        nameText2 = new JFormattedTextField();
        name2 = new JTextPane();
        statusText2 = new JFormattedTextField();
        selectStatus2 = new JComboBox();
        walkInPriceText2 = new JFormattedTextField();
        walkinPrice2 = new JTextPane();
        timeOpenText2 = new JFormattedTextField();
        timeOpen2 = new JTextPane();
        timeCloseText2 = new JFormattedTextField();
        timeClose2 = new JTextPane();
        editorPane5 = new JEditorPane();
        updateDetailsAmenityBack = new JButton();
        backgroundPicture6 = new JLabel();
        amenityUseUseAmenity2 = new JFormattedTextField();

        //======== amenityFrame ========
        {
            Container amenityFrameContentPane = amenityFrame.getContentPane();
            amenityFrameContentPane.setLayout(null);

            //---- amenityBack ----
            amenityBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            amenityBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            amenityBack.setBackground(new Color(0xc80f2e));
            amenityFrameContentPane.add(amenityBack);
            amenityBack.setBounds(5, 5, 95, 45);

            //---- titleBar ----
            titleBar.setText("Amenity");
            titleBar.setBackground(new Color(0xc80f2e));
            titleBar.setHorizontalAlignment(SwingConstants.CENTER);
            titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            titleBar.setForeground(Color.white);
            titleBar.setEditable(false);
            amenityFrameContentPane.add(titleBar);
            titleBar.setBounds(0, 0, 1200, 55);

            //---- goToAddAmenity ----
            goToAddAmenity.setText("ADD AMENITY");
            goToAddAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToAddAmenity.setForeground(Color.white);
            goToAddAmenity.setBackground(new Color(0x3ca3cb));
            amenityFrameContentPane.add(goToAddAmenity);
            goToAddAmenity.setBounds(485, 190, 250, 55);

            //---- goToReadAmenity ----
            goToReadAmenity.setText("READ AMENITY");
            goToReadAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToReadAmenity.setForeground(Color.white);
            goToReadAmenity.setBackground(new Color(0x3ca3cb));
            amenityFrameContentPane.add(goToReadAmenity);
            goToReadAmenity.setBounds(485, 300, 250, 55);

            //---- goToUpdateAmenity ----
            goToUpdateAmenity.setText("UPDATE AMENITY");
            goToUpdateAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToUpdateAmenity.setForeground(Color.white);
            goToUpdateAmenity.setBackground(new Color(0x3ca3cb));
            amenityFrameContentPane.add(goToUpdateAmenity);
            goToUpdateAmenity.setBounds(485, 415, 250, 55);

            //---- goToDeleteAmenity ----
            goToDeleteAmenity.setText("DELETE AMENITY");
            goToDeleteAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToDeleteAmenity.setForeground(Color.white);
            goToDeleteAmenity.setBackground(new Color(0x3ca3cb));
            amenityFrameContentPane.add(goToDeleteAmenity);
            goToDeleteAmenity.setBounds(485, 525, 250, 55);

            //---- label1 ----
            label1.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            amenityFrameContentPane.add(label1);
            label1.setBounds(0, 50, 1200, 620);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < amenityFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = amenityFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = amenityFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                amenityFrameContentPane.setMinimumSize(preferredSize);
                amenityFrameContentPane.setPreferredSize(preferredSize);
            }
            amenityFrame.pack();
            amenityFrame.setSize(1200, 700);
            amenityFrame.setLocationRelativeTo(amenityFrame.getOwner());
            amenityFrame.setVisible(true);
        }

        //======== addAmenityFrame ========
        {
            Container addAmenityFrameContentPane = addAmenityFrame.getContentPane();
            addAmenityFrameContentPane.setLayout(null);

            //---- addAmenity ----
            addAmenity.setText("ADD AMENITY");
            addAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            addAmenity.setForeground(Color.white);
            addAmenity.setBackground(new Color(0x3ca3cb));
            addAmenityFrameContentPane.add(addAmenity);
            addAmenity.setBounds(490, 480, 250, 55);

            //---- addAmenityTitle ----
            addAmenityTitle.setText("Add Amenity");
            addAmenityTitle.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            addAmenityTitle.setEditable(false);
            addAmenityTitle.setHorizontalAlignment(SwingConstants.CENTER);
            addAmenityFrameContentPane.add(addAmenityTitle);
            addAmenityTitle.setBounds(370, 170, 485, 35);

            //---- nameText ----
            nameText.setText("Name");
            nameText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            nameText.setEditable(false);
            addAmenityFrameContentPane.add(nameText);
            nameText.setBounds(420, 225, 175, 40);

            //---- name ----
            name.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            addAmenityFrameContentPane.add(name);
            name.setBounds(635, 225, 175, 40);

            //---- statusText ----
            statusText.setText("Status");
            statusText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            statusText.setEditable(false);
            addAmenityFrameContentPane.add(statusText);
            statusText.setBounds(420, 280, 175, 40);

            //---- selectStatus ----
            selectStatus.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            selectStatus.setEditable(true);
            addAmenityFrameContentPane.add(selectStatus);
            selectStatus.setBounds(635, 280, 175, 40);

            //---- walkInPriceText ----
            walkInPriceText.setText("Walk-in Price Per Hour");
            walkInPriceText.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
            walkInPriceText.setEditable(false);
            addAmenityFrameContentPane.add(walkInPriceText);
            walkInPriceText.setBounds(420, 335, 175, 35);

            //---- walkinPrice ----
            walkinPrice.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            addAmenityFrameContentPane.add(walkinPrice);
            walkinPrice.setBounds(635, 335, 175, 35);

            //---- timeOpenText ----
            timeOpenText.setText("Time Open");
            timeOpenText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            timeOpenText.setEditable(false);
            addAmenityFrameContentPane.add(timeOpenText);
            timeOpenText.setBounds(420, 385, 175, 35);

            //---- timeOpen ----
            timeOpen.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            addAmenityFrameContentPane.add(timeOpen);
            timeOpen.setBounds(635, 385, 175, 35);

            //---- timeCloseText ----
            timeCloseText.setText("Time Close");
            timeCloseText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            timeCloseText.setEditable(false);
            addAmenityFrameContentPane.add(timeCloseText);
            timeCloseText.setBounds(420, 435, 175, 35);

            //---- timeClose ----
            timeClose.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            addAmenityFrameContentPane.add(timeClose);
            timeClose.setBounds(635, 435, 175, 35);

            //---- editorPane2 ----
            editorPane2.setBackground(new Color(0xb5b9b8));
            editorPane2.setEditable(false);
            addAmenityFrameContentPane.add(editorPane2);
            editorPane2.setBounds(370, 205, 485, 365);

            //---- addAmenityBack ----
            addAmenityBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            addAmenityBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            addAmenityBack.setBackground(new Color(0xc80f2e));
            addAmenityFrameContentPane.add(addAmenityBack);
            addAmenityBack.setBounds(5, 5, 95, 45);

            //---- backgroundPicture2 ----
            backgroundPicture2.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            addAmenityFrameContentPane.add(backgroundPicture2);
            backgroundPicture2.setBounds(new Rectangle(new Point(0, 55), backgroundPicture2.getPreferredSize()));

            //---- amenityAddAmenity ----
            amenityAddAmenity.setText("Amenity: Add Amenity ");
            amenityAddAmenity.setBackground(new Color(0xc80f2e));
            amenityAddAmenity.setHorizontalAlignment(SwingConstants.CENTER);
            amenityAddAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenityAddAmenity.setForeground(Color.white);
            amenityAddAmenity.setEditable(false);
            addAmenityFrameContentPane.add(amenityAddAmenity);
            amenityAddAmenity.setBounds(0, 0, 1200, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < addAmenityFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = addAmenityFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = addAmenityFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                addAmenityFrameContentPane.setMinimumSize(preferredSize);
                addAmenityFrameContentPane.setPreferredSize(preferredSize);
            }
            addAmenityFrame.pack();
            addAmenityFrame.setLocationRelativeTo(addAmenityFrame.getOwner());
        }

        //======== readAmenityFrame ========
        {
            Container readAmenityFrameContentPane = readAmenityFrame.getContentPane();
            readAmenityFrameContentPane.setLayout(null);

            //---- readAmenityBack ----
            readAmenityBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            readAmenityBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            readAmenityBack.setBackground(new Color(0xc80f2e));
            readAmenityFrameContentPane.add(readAmenityBack);
            readAmenityBack.setBounds(5, 5, 95, 45);

            //======== tablePane ========
            {

                //---- sessionTable ----
                sessionTable.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null, "", "", null},
                                {null, null, null, null, null, null},
                        },
                        new String[] {
                                "Amenity ID", "Name", "Walk-in Price Per Hour", "Time Open", "Time Close", "Status"
                        }
                ));
                {
                    TableColumnModel cm = sessionTable.getColumnModel();
                    cm.getColumn(0).setMinWidth(100);
                    cm.getColumn(1).setMinWidth(200);
                    cm.getColumn(2).setMinWidth(200);
                    cm.getColumn(3).setMinWidth(150);
                    cm.getColumn(4).setMinWidth(150);
                    cm.getColumn(5).setMinWidth(100);
                }
                sessionTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                sessionTable.setEnabled(false);
                tablePane.setViewportView(sessionTable);
            }
            readAmenityFrameContentPane.add(tablePane);
            tablePane.setBounds(115, 145, 970, 435);

            //---- amenityReadAmenity ----
            amenityReadAmenity.setText("Amenity: Read Amenity");
            amenityReadAmenity.setBackground(new Color(0xc80f2e));
            amenityReadAmenity.setHorizontalAlignment(SwingConstants.CENTER);
            amenityReadAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenityReadAmenity.setForeground(Color.white);
            amenityReadAmenity.setEditable(false);
            readAmenityFrameContentPane.add(amenityReadAmenity);
            amenityReadAmenity.setBounds(0, 0, 1200, 55);

            //---- backgroundPicture3 ----
            backgroundPicture3.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            readAmenityFrameContentPane.add(backgroundPicture3);
            backgroundPicture3.setBounds(0, 55, 1200, 620);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < readAmenityFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = readAmenityFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = readAmenityFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                readAmenityFrameContentPane.setMinimumSize(preferredSize);
                readAmenityFrameContentPane.setPreferredSize(preferredSize);
            }
            readAmenityFrame.pack();
            readAmenityFrame.setLocationRelativeTo(readAmenityFrame.getOwner());
        }

        //======== deleteAmenityFrame ========
        {
            Container deleteAmenityFrameContentPane = deleteAmenityFrame.getContentPane();
            deleteAmenityFrameContentPane.setLayout(null);

            //---- deleteAmenity ----
            deleteAmenity.setText("DELETE AMENITY");
            deleteAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            deleteAmenity.setForeground(Color.white);
            deleteAmenity.setBackground(new Color(0x3ca3cb));
            deleteAmenityFrameContentPane.add(deleteAmenity);
            deleteAmenity.setBounds(490, 480, 250, 55);

            //---- deleteAmenityTitle ----
            deleteAmenityTitle.setText("Delete Amenity");
            deleteAmenityTitle.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            deleteAmenityTitle.setEditable(false);
            deleteAmenityTitle.setHorizontalAlignment(SwingConstants.CENTER);
            deleteAmenityFrameContentPane.add(deleteAmenityTitle);
            deleteAmenityTitle.setBounds(370, 170, 485, 35);

            //---- selectDelete ----
            selectDelete.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            deleteAmenityFrameContentPane.add(selectDelete);
            selectDelete.setBounds(425, 335, 390, 40);

            //---- editorPane3 ----
            editorPane3.setBackground(new Color(0xb5b9b8));
            editorPane3.setEditable(false);
            deleteAmenityFrameContentPane.add(editorPane3);
            editorPane3.setBounds(370, 205, 485, 365);

            //---- deleteAmenityBack ----
            deleteAmenityBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            deleteAmenityBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            deleteAmenityBack.setBackground(new Color(0xc80f2e));
            deleteAmenityFrameContentPane.add(deleteAmenityBack);
            deleteAmenityBack.setBounds(5, 5, 95, 45);

            //---- backgroundPicture4 ----
            backgroundPicture4.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            deleteAmenityFrameContentPane.add(backgroundPicture4);
            backgroundPicture4.setBounds(new Rectangle(new Point(0, 55), backgroundPicture4.getPreferredSize()));

            //---- amenityDeleteAmenity ----
            amenityDeleteAmenity.setText("Amenity: Delete Amenity");
            amenityDeleteAmenity.setBackground(new Color(0xc80f2e));
            amenityDeleteAmenity.setHorizontalAlignment(SwingConstants.CENTER);
            amenityDeleteAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenityDeleteAmenity.setForeground(Color.white);
            amenityDeleteAmenity.setEditable(false);
            deleteAmenityFrameContentPane.add(amenityDeleteAmenity);
            amenityDeleteAmenity.setBounds(0, 0, 1200, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < deleteAmenityFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = deleteAmenityFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = deleteAmenityFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                deleteAmenityFrameContentPane.setMinimumSize(preferredSize);
                deleteAmenityFrameContentPane.setPreferredSize(preferredSize);
            }
            deleteAmenityFrame.pack();
            deleteAmenityFrame.setLocationRelativeTo(deleteAmenityFrame.getOwner());
        }

        //======== updateSelectAmenityFrame ========
        {
            Container updateSelectAmenityFrameContentPane = updateSelectAmenityFrame.getContentPane();
            updateSelectAmenityFrameContentPane.setLayout(null);

            //---- updateAmenity ----
            updateAmenity.setText("UPDATE AMENITY");
            updateAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            updateAmenity.setForeground(Color.white);
            updateAmenity.setBackground(new Color(0x3ca3cb));
            updateSelectAmenityFrameContentPane.add(updateAmenity);
            updateAmenity.setBounds(490, 480, 250, 55);

            //---- updateAmenityTitle ----
            updateAmenityTitle.setText("Update Amenity");
            updateAmenityTitle.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            updateAmenityTitle.setEditable(false);
            updateAmenityTitle.setHorizontalAlignment(SwingConstants.CENTER);
            updateSelectAmenityFrameContentPane.add(updateAmenityTitle);
            updateAmenityTitle.setBounds(370, 170, 485, 35);

            //---- selectUpdate ----
            selectUpdate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            updateSelectAmenityFrameContentPane.add(selectUpdate);
            selectUpdate.setBounds(425, 335, 390, 40);

            //---- editorPane4 ----
            editorPane4.setBackground(new Color(0xb5b9b8));
            editorPane4.setEditable(false);
            updateSelectAmenityFrameContentPane.add(editorPane4);
            editorPane4.setBounds(370, 205, 485, 365);

            //---- updateSelectAmenityBack ----
            updateSelectAmenityBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            updateSelectAmenityBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            updateSelectAmenityBack.setBackground(new Color(0xc80f2e));
            updateSelectAmenityFrameContentPane.add(updateSelectAmenityBack);
            updateSelectAmenityBack.setBounds(5, 5, 95, 45);

            //---- backgroundPicture5 ----
            backgroundPicture5.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            updateSelectAmenityFrameContentPane.add(backgroundPicture5);
            backgroundPicture5.setBounds(new Rectangle(new Point(0, 55), backgroundPicture5.getPreferredSize()));

            //---- amenityUpdateAmenity2 ----
            amenityUpdateAmenity2.setText("Amenity: Update Amenity");
            amenityUpdateAmenity2.setBackground(new Color(0xc80f2e));
            amenityUpdateAmenity2.setHorizontalAlignment(SwingConstants.CENTER);
            amenityUpdateAmenity2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenityUpdateAmenity2.setForeground(Color.white);
            amenityUpdateAmenity2.setEditable(false);
            updateSelectAmenityFrameContentPane.add(amenityUpdateAmenity2);
            amenityUpdateAmenity2.setBounds(0, 0, 1200, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < updateSelectAmenityFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = updateSelectAmenityFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = updateSelectAmenityFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                updateSelectAmenityFrameContentPane.setMinimumSize(preferredSize);
                updateSelectAmenityFrameContentPane.setPreferredSize(preferredSize);
            }
            updateSelectAmenityFrame.pack();
            updateSelectAmenityFrame.setLocationRelativeTo(updateSelectAmenityFrame.getOwner());
        }

        //======== updateAmenityDetailsFrame ========
        {
            Container updateAmenityDetailsFrameContentPane = updateAmenityDetailsFrame.getContentPane();
            updateAmenityDetailsFrameContentPane.setLayout(null);

            //---- updateAmenity2 ----
            updateAmenity2.setText("UPDATE AMENITY");
            updateAmenity2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            updateAmenity2.setForeground(Color.white);
            updateAmenity2.setBackground(new Color(0x3ca3cb));
            updateAmenityDetailsFrameContentPane.add(updateAmenity2);
            updateAmenity2.setBounds(490, 480, 250, 55);

            //---- updateAmenityTitle2 ----
            updateAmenityTitle2.setText("Add Update");
            updateAmenityTitle2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            updateAmenityTitle2.setEditable(false);
            updateAmenityTitle2.setHorizontalAlignment(SwingConstants.CENTER);
            updateAmenityDetailsFrameContentPane.add(updateAmenityTitle2);
            updateAmenityTitle2.setBounds(370, 170, 485, 35);

            //---- nameText2 ----
            nameText2.setText("Name");
            nameText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            nameText2.setEditable(false);
            updateAmenityDetailsFrameContentPane.add(nameText2);
            nameText2.setBounds(420, 225, 175, 40);

            //---- name2 ----
            name2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            updateAmenityDetailsFrameContentPane.add(name2);
            name2.setBounds(635, 225, 175, 40);

            //---- statusText2 ----
            statusText2.setText("Status");
            statusText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            statusText2.setEditable(false);
            updateAmenityDetailsFrameContentPane.add(statusText2);
            statusText2.setBounds(420, 280, 175, 40);

            //---- selectStatus2 ----
            selectStatus2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            selectStatus2.setEditable(true);
            updateAmenityDetailsFrameContentPane.add(selectStatus2);
            selectStatus2.setBounds(635, 280, 175, 40);

            //---- walkInPriceText2 ----
            walkInPriceText2.setText("Walk-in Price Per Hour");
            walkInPriceText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
            walkInPriceText2.setEditable(false);
            updateAmenityDetailsFrameContentPane.add(walkInPriceText2);
            walkInPriceText2.setBounds(420, 335, 175, 35);

            //---- walkinPrice2 ----
            walkinPrice2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            updateAmenityDetailsFrameContentPane.add(walkinPrice2);
            walkinPrice2.setBounds(635, 335, 175, 35);

            //---- timeOpenText2 ----
            timeOpenText2.setText("Time Open");
            timeOpenText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            timeOpenText2.setEditable(false);
            updateAmenityDetailsFrameContentPane.add(timeOpenText2);
            timeOpenText2.setBounds(420, 385, 175, 35);

            //---- timeOpen2 ----
            timeOpen2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            updateAmenityDetailsFrameContentPane.add(timeOpen2);
            timeOpen2.setBounds(635, 385, 175, 35);

            //---- timeCloseText2 ----
            timeCloseText2.setText("Time Close");
            timeCloseText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            timeCloseText2.setEditable(false);
            updateAmenityDetailsFrameContentPane.add(timeCloseText2);
            timeCloseText2.setBounds(420, 435, 175, 35);

            //---- timeClose2 ----
            timeClose2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            updateAmenityDetailsFrameContentPane.add(timeClose2);
            timeClose2.setBounds(635, 435, 175, 35);

            //---- editorPane5 ----
            editorPane5.setBackground(new Color(0xb5b9b8));
            editorPane5.setEditable(false);
            updateAmenityDetailsFrameContentPane.add(editorPane5);
            editorPane5.setBounds(370, 205, 485, 365);

            //---- updateDetailsAmenityBack ----
            updateDetailsAmenityBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            updateDetailsAmenityBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            updateDetailsAmenityBack.setBackground(new Color(0xc80f2e));
            updateAmenityDetailsFrameContentPane.add(updateDetailsAmenityBack);
            updateDetailsAmenityBack.setBounds(5, 5, 95, 45);

            //---- backgroundPicture6 ----
            backgroundPicture6.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            updateAmenityDetailsFrameContentPane.add(backgroundPicture6);
            backgroundPicture6.setBounds(new Rectangle(new Point(0, 55), backgroundPicture6.getPreferredSize()));

            //---- amenityUseUseAmenity2 ----
            amenityUseUseAmenity2.setText("Amenity: Update Amenity ");
            amenityUseUseAmenity2.setBackground(new Color(0xc80f2e));
            amenityUseUseAmenity2.setHorizontalAlignment(SwingConstants.CENTER);
            amenityUseUseAmenity2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenityUseUseAmenity2.setForeground(Color.white);
            amenityUseUseAmenity2.setEditable(false);
            updateAmenityDetailsFrameContentPane.add(amenityUseUseAmenity2);
            amenityUseUseAmenity2.setBounds(0, 0, 1200, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < updateAmenityDetailsFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = updateAmenityDetailsFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = updateAmenityDetailsFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                updateAmenityDetailsFrameContentPane.setMinimumSize(preferredSize);
                updateAmenityDetailsFrameContentPane.setPreferredSize(preferredSize);
            }
            updateAmenityDetailsFrame.pack();
            updateAmenityDetailsFrame.setLocationRelativeTo(updateAmenityDetailsFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
    private JFrame amenityFrame;
    private JButton amenityBack;
    private JFormattedTextField titleBar;
    private JButton goToAddAmenity;
    private JButton goToReadAmenity;
    private JButton goToUpdateAmenity;
    private JButton goToDeleteAmenity;
    private JLabel label1;
    private JFrame addAmenityFrame;
    private JButton addAmenity;
    private JFormattedTextField addAmenityTitle;
    private JFormattedTextField nameText;
    private JTextPane name;
    private JFormattedTextField statusText;
    private JComboBox selectStatus;
    private JFormattedTextField walkInPriceText;
    private JTextPane walkinPrice;
    private JFormattedTextField timeOpenText;
    private JTextPane timeOpen;
    private JFormattedTextField timeCloseText;
    private JTextPane timeClose;
    private JEditorPane editorPane2;
    private JButton addAmenityBack;
    private JLabel backgroundPicture2;
    private JFormattedTextField amenityAddAmenity;
    private JFrame readAmenityFrame;
    private JButton readAmenityBack;
    private JScrollPane tablePane;
    private JTable sessionTable;
    private JFormattedTextField amenityReadAmenity;
    private JLabel backgroundPicture3;
    private JFrame deleteAmenityFrame;
    private JButton deleteAmenity;
    private JFormattedTextField deleteAmenityTitle;
    private JComboBox selectDelete;
    private JEditorPane editorPane3;
    private JButton deleteAmenityBack;
    private JLabel backgroundPicture4;
    private JFormattedTextField amenityDeleteAmenity;
    private JFrame updateSelectAmenityFrame;
    private JButton updateAmenity;
    private JFormattedTextField updateAmenityTitle;
    private JComboBox selectUpdate;
    private JEditorPane editorPane4;
    private JButton updateSelectAmenityBack;
    private JLabel backgroundPicture5;
    private JFormattedTextField amenityUpdateAmenity2;
    private JFrame updateAmenityDetailsFrame;
    private JButton updateAmenity2;
    private JFormattedTextField updateAmenityTitle2;
    private JFormattedTextField nameText2;
    private JTextPane name2;
    private JFormattedTextField statusText2;
    private JComboBox selectStatus2;
    private JFormattedTextField walkInPriceText2;
    private JTextPane walkinPrice2;
    private JFormattedTextField timeOpenText2;
    private JTextPane timeOpen2;
    private JFormattedTextField timeCloseText2;
    private JTextPane timeClose2;
    private JEditorPane editorPane5;
    private JButton updateDetailsAmenityBack;
    private JLabel backgroundPicture6;
    private JFormattedTextField amenityUseUseAmenity2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    // Getters
    public JFrame getAmenityFrame() {
        return this.amenityFrame;
    }

    public JFrame getAddAmenityFrame() {
        return this.addAmenityFrame;
    }

    public JFrame getReadAmenityFrame() {
        return this.readAmenityFrame;
    }

    public JFrame getDeleteAmenityFrame() {
        return this.deleteAmenityFrame;
    }

    public JFrame getUpdateSelectAmenityFrame() {
        return this.updateSelectAmenityFrame;
    }

    public JFrame getUpdateAmenityDetailsFrame() {
        return this.updateAmenityDetailsFrame;
    }

    // Add Amenity
    public String getName() {
        return this.name.getText();
    }

    public int getSelectStatus() {
        return this.selectStatus.getSelectedIndex() + 1;
    }

    public String getWalkInPrice() {
        return this.walkinPrice.getText();
    }

    public String getTimeOpen() {
        return this.timeOpen.getText();
    }

    public String getTimeClose() {
        return this.timeClose.getText();
    }

    // Delete

    public int getSelectDelete() {
        return this.selectDelete.getSelectedIndex() + 1;
    }

    // Update Select
    public int getSelectUpdate() {
        return this.selectUpdate.getSelectedIndex() + 1;
    }

    // Update Details
    public String getName2() {
        return this.name2.getText();
    }

    public int getSelectStatus2() {
        return this.selectStatus2.getSelectedIndex() + 1;
    }

    public String getWalkInPrice2() {
        return this.walkinPrice2.getText();
    }

    public String getTimeOpen2() {
        return this.timeOpen2.getText();
    }

    public String getTimeClose2() {
        return this.timeClose2.getText();
    }

    // Button Action Listeners
    public void amenityBackButton(ActionListener actionListener) {
        this.amenityBack.addActionListener(actionListener);
    }

    public void goToAddAmenityButton(ActionListener actionListener) {
        this.goToAddAmenity.addActionListener(actionListener);
    }

    public void goToReadAmenityButton(ActionListener actionListener) {
        this.goToReadAmenity.addActionListener(actionListener);
    }

    public void goToUpdateAmenityButton(ActionListener actionListener) {
        this.goToUpdateAmenity.addActionListener(actionListener);
    }

    public void goToDeleteAmenityButton(ActionListener actionListener) {
        this.goToDeleteAmenity.addActionListener(actionListener);
    }

    public void addAmenityButton(ActionListener actionListener) {
        this.amenityAddAmenity.addActionListener(actionListener);
    }

    public void addAmenityBackButton(ActionListener actionListener) {
        this.addAmenityBack.addActionListener(actionListener);
    }

    public void readAmenityBackButton(ActionListener actionListener) {
        this.readAmenityBack.addActionListener(actionListener);
    }

    public void deleteAmenityButton(ActionListener actionListener) {
        this.deleteAmenity.addActionListener(actionListener);
    }

    public void deleteAmenityBackButton(ActionListener actionListener) {
        this.deleteAmenityBack.addActionListener(actionListener);
    }

    public void updateAmenityButton(ActionListener actionListener) {
        this.updateAmenity.addActionListener(actionListener);
    }

    public void updateSelectAmenityBackButton(ActionListener actionListener) {
        this.updateSelectAmenityBack.addActionListener(actionListener);
    }

    public void updateAmenity2Button(ActionListener actionListener) {
        this.updateAmenity2.addActionListener(actionListener);
    }

    public void updateDetailsAmenityBackButton(ActionListener actionListener) {
        this.updateDetailsAmenityBack.addActionListener(actionListener);
    }

}
