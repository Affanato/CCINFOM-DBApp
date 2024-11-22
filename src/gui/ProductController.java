
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductController {
    private ProductView pView = new ProductView();

    public ProductController() {
        this.pView.productBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductFrame().dispose();
                MainMenuController mainMenuController = new MainMenuController();
            }
        });

        this.pView.goToAddButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getAddProductFrame().setVisible(true);
                pView.getProductFrame().dispose();
            }
        });

        this.pView.goToDeleteButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getDeleteProductFrame().setVisible(true);
                pView.getProductFrame().dispose();
            }
        });

        this.pView.goToReadButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getReadProductFrame().setVisible(true);
                pView.getProductFrame().dispose();
            }
        });

        this.pView.goToUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getUpdateProductFrame1().setVisible(true);
                pView.getProductFrame().dispose();
            }
        });

        this.pView.goToProductPurchasesButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductPurchasesFrame().setVisible(true);
                pView.getProductFrame().dispose();
            }
        });

        this.pView.goToRestockButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getRestockProductFrame().setVisible(true);
                pView.getProductFrame().dispose();
            }
        });

        this.pView.addBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductFrame().setVisible(true);
                pView.getAddProductFrame().dispose();
            }
        });

        this.pView.deleteBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductFrame().setVisible(true);
                pView.getDeleteProductFrame().dispose();
            }
        });

        this.pView.readBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductFrame().setVisible(true);
                pView.getReadProductFrame().dispose();
            }
        });

        this.pView.updateBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductPurchasesFrame().setVisible(true);
                pView.getUpdateProductFrame().dispose();
            }
        });

        this.pView.sellBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductPurchasesFrame().setVisible(true);
                pView.getSellProductFrame().dispose();
            }
        });

        this.pView.restockBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductFrame().setVisible(true);
                pView.getRestockProductFrame().dispose();
            }
        });

        this.pView.deleteProductButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.pView.updateProductButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.pView.restockProductButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.pView.sellProductButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.pView.addProductButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.pView.proceedButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getUpdateProductFrame().setVisible(true);
                pView.getUpdateProductFrame1().dispose();
            }
        });

        this.pView.updateBackButton1(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductFrame().setVisible(true);
                pView.getUpdateProductFrame1().dispose();
            }
        });



        // product purchases
        this.pView.productPurchaseBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductFrame().setVisible(true);
                pView.getProductPurchasesFrame().dispose();
            }
        });
        this.pView.goToAddButton2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getAddProductPurchaseFrame().setVisible(true);
                pView.getProductPurchasesFrame().dispose();
            }
        });
        this.pView.goToReadButton2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getReadProductPurchasesFrame().setVisible(true);
                pView.getProductPurchasesFrame().dispose();
            }
        });
        this.pView.goToDeleteButton2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getDeleteProductPurchaseFrame().setVisible(true);
                pView.getProductPurchasesFrame().dispose();
            }
        });
        this.pView.goToCancelButton2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getCancelProductPurchaseFrame().setVisible(true);
                pView.getProductPurchasesFrame().dispose();
            }
        });
        this.pView.goToUpdateButton2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getUpdateProductPurchaseFrame().setVisible(true);
                pView.getProductPurchasesFrame().dispose();
            }
        });

        this.pView.addPurchaseBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductPurchasesFrame().setVisible(true);
                pView.getAddProductPurchaseFrame().dispose();
            }
        });
        this.pView.deletePurchaseBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductPurchasesFrame().setVisible(true);
                pView.getDeleteProductPurchaseFrame().dispose();
            }
        });
        this.pView.cancelPurchaseBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductPurchasesFrame().setVisible(true);
                pView.getCancelProductPurchaseFrame().dispose();
            }
        });
        this.pView.proceedUpdatePurchaseProductButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getUpdateProductPurchaseFrame1().setVisible(true);
                pView.getUpdateProductPurchaseFrame().dispose();
            }
        });
        this.pView.updatePurchaseBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductPurchasesFrame().setVisible(true);
                pView.getUpdateProductPurchaseFrame().dispose();
            }
        });
        this.pView.updatePurchaseBackButton1(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getUpdateProductPurchaseFrame().setVisible(true);
                pView.getUpdateProductPurchaseFrame1().dispose();
            }
        });
        this.pView.readPurchaseBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getProductPurchasesFrame().setVisible(true);
                pView.getReadProductPurchasesFrame().dispose();
            }
        });
    }
}