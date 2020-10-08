package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleBorder {

    @FXML
    private TextField prihlasovacieMeno;
    @FXML
    private Button ok;
    @FXML
    private Button cancel;

    public void onActionHandler(ActionEvent event) {
        //System.out.println("Hello world " + prihlasovacieMeno.getText());
        //System.out.println(event.getSource());
        if (event.getSource().equals(ok)) {
        System.out.println("Hello world");

        ok.setDisable(true);

    }else if (event.getSource().equals(cancel)){
            System.out.println("Bye world");

            ok.setDisable(false);
        }
    }

    public  void onKeyReleased(){
        String text= prihlasovacieMeno.getText() ;
        if(text.isEmpty()){
            ok.setDisable(true);
        }
    }
}
