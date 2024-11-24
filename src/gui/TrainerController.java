
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;

public class TrainerController {
    private TrainerView tView = new TrainerView();
    private TrainersDAO dao = new TrainersDAO();

    public TrainerController() {
        this.tView.trainerBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getTrainerFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.tView.goToAddButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.clearText();
                tView.getAddTrainerFrame().setVisible(true);
                tView.getTrainerFrame().dispose();
            }
        });

        this.tView.goToReadButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.setTrainerTable(dao.selectAllTrainers());
                
                tView.getReadTrainerFrame().setVisible(true);
                tView.getTrainerFrame().dispose();
            }
        });

        this.tView.goToDeleteButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getTrainerIDJComboBox().setModel(new DefaultComboBoxModel<>(dao.getComboBoxTrainerIDs()));
                tView.getDeleteTrainerFrame().setVisible(true);
                tView.getTrainerFrame().dispose();
            }
        });

        this.tView.goToUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getUpdateTrainerIDJComboBox().setModel(new DefaultComboBoxModel<>(dao.getComboBoxTrainerIDs()));
                tView.getUpdateTrainerFrame2().setVisible(true);
                tView.getTrainerFrame().dispose();
            }
        });
        this.tView.goToUpdateStatusButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getUpdateStatusTrainerIDJComboBox().setModel(new DefaultComboBoxModel<>(dao.getComboBoxTrainerIDs()));
                tView.getUpdateStatusTrainerIDJComboBox().setSelectedItem("Active");
                tView.getUpdateStatusTrainerFrame().setVisible(true);
                tView.getTrainerFrame().dispose();
            }
        });

        this.tView.addBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getTrainerFrame().setVisible(true);
                tView.getAddTrainerFrame().dispose();
            }
        });

        this.tView.readBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getTrainerFrame().setVisible(true);
                tView.getReadTrainerFrame().dispose();
            }
        });

        this.tView.deleteBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getTrainerFrame().setVisible(true);
                tView.getDeleteTrainerFrame().dispose();
            }
        });
        this.tView.updateBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getUpdateTrainerFrame2().setVisible(true);
                tView.getUpdateTrainerFrame().dispose();
            }
        });
        this.tView.updateBackButton2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getTrainerFrame().setVisible(true);
                tView.getUpdateTrainerFrame2().dispose();
            }
        });
        this.tView.updateStatusBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tView.getTrainerFrame().setVisible(true);
                tView.getUpdateStatusTrainerFrame().dispose();
            }
        });
        this.tView.addTrainerButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lastname = tView.getLastName();
                String firstname = tView.getFirstName();
                String bdate = tView.getBirthDate();
                String sex = tView.getSex();
                String pnum = tView.getPhoneNumber();
                String speciality = tView.getSpeciality();
                String city = tView.getCity();
                String street = tView.getStreet();
                String barangay = tView.getBarangay();
                String province = tView.getProvince();

                if (dao.insertTrainer(lastname, firstname, LocalDate.parse(bdate), String.valueOf(sex.charAt(0)), pnum, street, barangay, city, province, speciality)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });
        this.tView.deleteTrainerButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(tView.getTrainerID());
                if (dao.deleteTrainer(id)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });
        this.tView.updateTrainerButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(tView.getTrainerID2());
                Trainer t = dao.selectTrainer(id);
                
                String lastname = tView.getUpdateLastName();
                String pnum = tView.getUpdatePhoneNumber();
                String speciality = tView.getUpdateSpeciality();
                String city = tView.getUpdateCity();
                String street = tView.getUpdateStreet();
                String barangay = tView.getUpdateBarangay();
                String province = tView.getUpdateProvince();

                if (dao.updateTrainer(t.trainerID(), lastname, t.birthdate(), String.valueOf(String.valueOf(t.sex()).charAt(0)), pnum, street, barangay, city, province, speciality)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });
        this.tView.updateStatusButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(tView.getUpdateStatusTrainerID());
                String status = tView.getUpdateTrainerStatus();
                if (dao.setTrainerStatus(id, status)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });
        this.tView.proceedUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(tView.getTrainerID2());
                Trainer t = dao.selectTrainer(id);

                tView.setUpdateFirstName(t.firstName());
                tView.setUpdateLastName(t.lastName());
                tView.setBirthDate(String.valueOf(t.birthdate()));
                tView.setPhoneNumber(t.phoneNumber());
                tView.setSex(String.valueOf(t.sex()));
                tView.setStreet(t.street());
                tView.setBarangay(t.barangay());
                tView.setCity(t.city());
                tView.setProvince(t.province());
                tView.setSpeciality(t.programSpecialty());

                tView.getUpdateTrainerFrame().setVisible(true);
                tView.getUpdateTrainerFrame2().dispose();
            }
        });
    }
}