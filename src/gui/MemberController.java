
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemberController {
    private final MemberView view = new MemberView();
    private final MembersDAO dao = new MembersDAO();

    public MemberController() {
        this.view.memberBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMemberFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.view.goToAddButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAddMemberFrame().setVisible(true);
                view.getMemberFrame().dispose();
            }
        });

        this.view.goToReadButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setMemberTable(dao.selectAllMembers());

                view.getReadMemberFrame().setVisible(true);
                view.getMemberFrame().dispose();
            }
        });

        this.view.goToDeleteButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMemberIDJComboBox().setModel(new DefaultComboBoxModel<>(dao.getComboBoxMemberIDs()));
                view.getDeleteMemberFrame().setVisible(true);
                view.getMemberFrame().dispose();
            }
        });

        this.view.goToUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getUpdateMemberIDJComboBox().setModel(new DefaultComboBoxModel<>(dao.getComboBoxMemberIDs()));
                view.getUpdateMemberIDFrame().setVisible(true);
                view.getMemberFrame().dispose();
            }
        });

        this.view.addBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMemberFrame().setVisible(true);
                view.getAddMemberFrame().dispose();
            }
        });

        this.view.readBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMemberFrame().setVisible(true);
                view.getReadMemberFrame().dispose();
            }
        });

        this.view.deleteBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMemberFrame().setVisible(true);
                view.getDeleteMemberFrame().dispose();
            }
        });

        this.view.updateMemberIDBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMemberFrame().setVisible(true);
                view.getUpdateMemberIDFrame().dispose();
            }
        });

        this.view.updateBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getUpdateMemberIDFrame().setVisible(true);
                view.getUpdateMemberFrame().dispose();
            }
        });

        this.view.proceedUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = view.getUpdateMemberID();
                Member member = dao.selectMember(ID);

                // TODO fix this
                view.setUpdateFirstName(member.firstName());
                view.setUpdateLastName(member.lastName());
                view.setUpdateSex(String.valueOf(member.sex()));
                view.setUpdateBirthDate(String.valueOf(member.birthdate()));
                view.getUpdatePhoneNumber(member.phoneNumber());
                view.getUpdateStreet(member.street());
                view.getUpdateBarangay(member.barangay());
                view.getUpdateCity(member.city());
                view.getUpdateProvince(member.province());

                view.getUpdateMemberFrame().setVisible(true);
                view.getUpdateMemberIDFrame().dispose();
            }
        });

        this.view.updateMemberButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = view.getUpdateMemberID();
                String firstName = view.getUpdatedFirstName();
                String lastName = view.getUpdateLastName();
                String sex = view.getUpdatedSex();
                String birthDate = view.getUpdateBirthDate();
                String phoneNumber = view.getUpdatePhoneNumber();
                String street = view.getUpdateStreet();
                String barangay = view.getUpdateBarangay();
                String city = view.getUpdateCity();
                String province = view.getUpdateProvince();


                if (dao.updateMember(ID, lastName, sex, phoneNumber, street, barangay, city, province)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });

        this.view.addMemberButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = view.getFirstName();
                String lastName = view.getLastName();
                String sex = view.getSex();
                String birthDate = view.getBirthDate();
                String phoneNumber = view.getPhoneNumber();
                String street = view.getStreet();
                String barangay = view.getBarangay();
                String city = view.getCity();
                String province = view.getProvince();


                if (dao.insertMember(lastName, name, birthDate, sex, phoneNumber, street, barangay, city, province)) {
                    Message.success();
                } else {
                    Message.failure();
                }

            }
        });

        this.view.deleteMemberButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = view.getMemberID();

                if (dao.deleteMember(ID)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });
    }
}