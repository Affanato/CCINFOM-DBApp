import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmenityController {
    private AmenityView aView = new AmenityView();

    public AmenityController() {
        this.aView.amenityBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Add main menu here
                aView.getAmenityFrame().dispose();
            }
        });

        this.aView.goToAdd(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                aView.getAddAmenityFrame().setVisible(true);
                aView.getAmenityFrame().dispose();
            }
        });

        this.aView.goToDelete(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getDeleteAmenityFrame().setVisible(true);
                aView.getAmenityFrame().dispose();
            }
        });

        this.aView.goToRead(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getReadAmenityFrame().setVisible(true);
                aView.getAmenityFrame().dispose();
            }
        });

        this.aView.goToUpdate(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getUpdateAmenityFrame().setVisible(true);
                aView.getAmenityFrame().dispose();
            }
        });

        this.aView.addAmenityBackButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getAmenityFrame().setVisible(true);
                aView.getAddAmenityFrame().dispose();
            }
        });

        this.aView.addAmenity(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.aView.deleteAmenityBack(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getAmenityFrame().setVisible(true);
                aView.getDeleteAmenityFrame().dispose();
            }
        });

        this.aView.deleteAmenityButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //
            }
        });

        this.aView.amenityReadBack(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getAmenityFrame().setVisible(true);
                aView.getReadAmenityFrame().dispose();
            }
        });

        this.aView.updateAmenityBack(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getAmenityFrame().setVisible(true);
                aView.getUpdateAmenitySelectFrame().dispose();
            }
        });

        this.aView.updateAmenityButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getUpdateAmenityFrame().setVisible(true);
                aView.getUpdateAmenitySelectFrame().dispose();
            }
        });

        this.aView.updateAmenityBackButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getUpdateAmenitySelectFrame().setVisible(true);
                aView.getUpdateAmenityFrame().dispose();
            }
        });

        this.aView.updateAmenity2(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //
            }
        });
    }
}
