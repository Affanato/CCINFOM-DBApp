import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Tue Nov 19 16:02:31 PST 2024
 */



/**
 * @author USER
 */
public class SalesReportView {
    public SalesReportView() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
        salesReportFrame = new JFrame();
        salesReportBack = new JButton();
        salesReportView = new JFormattedTextField();
        goToBestSelling = new JButton();
        goToSales = new JButton();
        bgPicture = new JLabel();
        bestSellingFrame = new JFrame();
        bestSellingBack = new JButton();
        tablePane = new JScrollPane();
        sessionTable = new JTable();
        salesReportBestSelling = new JFormattedTextField();
        bgPicture2 = new JLabel();
        salesFrame = new JFrame();
        salesBack = new JButton();
        tablePane2 = new JScrollPane();
        sessionTable2 = new JTable();
        salesReportSales = new JFormattedTextField();
        bgPicture3 = new JLabel();

        //======== salesReportFrame ========
        {
            Container salesReportFrameContentPane = salesReportFrame.getContentPane();
            salesReportFrameContentPane.setLayout(null);

            //---- salesReportBack ----
            salesReportBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            salesReportBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            salesReportBack.setBackground(new Color(0xc80f2e));
            salesReportFrameContentPane.add(salesReportBack);
            salesReportBack.setBounds(5, 5, 95, 45);

            //---- salesReportView ----
            salesReportView.setText("Sales Report");
            salesReportView.setBackground(new Color(0xc80f2e));
            salesReportView.setHorizontalAlignment(SwingConstants.CENTER);
            salesReportView.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            salesReportView.setForeground(Color.white);
            salesReportView.setEditable(false);
            salesReportFrameContentPane.add(salesReportView);
            salesReportView.setBounds(0, 0, 1200, 55);

            //---- goToBestSelling ----
            goToBestSelling.setText("BEST SELLING");
            goToBestSelling.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToBestSelling.setForeground(Color.white);
            goToBestSelling.setBackground(new Color(0x3ca3cb));
            salesReportFrameContentPane.add(goToBestSelling);
            goToBestSelling.setBounds(470, 220, 250, 55);

            //---- goToSales ----
            goToSales.setText("SALES");
            goToSales.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
            goToSales.setForeground(Color.white);
            goToSales.setBackground(new Color(0x3ca3cb));
            salesReportFrameContentPane.add(goToSales);
            goToSales.setBounds(470, 395, 250, 55);

            //---- bgPicture ----
            bgPicture.setIcon(new ImageIcon("resource/SalesReportBG.png"));
            salesReportFrameContentPane.add(bgPicture);
            bgPicture.setBounds(0, 55, 1200, 615);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < salesReportFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = salesReportFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = salesReportFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                salesReportFrameContentPane.setMinimumSize(preferredSize);
                salesReportFrameContentPane.setPreferredSize(preferredSize);
            }
            salesReportFrame.pack();
            salesReportFrame.setSize(1200, 700);
            salesReportFrame.setLocationRelativeTo(salesReportFrame.getOwner());
            salesReportFrame.setVisible(true);
        }

        //======== bestSellingFrame ========
        {
            Container bestSellingFrameContentPane = bestSellingFrame.getContentPane();
            bestSellingFrameContentPane.setLayout(null);

            //---- bestSellingBack ----
            bestSellingBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            bestSellingBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            bestSellingBack.setBackground(new Color(0xc80f2e));
            bestSellingFrameContentPane.add(bestSellingBack);
            bestSellingBack.setBounds(5, 5, 95, 45);

            //======== tablePane ========
            {

                //---- sessionTable ----
                sessionTable.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null},
                                {null, null, null},
                        },
                        new String[] {
                                " Ranking", "Product Name  ", "Products Sold"
                        }
                ));
                {
                    TableColumnModel cm = sessionTable.getColumnModel();
                    cm.getColumn(0).setMinWidth(100);
                    cm.getColumn(1).setMinWidth(200);
                    cm.getColumn(2).setMinWidth(200);
                }
                sessionTable.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
                sessionTable.setEnabled(false);
                tablePane.setViewportView(sessionTable);
            }
            bestSellingFrameContentPane.add(tablePane);
            tablePane.setBounds(115, 145, 970, 435);

            //---- salesReportBestSelling ----
            salesReportBestSelling.setText("Sales Report: Best Selling");
            salesReportBestSelling.setBackground(new Color(0xc80f2e));
            salesReportBestSelling.setHorizontalAlignment(SwingConstants.CENTER);
            salesReportBestSelling.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            salesReportBestSelling.setForeground(Color.white);
            salesReportBestSelling.setEditable(false);
            bestSellingFrameContentPane.add(salesReportBestSelling);
            salesReportBestSelling.setBounds(0, 0, 1200, 55);

            //---- bgPicture2 ----
            bgPicture2.setIcon(new ImageIcon("resource/SalesReportBG.png"));
            bestSellingFrameContentPane.add(bgPicture2);
            bgPicture2.setBounds(0, 55, 1200, 615);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < bestSellingFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = bestSellingFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = bestSellingFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                bestSellingFrameContentPane.setMinimumSize(preferredSize);
                bestSellingFrameContentPane.setPreferredSize(preferredSize);
            }
            bestSellingFrame.pack();
            bestSellingFrame.setLocationRelativeTo(bestSellingFrame.getOwner());
        }

        //======== salesFrame ========
        {
            Container salesFrameContentPane = salesFrame.getContentPane();
            salesFrameContentPane.setLayout(null);

            //---- salesBack ----
            salesBack.setSelectedIcon(new ImageIcon("resource/backButton.jpg"));
            salesBack.setIcon(new ImageIcon("resource/backButton.jpg"));
            salesBack.setBackground(new Color(0xc80f2e));
            salesFrameContentPane.add(salesBack);
            salesBack.setBounds(5, 5, 95, 45);

            //======== tablePane2 ========
            {

                //---- sessionTable2 ----
                sessionTable2.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null},
                                {null, null, null},
                        },
                        new String[] {
                                "Sales ", "Product Name  ", "Products Sold"
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
            salesFrameContentPane.add(tablePane2);
            tablePane2.setBounds(115, 145, 970, 435);

            //---- salesReportSales ----
            salesReportSales.setText("Sales Report: Sales");
            salesReportSales.setBackground(new Color(0xc80f2e));
            salesReportSales.setHorizontalAlignment(SwingConstants.CENTER);
            salesReportSales.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
            salesReportSales.setForeground(Color.white);
            salesReportSales.setEditable(false);
            salesFrameContentPane.add(salesReportSales);
            salesReportSales.setBounds(0, 0, 1200, 55);

            //---- bgPicture3 ----
            bgPicture3.setIcon(new ImageIcon("resource/SalesReportBG.png"));
            salesFrameContentPane.add(bgPicture3);
            bgPicture3.setBounds(0, 55, 1200, 615);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < salesFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = salesFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = salesFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                salesFrameContentPane.setMinimumSize(preferredSize);
                salesFrameContentPane.setPreferredSize(preferredSize);
            }
            salesFrame.pack();
            salesFrame.setLocationRelativeTo(salesFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Lucas Antonio V F. Tujan
    private JFrame salesReportFrame;
    private JButton salesReportBack;
    private JFormattedTextField salesReportView;
    private JButton goToBestSelling;
    private JButton goToSales;
    private JLabel bgPicture;
    private JFrame bestSellingFrame;
    private JButton bestSellingBack;
    private JScrollPane tablePane;
    private JTable sessionTable;
    private JFormattedTextField salesReportBestSelling;
    private JLabel bgPicture2;
    private JFrame salesFrame;
    private JButton salesBack;
    private JScrollPane tablePane2;
    private JTable sessionTable2;
    private JFormattedTextField salesReportSales;
    private JLabel bgPicture3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    // Getters
    public JFrame getSalesReportFrame() {
        return this.salesReportFrame;
    }

    public JFrame getBestSellingFrame() {
        return this.bestSellingFrame;
    }

    public JFrame getSalesFrame() {
        return this.salesFrame;
    }

    // Button Action Listeners
    public void salesReportBackButton(ActionListener actionListener) {
        this.salesReportBack.addActionListener(actionListener);
    }

    public void goToBestSellingButton(ActionListener actionListener) {
        this.goToBestSelling.addActionListener(actionListener);
    }

    public void goToSalesButton(ActionListener actionListener){
        this.goToSales.addActionListener(actionListener);
    }

    public void bestSellingBackButton(ActionListener actionListener){
        this.bestSellingBack.addActionListener(actionListener);
    }

    public void salesBackButton(ActionListener actionListener){
        this.salesBack.addActionListener(actionListener);
    }
}
