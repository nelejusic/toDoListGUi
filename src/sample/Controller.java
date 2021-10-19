package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        datePicker.setValue(LocalDate.now());
    }
    @FXML
    Button addButton;
    Button deleteButton;
    @FXML
    TextField taskNameField;
    @FXML
    TextArea taskDescriptionField;
    @FXML
    DatePicker datePicker;
    @FXML
    ListView<Event> taskList;
    ObservableList<Event>list = FXCollections.observableArrayList();


    @FXML


    public void addEvent(ActionEvent actionEvent) {

        list.add(new Event(datePicker.getValue(),taskNameField.getText(), taskDescriptionField.getText()));
        taskList.setItems(list);

    }

    @FXML
    public void deleteEvent(ActionEvent deleteEvent){

        taskList.getItems().remove(
                taskList.getSelectionModel().getSelectedItem()
        );
    }
}
