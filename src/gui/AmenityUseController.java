import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmenityUseController {
    private final AmenityUseView view = new AmenityUseView();

    public AmenityUseController() {
        this.view.amenityUseBackButtonButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenityUseFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.view.goToAddSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenityUseFrame().dispose();
                view.getAddSessionFrame().setVisible(true);
            }
        });

        this.view.goToReadSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenityUseFrame().dispose();
                view.getReadSessionFrame().setVisible(true);
            }
        });

        this.view.goToUpdateSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenityUseFrame().dispose();
                view.getUpdateSelectSession().setVisible(true);
            }
        });

        this.view.goToDeleteSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenityUseFrame().dispose();
                view.getDeleteSessionFrame().setVisible(true);
            }
        });

        this.view.addSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Display Success or Fail Message
            }
        });

        this.view.addSessionBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAddSessionFrame().dispose();
                view.getAmenityUseFrame().setVisible(true);
            }
        });

        this.view.readSessionBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getReadSessionFrame().dispose();
                view.getAmenityUseFrame().setVisible(true);
            }
        });

        this.view.deleteSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Display Success or Fail Message
            }
        });

        this.view.deleteSessionBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getDeleteSessionFrame().dispose();
                view.getAmenityUseFrame().setVisible(true);
            }
        });

        this.view.updateSessionSelectButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getUpdateSelectSession().dispose();
                view.getUpdateDetailsSessionFrame().setVisible(true);
            }
        });

        this.view.updateSelectBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getUpdateSelectSession().dispose();
                view.getAmenityUseFrame().setVisible(true);
            }
        });

        this.view.updateSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display Success or Fail Message
            }
        });

        this.view.updateSessionDetailsBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getUpdateDetailsSessionFrame().dispose();
                view.getUpdateSelectSession().setVisible(true);
            }
        });
    }
}
