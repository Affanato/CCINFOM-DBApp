import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmenityUseController {
    private final AmenityUseView AUView = new AmenityUseView();

    public AmenityUseController() {
        this.AUView.amenityUseBackButton(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               AUView.getAmenityUseFrame().dispose();
               MainMenuController mainMenuController = new MainMenuController();
           }
        });

        this.AUView.goToUseAmenityButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AUView.getAmenityUseFrame().dispose();
                AUView.getUseAmenityFrame().setVisible(true);
            }
        });

        this.AUView.goToReadSessionButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AUView.getAmenityUseFrame().dispose();
                AUView.getReadSessionFrame().setVisible(true);
            }
        });

        this.AUView.sessionReadBackButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AUView.getReadSessionFrame().dispose();
                AUView.getAmenityUseFrame().setVisible(true);
            }
        });

        this.AUView.useAmenityBackButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AUView.getUseAmenityFrame().dispose();
                AUView.getAmenityUseFrame().setVisible(true);
            }
        });

        this.AUView.useAmenityButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
    }
}
