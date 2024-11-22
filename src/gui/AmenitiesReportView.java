import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.ActionListener;
/*
 * Created by JFormDesigner on Wed Nov 20 13:32:08 PST 2024
 */



/**
 * @author USER
 */
public class AmenitiesReportView extends JFrame {
    public AmenitiesReportView() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
        amenitiesReportFrame = new JFrame();
        amenitiesReportBack = new JButton();
        goToMonthlyAmenities = new JButton();
        gotoTotalAmenities = new JButton();
        goToMonthlyRevenue = new JButton();
        goToTotaleRevenue = new JButton();
        titleBar = new JFormattedTextField();
        label1 = new JLabel();
        monthlyUseFrame = new JFrame();
        monthlyBack = new JButton();
        tablePane = new JScrollPane();
        mostPopularTable = new JTable();
        mostPopular = new JFormattedTextField();
        backgroundPicture = new JLabel();
        totalUseFrame = new JFrame();
        totalUseBack = new JButton();
        tablePane3 = new JScrollPane();
        mostPopularTable2 = new JTable();
        mostPopular2 = new JFormattedTextField();
        backgroundPicture3 = new JLabel();
        monthlyRevenueFrame = new JFrame();
        monthlyRevenueBack = new JButton();
        tablePane4 = new JScrollPane();
        mostPopularTable3 = new JTable();
        mostPopular3 = new JFormattedTextField();
        backgroundPicture4 = new JLabel();
        totalRevenueFrame = new JFrame();
        totalRevenueBack = new JButton();
        tablePane5 = new JScrollPane();
        mostPopularTable4 = new JTable();
        mostPopular4 = new JFormattedTextField();
        backgroundPicture5 = new JLabel();

        //======== amenitiesReportFrame ========
        {
            Container amenitiesReportFrameContentPane = amenitiesReportFrame.getContentPane();
            amenitiesReportFrameContentPane.setLayout(null);

            //---- amenitiesReportBack ----
            amenitiesReportBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            amenitiesReportBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            amenitiesReportBack.setBackground(new Color(0xc80f2e));
            amenitiesReportFrameContentPane.add(amenitiesReportBack);
            amenitiesReportBack.setBounds(5, 5, 95, 45);

            //---- goToMonthlyAmenities ----
            goToMonthlyAmenities.setText("MONTHLY AMENITIES USE");
            goToMonthlyAmenities.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
            goToMonthlyAmenities.setForeground(Color.white);
            goToMonthlyAmenities.setBackground(new Color(0x3ca3cb));
            amenitiesReportFrameContentPane.add(goToMonthlyAmenities);
            goToMonthlyAmenities.setBounds(475, 135, 250, 55);

            //---- gotoTotalAmenities ----
            gotoTotalAmenities.setText("TOTAL AMENITIES USE");
            gotoTotalAmenities.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
            gotoTotalAmenities.setForeground(Color.white);
            gotoTotalAmenities.setBackground(new Color(0x3ca3cb));
            amenitiesReportFrameContentPane.add(gotoTotalAmenities);
            gotoTotalAmenities.setBounds(475, 270, 250, 55);

            //---- goToMonthlyRevenue ----
            goToMonthlyRevenue.setText("MONTHLY AMENITIES REVENUE");
            goToMonthlyRevenue.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
            goToMonthlyRevenue.setForeground(Color.white);
            goToMonthlyRevenue.setBackground(new Color(0x3ca3cb));
            amenitiesReportFrameContentPane.add(goToMonthlyRevenue);
            goToMonthlyRevenue.setBounds(475, 405, 250, 55);

            //---- goToTotaleRevenue ----
            goToTotaleRevenue.setText("TOTAL AMENITIES REVENUE");
            goToTotaleRevenue.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
            goToTotaleRevenue.setForeground(Color.white);
            goToTotaleRevenue.setBackground(new Color(0x3ca3cb));
            amenitiesReportFrameContentPane.add(goToTotaleRevenue);
            goToTotaleRevenue.setBounds(475, 545, 250, 55);

            //---- titleBar ----
            titleBar.setText("Amenities Report");
            titleBar.setBackground(new Color(0xc80f2e));
            titleBar.setHorizontalAlignment(SwingConstants.CENTER);
            titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            titleBar.setForeground(Color.white);
            titleBar.setEditable(false);
            amenitiesReportFrameContentPane.add(titleBar);
            titleBar.setBounds(0, 0, 1200, 55);

            //---- label1 ----
            label1.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            amenitiesReportFrameContentPane.add(label1);
            label1.setBounds(0, 50, 1200, 620);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < amenitiesReportFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = amenitiesReportFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = amenitiesReportFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                amenitiesReportFrameContentPane.setMinimumSize(preferredSize);
                amenitiesReportFrameContentPane.setPreferredSize(preferredSize);
            }
            amenitiesReportFrame.pack();
            amenitiesReportFrame.setSize(1200, 700);
            amenitiesReportFrame.setLocationRelativeTo(amenitiesReportFrame.getOwner());
            amenitiesReportFrame.setVisible(true);

        }

        //======== monthlyUseFrame ========
        {
            Container monthlyUseFrameContentPane = monthlyUseFrame.getContentPane();
            monthlyUseFrameContentPane.setLayout(null);

            //---- monthlyBack ----
            monthlyBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            monthlyBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            monthlyBack.setBackground(new Color(0xc80f2e));
            monthlyUseFrameContentPane.add(monthlyBack);
            monthlyBack.setBounds(5, 5, 95, 45);

            //======== tablePane ========
            {

                //---- mostPopularTable ----
                mostPopularTable.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null, null},
                                {null, null, null, null},
                        },
                        new String[] {
                                "Year", "Month", "Amenity Name", "Total Usages"
                        }
                ));
                {
                    TableColumnModel cm = mostPopularTable.getColumnModel();
                    cm.getColumn(0).setMinWidth(100);
                    cm.getColumn(1).setMinWidth(100);
                    cm.getColumn(2).setMinWidth(200);
                    cm.getColumn(3).setMinWidth(150);
                }
                mostPopularTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                mostPopularTable.setEnabled(false);
                tablePane.setViewportView(mostPopularTable);
            }
            monthlyUseFrameContentPane.add(tablePane);
            tablePane.setBounds(115, 145, 970, 435);

            //---- mostPopular ----
            mostPopular.setText("Amenities Report: Monthly Amenities Use");
            mostPopular.setBackground(new Color(0xc80f2e));
            mostPopular.setHorizontalAlignment(SwingConstants.CENTER);
            mostPopular.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            mostPopular.setForeground(Color.white);
            mostPopular.setEditable(false);
            monthlyUseFrameContentPane.add(mostPopular);
            mostPopular.setBounds(0, 0, 1200, 55);

            //---- backgroundPicture ----
            backgroundPicture.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            monthlyUseFrameContentPane.add(backgroundPicture);
            backgroundPicture.setBounds(0, 55, 1200, 620);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < monthlyUseFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = monthlyUseFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = monthlyUseFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                monthlyUseFrameContentPane.setMinimumSize(preferredSize);
                monthlyUseFrameContentPane.setPreferredSize(preferredSize);
            }
            monthlyUseFrame.pack();
            monthlyUseFrame.setLocationRelativeTo(monthlyUseFrame.getOwner());
        }

        //======== totalUseFrame ========
        {
            Container totalUseFrameContentPane = totalUseFrame.getContentPane();
            totalUseFrameContentPane.setLayout(null);

            //---- totalUseBack ----
            totalUseBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            totalUseBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            totalUseBack.setBackground(new Color(0xc80f2e));
            totalUseFrameContentPane.add(totalUseBack);
            totalUseBack.setBounds(5, 5, 95, 45);

            //======== tablePane3 ========
            {

                //---- mostPopularTable2 ----
                mostPopularTable2.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null},
                        },
                        new String[] {
                                "Amenity Name", "Number of Uses"
                        }
                ));
                {
                    TableColumnModel cm = mostPopularTable2.getColumnModel();
                    cm.getColumn(0).setMinWidth(120);
                    cm.getColumn(1).setMinWidth(150);
                }
                mostPopularTable2.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                mostPopularTable2.setEnabled(false);
                tablePane3.setViewportView(mostPopularTable2);
            }
            totalUseFrameContentPane.add(tablePane3);
            tablePane3.setBounds(115, 145, 970, 435);

            //---- mostPopular2 ----
            mostPopular2.setText("Amenities Report: Total Amenities Use");
            mostPopular2.setBackground(new Color(0xc80f2e));
            mostPopular2.setHorizontalAlignment(SwingConstants.CENTER);
            mostPopular2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            mostPopular2.setForeground(Color.white);
            mostPopular2.setEditable(false);
            totalUseFrameContentPane.add(mostPopular2);
            mostPopular2.setBounds(0, 0, 1200, 55);

            //---- backgroundPicture3 ----
            backgroundPicture3.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            totalUseFrameContentPane.add(backgroundPicture3);
            backgroundPicture3.setBounds(0, 55, 1200, 620);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < totalUseFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = totalUseFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = totalUseFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                totalUseFrameContentPane.setMinimumSize(preferredSize);
                totalUseFrameContentPane.setPreferredSize(preferredSize);
            }
            totalUseFrame.pack();
            totalUseFrame.setLocationRelativeTo(totalUseFrame.getOwner());
        }

        //======== monthlyRevenueFrame ========
        {
            Container monthlyRevenueFrameContentPane = monthlyRevenueFrame.getContentPane();
            monthlyRevenueFrameContentPane.setLayout(null);

            //---- monthlyRevenueBack ----
            monthlyRevenueBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            monthlyRevenueBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            monthlyRevenueBack.setBackground(new Color(0xc80f2e));
            monthlyRevenueFrameContentPane.add(monthlyRevenueBack);
            monthlyRevenueBack.setBounds(5, 5, 95, 45);

            //======== tablePane4 ========
            {

                //---- mostPopularTable3 ----
                mostPopularTable3.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null, null},
                                {null, null, null, null},
                        },
                        new String[] {
                                "Year", "Month", "Amenity Name", "Total Revenue"
                        }
                ));
                {
                    TableColumnModel cm = mostPopularTable3.getColumnModel();
                    cm.getColumn(0).setMinWidth(100);
                    cm.getColumn(1).setMinWidth(100);
                    cm.getColumn(2).setMinWidth(200);
                    cm.getColumn(3).setMinWidth(150);
                }
                mostPopularTable3.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                mostPopularTable3.setEnabled(false);
                tablePane4.setViewportView(mostPopularTable3);
            }
            monthlyRevenueFrameContentPane.add(tablePane4);
            tablePane4.setBounds(115, 145, 970, 435);

            //---- mostPopular3 ----
            mostPopular3.setText("Amenities Report: Monthly Amenities Revenue");
            mostPopular3.setBackground(new Color(0xc80f2e));
            mostPopular3.setHorizontalAlignment(SwingConstants.CENTER);
            mostPopular3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            mostPopular3.setForeground(Color.white);
            mostPopular3.setEditable(false);
            monthlyRevenueFrameContentPane.add(mostPopular3);
            mostPopular3.setBounds(0, 0, 1200, 55);

            //---- backgroundPicture4 ----
            backgroundPicture4.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            monthlyRevenueFrameContentPane.add(backgroundPicture4);
            backgroundPicture4.setBounds(0, 55, 1200, 620);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < monthlyRevenueFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = monthlyRevenueFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = monthlyRevenueFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                monthlyRevenueFrameContentPane.setMinimumSize(preferredSize);
                monthlyRevenueFrameContentPane.setPreferredSize(preferredSize);
            }
            monthlyRevenueFrame.pack();
            monthlyRevenueFrame.setLocationRelativeTo(monthlyRevenueFrame.getOwner());
        }

        //======== totalRevenueFrame ========
        {
            Container totalRevenueFrameContentPane = totalRevenueFrame.getContentPane();
            totalRevenueFrameContentPane.setLayout(null);

            //---- totalRevenueBack ----
            totalRevenueBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            totalRevenueBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            totalRevenueBack.setBackground(new Color(0xc80f2e));
            totalRevenueFrameContentPane.add(totalRevenueBack);
            totalRevenueBack.setBounds(5, 5, 95, 45);

            //======== tablePane5 ========
            {

                //---- mostPopularTable4 ----
                mostPopularTable4.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null},
                        },
                        new String[] {
                                "Amenity Name", "Total Revenue"
                        }
                ));
                {
                    TableColumnModel cm = mostPopularTable4.getColumnModel();
                    cm.getColumn(0).setMinWidth(120);
                    cm.getColumn(1).setMinWidth(150);
                }
                mostPopularTable4.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                mostPopularTable4.setEnabled(false);
                tablePane5.setViewportView(mostPopularTable4);
            }
            totalRevenueFrameContentPane.add(tablePane5);
            tablePane5.setBounds(115, 145, 970, 435);

            //---- mostPopular4 ----
            mostPopular4.setText("Amenities Report: Total Amenities Revenue");
            mostPopular4.setBackground(new Color(0xc80f2e));
            mostPopular4.setHorizontalAlignment(SwingConstants.CENTER);
            mostPopular4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            mostPopular4.setForeground(Color.white);
            mostPopular4.setEditable(false);
            totalRevenueFrameContentPane.add(mostPopular4);
            mostPopular4.setBounds(0, 0, 1200, 55);

            //---- backgroundPicture5 ----
            backgroundPicture5.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            totalRevenueFrameContentPane.add(backgroundPicture5);
            backgroundPicture5.setBounds(0, 55, 1200, 620);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < totalRevenueFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = totalRevenueFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = totalRevenueFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                totalRevenueFrameContentPane.setMinimumSize(preferredSize);
                totalRevenueFrameContentPane.setPreferredSize(preferredSize);
            }
            totalRevenueFrame.pack();
            totalRevenueFrame.setLocationRelativeTo(totalRevenueFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
    private JFrame amenitiesReportFrame;
    private JButton amenitiesReportBack;
    private JButton goToMonthlyAmenities;
    private JButton gotoTotalAmenities;
    private JButton goToMonthlyRevenue;
    private JButton goToTotaleRevenue;
    private JFormattedTextField titleBar;
    private JLabel label1;
    private JFrame monthlyUseFrame;
    private JButton monthlyBack;
    private JScrollPane tablePane;
    private JTable mostPopularTable;
    private JFormattedTextField mostPopular;
    private JLabel backgroundPicture;
    private JFrame totalUseFrame;
    private JButton totalUseBack;
    private JScrollPane tablePane3;
    private JTable mostPopularTable2;
    private JFormattedTextField mostPopular2;
    private JLabel backgroundPicture3;
    private JFrame monthlyRevenueFrame;
    private JButton monthlyRevenueBack;
    private JScrollPane tablePane4;
    private JTable mostPopularTable3;
    private JFormattedTextField mostPopular3;
    private JLabel backgroundPicture4;
    private JFrame totalRevenueFrame;
    private JButton totalRevenueBack;
    private JScrollPane tablePane5;
    private JTable mostPopularTable4;
    private JFormattedTextField mostPopular4;
    private JLabel backgroundPicture5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    // Getters
    public JFrame getAmenitiesReportFrame() {
        return this.amenitiesReportFrame;
    }

    public JFrame getMonthlyUseFrame() {
        return this.monthlyUseFrame;
    }

    public JFrame getTotalUseFrame() {
        return this.totalUseFrame;
    }

    public JFrame getMonthlyRevenueFrame() {
        return this.monthlyRevenueFrame;
    }

    public JFrame getTotalRevenueFrame() {
        return this.totalRevenueFrame;
    }

    // Button Action Listeners
    public void amenitiesReportBackButton(ActionListener actionListener) {
        this.amenitiesReportBack.addActionListener(actionListener);
    }

    public void goToMonthlyAmenitiesButton(ActionListener actionListener) {
        this.goToMonthlyAmenities.addActionListener(actionListener);
    }

    public void goToTotalAmenitiesButton(ActionListener actionListener) {
        this.gotoTotalAmenities.addActionListener(actionListener);
    }

    public void goToMonthlyRevenueButton(ActionListener actionListener) {
        this.goToMonthlyRevenue.addActionListener(actionListener);
    }

    public void goToTotalRevenueButton(ActionListener actionListener) {
        this.goToTotaleRevenue.addActionListener(actionListener);
    }

    public void monthlyBackButton(ActionListener actionListener) {
        this.monthlyBack.addActionListener(actionListener);
    }

    public void totalUseBackButton(ActionListener actionListener) {
        this.totalUseBack.addActionListener(actionListener);
    }

    public void monthlyRevenueBackButton(ActionListener actionListener) {
        this.monthlyRevenueBack.addActionListener(actionListener);
    }

    public void totalRevenueBackButton(ActionListener actionListener) {
        this.totalRevenueBack.addActionListener(actionListener);
    }

    // Table Setters
    public void setMonthlyUseTable(Object[][] data) {
        String[] columnNames = {
                "Year", "Month", "Amenity Name", "Total Usages"
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        mostPopularTable.setModel(model);

        TableColumnModel cm = mostPopularTable.getColumnModel();
        cm.getColumn(0).setMinWidth(100);
        cm.getColumn(1).setMinWidth(100);
        cm.getColumn(2).setMinWidth(200);
        cm.getColumn(3).setMinWidth(150);
    }

    public void setTotalUseTable(Object[][] data) {
        String[] columnNames = {
                "Amenity Name", "Number of Uses"
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        mostPopularTable2.setModel(model);

        TableColumnModel cm = mostPopularTable2.getColumnModel();
        cm.getColumn(0).setMinWidth(120);
        cm.getColumn(1).setMinWidth(150);
    }

    public void setMonthlyRevenueTable(Object[][] data) {
        String[] columnNames = {
                "Year", "Month", "Amenity Name", "Total Revenue"
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        mostPopularTable3.setModel(model);

        TableColumnModel cm = mostPopularTable3.getColumnModel();
        cm.getColumn(0).setMinWidth(100);
        cm.getColumn(1).setMinWidth(100);
        cm.getColumn(2).setMinWidth(200);
        cm.getColumn(3).setMinWidth(150);
    }

    public void setTotalRevenueTable(Object[][] data) {
        String[] columnNames = {
                "Amenity Name", "Total Revenue"
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        mostPopularTable4.setModel(model);

        TableColumnModel cm = mostPopularTable4.getColumnModel();
        cm.getColumn(0).setMinWidth(120);
        cm.getColumn(1).setMinWidth(150);
    }
}
