import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalesReportController {
    private final SalesReportView sView = new SalesReportView();
    private final ProductsDAO pDAO = new ProductsDAO();

    public SalesReportController() {
        this.sView.salesReportBackButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenuController();
                sView.getSalesReportFrame().dispose();
            }
        });

        this.sView.goToMonthlyButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                sView.setYearlyTable(pDAO.reportYearlyRevenueByProduct());
                sView.getBestSellingFrame().setVisible(true);
                sView.getSalesReportFrame().dispose();
            }
        });

        this.sView.goToYearlyButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                sView.setMonthlyTable(pDAO.reportMonthlyRevenueByProduct());
                sView.getSalesFrame().setVisible(true);
                sView.getSalesReportFrame().dispose();
            }
        });

        this.sView.bestSellingBackButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                sView.getSalesReportFrame().setVisible(true);
                sView.getBestSellingFrame().dispose();
            }
        });

        this.sView.salesBackButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                sView.getSalesReportFrame().setVisible(true);
                sView.getSalesFrame().dispose();
            }
        });
    }
}