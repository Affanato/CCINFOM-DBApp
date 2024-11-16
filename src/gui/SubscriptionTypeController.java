
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubscriptionTypeController {
    private SubscriptionTypeView mtView = new SubscriptionTypeView();

    public SubscriptionTypeController() {
        this.mtView.memberBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DummyController();
                mtView.getSubscriptionTypeFrame().dispose();
            }
        });

        this.mtView.goToAddButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getAddSubscriptionTypeFrame().setVisible(true);
                mtView.getSubscriptionTypeFrame().dispose();
            }
        });

        this.mtView.goToDeleteButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getDeleteSubscriptionTypeFrame().setVisible(true);
                mtView.getSubscriptionTypeFrame().dispose();
            }
        });

        this.mtView.goToUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getUpdateSubscriptionTypeFrame1().setVisible(true);
                mtView.getSubscriptionTypeFrame().dispose();
            }
        });

        this.mtView.goToReadButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getReadSubscriptionTypeFrame().setVisible(true);
                mtView.getSubscriptionTypeFrame().dispose();
            }
        });

        this.mtView.addBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getSubscriptionTypeFrame().setVisible(true);
                mtView.getAddSubscriptionTypeFrame().dispose();
            }
        });

        this.mtView.addSubscriptionTypeButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.mtView.deleteBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getSubscriptionTypeFrame().setVisible(true);
                mtView.getDeleteSubscriptionTypeFrame().dispose();
            }
        });

        this.mtView.deleteSubscriptionTypeButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.mtView.updateBackButton1(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getSubscriptionTypeFrame().setVisible(true);
                mtView.getUpdateSubscriptionTypeFrame1().dispose();
            }
        });

        this.mtView.proceedUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getUpdateSubscriptionTypeFrame2().setVisible(true);
                mtView.getUpdateSubscriptionTypeFrame1().dispose();
            }
        });

        this.mtView.updateBackButton2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getUpdateSubscriptionTypeFrame1().setVisible(true);
                mtView.getUpdateSubscriptionTypeFrame2().dispose();
            }
        });

        this.mtView.updateSubscriptionTypeButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.mtView.goToAddAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getAddAmenityFrame().setVisible(true);
                mtView.getUpdateSubscriptionTypeFrame2().dispose();
            }
        });

        this.mtView.goToRemoveAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getRemoveAmenityFrame().setVisible(true);
                mtView.getUpdateSubscriptionTypeFrame2().dispose();
            }
        });

        this.mtView.goToReadAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getReadAmenityFrame().setVisible(true);
                mtView.getUpdateSubscriptionTypeFrame2().dispose();
            }
        });

        this.mtView.addAmenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getUpdateSubscriptionTypeFrame2().setVisible(true);
                mtView.getAddAmenityFrame().dispose();
            }
        });

        this.mtView.addAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.mtView.removeAmenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getUpdateSubscriptionTypeFrame2().setVisible(true);
                mtView.getRemoveAmenityFrame().dispose();
            }
        });

        this.mtView.removeAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.mtView.readAmenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getUpdateSubscriptionTypeFrame2().setVisible(true);
                mtView.getReadAmenityFrame().dispose();
            }
        });

        this.mtView.readBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getSubscriptionTypeFrame().setVisible(true);
                mtView.getReadSubscriptionTypeFrame().dispose();
            }
        });
    }
}