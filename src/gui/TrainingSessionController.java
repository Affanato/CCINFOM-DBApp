
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrainingSessionController {
    private TrainingSessionView tsView = new TrainingSessionView();

    public TrainingSessionController() {
        this.tsView.trainingSessionBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getTrainingSessionFrame().dispose();
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
    }
}