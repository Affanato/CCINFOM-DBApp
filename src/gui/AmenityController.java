import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmenityController {
    private final AmenityView view = new AmenityView();
    private final AmenitiesDAO dao = new AmenitiesDAO();

    public AmenityController() {
        this.view.amenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenityFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.view.goToAddAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenityFrame().dispose();
                view.getAddAmenityFrame().setVisible(true);
            }
        });

        this.view.goToReadAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setReadAmenityTable(dao.selectAllAmenities());

                view.getAmenityFrame().dispose();
                view.getReadAmenityFrame().setVisible(true);
            }
        });

        this.view.goToUpdateAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getUpdateAmenity().setModel(new DefaultComboBoxModel<>(dao.getComboBoxAmenityIDs()));
                view.getAmenityFrame().dispose();
                view.getUpdateSelectAmenityFrame().setVisible(true);
            }
        });

        this.view.goToDeleteAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getDeleteAmenity().setModel(new DefaultComboBoxModel<>(dao.getComboBoxAmenityIDs()));

                view.getAmenityFrame().dispose();
                view.getDeleteAmenityFrame().setVisible(true);
            }
        });

        this.view.addAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = view.getName();
                String status = view.getSelectStatus();
                int walkInPrice = Integer.parseInt(view.getWalkInPrice());
                String timeOpen = view.getTimeOpen();
                String timeClose = view.getTimeClose();

                if (dao.insertAmenity(name, walkInPrice, timeOpen, timeClose, status)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });

        this.view.addAmenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAddAmenityFrame().dispose();
                view.getAmenityFrame().setVisible(true);
            }
        });

        this.view.readAmenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setReadAmenityTable(dao.selectAllAmenities());
                view.getReadAmenityFrame().dispose();
                view.getAmenityFrame().setVisible(true);
            }
        });

        this.view.deleteAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(view.getSelectDelete());

                if (dao.deleteAmenity(ID)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });

        this.view.deleteAmenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getDeleteAmenityFrame().dispose();
                view.getAmenityFrame().setVisible(true);
            }
        });

        this.view.updateAmenityButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(view.getSelectUpdate());
                Amenity amenity = dao.selectAmenity(ID);

                // TODO fix this
                view.setName2(amenity.amenityName());
                view.setSelectStatus2(amenity.amenityStatus().toString());
                view.setWalkInPrice2(String.valueOf(amenity.walkInPricePerHour()));
                view.setTimeOpen2(String.valueOf(amenity.openingTime()));
                view.setTimeClose2(String.valueOf(amenity.closingTime()));

                view.getUpdateSelectAmenityFrame().dispose();
                view.getUpdateAmenityDetailsFrame().setVisible(true);
            }
        });

        this.view.updateSelectAmenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getUpdateSelectAmenityFrame().dispose();
                view.getAmenityFrame().setVisible(true);
            }
        });

        this.view.updateAmenity2Button(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(view.getSelectUpdate());
                String name = view.getName2();
                String status = view.getSelectStatus2();
                int walkInPrice = Integer.parseInt(view.getWalkInPrice2());
                String timeOpen = view.getTimeOpen2();
                String timeClose = view.getTimeClose2();
                Amenity amenity = dao.selectAmenity(ID);

                if (dao.updateAmenity(amenity.amenityID(), name, walkInPrice, timeOpen, timeClose, status)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });

        this.view.updateDetailsAmenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getUpdateAmenityDetailsFrame().dispose();
                view.getUpdateSelectAmenityFrame().setVisible(true);
            }
        });
    }

}