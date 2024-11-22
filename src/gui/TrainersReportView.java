import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.ActionListener;
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
        goToMonthlySessions = new JButton();
        goToYearlySessions = new JButton();
        label1 = new JLabel();
        monthlySessionsFrame = new JFrame();
        monthlySessionBack = new JButton();
        tablePane = new JScrollPane();
        monthlyTable = new JTable();
        mostPopular = new JFormattedTextField();
        backgroundPicture = new JLabel();
        yearlySessionsFrame = new JFrame();
        yearlySessionsBack = new JButton();
        tablePane2 = new JScrollPane();
        yearlyTable = new JTable();
        mostPopular2 = new JFormattedTextField();
        backgroundPicture2 = new JLabel();

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

            //---- goToMonthlySessions ----
            goToMonthlySessions.setText("MONTHLY TRAINERS SESSIONS");
            goToMonthlySessions.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
            goToMonthlySessions.setForeground(Color.white);
            goToMonthlySessions.setBackground(new Color(0x3ca3cb));
            trainersReportFrameContentPane.add(goToMonthlySessions);
            goToMonthlySessions.setBounds(485, 265, 250, 55);

            //---- goToYearlySessions ----
            goToYearlySessions.setText("YEARLY TRAINERS SESSIONS");
            goToYearlySessions.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
            goToYearlySessions.setForeground(Color.white);
            goToYearlySessions.setBackground(new Color(0x3ca3cb));
            trainersReportFrameContentPane.add(goToYearlySessions);
            goToYearlySessions.setBounds(485, 435, 250, 55);

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

        //======== monthlySessionsFrame ========
        {
            Container monthlySessionsFrameContentPane = monthlySessionsFrame.getContentPane();
            monthlySessionsFrameContentPane.setLayout(null);

            //---- monthlySessionBack ----
            monthlySessionBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            monthlySessionBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            monthlySessionBack.setBackground(new Color(0xc80f2e));
            monthlySessionsFrameContentPane.add(monthlySessionBack);
            monthlySessionBack.setBounds(5, 5, 95, 45);

            //======== tablePane ========
            {

                //---- monthlyTable ----
                monthlyTable.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                        },
                        new String[] {
                                "Year", "Month", "Last Name", "First Name", "Program Specialty", "Total Sessions"
                        }
                ));
                {
                    TableColumnModel cm = monthlyTable.getColumnModel();
                    cm.getColumn(0).setMinWidth(100);
                    cm.getColumn(1).setMinWidth(100);
                    cm.getColumn(2).setMinWidth(150);
                    cm.getColumn(3).setMinWidth(150);
                    cm.getColumn(4).setMinWidth(200);
                    cm.getColumn(5).setMinWidth(150);
                }
                monthlyTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                monthlyTable.setEnabled(false);
                tablePane.setViewportView(monthlyTable);
            }
            monthlySessionsFrameContentPane.add(tablePane);
            tablePane.setBounds(115, 145, 970, 435);

            //---- mostPopular ----
            mostPopular.setText("Trainers Report: Monthly Trainers Sessions");
            mostPopular.setBackground(new Color(0xc80f2e));
            mostPopular.setHorizontalAlignment(SwingConstants.CENTER);
            mostPopular.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            mostPopular.setForeground(Color.white);
            mostPopular.setEditable(false);
            monthlySessionsFrameContentPane.add(mostPopular);
            mostPopular.setBounds(0, 0, 1200, 55);

            //---- backgroundPicture ----
            backgroundPicture.setIcon(new ImageIcon("resource/trainersbg.jpg"));
            monthlySessionsFrameContentPane.add(backgroundPicture);
            backgroundPicture.setBounds(0, 55, 1200, 620);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < monthlySessionsFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = monthlySessionsFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = monthlySessionsFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                monthlySessionsFrameContentPane.setMinimumSize(preferredSize);
                monthlySessionsFrameContentPane.setPreferredSize(preferredSize);
            }
            monthlySessionsFrame.pack();
            monthlySessionsFrame.setLocationRelativeTo(monthlySessionsFrame.getOwner());
        }

        //======== yearlySessionsFrame ========
        {
            Container yearlySessionsFrameContentPane = yearlySessionsFrame.getContentPane();
            yearlySessionsFrameContentPane.setLayout(null);

            //---- yearlySessionsBack ----
            yearlySessionsBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            yearlySessionsBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            yearlySessionsBack.setBackground(new Color(0xc80f2e));
            yearlySessionsFrameContentPane.add(yearlySessionsBack);
            yearlySessionsBack.setBounds(5, 5, 95, 45);

            //======== tablePane2 ========
            {

                //---- yearlyTable ----
                yearlyTable.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                        },
                        new String[] {
                                "Year", "Last Name", "First Name", "Program Specialty", "Total Sessions"
                        }
                ));
                {
                    TableColumnModel cm = yearlyTable.getColumnModel();
                    cm.getColumn(0).setMinWidth(100);
                    cm.getColumn(1).setMinWidth(150);
                    cm.getColumn(2).setMinWidth(150);
                    cm.getColumn(3).setMinWidth(200);
                    cm.getColumn(4).setMinWidth(150);
                }
                yearlyTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                yearlyTable.setEnabled(false);
                tablePane2.setViewportView(yearlyTable);
            }
            yearlySessionsFrameContentPane.add(tablePane2);
            tablePane2.setBounds(115, 145, 970, 435);

            //---- mostPopular2 ----
            mostPopular2.setText("Trainers Report: Yearly Trainers Sessions");
            mostPopular2.setBackground(new Color(0xc80f2e));
            mostPopular2.setHorizontalAlignment(SwingConstants.CENTER);
            mostPopular2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            mostPopular2.setForeground(Color.white);
            mostPopular2.setEditable(false);
            yearlySessionsFrameContentPane.add(mostPopular2);
            mostPopular2.setBounds(0, 0, 1200, 55);

            //---- backgroundPicture2 ----
            backgroundPicture2.setIcon(new ImageIcon("resource/trainersbg.jpg"));
            yearlySessionsFrameContentPane.add(backgroundPicture2);
            backgroundPicture2.setBounds(0, 55, 1200, 620);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < yearlySessionsFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = yearlySessionsFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = yearlySessionsFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                yearlySessionsFrameContentPane.setMinimumSize(preferredSize);
                yearlySessionsFrameContentPane.setPreferredSize(preferredSize);
            }
            yearlySessionsFrame.pack();
            yearlySessionsFrame.setLocationRelativeTo(yearlySessionsFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
    private JFrame trainersReportFrame;
    private JButton trainersReportBack;
    private JFormattedTextField trainersReport;
    private JButton goToMonthlySessions;
    private JButton goToYearlySessions;
    private JLabel label1;
    private JFrame monthlySessionsFrame;
    private JButton monthlySessionBack;
    private JScrollPane tablePane;
    private JTable monthlyTable;
    private JFormattedTextField mostPopular;
    private JLabel backgroundPicture;
    private JFrame yearlySessionsFrame;
    private JButton yearlySessionsBack;
    private JScrollPane tablePane2;
    private JTable yearlyTable;
    private JFormattedTextField mostPopular2;
    private JLabel backgroundPicture2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    // Getters
    public JFrame getTrainersReportFrame() {
        return this.trainersReportFrame;
    }

    public JFrame getMonthlySessionsFrame() {
        return this.monthlySessionsFrame;
    }

    public JFrame getYearlySessionsFrame() {
        return this.yearlySessionsFrame;
    }

    // Button Action Listeners
    public void trainersReportBackButton(ActionListener actionListener) {
        this.trainersReportBack.addActionListener(actionListener);
    }

    public void goToMonthlySessionsButton(ActionListener actionListener) {
        this.goToMonthlySessions.addActionListener(actionListener);
    }

    public void goToYearlySessionsButton(ActionListener actionListener) {
        this.goToYearlySessions.addActionListener(actionListener);
    }

    public void monthlySessionBackButton(ActionListener actionListener) {
        this.monthlySessionBack.addActionListener(actionListener);
    }

    public void yearlySessionsBackButton(ActionListener actionListener) {
        this.yearlySessionsBack.addActionListener(actionListener);
    }

    // Table Setters
    public void setMonthlyTable(Object[][] data) {
        String[] columnNames = {
                "Year", "Month", "Last Name", "First Name", "Program Specialty", "Total Sessions"
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        monthlyTable.setModel(model);

        TableColumnModel cm = monthlyTable.getColumnModel();
        cm.getColumn(0).setMinWidth(100);
        cm.getColumn(1).setMinWidth(100);
        cm.getColumn(2).setMinWidth(150);
        cm.getColumn(3).setMinWidth(150);
        cm.getColumn(4).setMinWidth(200);
        cm.getColumn(5).setMinWidth(150);
    }

    public void setYearlyTable(Object[][] data) {
        String[] columnNames = {
                "Year", "Last Name", "First Name", "Program Specialty", "Total Sessions"
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        yearlyTable.setModel(model);

        TableColumnModel cm = yearlyTable.getColumnModel();
        cm.getColumn(0).setMinWidth(100);
        cm.getColumn(1).setMinWidth(150);
        cm.getColumn(2).setMinWidth(150);
        cm.getColumn(3).setMinWidth(200);
        cm.getColumn(4).setMinWidth(150);
    }

}

