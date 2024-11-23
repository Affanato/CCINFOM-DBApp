
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;

import javax.swing.DefaultComboBoxModel;

public class TrainingSessionController {
    private TrainingSessionView tsView = new TrainingSessionView();
    private TrainingSessionsDAO dao = new TrainingSessionsDAO();

    public TrainingSessionController() {
        this.tsView.trainingSessionBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getTrainingSessionFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.tsView.goToAddButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TrainersDAO td = new TrainersDAO();
                MembersDAO md = new MembersDAO();

                tsView.getMemberIDBox().setModel(new DefaultComboBoxModel<>(md.getComboBoxMemberIDs())); 
                tsView.getTrainerIDBox().setModel(new DefaultComboBoxModel<>(td.getComboBoxTrainerIDs())); 

                tsView.getScheduleSessionFrame().setVisible(true);
                tsView.getTrainingSessionFrame().dispose();
            }
        });

        this.tsView.goToReadAllButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.setTrainerSessionTable(dao.selectAllTrainingSessions());
                tsView.getReadSessionFrame().setVisible(true);
                tsView.getTrainingSessionFrame().dispose();
            }
        });

        this.tsView.goToReadUpcomingButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.setTrainerSessionTable(dao.selectAllUpcomingTrainingSessions());
                tsView.getReadUpcomingSessionFrame().setVisible(true);
                tsView.getTrainingSessionFrame().dispose();
            }
        });

        this.tsView.goToDeleteButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getTrainingSessionIDComboBox().setModel(new DefaultComboBoxModel<>(dao.getComboBoxTrainingSessionIDs())); 
                tsView.getCancelSessionFrame().setVisible(true);
                tsView.getTrainingSessionFrame().dispose();
            }
        });

        this.tsView.goToUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getUpdateTrainingSessionIDComboBox().setModel(new DefaultComboBoxModel<>(dao.getComboBoxTrainingSessionIDs())); 
                tsView.getUpdateSessionFrame1().setVisible(true);
                tsView.getTrainingSessionFrame().dispose();
            }
        });

        this.tsView.scheduleBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getTrainingSessionFrame().setVisible(true);
                tsView.getScheduleSessionFrame().dispose();
            }
        });

        this.tsView.readAllBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getTrainingSessionFrame().setVisible(true);
                tsView.getReadSessionFrame().dispose();
            }
        });

        this.tsView.readUpcomingBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getTrainingSessionFrame().setVisible(true);
                tsView.getReadUpcomingSessionFrame().dispose();
            }
        });

        this.tsView.cancelBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getTrainingSessionFrame().setVisible(true);
                tsView.getCancelSessionFrame().dispose();
            }
        });
        this.tsView.updateBackButton1(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getTrainingSessionFrame().setVisible(true);
                tsView.getUpdateSessionFrame1().dispose();
            }
        });
        this.tsView.updateBackButton2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tsView.getUpdateSessionFrame1().setVisible(true);
                tsView.getUpdateSessionFrame2().dispose();
            }
        });

        this.tsView.scheduleSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int memberID = Integer.parseInt(tsView.getMemberID());
                int trainerID = Integer.parseInt(tsView.getTrainerID());
                String startDate = tsView.getStartDate();
                String endDate = tsView.getEndDate();

                if (dao.insertTrainingSession(memberID, trainerID, startDate, endDate)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });
        this.tsView.cancelSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sessionid = Integer.parseInt(tsView.getTrainingSessionID());
                if (dao.deleteTrainingSession(sessionid)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });
        this.tsView.proceedUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sessionid = Integer.parseInt(tsView.getUpdateTrainingSessionID());
                TrainingSession ts = dao.selectTrainingSession(sessionid);
                TrainersDAO t = new TrainersDAO();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

                tsView.setUpdateSubscriptionID(String.valueOf(ts.subscriptionID()));
                tsView.getUpdateTrainerIDComboBox().setModel(new DefaultComboBoxModel<>(t.getComboBoxTrainerIDs())); 
                tsView.getUpdateTrainerIDComboBox().setSelectedItem(String.valueOf(ts.trainerID()));
                tsView.setUpdateStartDate(String.valueOf(ts.sessionStartDateTime().format(formatter)));
                tsView.setUpdateEndDate(String.valueOf(ts.sessionEndDateTime().format(formatter)));


                tsView.getUpdateSessionFrame1().dispose();
                tsView.getUpdateSessionFrame2().setVisible(true);
            }
        });
        this.tsView.updateTrainingSessionButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sessionid = Integer.parseInt(tsView.getUpdateTrainingSessionID());
                int trainerID = Integer.parseInt(tsView.getUpdateTrainerID());
                String startDate = tsView.getUpdateStartDate();
                String endDate = tsView.getUpdateEndDate();

                if (dao.updateTrainingSession(sessionid, trainerID, startDate, endDate)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });
    }
}