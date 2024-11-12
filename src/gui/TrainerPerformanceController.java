
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrainerPerformanceController {
    private TrainerPerformanceView tpView = new TrainerPerformanceView();

    public TrainerPerformanceController() {
        this.tpView.updateTrainerBackButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // go back to home page lang
            }
        });

        this.tpView.updateRatingButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String membershipID = tpView.getMembershipID();
                String rating = tpView.getPerformanceRating();
            }
        });
    }
}