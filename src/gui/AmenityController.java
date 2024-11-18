import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmenityController {
    private final AmenityView aView = new AmenityView();

    public AmenityController() {
        this.aView.amenityBackButtonB(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Add main menu here
                aView.getAmenityFrame().dispose();
            }
        });

        this.aView.goToAddB(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                aView.getAddAmenityFrame().setVisible(true);
                aView.getAmenityFrame().dispose();
            }
        });

        this.aView.goToDeleteB(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getDeleteAmenityFrame().setVisible(true);
                aView.getAmenityFrame().dispose();
            }
        });

        this.aView.goToReadB(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getReadAmenityFrame().setVisible(true);
                aView.getAmenityFrame().dispose();
            }
        });

        this.aView.goToUpdateB(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getUpdateAmenitySelectFrame().setVisible(true);
                aView.getAmenityFrame().dispose();
            }
        });

        this.aView.addAmenityBackButtonB(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getAmenityFrame().setVisible(true);
                aView.getAddAmenityFrame().dispose();
            }
        });

        this.aView.addAmenityB(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        this.aView.deleteAmenityBackB(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getAmenityFrame().setVisible(true);
                aView.getDeleteAmenityFrame().dispose();
            }
        });

        this.aView.deleteAmenityButtonB(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //
            }
        });

        this.aView.amenityReadBackB(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getAmenityFrame().setVisible(true);
                aView.getReadAmenityFrame().dispose();
            }
        });

        this.aView.updateAmenityBackB(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getAmenityFrame().setVisible(true);
                aView.getUpdateAmenitySelectFrame().dispose();
            }
        });

        this.aView.updateAmenityButtonB(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getUpdateAmenityFrame().setVisible(true);
                aView.getUpdateAmenitySelectFrame().dispose();
            }
        });

        this.aView.updateAmenityBackButtonB(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aView.getUpdateAmenitySelectFrame().setVisible(true);
                aView.getUpdateAmenityFrame().dispose();
            }
        });

        this.aView.updateAmenity2B(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //
            }
        });
    }

    public void main(String[] args){

    }
}
