
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubscriptionController {
    private SubscriptionView mView = new SubscriptionView();

    public SubscriptionController() {
        this.mView.memberBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DummyController();
                mView.getSubscriptionFrame().dispose();
            }
        });

        this.mView.goToAddButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getAddSubscriptionFrame().setVisible(true);
                mView.getSubscriptionFrame().dispose();
            }
        });

        this.mView.goToDeleteButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getDeleteSubscriptionFrame().setVisible(true);
                mView.getSubscriptionFrame().dispose();
            }
        });

        this.mView.goToReadButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getReadSubscriptionFrame().setVisible(true);
                mView.getSubscriptionFrame().dispose();
            }
        });
        this.mView.goToTerminateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getTerminateSubscriptionFrame().setVisible(true);
                mView.getSubscriptionFrame().dispose();
            }
        });

        this.mView.addBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getSubscriptionFrame().setVisible(true);
                mView.getAddSubscriptionFrame().dispose();
            }
        });

        this.mView.deleteBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getSubscriptionFrame().setVisible(true);
                mView.getDeleteSubscriptionFrame().dispose();
            }
        });

        this.mView.readBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getSubscriptionFrame().setVisible(true);
                mView.getReadSubscriptionFrame().dispose();
            }
        });

        this.mView.terminateBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getSubscriptionFrame().setVisible(true);
                mView.getTerminateSubscriptionFrame().dispose();
            }
        });

        this.mView.addSubscriptionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.mView.deleteSubscriptionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.mView.terminateSubscriptionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
    }
}