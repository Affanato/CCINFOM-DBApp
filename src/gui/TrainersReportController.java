import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrainersReportController {
    private final TrainersReportView view = new TrainersReportView();

    public TrainersReportController() {
        view.trainersReportBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTrainersReportFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        view.goToMostPopularButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTrainersReportFrame().dispose();
                view.getMostPopularFrame().setVisible(true);
            }
        });

        view.mostPopularBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMostPopularFrame().dispose();
                view.getTrainersReportFrame().setVisible(true);
            }
        });
    }
}
