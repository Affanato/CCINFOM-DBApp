import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Nov 16 05:33:48 PST 2024
 */



/**
 * @author USER
 */
public class StartPageView extends JFrame {
    public StartPageView() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
        button1 = new JButton();
        label2 = new JLabel();
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0xffffff));
        this.setResizable(false);

        //---- button1 ----
        button1.setText("START");
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 18f));
        contentPane.add(button1);
        button1.setBounds(450, 500, 300, 90);

        //---- label2 ----
        label2.setText("Bunyi Gym");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setVerticalAlignment(SwingConstants.CENTER);
        label2.setBackground(new Color(0xc80f2e));
        label2.setForeground(Color.white);
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 60f));
        label2.setOpaque(true);
        contentPane.add(label2);
        label2.setBounds(350, 100, 500, 125);

        //---- label1 ----
        label1.setIcon(new ImageIcon("resource/GymBackground.png"));
        contentPane.add(label1);
        label1.setBounds(0, 0, 1200, 700);

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
    private JButton button1;
    private JLabel label2;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public JFrame getFrame(){
        return this;
    }

    public void startButton(ActionListener actionListener){
        button1.addActionListener(actionListener);
    }

    public static void main(String[] args) {
        new StartPageController();
    }
}