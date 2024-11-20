import com.sun.tools.javac.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmenitiesReportController {
    private final AmenitiesReportView view = new AmenitiesReportView();

    public AmenitiesReportController() {
        this.view.amenitiesReportBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenitiesReportFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.view.goToMostPopularButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenitiesReportFrame().dispose();
                view.getMostPopularFrame().setVisible(true);
            }
        });

        this.view.goToAmenitiesRevenueButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenitiesReportFrame().dispose();
                view.getAmenitiesRevenueFrame().setVisible(true);
            }
        });

        this.view.mostPopularBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMostPopularFrame().dispose();
                view.getAmenitiesReportFrame().setVisible(true);
            }
        });

        this.view.amenitiesRevenueBack(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenitiesRevenueFrame().dispose();
                view.getAmenitiesReportFrame().setVisible(true);
            }
        });
    }
}
