
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;

public class SubscriptionTypeController {
    private SubscriptionTypeView mtView = new SubscriptionTypeView();
    private SubscriptionTypesDAO dao = new SubscriptionTypesDAO();
    private AmenitiesDAO daoAm = new AmenitiesDAO();
    private SubscriptionTypeAmenitiesDAO sdao = new SubscriptionTypeAmenitiesDAO();

    public SubscriptionTypeController() {
        this.mtView.memberBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getSubscriptionTypeFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
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
                mtView.getSubscriptionTypeIDJComboBox().setModel(new DefaultComboBoxModel<>(dao.getComboBoxSubscriptionTypeIDs()));
                mtView.getDeleteSubscriptionTypeFrame().setVisible(true);
                mtView.getSubscriptionTypeFrame().dispose();
            }
        });

        this.mtView.goToUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.getUpdateSubscriptionNameJComboBox().setModel(new DefaultComboBoxModel<>(dao.getComboBoxSubscriptionTypeIDs()));
                mtView.getUpdateSubscriptionTypeFrame1().setVisible(true);
                mtView.getSubscriptionTypeFrame().dispose();
            }
        });

        this.mtView.goToReadButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtView.setMemberTable(dao.selectAllSubscriptionTypes());
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
                System.out.println("String: " + mtView.getSubscriptionTypeName());
                System.out.println("Double: " + mtView.getSubscriptionTypePrice());
                String name = mtView.getSubscriptionTypeName();
                double price = Double.parseDouble(mtView.getSubscriptionTypePrice());
                

                if (dao.insertSubscriptionType(name, price)) {
                    Message.success();
                } else {
                    Message.failure();
                }
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
                int id = Integer.parseInt(mtView.getSubscriptionTypeID());
                if (dao.deleteSubscriptionType(id)) {
                    Message.success();
                } else {
                    Message.failure();
                }
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
                System.out.println(mtView.getUpdateSubscriptionName());
                int id = Integer.parseInt(mtView.getUpdateSubscriptionName());
                SubscriptionType st = dao.selectSubscriptionType(id);

                mtView.setUpdateSubscriptionTypeName(st.subscriptionTypeName());
                mtView.setUpdateSubscriptionTypePrice(String.valueOf(st.subscriptionTypePrice()));

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
                int id = Integer.parseInt(mtView.getUpdateSubscriptionName());
                String name = mtView.getUpdateSubscriptionTypeName();
                double price = Double.parseDouble(mtView.getUpdateSubscriptionTypePrice());

                if (dao.updateSubscriptionType(id, name, price)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });

        this.mtView.goToAddAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(mtView.getUpdateSubscriptionName());
                mtView.getAddAmenityIDJComboBox().setModel(new DefaultComboBoxModel<>(sdao.getComboBoxNonExistingAmenities(id)));
                mtView.getAddAmenityFrame().setVisible(true);
                mtView.getUpdateSubscriptionTypeFrame2().dispose();
            }
        });

        this.mtView.goToRemoveAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(mtView.getUpdateSubscriptionName());
                mtView.getRemoveAmenityIDJComboBox().setModel(new DefaultComboBoxModel<>(SubscriptionTypeAmenitiesDAO.selectAllAmenityIDsOfASubscriptionType(id)));  
                mtView.getRemoveAmenityFrame().setVisible(true);
                mtView.getUpdateSubscriptionTypeFrame2().dispose();
            }
        });

        this.mtView.goToReadAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(mtView.getUpdateSubscriptionName());
                mtView.setAmenityTable(sdao.selectAllAmenityNamesOfASubscriptionType(id));
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
                int id = Integer.parseInt(mtView.getUpdateSubscriptionName());
                int amenityid = Integer.parseInt(String.valueOf(mtView.getAddAmenityIDJComboBox().getSelectedItem()));
                SubscriptionTypeAmenity snew = new SubscriptionTypeAmenity(id, amenityid);

                if (sdao.insertSubscriptionTypeAmenity(snew)) {
                    Message.success();
                } else {
                    Message.failure();
                }
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
                int id = Integer.parseInt(mtView.getUpdateSubscriptionName());
                int amenityid = Integer.parseInt(String.valueOf(mtView.getRemoveAmenityIDJComboBox().getSelectedItem()));
                SubscriptionTypeAmenity snew = new SubscriptionTypeAmenity(id, amenityid);

                if (sdao.deleteSubscriptionTypeAmenity(snew)) {
                    Message.success();
                } else {
                    Message.failure();
                }
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