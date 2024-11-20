import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubscriptionsReportController {
    private final SubscriptionsReportView sView = new SubscriptionsReportView();

    public SubscriptionsReportController() {
        this.sView.subscriptionsReportBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sView.getSubscriptionsReportFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.sView.goToNewMonthlySubscriptionsButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                sView.getSubscriptionsReportFrame().dispose();
                sView.getNewMonthlyFrame().setVisible(true);
            }
        });

        this.sView.goToNewYearlySubscriptionsButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                sView.getSubscriptionsReportFrame().dispose();
                sView.getNewYearlyFrame().setVisible(true);
            }
        });

        this.sView.goToTotalSubscriptionsButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                sView.getSubscriptionsReportFrame().dispose();
                sView.getTotalSubscriptionsFrame().setVisible(true);
            }
        });

        this.sView.newMonthlyBackButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                sView.getNewMonthlyFrame().dispose();
                sView.getSubscriptionsReportFrame().setVisible(true);
            }
        });

        this.sView.newYearlyBackButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                sView.getNewYearlyFrame().dispose();
                sView.getSubscriptionsReportFrame().setVisible(true);
            }
        });

        this.sView.totalSubscriptionsBackButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                sView.getTotalSubscriptionsFrame().dispose();
                sView.getSubscriptionsReportFrame().setVisible(true);
            }
        });
    }
}
