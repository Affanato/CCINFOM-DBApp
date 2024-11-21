
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrainingSessionController {
    private TrainingSessionView tsView = new TrainingSessionView();

    public TrainingSessionController() {
        this.tsView.trainingSessionBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getTrainingSessionFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.tsView.goToAddButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getScheduleSessionFrame().setVisible(true);
                tsView.getTrainingSessionFrame().dispose();
            }
        });

        this.tsView.goToReadButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getReadSessionFrame().setVisible(true);
                tsView.getTrainingSessionFrame().dispose();
            }
        });

        this.tsView.goToDeleteButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getCancelSessionFrame().setVisible(true);
                tsView.getTrainingSessionFrame().dispose();
            }
        });

        this.tsView.goToUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getUpdateSessionFrame1().setVisible(true);
                tsView.getTrainingSessionFrame().dispose();
                tsView.getUpdateTrainingSessionIDComboBox(); // set here
            }
        });

        this.tsView.scheduleBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getTrainingSessionFrame().setVisible(true);
                tsView.getScheduleSessionFrame().dispose();
            }
        });

        this.tsView.readBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getTrainingSessionFrame().setVisible(true);
                tsView.getReadSessionFrame().dispose();
            }
        });

        this.tsView.cancelBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getTrainingSessionFrame().setVisible(true);
                tsView.getCancelSessionFrame().dispose();
            }
        });
        this.tsView.updateBackButton1(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getTrainingSessionFrame().setVisible(true);
                tsView.getUpdateSessionFrame1().dispose();
            }
        });
        this.tsView.updateBackButton2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getUpdateSessionFrame1().setVisible(true);
                tsView.getUpdateSessionFrame2().dispose();
            }
        });

        this.tsView.scheduleSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
        this.tsView.cancelSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
        this.tsView.proceedUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getUpdateSessionFrame1().dispose();
                tsView.getUpdateSessionFrame2().setVisible(true);
            }
        });
        this.tsView.updateTrainingSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
    }
}