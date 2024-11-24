import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Tue Nov 19 16:37:42 PST 2024
 */



/**
 * @author USER
 */
public class SubscriptionsReportView extends JFrame {
    public SubscriptionsReportView() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
        subscriptionsReportFrame = new JFrame();
        subscriptionsReportBack = new JButton();
        subscriptionsReport = new JFormattedTextField();
        goToNewMonthlySubscriptions = new JButton();
        goToNewYearlySubscriptions = new JButton();
        goToTotalSubscriptions = new JButton();
        bgPicture = new JLabel();
        newMonthlyFrame = new JFrame();
        newMonthlyBack = new JButton();
        tablePane = new JScrollPane();
        sessionTable = new JTable();
        newMonthlySubscriptions = new JFormattedTextField();
        bgPicture2 = new JLabel();
        newYearlyFrame = new JFrame();
        newYearlyBack = new JButton();
        tablePane3 = new JScrollPane();
        sessionTable3 = new JTable();
        newYearlySubscriptions = new JFormattedTextField();
        bgPicture4 = new JLabel();
        totalSubscriptionsFrame = new JFrame();
        totalSubscriptionsBack = new JButton();
        tablePane2 = new JScrollPane();
        sessionTable2 = new JTable();
        totalSubscriptionsReport = new JFormattedTextField();
        bgPicture3 = new JLabel();

        //======== subscriptionsReportFrame ========
        {
            Container subscriptionsReportFrameContentPane = subscriptionsReportFrame.getContentPane();
            subscriptionsReportFrameContentPane.setLayout(null);

            //---- subscriptionsReportBack ----
            subscriptionsReportBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            subscriptionsReportBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            subscriptionsReportBack.setBackground(new Color(0xc80f2e));
            subscriptionsReportFrameContentPane.add(subscriptionsReportBack);
            subscriptionsReportBack.setBounds(5, 5, 95, 45);

            //---- subscriptionsReport ----
            subscriptionsReport.setText("Subscriptions Report");
            subscriptionsReport.setBackground(new Color(0xc80f2e));
            subscriptionsReport.setHorizontalAlignment(SwingConstants.CENTER);
            subscriptionsReport.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            subscriptionsReport.setForeground(Color.white);
            subscriptionsReport.setEditable(false);
            subscriptionsReportFrameContentPane.add(subscriptionsReport);
            subscriptionsReport.setBounds(0, 0, 1200, 55);

            //---- goToNewMonthlySubscriptions ----
            goToNewMonthlySubscriptions.setText("MONTHLY SUBSCRIPTIONS");
            goToNewMonthlySubscriptions.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
            goToNewMonthlySubscriptions.setForeground(Color.white);
            goToNewMonthlySubscriptions.setBackground(new Color(0x3ca3cb));
            subscriptionsReportFrameContentPane.add(goToNewMonthlySubscriptions);
            goToNewMonthlySubscriptions.setBounds(470, 220, 250, 55);

            //---- goToNewYearlySubscriptions ----
            goToNewYearlySubscriptions.setText("YEARLY SUBSCRIPTIONS");
            goToNewYearlySubscriptions.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
            goToNewYearlySubscriptions.setForeground(Color.white);
            goToNewYearlySubscriptions.setBackground(new Color(0x3ca3cb));
            subscriptionsReportFrameContentPane.add(goToNewYearlySubscriptions);
            goToNewYearlySubscriptions.setBounds(470, 345, 250, 55);

            //---- goToTotalSubscriptions ----
            goToTotalSubscriptions.setText("TOTAL SUBSCRIPTIONS");
            goToTotalSubscriptions.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
            goToTotalSubscriptions.setForeground(Color.white);
            goToTotalSubscriptions.setBackground(new Color(0x3ca3cb));
            subscriptionsReportFrameContentPane.add(goToTotalSubscriptions);
            goToTotalSubscriptions.setBounds(470, 470, 250, 55);

            //---- bgPicture ----
            bgPicture.setIcon(new ImageIcon("resource/SubscriptionsReportBG.png"));
            subscriptionsReportFrameContentPane.add(bgPicture);
            bgPicture.setBounds(0, 55, 1200, 615);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < subscriptionsReportFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = subscriptionsReportFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = subscriptionsReportFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                subscriptionsReportFrameContentPane.setMinimumSize(preferredSize);
                subscriptionsReportFrameContentPane.setPreferredSize(preferredSize);
            }
            subscriptionsReportFrame.pack();
            subscriptionsReportFrame.setSize(1200, 700);
            subscriptionsReportFrame.setLocationRelativeTo(subscriptionsReportFrame.getOwner());
            subscriptionsReportFrame.setVisible(true);
        }

        //======== newMonthlyFrame ========
        {
            Container newMonthlyFrameContentPane = newMonthlyFrame.getContentPane();
            newMonthlyFrameContentPane.setLayout(null);

            //---- newMonthlyBack ----
            newMonthlyBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            newMonthlyBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            newMonthlyBack.setBackground(new Color(0xc80f2e));
            newMonthlyFrameContentPane.add(newMonthlyBack);
            newMonthlyBack.setBounds(5, 5, 95, 45);

            //======== tablePane ========
            {

                //---- sessionTable ----
                sessionTable.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null, null, null},
                                {"", null, null, null, null},
                                {null, null, null, null, null},
                        },
                        new String[] {
                                "Year", "Month", "Subscription Type", "Total Subscriptions", "Total Revenue"
                        }
                ));
                {
                    TableColumnModel cm = sessionTable.getColumnModel();
                    cm.getColumn(0).setMinWidth(100);
                    cm.getColumn(1).setMinWidth(100);
                    cm.getColumn(2).setMinWidth(200);
                    cm.getColumn(3).setMinWidth(200);
                    cm.getColumn(4).setMinWidth(200);
                }
                sessionTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                sessionTable.setEnabled(false);
                tablePane.setViewportView(sessionTable);
            }
            newMonthlyFrameContentPane.add(tablePane);
            tablePane.setBounds(115, 145, 970, 435);

            //---- newMonthlySubscriptions ----
            newMonthlySubscriptions.setText("Subscriptions Report: Monthly Subscriptions");
            newMonthlySubscriptions.setBackground(new Color(0xc80f2e));
            newMonthlySubscriptions.setHorizontalAlignment(SwingConstants.CENTER);
            newMonthlySubscriptions.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            newMonthlySubscriptions.setForeground(Color.white);
            newMonthlySubscriptions.setEditable(false);
            newMonthlyFrameContentPane.add(newMonthlySubscriptions);
            newMonthlySubscriptions.setBounds(0, 0, 1200, 55);

            //---- bgPicture2 ----
            bgPicture2.setIcon(new ImageIcon("resource/SubscriptionsReportBG.png"));
            newMonthlyFrameContentPane.add(bgPicture2);
            bgPicture2.setBounds(0, 55, 1200, 615);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < newMonthlyFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = newMonthlyFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = newMonthlyFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                newMonthlyFrameContentPane.setMinimumSize(preferredSize);
                newMonthlyFrameContentPane.setPreferredSize(preferredSize);
            }
            newMonthlyFrame.pack();
            newMonthlyFrame.setLocationRelativeTo(newMonthlyFrame.getOwner());
        }

        //======== newYearlyFrame ========
        {
            Container newYearlyFrameContentPane = newYearlyFrame.getContentPane();
            newYearlyFrameContentPane.setLayout(null);

            //---- newYearlyBack ----
            newYearlyBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            newYearlyBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            newYearlyBack.setBackground(new Color(0xc80f2e));
            newYearlyFrameContentPane.add(newYearlyBack);
            newYearlyBack.setBounds(5, 5, 95, 45);

            //======== tablePane3 ========
            {

                //---- sessionTable3 ----
                sessionTable3.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                        },
                        new String[] {
                                "Year", "Subscription Type", "Total Subscriptions", "Total Revenue"
                        }
                ));
                {
                    TableColumnModel cm = sessionTable3.getColumnModel();
                    cm.getColumn(0).setMinWidth(100);
                    cm.getColumn(1).setMinWidth(200);
                    cm.getColumn(2).setMinWidth(200);
                    cm.getColumn(3).setMinWidth(200);
                }
                sessionTable3.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                sessionTable3.setEnabled(false);
                tablePane3.setViewportView(sessionTable3);
            }
            newYearlyFrameContentPane.add(tablePane3);
            tablePane3.setBounds(115, 145, 970, 435);

            //---- newYearlySubscriptions ----
            newYearlySubscriptions.setText("Subscriptions Report: Yearly Subscriptions");
            newYearlySubscriptions.setBackground(new Color(0xc80f2e));
            newYearlySubscriptions.setHorizontalAlignment(SwingConstants.CENTER);
            newYearlySubscriptions.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            newYearlySubscriptions.setForeground(Color.white);
            newYearlySubscriptions.setEditable(false);
            newYearlyFrameContentPane.add(newYearlySubscriptions);
            newYearlySubscriptions.setBounds(0, 0, 1200, 55);

            //---- bgPicture4 ----
            bgPicture4.setIcon(new ImageIcon("resource/SubscriptionsReportBG.png"));
            newYearlyFrameContentPane.add(bgPicture4);
            bgPicture4.setBounds(0, 55, 1200, 615);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < newYearlyFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = newYearlyFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = newYearlyFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                newYearlyFrameContentPane.setMinimumSize(preferredSize);
                newYearlyFrameContentPane.setPreferredSize(preferredSize);
            }
            newYearlyFrame.pack();
            newYearlyFrame.setLocationRelativeTo(newYearlyFrame.getOwner());
        }

        //======== totalSubscriptionsFrame ========
        {
            Container totalSubscriptionsFrameContentPane = totalSubscriptionsFrame.getContentPane();
            totalSubscriptionsFrameContentPane.setLayout(null);

            //---- totalSubscriptionsBack ----
            totalSubscriptionsBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            totalSubscriptionsBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            totalSubscriptionsBack.setBackground(new Color(0xc80f2e));
            totalSubscriptionsFrameContentPane.add(totalSubscriptionsBack);
            totalSubscriptionsBack.setBounds(5, 5, 95, 45);

            //======== tablePane2 ========
            {

                //---- sessionTable2 ----
                sessionTable2.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null},
                                {null, null, null},
                        },
                        new String[] {
                                "Subscription Type", "Total Subscriptions", "Total Revenue"
                        }
                ));
                {
                    TableColumnModel cm = sessionTable2.getColumnModel();
                    cm.getColumn(0).setMinWidth(200);
                    cm.getColumn(1).setMinWidth(200);
                    cm.getColumn(2).setMinWidth(200);
                }
                sessionTable2.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                sessionTable2.setEnabled(false);
                tablePane2.setViewportView(sessionTable2);
            }
            totalSubscriptionsFrameContentPane.add(tablePane2);
            tablePane2.setBounds(115, 145, 970, 435);

            //---- totalSubscriptionsReport ----
            totalSubscriptionsReport.setText("Subscriptions Report: Total Subscription");
            totalSubscriptionsReport.setBackground(new Color(0xc80f2e));
            totalSubscriptionsReport.setHorizontalAlignment(SwingConstants.CENTER);
            totalSubscriptionsReport.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            totalSubscriptionsReport.setForeground(Color.white);
            totalSubscriptionsReport.setEditable(false);
            totalSubscriptionsFrameContentPane.add(totalSubscriptionsReport);
            totalSubscriptionsReport.setBounds(0, 0, 1200, 55);

            //---- bgPicture3 ----
            bgPicture3.setIcon(new ImageIcon("resource/SubscriptionsReportBG.png"));
            totalSubscriptionsFrameContentPane.add(bgPicture3);
            bgPicture3.setBounds(0, 55, 1200, 615);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < totalSubscriptionsFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = totalSubscriptionsFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = totalSubscriptionsFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                totalSubscriptionsFrameContentPane.setMinimumSize(preferredSize);
                totalSubscriptionsFrameContentPane.setPreferredSize(preferredSize);
            }
            totalSubscriptionsFrame.pack();
            totalSubscriptionsFrame.setLocationRelativeTo(totalSubscriptionsFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
    private JFrame subscriptionsReportFrame;
    private JButton subscriptionsReportBack;
    private JFormattedTextField subscriptionsReport;
    private JButton goToNewMonthlySubscriptions;
    private JButton goToNewYearlySubscriptions;
    private JButton goToTotalSubscriptions;
    private JLabel bgPicture;
    private JFrame newMonthlyFrame;
    private JButton newMonthlyBack;
    private JScrollPane tablePane;
    private JTable sessionTable;
    private JFormattedTextField newMonthlySubscriptions;
    private JLabel bgPicture2;
    private JFrame newYearlyFrame;
    private JButton newYearlyBack;
    private JScrollPane tablePane3;
    private JTable sessionTable3;
    private JFormattedTextField newYearlySubscriptions;
    private JLabel bgPicture4;
    private JFrame totalSubscriptionsFrame;
    private JButton totalSubscriptionsBack;
    private JScrollPane tablePane2;
    private JTable sessionTable2;
    private JFormattedTextField totalSubscriptionsReport;
    private JLabel bgPicture3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    // Getters
    public JFrame getSubscriptionsReportFrame() {
        return this.subscriptionsReportFrame;
    }

    public JFrame getNewMonthlyFrame() {
        return this.newMonthlyFrame;
    }

    public JFrame getNewYearlyFrame() {
        return this.newYearlyFrame;
    }

    public JFrame getTotalSubscriptionsFrame() {
        return this.totalSubscriptionsFrame;
    }

    // Button Action Listeners
    public void subscriptionsReportBackButton(ActionListener actionListener) {
        this.subscriptionsReportBack.addActionListener(actionListener);
    }

    public void goToNewMonthlySubscriptionsButton(ActionListener actionListener) {
        this.goToNewMonthlySubscriptions.addActionListener(actionListener);
    }

    public void goToNewYearlySubscriptionsButton(ActionListener actionListener) {
        this.goToNewYearlySubscriptions.addActionListener(actionListener);
    }

    public void goToTotalSubscriptionsButton(ActionListener actionListener) {
        this.goToTotalSubscriptions.addActionListener(actionListener);
    }

    public void newMonthlyBackButton(ActionListener actionListener) {
        this.newMonthlyBack.addActionListener(actionListener);
    }

    public void newYearlyBackButton(ActionListener actionListener) {
        this.newYearlyBack.addActionListener(actionListener);
    }

    public void totalSubscriptionsBackButton(ActionListener actionListener) {
        this.totalSubscriptionsBack.addActionListener(actionListener);
    }

    // Table Setters
    public void setNewMonthlySubscriptionsTable(Object[][] data) {
        String[] columnNames = {
                "Year", "Month", "Subscription Type", "Total Subscriptions", "Total Revenue"
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        sessionTable.setModel(model);

        TableColumnModel cm = sessionTable.getColumnModel();
        cm.getColumn(0).setMinWidth(100);
        cm.getColumn(1).setMinWidth(100);
        cm.getColumn(2).setMinWidth(200);
        cm.getColumn(3).setMinWidth(200);
        cm.getColumn(4).setMinWidth(200);
    }

    public void setNewYearlySubscriptionsTable(Object[][] data) {
        String[] columnNames = {
                "Year", "Subscription Type", "Total Subscriptions", "Total Revenue"
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        sessionTable3.setModel(model);

        TableColumnModel cm = sessionTable3.getColumnModel();
        cm.getColumn(0).setMinWidth(100);
        cm.getColumn(1).setMinWidth(200);
        cm.getColumn(2).setMinWidth(200);
        cm.getColumn(3).setMinWidth(200);
    }

    public void setTotalSubscriptionsTable(Object[][] data) {
        String[] columnNames = {
                "Subscription Type", "Total Subscriptions", "Total Revenue"
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        sessionTable2.setModel(model);

        TableColumnModel cm = sessionTable2.getColumnModel();
        cm.getColumn(0).setMinWidth(200);
        cm.getColumn(1).setMinWidth(200);
        cm.getColumn(2).setMinWidth(200);
    };

}
