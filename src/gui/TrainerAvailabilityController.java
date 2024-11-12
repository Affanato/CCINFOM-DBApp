
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrainerAvailabilityController {
    private TrainerAvailabilityView taView = new TrainerAvailabilityView();

    public TrainerAvailabilityController() {
        this.taView.trainerAvailabilityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // go back to home page lang
            }
        });

        this.taView.updateButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String trainerID = taView.getTrainerID();
                String schedule = taView.getChangeSched();
            }
        });
    }
}