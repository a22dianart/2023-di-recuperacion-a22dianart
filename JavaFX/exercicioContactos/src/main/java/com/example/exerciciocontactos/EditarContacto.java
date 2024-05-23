package com.example.exerciciocontactos;

import com.example.exerciciocontactos.datamodel.Contact;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditarContacto
{
    @javafx.fxml.FXML
    private TextField nomeTxt;
    @javafx.fxml.FXML
    private TextField apelidosTxt;
    @javafx.fxml.FXML
    private TextField notasTxt;
    @javafx.fxml.FXML
    private TextField telefonoTxt;
    @javafx.fxml.FXML
    private Button boton;

    private HelloController helloController;
    private Stage stage;

    private Contact contact;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void onBotonClick(ActionEvent actionEvent) {
        helloController.modificarContacto(nomeTxt.getText(), apelidosTxt.getText(), telefonoTxt.getText(), notasTxt.getText());
        stage.close();
    }

    public void setHelloController(HelloController helloController) {
        this.helloController = helloController;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setContact(Contact contact){
        this.contact= contact;

        nomeTxt.setText(contact.getNome());
        apelidosTxt.setText(contact.getApelidos());
        telefonoTxt.setText(contact.getTelefono());
        notasTxt.setText(contact.getNotas());
    }

}