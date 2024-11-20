import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Wed Nov 20 13:58:28 PST 2024
 */



/**
 * @author USER
 */
public class TrainersReportView extends JFrame {
    public TrainersReportView() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
        trainersReportFrame = new JFrame();
        trainersReportBack = new JButton();
        trainersReport = new JFormattedTextField();
        goToMostPopular = new JButton();
        label1 = new JLabel();
        mostPopularFrame = new JFrame();
        mostPopularBack = new JButton();
        tablePane = new JScrollPane();
        mostPopularTable = new JTable();
        mostPopular = new JFormattedTextField();
        backgroundPicture = new JLabel();

        //======== trainersReportFrame ========
        {
            Container trainersReportFrameContentPane = trainersReportFrame.getContentPane();
            trainersReportFrameContentPane.setLayout(null);

            //---- trainersReportBack ----
            trainersReportBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            trainersReportBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            trainersReportBack.setBackground(new Color(0xc80f2e));
            trainersReportFrameContentPane.add(trainersReportBack);
            trainersReportBack.setBounds(5, 5, 95, 45);

            //---- trainersReport ----
            trainersReport.setText("Trainers Report");
            trainersReport.setBackground(new Color(0xc80f2e));
            trainersReport.setHorizontalAlignment(SwingConstants.CENTER);
            trainersReport.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            trainersReport.setForeground(Color.white);
            trainersReport.setEditable(false);
            trainersReportFrameContentPane.add(trainersReport);
            trainersReport.setBounds(0, 0, 1200, 55);

            //---- goToMostPopular ----
            goToMostPopular.setText("MOST POPULAR");
            goToMostPopular.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToMostPopular.setForeground(Color.white);
            goToMostPopular.setBackground(new Color(0x3ca3cb));
            trainersReportFrameContentPane.add(goToMostPopular);
            goToMostPopular.setBounds(485, 320, 250, 55);

            //---- label1 ----
            label1.setIcon(new ImageIcon("resource/trainersbg.jpg"));
            trainersReportFrameContentPane.add(label1);
            label1.setBounds(0, 50, 1200, 620);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < trainersReportFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = trainersReportFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = trainersReportFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                trainersReportFrameContentPane.setMinimumSize(preferredSize);
                trainersReportFrameContentPane.setPreferredSize(preferredSize);
            }
            trainersReportFrame.pack();
            trainersReportFrame.setSize(1200, 700);
            trainersReportFrame.setLocationRelativeTo(trainersReportFrame.getOwner());
            trainersReportFrame.setVisible(true);
        }

        //======== mostPopularFrame ========
        {
            Container mostPopularFrameContentPane = mostPopularFrame.getContentPane();
            mostPopularFrameContentPane.setLayout(null);

            //---- mostPopularBack ----
            mostPopularBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            mostPopularBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            mostPopularBack.setBackground(new Color(0xc80f2e));
            mostPopularFrameContentPane.add(mostPopularBack);
            mostPopularBack.setBounds(5, 5, 95, 45);

            //======== tablePane ========
            {

                //---- mostPopularTable ----
                mostPopularTable.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null, null},
                                {null, null, null, null},
                        },
                        new String[] {
                                "Ranking", "Number of Scheduled Session ", "Trainer Name", "Speciality"
                        }
                ));
                {
                    TableColumnModel cm = mostPopularTable.getColumnModel();
                    cm.getColumn(0).setMinWidth(120);
                    cm.getColumn(1).setMinWidth(200);
                    cm.getColumn(2).setMinWidth(200);
                    cm.getColumn(3).setMinWidth(100);
                }
                mostPopularTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                mostPopularTable.setEnabled(false);
                tablePane.setViewportView(mostPopularTable);
            }
            mostPopularFrameContentPane.add(tablePane);
            tablePane.setBounds(115, 145, 970, 435);

            //---- mostPopular ----
            mostPopular.setText("Trainers Report: Most Popular");
            mostPopular.setBackground(new Color(0xc80f2e));
            mostPopular.setHorizontalAlignment(SwingConstants.CENTER);
            mostPopular.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            mostPopular.setForeground(Color.white);
            mostPopular.setEditable(false);
            mostPopularFrameContentPane.add(mostPopular);
            mostPopular.setBounds(0, 0, 1200, 55);

            //---- backgroundPicture ----
            backgroundPicture.setIcon(new ImageIcon("resource/trainersbg.jpg"));
            mostPopularFrameContentPane.add(backgroundPicture);
            backgroundPicture.setBounds(0, 55, 1200, 620);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < mostPopularFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = mostPopularFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = mostPopularFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                mostPopularFrameContentPane.setMinimumSize(preferredSize);
                mostPopularFrameContentPane.setPreferredSize(preferredSize);
            }
            mostPopularFrame.pack();
            mostPopularFrame.setLocationRelativeTo(mostPopularFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
    private JFrame trainersReportFrame;
    private JButton trainersReportBack;
    private JFormattedTextField trainersReport;
    private JButton goToMostPopular;
    private JLabel label1;
    private JFrame mostPopularFrame;
    private JButton mostPopularBack;
    private JScrollPane tablePane;
    private JTable mostPopularTable;
    private JFormattedTextField mostPopular;
    private JLabel backgroundPicture;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    // Getters
    public JFrame getTrainersReportFrame() {
        return this.trainersReportFrame;
    }

    public JFrame getMostPopularFrame() {
        return this.mostPopularFrame;
    }

    // Button Action Listeners
    public void trainersReportBackButton(ActionListener actionListener){
        this.trainersReportBack.addActionListener(actionListener);
    }

    public void goToMostPopularButton(ActionListener actionListener){
        this.goToMostPopular.addActionListener(actionListener);
    }

    public void mostPopularBackButton(ActionListener actionListener){
        this.mostPopularBack.addActionListener(actionListener);
    }
}
