import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Nov 17 17:35:22 PST 2024
 */



/**
 * @author USER
 */
public class AmenitiesView extends JFrame {
    public AmenitiesView() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
        amenitiesBackButton = new JButton();
        titleBar = new JFormattedTextField();
        goToAdd = new JButton();
        goToRead = new JButton();
        goToUpdate = new JButton();
        goToDelete = new JButton();
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0xffffff));
        this.setResizable(false);

        //---- amenitiesBackButton ----
        amenitiesBackButton.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
        amenitiesBackButton.setIcon(new ImageIcon("resource/backButton.jpg"));
        amenitiesBackButton.setBackground(new Color(0xc80f2e));
        contentPane.add(amenitiesBackButton);
        amenitiesBackButton.setBounds(5, 5, 95, 45);

        //---- titleBar ----
        titleBar.setText("Amenities");
        titleBar.setBackground(new Color(0xc80f2e));
        titleBar.setHorizontalAlignment(SwingConstants.CENTER);
        titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
        titleBar.setForeground(Color.white);
        titleBar.setEditable(false);
        contentPane.add(titleBar);
        titleBar.setBounds(0, 0, 1200, 55);

        //---- goToAdd ----
        goToAdd.setText("ADD AMENITIES");
        goToAdd.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
        goToAdd.setForeground(Color.white);
        goToAdd.setBackground(new Color(0x3ca3cb));
        contentPane.add(goToAdd);
        goToAdd.setBounds(485, 195, 250, 55);

        //---- goToRead ----
        goToRead.setText("READ AMENITIES");
        goToRead.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
        goToRead.setForeground(Color.white);
        goToRead.setBackground(new Color(0x3ca3cb));
        contentPane.add(goToRead);
        goToRead.setBounds(485, 285, 250, 55);

        //---- goToUpdate ----
        goToUpdate.setText("UPDATE AMENITIES");
        goToUpdate.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
        goToUpdate.setForeground(Color.white);
        goToUpdate.setBackground(new Color(0x3ca3cb));
        contentPane.add(goToUpdate);
        goToUpdate.setBounds(485, 375, 250, 55);

        //---- goToDelete ----
        goToDelete.setText("DELETE AMENITIES");
        goToDelete.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
        goToDelete.setForeground(Color.white);
        goToDelete.setBackground(new Color(0x3ca3cb));
        contentPane.add(goToDelete);
        goToDelete.setBounds(485, 465, 250, 55);

        //---- label1 ----
        label1.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
        contentPane.add(label1);
        label1.setBounds(0, 50, 1200, 620);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
    private JButton amenitiesBackButton;
    private JFormattedTextField titleBar;
    private JButton goToAdd;
    private JButton goToRead;
    private JButton goToUpdate;
    private JButton goToDelete;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public static void main(String[] args) {
        new AmenitiesView();
    }
}
