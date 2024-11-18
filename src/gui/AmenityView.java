import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Mon Nov 18 15:55:49 PST 2024
 */



/**
 * @author USER
 */
public class AmenityView  {

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
        amenityFrame = new JFrame();
        amenityBackButton = new JButton();
        titleBar = new JFormattedTextField();
        goToAdd = new JButton();
        goToRead = new JButton();
        goToUpdate = new JButton();
        goToDelete = new JButton();
        label1 = new JLabel();
        addAmenityFrame = new JFrame();
        nameText = new JFormattedTextField();
        name = new JTextPane();
        walkInPriceText = new JFormattedTextField();
        walkInPrice = new JTextPane();
        timeOpenText = new JFormattedTextField();
        timeOpen = new JTextPane();
        timeCloseText = new JFormattedTextField();
        timeClose = new JTextPane();
        addAmenityBackButton = new JButton();
        amenityAddAmenity = new JFormattedTextField();
        statusText = new JFormattedTextField();
        status = new JTextPane();
        greyBar = new JFormattedTextField();
        addAmenity = new JButton();
        backgroundPicture = new JLabel();
        deleteAmenityFrame = new JFrame();
        deleteAmenityButton = new JButton();
        selectAmenity = new JFormattedTextField();
        selectAmenityBar = new JComboBox();
        editorPane2 = new JEditorPane();
        deleteAmenityBack = new JButton();
        backgroundPicture2 = new JLabel();
        amenityDeleteAmenity = new JFormattedTextField();
        readAmenityFrame = new JFrame();
        amenityReadBack = new JButton();
        tablePane = new JScrollPane();
        amenityTable = new JTable();
        amenityReadAmenity = new JFormattedTextField();
        backgroundPicture3 = new JLabel();
        updateAmenitySelectFrame = new JFrame();
        updateAmenityButton = new JButton();
        selectAmenity2 = new JFormattedTextField();
        selectAmenityBar2 = new JComboBox();
        editorPane3 = new JEditorPane();
        updateAmenityBack = new JButton();
        backgroundPicture4 = new JLabel();
        amenityUpdateAmenity = new JFormattedTextField();
        updateAmenityFrame = new JFrame();
        nameText2 = new JFormattedTextField();
        name2 = new JTextPane();
        walkInPriceText2 = new JFormattedTextField();
        walkInPrice2 = new JTextPane();
        timeOpenText2 = new JFormattedTextField();
        timeOpen2 = new JTextPane();
        timeCloseText2 = new JFormattedTextField();
        timeClose2 = new JTextPane();
        updateAmenityBackButton = new JButton();
        amenityAddAmenity2 = new JFormattedTextField();
        statusText2 = new JFormattedTextField();
        status2 = new JTextPane();
        greyBar2 = new JFormattedTextField();
        updateAmenity2 = new JButton();
        backgroundPicture5 = new JLabel();

        //======== amenityFrame ========
        {
            Container amenityFrameContentPane = amenityFrame.getContentPane();
            amenityFrameContentPane.setLayout(null);

            //---- amenityBackButton ----
            amenityBackButton.setSelectedIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\backButton.jpg"));
            amenityBackButton.setIcon(new ImageIcon("C:\\Users\\Diane\\Desktop\\CCINFOM-DBApp\\resources\\backButton.jpg"));
            amenityBackButton.setBackground(new Color(0xc80f2e));
            amenityFrameContentPane.add(amenityBackButton);
            amenityBackButton.setBounds(5, 5, 95, 45);

            //---- titleBar ----
            titleBar.setText("Amenity");
            titleBar.setBackground(new Color(0xc80f2e));
            titleBar.setHorizontalAlignment(SwingConstants.CENTER);
            titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            titleBar.setForeground(Color.white);
            titleBar.setEditable(false);
            amenityFrameContentPane.add(titleBar);
            titleBar.setBounds(0, 0, 1200, 55);

            //---- goToAdd ----
            goToAdd.setText("ADD AMENITY");
            goToAdd.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToAdd.setForeground(Color.white);
            goToAdd.setBackground(new Color(0x3ca3cb));
            amenityFrameContentPane.add(goToAdd);
            goToAdd.setBounds(485, 195, 250, 55);

            //---- goToRead ----
            goToRead.setText("READ AMENITY");
            goToRead.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToRead.setForeground(Color.white);
            goToRead.setBackground(new Color(0x3ca3cb));
            amenityFrameContentPane.add(goToRead);
            goToRead.setBounds(485, 285, 250, 55);

            //---- goToUpdate ----
            goToUpdate.setText("UPDATE AMENITY");
            goToUpdate.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToUpdate.setForeground(Color.white);
            goToUpdate.setBackground(new Color(0x3ca3cb));
            amenityFrameContentPane.add(goToUpdate);
            goToUpdate.setBounds(485, 375, 250, 55);

            //---- goToDelete ----
            goToDelete.setText("DELETE AMENITY");
            goToDelete.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToDelete.setForeground(Color.white);
            goToDelete.setBackground(new Color(0x3ca3cb));
            amenityFrameContentPane.add(goToDelete);
            goToDelete.setBounds(485, 465, 250, 55);

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
            amenityFrame.setLocationRelativeTo(null);
            amenityFrame.setVisible(true);
        }

        //======== addAmenityFrame ========
        {
            Container addAmenityFrameContentPane = addAmenityFrame.getContentPane();
            addAmenityFrameContentPane.setLayout(null);

            //---- nameText ----
            nameText.setText("Name");
            nameText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            nameText.setEditable(false);
            addAmenityFrameContentPane.add(nameText);
            nameText.setBounds(395, 175, 205, 35);

            //---- name ----
            name.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            addAmenityFrameContentPane.add(name);
            name.setBounds(650, 175, 200, 35);

            //---- walkInPriceText ----
            walkInPriceText.setText("Walk-in Price Per Hour");
            walkInPriceText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            walkInPriceText.setEditable(false);
            addAmenityFrameContentPane.add(walkInPriceText);
            walkInPriceText.setBounds(395, 315, 205, 35);

            //---- walkInPrice ----
            walkInPrice.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            addAmenityFrameContentPane.add(walkInPrice);
            walkInPrice.setBounds(650, 315, 200, 35);

            //---- timeOpenText ----
            timeOpenText.setText("Time Open  ");
            timeOpenText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            timeOpenText.setEditable(false);
            addAmenityFrameContentPane.add(timeOpenText);
            timeOpenText.setBounds(395, 385, 205, 35);

            //---- timeOpen ----
            timeOpen.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            addAmenityFrameContentPane.add(timeOpen);
            timeOpen.setBounds(650, 385, 200, 35);

            //---- timeCloseText ----
            timeCloseText.setText("Time Close");
            timeCloseText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            timeCloseText.setEditable(false);
            addAmenityFrameContentPane.add(timeCloseText);
            timeCloseText.setBounds(395, 455, 205, 35);

            //---- timeClose ----
            timeClose.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            addAmenityFrameContentPane.add(timeClose);
            timeClose.setBounds(650, 455, 200, 35);

            //---- addAmenityBackButton ----
            addAmenityBackButton.setSelectedIcon(new ImageIcon("resources/backButton.jpg"));
            addAmenityBackButton.setIcon(new ImageIcon("resources/backButton.jpg"));
            addAmenityBackButton.setBackground(new Color(0xc80f2e));
            addAmenityFrameContentPane.add(addAmenityBackButton);
            addAmenityBackButton.setBounds(5, 5, 95, 45);

            //---- amenityAddAmenity ----
            amenityAddAmenity.setText("Amenity: Add Amenity");
            amenityAddAmenity.setBackground(new Color(0xc80f2e));
            amenityAddAmenity.setHorizontalAlignment(SwingConstants.CENTER);
            amenityAddAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenityAddAmenity.setForeground(Color.white);
            amenityAddAmenity.setEditable(false);
            addAmenityFrameContentPane.add(amenityAddAmenity);
            amenityAddAmenity.setBounds(0, 0, 1200, 55);

            //---- statusText ----
            statusText.setText("Status");
            statusText.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            statusText.setEditable(false);
            addAmenityFrameContentPane.add(statusText);
            statusText.setBounds(395, 245, 205, 35);

            //---- status ----
            status.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            addAmenityFrameContentPane.add(status);
            status.setBounds(650, 245, 200, 35);

            //---- greyBar ----
            greyBar.setBackground(new Color(0xb5b9b8));
            greyBar.setHorizontalAlignment(SwingConstants.CENTER);
            greyBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            greyBar.setForeground(Color.white);
            greyBar.setEditable(false);
            addAmenityFrameContentPane.add(greyBar);
            greyBar.setBounds(65, 125, 1075, 415);

            //---- addAmenity ----
            addAmenity.setText("ADD AMENITY");
            addAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            addAmenity.setForeground(Color.white);
            addAmenity.setBackground(new Color(0x3ca3cb));
            addAmenityFrameContentPane.add(addAmenity);
            addAmenity.setBounds(500, 580, 250, 55);

            //---- backgroundPicture ----
            backgroundPicture.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            addAmenityFrameContentPane.add(backgroundPicture);
            backgroundPicture.setBounds(0, 50, 1200, 620);

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

        //======== deleteAmenityFrame ========
        {
            Container deleteAmenityFrameContentPane = deleteAmenityFrame.getContentPane();
            deleteAmenityFrameContentPane.setLayout(null);

            //---- deleteAmenityButton ----
            deleteAmenityButton.setText("DELETE AMENITY");
            deleteAmenityButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            deleteAmenityButton.setForeground(Color.white);
            deleteAmenityButton.setBackground(new Color(0x3ca3cb));
            deleteAmenityFrameContentPane.add(deleteAmenityButton);
            deleteAmenityButton.setBounds(490, 395, 250, 55);

            //---- selectAmenity ----
            selectAmenity.setText("Select Amenity");
            selectAmenity.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            selectAmenity.setEditable(false);
            selectAmenity.setHorizontalAlignment(SwingConstants.CENTER);
            deleteAmenityFrameContentPane.add(selectAmenity);
            selectAmenity.setBounds(370, 235, 485, 35);

            //---- selectAmenityBar ----
            selectAmenityBar.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            deleteAmenityFrameContentPane.add(selectAmenityBar);
            selectAmenityBar.setBounds(420, 320, 390, 40);

            //---- editorPane2 ----
            editorPane2.setBackground(new Color(0xb5b9b8));
            editorPane2.setEditable(false);
            deleteAmenityFrameContentPane.add(editorPane2);
            editorPane2.setBounds(370, 235, 485, 240);

            //---- deleteAmenityBack ----
            deleteAmenityBack.setSelectedIcon(new ImageIcon("resources/backButton.jpg"));
            deleteAmenityBack.setIcon(new ImageIcon("resources/backButton.jpg"));
            deleteAmenityBack.setBackground(new Color(0xc80f2e));
            deleteAmenityFrameContentPane.add(deleteAmenityBack);
            deleteAmenityBack.setBounds(5, 5, 95, 45);

            //---- backgroundPicture2 ----
            backgroundPicture2.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            deleteAmenityFrameContentPane.add(backgroundPicture2);
            backgroundPicture2.setBounds(new Rectangle(new Point(0, 55), backgroundPicture2.getPreferredSize()));

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

        //======== readAmenityFrame ========
        {
            Container readAmenityFrameContentPane = readAmenityFrame.getContentPane();
            readAmenityFrameContentPane.setLayout(null);

            //---- amenityReadBack ----
            amenityReadBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            amenityReadBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            amenityReadBack.setBackground(new Color(0xc80f2e));
            readAmenityFrameContentPane.add(amenityReadBack);
            amenityReadBack.setBounds(5, 5, 95, 45);

            //======== tablePane ========
            {

                //---- amenityTable ----
                amenityTable.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null, null, "", null},
                                {null, null, null, null, null, null},
                        },
                        new String[] {
                                "Amenity ID ", "Name  ", "Status", "Walk In Price Per Hour", "Time Open  ", "Time Close "
                        }
                ));
                {
                    TableColumnModel cm = amenityTable.getColumnModel();
                    cm.getColumn(0).setMinWidth(80);
                    cm.getColumn(1).setMinWidth(100);
                    cm.getColumn(2).setMinWidth(100);
                    cm.getColumn(3).setMinWidth(200);
                    cm.getColumn(4).setMinWidth(150);
                    cm.getColumn(5).setMinWidth(150);
                }
                amenityTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                amenityTable.setEnabled(false);
                tablePane.setViewportView(amenityTable);
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

        //======== updateAmenitySelectFrame ========
        {
            Container updateAmenitySelectFrameContentPane = updateAmenitySelectFrame.getContentPane();
            updateAmenitySelectFrameContentPane.setLayout(null);

            //---- updateAmenityButton ----
            updateAmenityButton.setText("UPDATE AMENITY");
            updateAmenityButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            updateAmenityButton.setForeground(Color.white);
            updateAmenityButton.setBackground(new Color(0x3ca3cb));
            updateAmenitySelectFrameContentPane.add(updateAmenityButton);
            updateAmenityButton.setBounds(490, 395, 250, 55);

            //---- selectAmenity2 ----
            selectAmenity2.setText("Select Amenity");
            selectAmenity2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            selectAmenity2.setEditable(false);
            selectAmenity2.setHorizontalAlignment(SwingConstants.CENTER);
            updateAmenitySelectFrameContentPane.add(selectAmenity2);
            selectAmenity2.setBounds(370, 235, 485, 35);

            //---- selectAmenityBar2 ----
            selectAmenityBar2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            updateAmenitySelectFrameContentPane.add(selectAmenityBar2);
            selectAmenityBar2.setBounds(420, 320, 390, 40);

            //---- editorPane3 ----
            editorPane3.setBackground(new Color(0xb5b9b8));
            editorPane3.setEditable(false);
            updateAmenitySelectFrameContentPane.add(editorPane3);
            editorPane3.setBounds(370, 235, 485, 240);

            //---- updateAmenityBack ----
            updateAmenityBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            updateAmenityBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            updateAmenityBack.setBackground(new Color(0xc80f2e));
            updateAmenitySelectFrameContentPane.add(updateAmenityBack);
            updateAmenityBack.setBounds(5, 5, 95, 45);

            //---- backgroundPicture4 ----
            backgroundPicture4.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            updateAmenitySelectFrameContentPane.add(backgroundPicture4);
            backgroundPicture4.setBounds(new Rectangle(new Point(0, 55), backgroundPicture4.getPreferredSize()));

            //---- amenityUpdateAmenity ----
            amenityUpdateAmenity.setText("Amenity: Update Amenity");
            amenityUpdateAmenity.setBackground(new Color(0xc80f2e));
            amenityUpdateAmenity.setHorizontalAlignment(SwingConstants.CENTER);
            amenityUpdateAmenity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenityUpdateAmenity.setForeground(Color.white);
            amenityUpdateAmenity.setEditable(false);
            updateAmenitySelectFrameContentPane.add(amenityUpdateAmenity);
            amenityUpdateAmenity.setBounds(0, 0, 1200, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < updateAmenitySelectFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = updateAmenitySelectFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = updateAmenitySelectFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                updateAmenitySelectFrameContentPane.setMinimumSize(preferredSize);
                updateAmenitySelectFrameContentPane.setPreferredSize(preferredSize);
            }
            updateAmenitySelectFrame.pack();
            updateAmenitySelectFrame.setLocationRelativeTo(updateAmenitySelectFrame.getOwner());
        }

        //======== updateAmenityFrame ========
        {
            Container updateAmenityFrameContentPane = updateAmenityFrame.getContentPane();
            updateAmenityFrameContentPane.setLayout(null);

            //---- nameText2 ----
            nameText2.setText("Name");
            nameText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            nameText2.setEditable(false);
            updateAmenityFrameContentPane.add(nameText2);
            nameText2.setBounds(395, 175, 205, 35);

            //---- name2 ----
            name2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            updateAmenityFrameContentPane.add(name2);
            name2.setBounds(650, 175, 200, 35);

            //---- walkInPriceText2 ----
            walkInPriceText2.setText("Walk-in Price Per Hour");
            walkInPriceText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            walkInPriceText2.setEditable(false);
            updateAmenityFrameContentPane.add(walkInPriceText2);
            walkInPriceText2.setBounds(395, 315, 205, 35);

            //---- walkInPrice2 ----
            walkInPrice2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            updateAmenityFrameContentPane.add(walkInPrice2);
            walkInPrice2.setBounds(650, 315, 200, 35);

            //---- timeOpenText2 ----
            timeOpenText2.setText("Time Open  ");
            timeOpenText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            timeOpenText2.setEditable(false);
            updateAmenityFrameContentPane.add(timeOpenText2);
            timeOpenText2.setBounds(395, 385, 205, 35);

            //---- timeOpen2 ----
            timeOpen2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            updateAmenityFrameContentPane.add(timeOpen2);
            timeOpen2.setBounds(650, 385, 200, 35);

            //---- timeCloseText2 ----
            timeCloseText2.setText("Time Close");
            timeCloseText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            timeCloseText2.setEditable(false);
            updateAmenityFrameContentPane.add(timeCloseText2);
            timeCloseText2.setBounds(395, 455, 205, 35);

            //---- timeClose2 ----
            timeClose2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            updateAmenityFrameContentPane.add(timeClose2);
            timeClose2.setBounds(650, 455, 200, 35);

            //---- updateAmenityBackButton ----
            updateAmenityBackButton.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            updateAmenityBackButton.setIcon(new ImageIcon("resource/backButton.jpg"));
            updateAmenityBackButton.setBackground(new Color(0xc80f2e));
            updateAmenityFrameContentPane.add(updateAmenityBackButton);
            updateAmenityBackButton.setBounds(5, 5, 95, 45);

            //---- amenityAddAmenity2 ----
            amenityAddAmenity2.setText("Amenity: Update Amenity");
            amenityAddAmenity2.setBackground(new Color(0xc80f2e));
            amenityAddAmenity2.setHorizontalAlignment(SwingConstants.CENTER);
            amenityAddAmenity2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenityAddAmenity2.setForeground(Color.white);
            amenityAddAmenity2.setEditable(false);
            updateAmenityFrameContentPane.add(amenityAddAmenity2);
            amenityAddAmenity2.setBounds(0, 0, 1200, 55);

            //---- statusText2 ----
            statusText2.setText("Status");
            statusText2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
            statusText2.setEditable(false);
            updateAmenityFrameContentPane.add(statusText2);
            statusText2.setBounds(395, 245, 205, 35);

            //---- status2 ----
            status2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
            updateAmenityFrameContentPane.add(status2);
            status2.setBounds(650, 245, 200, 35);

            //---- greyBar2 ----
            greyBar2.setBackground(new Color(0xb5b9b8));
            greyBar2.setHorizontalAlignment(SwingConstants.CENTER);
            greyBar2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            greyBar2.setForeground(Color.white);
            greyBar2.setEditable(false);
            updateAmenityFrameContentPane.add(greyBar2);
            greyBar2.setBounds(65, 125, 1075, 415);

            //---- updateAmenity2 ----
            updateAmenity2.setText("UPDATE AMENITY");
            updateAmenity2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            updateAmenity2.setForeground(Color.white);
            updateAmenity2.setBackground(new Color(0x3ca3cb));
            updateAmenityFrameContentPane.add(updateAmenity2);
            updateAmenity2.setBounds(500, 580, 250, 55);

            //---- backgroundPicture5 ----
            backgroundPicture5.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            updateAmenityFrameContentPane.add(backgroundPicture5);
            backgroundPicture5.setBounds(0, 50, 1200, 620);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < updateAmenityFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = updateAmenityFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = updateAmenityFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                updateAmenityFrameContentPane.setMinimumSize(preferredSize);
                updateAmenityFrameContentPane.setPreferredSize(preferredSize);
            }
            updateAmenityFrame.pack();
            updateAmenityFrame.setLocationRelativeTo(updateAmenityFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
    private JFrame amenityFrame;
    private JButton amenityBackButton;
    private JFormattedTextField titleBar;
    private JButton goToAdd;
    private JButton goToRead;
    private JButton goToUpdate;
    private JButton goToDelete;
    private JLabel label1;
    private JFrame addAmenityFrame;
    private JFormattedTextField nameText;
    private JTextPane name;
    private JFormattedTextField walkInPriceText;
    private JTextPane walkInPrice;
    private JFormattedTextField timeOpenText;
    private JTextPane timeOpen;
    private JFormattedTextField timeCloseText;
    private JTextPane timeClose;
    private JButton addAmenityBackButton;
    private JFormattedTextField amenityAddAmenity;
    private JFormattedTextField statusText;
    private JTextPane status;
    private JFormattedTextField greyBar;
    private JButton addAmenity;
    private JLabel backgroundPicture;
    private JFrame deleteAmenityFrame;
    private JButton deleteAmenityButton;
    private JFormattedTextField selectAmenity;
    private JComboBox selectAmenityBar;
    private JEditorPane editorPane2;
    private JButton deleteAmenityBack;
    private JLabel backgroundPicture2;
    private JFormattedTextField amenityDeleteAmenity;
    private JFrame readAmenityFrame;
    private JButton amenityReadBack;
    private JScrollPane tablePane;
    private JTable amenityTable;
    private JFormattedTextField amenityReadAmenity;
    private JLabel backgroundPicture3;
    private JFrame updateAmenitySelectFrame;
    private JButton updateAmenityButton;
    private JFormattedTextField selectAmenity2;
    private JComboBox selectAmenityBar2;
    private JEditorPane editorPane3;
    private JButton updateAmenityBack;
    private JLabel backgroundPicture4;
    private JFormattedTextField amenityUpdateAmenity;
    private JFrame updateAmenityFrame;
    private JFormattedTextField nameText2;
    private JTextPane name2;
    private JFormattedTextField walkInPriceText2;
    private JTextPane walkInPrice2;
    private JFormattedTextField timeOpenText2;
    private JTextPane timeOpen2;
    private JFormattedTextField timeCloseText2;
    private JTextPane timeClose2;
    private JButton updateAmenityBackButton;
    private JFormattedTextField amenityAddAmenity2;
    private JFormattedTextField statusText2;
    private JTextPane status2;
    private JFormattedTextField greyBar2;
    private JButton updateAmenity2;
    private JLabel backgroundPicture5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    // Getters
    public JFrame getAmenityFrame() {
        return this.amenityFrame;
    }

    public JFrame getAddAmenityFrame(){
        return this.addAmenityFrame;
    }

    public JFrame getDeleteAmenityFrame(){
        return this.deleteAmenityFrame;
    }

    public JFrame getReadAmenityFrame(){
        return this.readAmenityFrame;
    }

    public JFrame getUpdateAmenityFrame(){
        return this.updateAmenityFrame;
    }

    public JFrame getUpdateAmenitySelectFrame(){
        return this.updateAmenitySelectFrame;
    }

    // Add
    public String getName(){
        return this.name.getText();
    }

    public String getStatus(){
        return this.status.getText();
    }

    public String getWalkInPrice(){
        return this.walkInPrice.getText();
    }

    public String getTimeOpen(){
        return this.timeOpen.getText();
    }

    public String getTimeClose(){
        return this.timeClose.getText();
    }

    // Delete
    public int getDeleteAmenityID(){
        return this.selectAmenityBar.getSelectedIndex() + 1;
    }

    // Update
    public int getAmenityID(){
        return this.selectAmenityBar2.getSelectedIndex() + 1;
    }

    public String getUpdateName(){
        return this.name2.getText();
    }

    public String getUpdateStatus(){
        return this.status2.getText();
    }

    public String getUpdateWalkInPrice(){
        return this.walkInPrice2.getText();
    }

    public String getUpdateTimeOpen(){
        return this.timeOpen2.getText();
    }

    public String getUpdateTimeClose(){
        return this.timeClose2.getText();
    }

    // Setters
    public void setName(String name){
        this.name.setText(name);
    }

    public void setStatus(String status){
        this.status.setText(status);
    }

    public void setWalkInPrice(String walkInPrice){
        this.walkInPrice.setText(walkInPrice);
    }

    public void setTimeOpen(String timeOpen){
        this.walkInPrice.setText(timeOpen);
    }

    public void setTimeClose(String timeClose){
        this.timeClose.setText(timeClose);
    }

    // Button Action Listeners
    public void amenityBackButtonB(ActionListener actionListener){
        this.amenityBackButton.addActionListener(actionListener);
    }

    public void goToAddB(ActionListener actionListener){
        this.goToAdd.addActionListener(actionListener);
    }

    public void goToReadB(ActionListener actionListener){
        this.goToRead.addActionListener(actionListener);
    }

    public void goToUpdateB(ActionListener actionListener){
        this.goToUpdate.addActionListener(actionListener);
    }

    public void goToDeleteB(ActionListener actionListener){
        this.goToDelete.addActionListener(actionListener);
    }

    public void addAmenityBackButtonB(ActionListener actionListener){
        this.addAmenityBackButton.addActionListener(actionListener);
    }

    public void addAmenityB(ActionListener actionListener){
        this.amenityAddAmenity.addActionListener(actionListener);
    }

    public void deleteAmenityBackB(ActionListener actionListener){
        this.deleteAmenityBack.addActionListener(actionListener);
    }

    public void deleteAmenityButtonB(ActionListener actionListener){
        this.deleteAmenityButton.addActionListener(actionListener);
    }

    public void amenityReadBackB(ActionListener actionListener){
        this.amenityReadBack.addActionListener(actionListener);
    }

    public void updateAmenityButtonB(ActionListener actionListener){
        this.updateAmenityButton.addActionListener(actionListener);
    }

    public void updateAmenityBackB(ActionListener actionListener){
        this.updateAmenityBack.addActionListener(actionListener);
    }

    public void updateAmenityBackButtonB(ActionListener actionListener){
        this.updateAmenityBackButton.addActionListener(actionListener);
    }

    public void updateAmenity2B(ActionListener actionListener){
        this.updateAmenity2.addActionListener(actionListener);
    }

    public void main(String[] args){
        new AmenityController();
    }
}
