import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

//import src.dao;

public class AmenityUseController {
    private final AmenityUseView view = new AmenityUseView();
    private final AmenityLogsDAO dao = new AmenityLogsDAO();
    private final MembersDAO memberDAO = new MembersDAO();
    private final AmenitiesDAO amenityDAO = new AmenitiesDAO();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public AmenityUseController() {
        this.view.amenityUseBackButtonButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAmenityUseFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.view.goToAddSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getMemberBar().setModel(new DefaultComboBoxModel<>(memberDAO.getComboBoxMemberIDs()));
                view.getAmenityBar().setModel(new DefaultComboBoxModel<>(dao.getComboBoxAmenityLogIDs()));
                view.clearText();
                view.getAmenityUseFrame().dispose();
                view.getAddSessionFrame().setVisible(true);
            }
        });

        this.view.goToReadSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setSessionTable(dao.selectAllAmenityLogs());
                view.getAmenityUseFrame().dispose();
                view.getReadSessionFrame().setVisible(true);
            }
        });

        this.view.goToUpdateSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getUpdateSession().setModel(new DefaultComboBoxModel<>(dao.getComboBoxAmenityLogIDs()));
                view.getAmenityUseFrame().dispose();
                view.getUpdateSelectSession().setVisible(true);
            }
        });

        this.view.goToDeleteSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getDeleteSession().setModel(new DefaultComboBoxModel<>(dao.getComboBoxAmenityLogIDs()));
                view.getAmenityUseFrame().dispose();
                view.getDeleteSessionFrame().setVisible(true);
            }
        });

        this.view.addSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Display Success or Fail Message
                // LOAD COMBO BOXES
                int memberID = Integer.parseInt(view.getSelectMemberBar());
                int amenityID = Integer.parseInt(view.getSelectAmenityBar());
                String startDateTime = view.getStartTime();
                int usageHours = Integer.parseInt(view.getUsageHours());

                if (dao.insertAmenityLog(memberID, amenityID, startDateTime, usageHours)) {
                    Message.success();
                } else {
                    Message.failure();
                }

            }
        });

        this.view.addSessionBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAddSessionFrame().dispose();
                view.getAmenityUseFrame().setVisible(true);
            }
        });

        this.view.readSessionBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getReadSessionFrame().dispose();
                view.getAmenityUseFrame().setVisible(true);
            }
        });

        this.view.deleteSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Display Success or Fail Message
                int logID = Integer.parseInt(view.getSelectDelete());

                if (dao.deleteAmenityLog(logID)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });

        this.view.deleteSessionBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getDeleteSessionFrame().dispose();
                view.getAmenityUseFrame().setVisible(true);
            }
        });

        this.view.updateSessionSelectButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sessionID = Integer.parseInt(view.getSelectUpdate());
                AmenityLog am = dao.selectAmenityLog(sessionID);
                MembersDAO mem = new MembersDAO();
    

                view.getMemberBar2().setModel(new DefaultComboBoxModel<>(mem.getComboBoxMemberIDs()));
                view.getAmenityBar2().setModel(new DefaultComboBoxModel<>((amenityDAO.getComboBoxAmenityIDs())));
                view.setStartTime2(String.valueOf(am.usageStartDateTime().format(formatter)));
                view.setUsageHours2(String.valueOf(am.usageDurationHours()));
                
                view.getUpdateSelectSession().dispose();
                view.getUpdateDetailsSessionFrame().setVisible(true);
            }
        });

        this.view.updateSelectBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getUpdateSelectSession().dispose();
                view.getAmenityUseFrame().setVisible(true);
            }
        });

        this.view.updateSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display Success or Fail Message
                int sessionID = Integer.parseInt(view.getSelectUpdate());
                int memberid = Integer.parseInt(String.valueOf(view.getMemberBar2().getSelectedItem()));
                int amenityid = Integer.parseInt(String.valueOf(view.getAmenityBar2().getSelectedItem()));
                String startDateTime = view.getStartTime2();
                int usageHours = Integer.parseInt(view.getUsageHours2());

                if (dao.updateAmenityLog(sessionID, memberid, amenityid, startDateTime, usageHours)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });

        this.view.updateSessionDetailsBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getUpdateDetailsSessionFrame().dispose();
                view.getUpdateSelectSession().setVisible(true);
            }
        });
    }
}
