
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MembershipSubscriptionController {
    private MembershipSubscriptionView msView = new MembershipSubscriptionView();

    public MembershipSubscriptionController() {
        this.msView.membershipBackButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // go back to home page lang
            }
        });

        this.msView.recordSubscriptionButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String memberID = msView.getMemberID();
                String trainerID = msView.getTrainerID();
                String startDate = msView.getStartDate();
            }
        });
    }
}