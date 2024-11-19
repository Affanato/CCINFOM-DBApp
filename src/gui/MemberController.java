
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemberController {
    private MemberView mView = new MemberView();

    public MemberController() {
        this.mView.memberBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getMemberFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.mView.goToAddButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getAddMemberFrame().setVisible(true);
                mView.getMemberFrame().dispose();
            }
        });

        this.mView.goToReadButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[][] data = {
                    {"Alice", "hey nowww hey noooow this is what dreams are made of", 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"},
                    {"Charlie", 789, 92.3, "Hi", 7, "Nice"},
                    {"Alice", 123, 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"},
                    {"Alice", 123, 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"},
                    {"Alice", 123, 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"},
                    {"Alice", 123, 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"},
                    {"Alice", 123, 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"},
                    {"Alice", 123, 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"},
                    {"Alice", 123, 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"},
                    {"Alice", 123, 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"},
                    {"Alice", 123, 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"},
                    {"Alice", 123, 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"},
                    {"Alice", 123, 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"},
                    {"Alice", 123, 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"},
                    {"Alice", 123, 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"},
                    {"Alice", 123, 89.5, "Hi", 7, "Nice"},
                    {"Bob", 456, 76.0, "Hi", 7, "Nice"}
                };
                mView.setMemberTable(data);
                mView.getReadMemberFrame().setVisible(true);
                mView.getMemberFrame().dispose();
            }
        });

        this.mView.goToDeleteButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getDeleteMemberFrame().setVisible(true);
                mView.getMemberFrame().dispose();
            }
        });

        this.mView.goToUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getUpdateMemberIDFrame().setVisible(true);
                mView.getMemberFrame().dispose();
            }
        });

        this.mView.addBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getMemberFrame().setVisible(true);
                mView.getAddMemberFrame().dispose();
            }
        });

        this.mView.readBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getMemberFrame().setVisible(true);
                mView.getReadMemberFrame().dispose();
            }
        });

        this.mView.deleteBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getMemberFrame().setVisible(true);
                mView.getDeleteMemberFrame().dispose();
            }
        });

        this.mView.updateMemberIDBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getMemberFrame().setVisible(true);
                mView.getUpdateMemberIDFrame().dispose();
            }
        });

        this.mView.updateBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getUpdateMemberIDFrame().setVisible(true);
                mView.getUpdateMemberFrame().dispose();
            }
        });

        this.mView.proceedUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mView.getUpdateMemberFrame().setVisible(true);
                mView.getUpdateMemberIDFrame().dispose();
            }
        });

        this.mView.updateMemberButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.mView.addMemberButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.mView.deleteMemberButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
    }
}