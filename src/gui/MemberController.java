
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
                view.getUpdateMemberFrame().setVisible(true);
                view.getUpdateMemberIDFrame().dispose();
            }
        });

        this.view.updateMemberButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.view.addMemberButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.view.deleteMemberButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
    }
}