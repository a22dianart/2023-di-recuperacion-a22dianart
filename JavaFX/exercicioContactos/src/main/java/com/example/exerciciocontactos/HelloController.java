package com.example.exerciciocontactos;

import com.example.exerciciocontactos.datamodel.Contact;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class HelloController {


    @FXML
    private MenuBar menuBar;
    @FXML
    private Menu contactsMenu;
    @FXML
    private MenuItem engadirItem;
    @FXML
    private MenuItem borrarItem;
    @FXML
    private TableView tabla;
    @FXML
    private MenuItem editarItem;

    public void initialize(){

        TableColumn<Contact, String> nomeColumn = new TableColumn<>("Nome");
        nomeColumn.setCellValueFactory(new PropertyValueFactory<>("nome"));

        TableColumn<Contact, String> apelidosColumn = new TableColumn<>("Apelidos");
        apelidosColumn.setCellValueFactory(new PropertyValueFactory<>("apelidos"));

        TableColumn<Contact, String> telefonoColumn = new TableColumn<>("Teléfono");
        telefonoColumn.setCellValueFactory(new PropertyValueFactory<>("telefono"));

        TableColumn<Contact, String> notasColumn = new TableColumn<>("Notas");
        notasColumn.setCellValueFactory(new PropertyValueFactory<>("notas"));

        tabla.getColumns().add(nomeColumn);
        tabla.getColumns().add(apelidosColumn);
        tabla.getColumns().add(telefonoColumn);
        tabla.getColumns().add(notasColumn);

        final ObservableList<Contact> data = FXCollections.observableArrayList(
                new Contact("Jacob", "Smith", "9813224545", "algoo"),
                new Contact("María", "Ruiz", "7853934563", "sfkjhf")

        );

        tabla.setItems(data);



    }

    @FXML
    public void onBorrarClick(ActionEvent actionEvent) {
        int indice = tabla.getSelectionModel().getSelectedIndex();
        if (indice==-1){
            Alert alert = new Alert(Alert.AlertType.ERROR, "Selecciona o elemento que queres borrar.");
            alert.showAndWait();

        }else{
            tabla.getItems().remove(indice);
        }
    }

    @FXML
    public void onEditarClick(ActionEvent actionEvent) throws IOException {
        int indice = tabla.getSelectionModel().getSelectedIndex();
        if (indice==-1){
            Alert alert = new Alert(Alert.AlertType.ERROR, "Selecciona o elemento que queres editar.");
            alert.showAndWait();

        }else{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("editarContacto.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Contact contacto = (Contact) tabla.getItems().get(indice);
            Stage stage = new Stage();
            EditarContacto editarContacto = fxmlLoader.getController(); //obter controlador da filla
            editarContacto.setHelloController(this); //pasarlle o controlador do pai
            editarContacto.setStage(stage);
            editarContacto.setContact(contacto);



            stage.initOwner(tabla.getScene().getWindow()); //owner da nova ventá

            stage.setTitle("Editar contacto");
            stage.setScene(scene);
            stage.show();
        }



    }

    @FXML
    public void onEngadirClick(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ventaNovoContacto.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Stage stage = new Stage();
        VentaNovoContacto ventaController = fxmlLoader.getController(); //obter controlador da filla
        ventaController.setHelloController(this); //pasarlle o controlador do pai
        ventaController.setStage(stage);


        stage.initOwner(tabla.getScene().getWindow()); //owner da nova ventá

        stage.setTitle("My contacts");
        stage.setScene(scene);
        stage.show();

    }

    public void crearContacto(String nome, String apelidos, String telefono, String notas){
        tabla.getItems().add(new Contact(nome,apelidos,telefono,notas));
    }
    public void modificarContacto(String nome, String apelidos, String telefono, String notas){
        int indice = tabla.getSelectionModel().getSelectedIndex();
        Contact contact = (Contact) tabla.getItems().get(indice);
        contact.setNome(nome);
        contact.setApelidos(apelidos);
        contact.setTelefono(telefono);
        contact.setNotas(notas);

        tabla.getItems().set(indice,contact);

    }
}