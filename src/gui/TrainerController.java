
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrainerController {
    private TrainerView tView = new TrainerView();

    public TrainerController() {
        this.tView.trainerBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getTrainerFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.tView.goToAddButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getAddTrainerFrame().setVisible(true);
                tView.getTrainerFrame().dispose();
            }
        });

        this.tView.goToReadButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getReadTrainerFrame().setVisible(true);
                tView.getTrainerFrame().dispose();
            }
        });

        this.tView.goToDeleteButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getDeleteTrainerFrame().setVisible(true);
                tView.getTrainerFrame().dispose();
            }
        });

        this.tView.goToUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getUpdateTrainerFrame().setVisible(true);
                tView.getTrainerFrame().dispose();
            }
        });
        this.tView.goToUpdateStatusButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getUpdateStatusTrainerFrame().setVisible(true);
                tView.getTrainerFrame().dispose();
            }
        });

        this.tView.addBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getTrainerFrame().setVisible(true);
                tView.getAddTrainerFrame().dispose();
            }
        });

        this.tView.readBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getTrainerFrame().setVisible(true);
                tView.getReadTrainerFrame().dispose();
            }
        });

        this.tView.deleteBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getTrainerFrame().setVisible(true);
                tView.getDeleteTrainerFrame().dispose();
            }
        });
        this.tView.updateBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getTrainerFrame().setVisible(true);
                tView.getUpdateTrainerFrame().dispose();
            }
        });
        this.tView.updateStatusBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getTrainerFrame().setVisible(true);
                tView.getUpdateStatusTrainerFrame().dispose();
            }
        });
        this.tView.addTrainerButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
        this.tView.deleteTrainerButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
        this.tView.updateTrainerButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
        this.tView.updateStatusButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
    }
}