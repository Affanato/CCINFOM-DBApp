import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.table.*;
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
        titleBar = new JFormattedTextField();
        goToMostPopular = new JButton();
        goToAmenitiesRevenue = new JButton();
        label1 = new JLabel();
        mostPopularFrame = new JFrame();
        mostPopularBack = new JButton();
        tablePane = new JScrollPane();
        mostPopularTable = new JTable();
        mostPopular = new JFormattedTextField();
        backgroundPicture = new JLabel();
        amenitiesRevenueFrame = new JFrame();
        amenitiesRevenueBack = new JButton();
        tablePane2 = new JScrollPane();
        revenueTable = new JTable();
        amenitiesRevenue = new JFormattedTextField();
        backgroundPicture2 = new JLabel();

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

            //---- titleBar ----
            titleBar.setText("Amenities Report");
            titleBar.setBackground(new Color(0xc80f2e));
            titleBar.setHorizontalAlignment(SwingConstants.CENTER);
            titleBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            titleBar.setForeground(Color.white);
            titleBar.setEditable(false);
            amenitiesReportFrameContentPane.add(titleBar);
            titleBar.setBounds(0, 0, 1200, 55);

            //---- goToMostPopular ----
            goToMostPopular.setText("MOST POPULAR");
            goToMostPopular.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToMostPopular.setForeground(Color.white);
            goToMostPopular.setBackground(new Color(0x3ca3cb));
            amenitiesReportFrameContentPane.add(goToMostPopular);
            goToMostPopular.setBounds(485, 210, 250, 55);

            //---- goToAmenitiesRevenue ----
            goToAmenitiesRevenue.setText("AMENITIES REVENUE");
            goToAmenitiesRevenue.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToAmenitiesRevenue.setForeground(Color.white);
            goToAmenitiesRevenue.setBackground(new Color(0x3ca3cb));
            amenitiesReportFrameContentPane.add(goToAmenitiesRevenue);
            goToAmenitiesRevenue.setBounds(485, 425, 250, 55);

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
                                {null, null, null},
                                {null, null, null},
                        },
                        new String[] {
                                "Ranking", "Amenity Name", "Number of Uses"
                        }
                ));
                {
                    TableColumnModel cm = mostPopularTable.getColumnModel();
                    cm.getColumn(0).setMinWidth(120);
                    cm.getColumn(1).setMinWidth(200);
                    cm.getColumn(2).setMinWidth(150);
                }
                mostPopularTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                mostPopularTable.setEnabled(false);
                tablePane.setViewportView(mostPopularTable);
            }
            mostPopularFrameContentPane.add(tablePane);
            tablePane.setBounds(115, 145, 970, 435);

            //---- mostPopular ----
            mostPopular.setText("Amenities Report: Most Popular ");
            mostPopular.setBackground(new Color(0xc80f2e));
            mostPopular.setHorizontalAlignment(SwingConstants.CENTER);
            mostPopular.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            mostPopular.setForeground(Color.white);
            mostPopular.setEditable(false);
            mostPopularFrameContentPane.add(mostPopular);
            mostPopular.setBounds(0, 0, 1200, 55);

            //---- backgroundPicture ----
            backgroundPicture.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
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

        //======== amenitiesRevenueFrame ========
        {
            Container amenitiesRevenueFrameContentPane = amenitiesRevenueFrame.getContentPane();
            amenitiesRevenueFrameContentPane.setLayout(null);

            //---- amenitiesRevenueBack ----
            amenitiesRevenueBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            amenitiesRevenueBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            amenitiesRevenueBack.setBackground(new Color(0xc80f2e));
            amenitiesRevenueFrameContentPane.add(amenitiesRevenueBack);
            amenitiesRevenueBack.setBounds(5, 5, 95, 45);

            //======== tablePane2 ========
            {

                //---- revenueTable ----
                revenueTable.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null},
                                {null, null, null},
                        },
                        new String[] {
                                "Ranking", "Amenity Name", "Revenue"
                        }
                ));
                {
                    TableColumnModel cm = revenueTable.getColumnModel();
                    cm.getColumn(0).setMinWidth(120);
                    cm.getColumn(1).setMinWidth(200);
                    cm.getColumn(2).setMinWidth(150);
                }
                revenueTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                revenueTable.setEnabled(false);
                tablePane2.setViewportView(revenueTable);
            }
            amenitiesRevenueFrameContentPane.add(tablePane2);
            tablePane2.setBounds(115, 145, 970, 435);

            //---- amenitiesRevenue ----
            amenitiesRevenue.setText("Amenities Report: Amenities Revenue");
            amenitiesRevenue.setBackground(new Color(0xc80f2e));
            amenitiesRevenue.setHorizontalAlignment(SwingConstants.CENTER);
            amenitiesRevenue.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            amenitiesRevenue.setForeground(Color.white);
            amenitiesRevenue.setEditable(false);
            amenitiesRevenueFrameContentPane.add(amenitiesRevenue);
            amenitiesRevenue.setBounds(0, 0, 1200, 55);

            //---- backgroundPicture2 ----
            backgroundPicture2.setIcon(new ImageIcon("resource/AmenitiesViewBG.png"));
            amenitiesRevenueFrameContentPane.add(backgroundPicture2);
            backgroundPicture2.setBounds(0, 55, 1200, 620);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < amenitiesRevenueFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = amenitiesRevenueFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = amenitiesRevenueFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                amenitiesRevenueFrameContentPane.setMinimumSize(preferredSize);
                amenitiesRevenueFrameContentPane.setPreferredSize(preferredSize);
            }
            amenitiesRevenueFrame.pack();
            amenitiesRevenueFrame.setLocationRelativeTo(amenitiesRevenueFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
    private JFrame amenitiesReportFrame;
    private JButton amenitiesReportBack;
    private JFormattedTextField titleBar;
    private JButton goToMostPopular;
    private JButton goToAmenitiesRevenue;
    private JLabel label1;
    private JFrame mostPopularFrame;
    private JButton mostPopularBack;
    private JScrollPane tablePane;
    private JTable mostPopularTable;
    private JFormattedTextField mostPopular;
    private JLabel backgroundPicture;
    private JFrame amenitiesRevenueFrame;
    private JButton amenitiesRevenueBack;
    private JScrollPane tablePane2;
    private JTable revenueTable;
    private JFormattedTextField amenitiesRevenue;
    private JLabel backgroundPicture2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    // Getters
    public JFrame getAmenitiesReportFrame(){
        return this.amenitiesReportFrame;
    }

    public JFrame getMostPopularFrame(){
        return this.mostPopularFrame;
    }

    public JFrame getAmenitiesRevenueFrame(){
        return this.amenitiesRevenueFrame;
    }

    // Button Action Listeners
    public void amenitiesReportBackButton(ActionListener actionListener){
        this.amenitiesReportBack.addActionListener(actionListener);
    }

    public void goToMostPopularButton(ActionListener actionListener){
        this.goToMostPopular.addActionListener(actionListener);
    }

    public void goToAmenitiesRevenueButton(ActionListener actionListener){
        this.goToAmenitiesRevenue.addActionListener(actionListener);
    }

    public void mostPopularBackButton(ActionListener actionListener){
        this.mostPopularBack.addActionListener(actionListener);
    }

    public void amenitiesRevenueBack(ActionListener actionListener){
        this.amenitiesRevenueBack.addActionListener(actionListener);
    }
}
