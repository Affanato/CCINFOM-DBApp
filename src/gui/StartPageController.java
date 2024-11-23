import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPageController {
    private final StartPageView sView = new StartPageView();

    public StartPageController() {
        sView.startButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                sView.getFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });
    }

    public static void main(String[] args) {
        new StartPageController();
    }
}
