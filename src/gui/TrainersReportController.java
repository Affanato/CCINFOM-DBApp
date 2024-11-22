import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrainersReportController {
    private final TrainersReportView view = new TrainersReportView();

    public TrainersReportController() {
        this.view.trainersReportBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTrainersReportFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.view.goToMonthlySessionsButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTrainersReportFrame().dispose();
                view.getMonthlySessionsFrame().setVisible(true);
            }
        });

        this.view.goToYearlySessionsButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTrainersReportFrame().dispose();
                view.getYearlySessionsFrame().setVisible(true);
            }
        });

        this.view.monthlySessionBackButton(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               view.getMonthlySessionsFrame().dispose();
               view.getTrainersReportFrame().setVisible(true);
           }
        });

        this.view.yearlySessionsBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getYearlySessionsFrame().dispose();
                view.getTrainersReportFrame().setVisible(true);
            }
        });
    }
}
