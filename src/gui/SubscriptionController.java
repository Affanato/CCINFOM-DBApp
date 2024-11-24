import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubscriptionController {
    private SubscriptionView view = new SubscriptionView();
    private MembersDAO membersDAO = new MembersDAO();
    private SubscriptionTypesDAO subscriptionTypesDAO = new SubscriptionTypesDAO();
    private SubscriptionsDAO subscriptionsDAO = new SubscriptionsDAO();

    public SubscriptionController() {
        this.view.memberBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getSubscriptionFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.view.goToAddButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMemberIDComboBox().setModel(new DefaultComboBoxModel<>(membersDAO.getComboBoxMemberIDs()));
                view.getMembershipTypeComboBox().setModel(new DefaultComboBoxModel<>(subscriptionTypesDAO.getComboBoxSubscriptionTypeIDs()));

                view.clearText();
                view.getAddSubscriptionFrame().setVisible(true);
                view.getSubscriptionFrame().dispose();
            }
        });

        this.view.goToDeleteButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMembershipIDComboBox().setModel(new DefaultComboBoxModel<>(subscriptionsDAO.getComboBoxSubscriptionIDs()));

                view.getDeleteSubscriptionFrame().setVisible(true);
                view.getSubscriptionFrame().dispose();
            }
        });

        this.view.goToReadAllButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setMemberTable(subscriptionsDAO.selectAllSubscriptions());

                view.getReadAllSubscriptionFrame().setVisible(true);
                view.getSubscriptionFrame().dispose();
            }
        });

        this.view.goToReadActiveButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setActiveTable(subscriptionsDAO.selectActiveSubscriptions());

                view.getReadActiveSubscriptionFrame().setVisible(true);
                view.getSubscriptionFrame().dispose();
            }
        });

        this.view.goToTerminateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTerminateMembershipIDComboBox().setModel(new DefaultComboBoxModel<>(subscriptionsDAO.getComboBoxActiveSubscriptionIDs()));

                view.getTerminateSubscriptionFrame().setVisible(true);
                view.getSubscriptionFrame().dispose();
            }
        });

        this.view.addBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getSubscriptionFrame().setVisible(true);
                view.getAddSubscriptionFrame().dispose();
            }
        });

        this.view.deleteBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getSubscriptionFrame().setVisible(true);
                view.getDeleteSubscriptionFrame().dispose();
            }
        });

        this.view.readAllBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getSubscriptionFrame().setVisible(true);
                view.getReadAllSubscriptionFrame().dispose();
            }
        });

        this.view.readActiveBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getSubscriptionFrame().setVisible(true);
                view.getReadActiveSubscriptionFrame().dispose();
            }
        });

        this.view.terminateBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getSubscriptionFrame().setVisible(true);
                view.getTerminateSubscriptionFrame().dispose();
            }
        });

        this.view.addSubscriptionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int memberID = Integer.parseInt(view.getMemberID());
                int subscriptionType = Integer.parseInt(view.getMembershipTypeComboBox().getSelectedItem().toString());
                String startDate = view.getStartDate();

                if (subscriptionsDAO.insertSubscription(memberID, subscriptionType, startDate)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });

        this.view.deleteSubscriptionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(view.getSubscriptionID());

                if (subscriptionsDAO.deleteSubscription(ID)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });

        this.view.terminateSubscriptionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(view.getTerminateSubscriptionID());

                if (subscriptionsDAO.terminateSubscription(ID)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });
    }
}