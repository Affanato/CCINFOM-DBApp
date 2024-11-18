import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Nov 17 12:21:47 PST 2024
 */



/**
 * @author USER
 */
public class MainMenuView extends JFrame {
    public MainMenuView() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        label8 = new JLabel();
        label9 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0xffffff));
        this.setResizable(false);

        //---- label1 ----
        label1.setText("       Bunyi Gym");
        label1.setBackground(new Color(0xc80f2e));
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 15f));
        label1.setForeground(Color.white);
        label1.setOpaque(true);
        contentPane.add(label1);
        label1.setBounds(0, 0, 1200, 95);

        //---- label2 ----
        label2.setIcon(new ImageIcon("resource/ProfilePic.png"));
        contentPane.add(label2);
        label2.setBounds(40, 135, 120, 120);

        //---- label3 ----
        label3.setText("Branch Manager");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 30f));
        contentPane.add(label3);
        label3.setBounds(180, 125, 370, 70);

        //---- button1 ----
        button1.setText("Sales Report");
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 9f));
        button1.setForeground(Color.white);
        button1.setBackground(new Color(0x3ca3cb));
        contentPane.add(button1);
        button1.setBounds(595, 115, 260, 77);

        //---- button2 ----
        button2.setText("Membership Report");
        button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 9f));
        button2.setForeground(Color.white);
        button2.setBackground(new Color(0x3ca3cb));
        contentPane.add(button2);
        button2.setBounds(595, 230, 260, 77);

        //---- button3 ----
        button3.setText("Trainer Report ");
        button3.setForeground(Color.white);
        button3.setBackground(new Color(0x3ca3cb));
        button3.setFont(button3.getFont().deriveFont(button3.getFont().getSize() + 9f));
        contentPane.add(button3);
        button3.setBounds(895, 230, 260, 77);

        //---- button4 ----
        button4.setText("Amenities Use ");
        button4.setBackground(new Color(0x3ca3cb));
        button4.setFont(button4.getFont().deriveFont(button4.getFont().getSize() + 12f));
        button4.setForeground(Color.white);
        contentPane.add(button4);
        button4.setBounds(895, 115, 260, 77);

        //---- button5 ----
        button5.setText("Product");
        button5.setBackground(new Color(0xc80f2e));
        button5.setForeground(Color.white);
        contentPane.add(button5);
        button5.setBounds(915, 540, 200, 90);

        //---- button6 ----
        button6.setText("Membership");
        button6.setBackground(new Color(0xc80f2e));
        button6.setForeground(Color.white);
        contentPane.add(button6);
        button6.setBounds(350, 540, 215, 90);

        //---- button7 ----
        button7.setText("Trainer");
        button7.setBackground(new Color(0xc80f2e));
        button7.setForeground(Color.white);
        contentPane.add(button7);
        button7.setBounds(640, 380, 210, 90);

        //---- button8 ----
        button8.setText("Member");
        button8.setBackground(new Color(0xc80f2e));
        button8.setForeground(Color.white);
        contentPane.add(button8);
        button8.setBounds(80, 540, 210, 90);

        //---- button9 ----
        button9.setText("Amenity ");
        button9.setBackground(new Color(0xc80f2e));
        button9.setForeground(Color.white);
        contentPane.add(button9);
        button9.setBounds(80, 380, 210, 90);

        //---- button10 ----
        button10.setText("Training Session");
        button10.setBackground(new Color(0xc80f2e));
        button10.setForeground(Color.white);
        contentPane.add(button10);
        button10.setBounds(910, 380, 205, 85);

        //---- button11 ----
        button11.setText("Amenity Use");
        button11.setBackground(new Color(0xc80f2e));
        button11.setForeground(Color.white);
        contentPane.add(button11);
        button11.setBounds(350, 380, 210, 90);

        //---- button12 ----
        button12.setText("Membership Type");
        button12.setBackground(new Color(0xc80f2e));
        button12.setForeground(Color.white);
        contentPane.add(button12);
        button12.setBounds(645, 540, 210, 90);

        //---- label8 ----
        label8.setText("text");
        label8.setIcon(new ImageIcon("resource/MainMenuBG.png"));
        contentPane.add(label8);
        label8.setBounds(0, 325, 1200, label8.getPreferredSize().height);

        //---- label9 ----
        label9.setBackground(Color.white);
        label9.setOpaque(true);
        contentPane.add(label9);
        label9.setBounds(0, 95, 1200, 230);

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
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JLabel label8;
    private JLabel label9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public static void main(String[] args) {
        new MainMenuView();
    }
}
