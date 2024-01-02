package javafx.controller;

import com.sun.deploy.cache.JarSigningData;
import javaf.entity.Student;
import javafx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class CreateController implements Initializable {


    public TextField ipFullName;
    public DatePicker ipDob;
    public TextField ipCarName;
    public TextArea ipAddress;
    public DatePicker ipDateStart;
    public TextField ipDay;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void backToList(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../../javafx/fxml/car/customerinformation.fxml"));

        Main.rootStage.setScene(new Scene(root, 800, 600));
    }

    public void submit(ActionEvent actionEvent) {
        try {
            String fullName = ipFullName.getText();
            String carName = ipCarName.getText();
            LocalDate dob = ipDob.getValue();
            LocalDate dateStart = ipDateStart.getValue();
            String address = ipAddress.getText();
            String day = ipDay.getText();

            backToList(null);
          

        }catch (Exception e){
            showAlert(e.getMessage());

        }



    }
    private void showAlert(String message){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(message);
        alert.show();
    }
}
