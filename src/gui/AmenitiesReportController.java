import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmenitiesReportController {
    private final AmenitiesReportView view = new AmenitiesReportView();
    private final AmenitiesDAO aDAO = new AmenitiesDAO();

    AmenitiesReportController() {
        this.view.amenitiesReportBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenitiesReportFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.view.goToMonthlyAmenitiesButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setMonthlyUseTable(aDAO.queryAmenitiesUsagePerMonthPerYear());

                view.getAmenitiesReportFrame().dispose();
                view.getMonthlyUseFrame().setVisible(true);
            }
        });

        this.view.goToTotalAmenitiesButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setTotalUseTable(aDAO.queryAmenitiesUsageLifetime());

                view.getAmenitiesReportFrame().dispose();
                view.getTotalUseFrame().setVisible(true);
            }
        });

        this.view.goToMonthlyRevenueButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setMonthlyRevenueTable(aDAO.queryAmenitiesRevenuePerMonthPerYear());

                view.getAmenitiesReportFrame().dispose();
                view.getMonthlyRevenueFrame().setVisible(true);
            }
        });

        this.view.goToTotalRevenueButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setTotalRevenueTable(aDAO.queryAmenitiesRevenueLifetime());

                view.getAmenitiesReportFrame().dispose();
                view.getTotalRevenueFrame().setVisible(true);
            }
        });

        this.view.monthlyBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMonthlyUseFrame().dispose();
                view.getAmenitiesReportFrame().setVisible(true);
            }
        });

        this.view.totalUseBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTotalUseFrame().dispose();
                view.getAmenitiesReportFrame().setVisible(true);
            }
        });

        this.view.monthlyRevenueBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMonthlyRevenueFrame().dispose();
                view.getAmenitiesReportFrame().setVisible(true);
            }
        });

        this.view.totalRevenueBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTotalRevenueFrame().dispose();
                view.getAmenitiesReportFrame().setVisible(true);
            }
        });
    }
}