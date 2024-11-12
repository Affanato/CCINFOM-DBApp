
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PurchaseProductsController {
    private PurchaseProductsView ppView = new PurchaseProductsView();

    public PurchaseProductsController() {
        this.ppView.purchaseBackButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // go back to home page lang
            }
        });

        this.ppView.recordSalesListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ppView.getRecordSalesFrame().setVisible(true);
                ppView.getPurchaseProductsFrame().dispose();
            }
        });

        this.ppView.availableProdListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ppView.getAvailableProductsFrame().setVisible(true);
                ppView.getPurchaseProductsFrame().dispose();
            }
        });

        this.ppView.restockProductsListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ppView.getRestockProductsFrame().setVisible(true);
                ppView.getPurchaseProductsFrame().dispose();
            }
        });

        this.ppView.availableProductsBackButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ppView.getPurchaseProductsFrame().setVisible(true);
                ppView.getAvailableProductsFrame().dispose();
            }
        });

        this.ppView.restockProductsBackButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ppView.getPurchaseProductsFrame().setVisible(true);
                ppView.getRestockProductsFrame().dispose();
            }
        });

        this.ppView.recordSalesBackButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ppView.getPurchaseProductsFrame().setVisible(true);
                ppView.getRecordSalesFrame().dispose();
            }
        });

        this.ppView.restockButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // go back to home page lang
            }
        });

        this.ppView.recordButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // go back to home page lang
            }
        });

    }
}