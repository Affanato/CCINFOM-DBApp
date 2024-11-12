
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BranchInformationController {
    private BranchInformationView biView = new BranchInformationView();

    public BranchInformationController() {
        this.biView.branchBackButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // go back to home page lang
            }
        });

        this.biView.memTypeButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                biView.getMembershipsFrame().setVisible(true);
                biView.getBranchInfoFrame().dispose();
            }
        });

        this.biView.trainerButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                biView.getTrainersFrame().setVisible(true);
                biView.getBranchInfoFrame().dispose();
            }
        });

        this.biView.productButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                biView.getProductsFrame().setVisible(true);
                biView.getBranchInfoFrame().dispose();
            }
        });

        this.biView.productsBackButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                biView.getBranchInfoFrame().setVisible(true);
                biView.getProductsFrame().dispose();
            }
        });

        this.biView.trainersBackButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                biView.getBranchInfoFrame().setVisible(true);
                biView.getTrainersFrame().dispose();
            }
        });

        this.biView.membershipBackButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                biView.getBranchInfoFrame().setVisible(true);
                biView.getMembershipsFrame().dispose();
            }
        });
    }
}