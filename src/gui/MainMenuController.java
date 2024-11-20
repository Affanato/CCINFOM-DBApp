import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuController {
    private final MainMenuView view = new MainMenuView();

    public MainMenuController() {
        view.salesReportButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                SalesReportController saleReportController = new SalesReportController();
                view.getMainMenueFrame().dispose();
            }
        });

        view.membershipReportButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                SubscriptionsReportController subscriptionReportController = new SubscriptionsReportController();
                view.getMainMenueFrame().dispose();
            }
        });

        view.trainerReportButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // Controller Trainer Report
                view.getMainMenueFrame().dispose();
            }
        });

        view.amenitiesUseButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // Amenities Use Report
                view.getMainMenueFrame().dispose();
            }
        });

        view.amenityButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AmenityController amenityController = new AmenityController();
                view.getMainMenueFrame().dispose();
            }
        });

        view.amenityUseButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AmenityUseController amenityUseController = new AmenityUseController();
                view.getMainMenueFrame().dispose();
            }
        });

        view.trainerButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                TrainerController trainerController = new TrainerController();
                view.getMainMenueFrame().dispose();
            }
        });

        view.trainingSessionButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                TrainingSessionController trainingSessionController = new TrainingSessionController();
                view.getMainMenueFrame().dispose();
            }
        });

        view.memberButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                MemberController memberController = new MemberController();
                view.getMainMenueFrame().dispose();
            }
        });

        view.subscriptionButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                SubscriptionController subscriptionController = new SubscriptionController();
                view.getMainMenueFrame().dispose();
            }
        });

        view.subscriptionTypeButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                SubscriptionTypeController subscriptionTypeController = new SubscriptionTypeController();
                view.getMainMenueFrame().dispose();
            }
        });

        view.product(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ProductController productController = new ProductController();
                view.getMainMenueFrame().dispose();
            }
        });
    }
}
