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

        this.sView.goToBestSellingButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //sView.setBestSellingTable(pDAO.selectProductsByYearlyQuantitySold());

                sView.getBestSellingFrame().setVisible(true);
                sView.getSalesReportFrame().dispose();
            }
        });

        this.sView.goToSalesButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO maybe this isn't finalized yet
                //sView.setSalesTable();

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