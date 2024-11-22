import com.sun.tools.javac.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmenityController {
    private final AmenityView view = new AmenityView();

    public AmenityController() {
        this.view.amenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenityFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.view.goToAddAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenityFrame().dispose();
                view.getAddAmenityFrame().setVisible(true);
            }
        });

        this.view.goToReadAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenityFrame().dispose();
                view.getReadAmenityFrame().setVisible(true);
            }
        });

        this.view.goToUpdateAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenityFrame().dispose();
                view.getUpdateSelectAmenityFrame().setVisible(true);
            }
        });

        this.view.goToDeleteAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenityFrame().dispose();
                view.getDeleteAmenityFrame().setVisible(true);
            }
        });

        this.view.addAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Display Success or Fail Message
            }
        });

        this.view.addAmenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAddAmenityFrame().dispose();
                view.getAmenityFrame().setVisible(true);
            }
        });

        this.view.readAmenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getReadAmenityFrame().dispose();
                view.getAmenityFrame().setVisible(true);
            }
        });

        this.view.deleteAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Display Success or Fail Message
            }
        });

        this.view.deleteAmenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getDeleteAmenityFrame().dispose();
                view.getAmenityFrame().setVisible(true);
            }
        });

        this.view.updateAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getUpdateSelectAmenityFrame().dispose();
                view.getUpdateAmenityDetailsFrame().setVisible(true);
            }
        });

        this.view.updateSelectAmenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getUpdateSelectAmenityFrame().dispose();
                view.getAmenityFrame().setVisible(true);
            }
        });

        this.view.updateAmenity2Button(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Display Success or Fail Message
            }
        });

        this.view.updateDetailsAmenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getUpdateAmenityDetailsFrame().dispose();
                view.getUpdateSelectAmenityFrame().setVisible(true);
            }
        });
    }

}