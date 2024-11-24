
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Member;

import javax.swing.DefaultComboBoxModel;
import jdk.net.NetworkPermission;

public class ProductController {
    private ProductView pView = new ProductView();
    private ProductsDAO dao = new ProductsDAO();
    private MembersDAO mem = new MembersDAO();
    private ProductPurchasesDAO purch = new ProductPurchasesDAO();

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
                pView.getProductIDJComboBox().setModel((new DefaultComboBoxModel<>(dao.getComboBoxProductIDs())));
                pView.getDeleteProductFrame().setVisible(true);
                pView.getProductFrame().dispose();
            }
        });

        this.pView.goToReadButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.setProductTable(dao.selectAllProducts());
                pView.getReadProductFrame().setVisible(true);
                pView.getProductFrame().dispose();
            }
        });

        this.pView.goToUpdateButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getUpdateProductIDComboBox().setModel((new DefaultComboBoxModel<>(dao.getComboBoxProductIDs())));
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
                pView.getRestockProductIDComboBox().setModel((new DefaultComboBoxModel<>(dao.getComboBoxProductIDs())));
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
                int id = Integer.parseInt(pView.getDeleteProductID());

                if (dao.deleteProduct(id)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });

        this.pView.updateProductButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int productid = Integer.parseInt(pView.getUpdateProductID());
                Product p = ProductsDAO.selectProduct(productid);
    

                double price = Double.parseDouble(pView.getUpdateProductPrice());
                String description = pView.getUpdateProductDescription();
                Product newP = new Product(productid, p.productBrand(), p.productName(), description, price, p.availableQuantity());

                if (dao.updateProduct(productid, newP)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });

        this.pView.restockProductButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(pView.getRestockProductID());
                int quantity = Integer.parseInt(pView.getRestockQuantity());

                if (dao.restockProduct(id, quantity)) {
                    Message.success();
                } else {
                    Message.failure();
                }
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
                String name = pView.getProductName();
                double price = Double.parseDouble(pView.getProductPrice());
                String brand = pView.getProductBrand();
                int quantity = Integer.parseInt(pView.getAvailableQuantity());
                String description = pView.getProductDescription();

                if (dao.insertProduct(brand, name, description, price, quantity)) {
                    Message.success();
                } else {
                    Message.failure();
                }

            }
        });

        this.pView.proceedButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int productid = Integer.parseInt(pView.getUpdateProductID());
                Product p = ProductsDAO.selectProduct(productid);

                pView.setProductName(p.productName());
                pView.setProductBrand(p.productBrand());
                pView.setProductDescription(p.productDescription());
                pView.setAvailableQuantity(String.valueOf(p.availableQuantity()));
                pView.setProductPrice(String.valueOf(p.productPrice()));

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
                pView.getSellMemberIDComboBox().setModel(new DefaultComboBoxModel<>(mem.getComboBoxMemberIDs()));
                pView.getSellProductIDComboBox().setModel(new DefaultComboBoxModel<>(dao.getComboBoxProductIDs()));
                pView.getAddProductPurchaseFrame().setVisible(true);
                pView.getProductPurchasesFrame().dispose();
            }
        });
        this.pView.goToReadButton2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.setPurchasesTable(purch.selectAllProductPurchases());
                pView.getReadProductPurchasesFrame().setVisible(true);
                pView.getProductPurchasesFrame().dispose();
            }
        });
        this.pView.goToDeleteButton2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getDeleteProductPurchaseID().setModel(new DefaultComboBoxModel<>(purch.getComboBoxProductPurchaseIDs()));

                
                pView.getDeleteProductPurchaseFrame().setVisible(true);
                pView.getProductPurchasesFrame().dispose();
            }
        });
        this.pView.goToCancelButton2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getCancelProductPurchaseID().setModel(new DefaultComboBoxModel<>(purch.getComboBoxProductPurchaseIDs()));

                
                pView.getCancelProductPurchaseFrame().setVisible(true);
                pView.getProductPurchasesFrame().dispose();
            }
        });
        this.pView.goToUpdateButton2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pView.getUpdateProductPurchaseID().setModel(new DefaultComboBoxModel<>(purch.getComboBoxProductPurchaseIDs()));

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
                int id = Integer.parseInt(String.valueOf(pView.getUpdateProductPurchaseID().getSelectedItem()));
                ProductPurchase pp = purch.selectProductPurchase(id);
                pView.getMemberPurchaseID().setModel(new DefaultComboBoxModel<>(mem.getComboBoxMemberIDs()));
                pView.getProductPurchaseID().setModel(new DefaultComboBoxModel<>(dao.getComboBoxProductIDs()));
                pView.getMemberPurchaseID().setSelectedItem(String.valueOf(pp.memberID()));
                pView.getProductPurchaseID().setSelectedItem(String.valueOf(pp.productID()));
                pView.setQuantityPurchase(String.valueOf(pp.quantitySold()));

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


        this.pView.addPurchaseProductButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int memberid = Integer.parseInt(pView.getSellMemberID());
                int productid = Integer.parseInt(pView.getSellProductID());
                int quantity = Integer.parseInt(pView.getSellQuantity());

                if (dao.sellProduct(memberid, productid, quantity)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });

        this.pView.updatePurchaseProductButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(String.valueOf(pView.getUpdateProductPurchaseID().getSelectedItem()));

                int memberid = Integer.parseInt(String.valueOf(pView.getMemberPurchaseID().getSelectedItem()));
                int productid = Integer.parseInt(String.valueOf(pView.getProductPurchaseID().getSelectedItem()));
                int quantity = Integer.parseInt(pView.getQuantityPurchase());

                if (purch.updateProductPurchase(id, productid, quantity, memberid)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });

        this.pView.deletePurchaseProductButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(String.valueOf(pView.getDeleteProductPurchaseID().getSelectedItem()));

                if (purch.deleteProductPurchase(id)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });

        this.pView.cancelPurchaseProductButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(String.valueOf(pView.getCancelProductPurchaseID().getSelectedItem()));

                if (purch.cancelProductPurchase(id)) {
                    Message.success();
                } else {
                    Message.failure();
                }
            }
        });
    }
}