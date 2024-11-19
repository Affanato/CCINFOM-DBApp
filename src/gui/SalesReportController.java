import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalesReportController {
    private final SalesReportView sView = new SalesReportView();

    public SalesReportController() {
        this.sView.salesReportBackButton(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               MainMenuController mainMenuController = new MainMenuController();
               sView.getSalesReportFrame().dispose();
           }
        });

        this.sView.goToBestSellingButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                sView.getBestSellingFrame().setVisible(true);
                sView.getSalesReportFrame().dispose();

            }
        });

        this.sView.goToSalesButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
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
