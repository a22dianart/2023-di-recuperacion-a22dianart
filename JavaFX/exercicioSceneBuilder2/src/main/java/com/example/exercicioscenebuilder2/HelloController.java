package com.example.exercicioscenebuilder2;

import com.example.exercicioscenebuilder2.model.Direccion;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

    @FXML
    private Label enderezoLbl;
    @FXML
    private Button botonNovo;
    @FXML
    private Label cidadeLbl;
    @FXML
    private Button botonEditar;
    @FXML
    private Label codigoLbl;
    @FXML
    private Label dataLbl;
    @FXML
    private TableView tabla;
    @FXML
    private Label nomeLbl;
    @FXML
    private Button botonBorrar;
    @FXML
    private Label apelidosLbl;

   public void initialize(){

       TableColumn<Direccion, String> column1 = new TableColumn<>("Nome");
       column1.setCellValueFactory(new PropertyValueFactory<>("nome"));
       TableColumn<Direccion, String> column2 = new TableColumn<>("Apelidos");
       column2.setCellValueFactory(new PropertyValueFactory<>("apelidos"));
       tabla.getColumns().add(column1);
       tabla.getColumns().add(column2);

       final ObservableList<Direccion> data = FXCollections.observableArrayList(
               new Direccion("Diana", "Ramos", "romero donallo", "santiago", "15706", "27/12"),
               new Direccion("Alba", "Dominguez", "av. ferrol", "santiago", "15706", "27/12")
       );



       tabla.setItems(data);
       System.out.println("olaa");

       tabla.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
           @Override
           public void changed(ObservableValue observableValue, Object o, Object t1) {
               Direccion direccion = (Direccion) t1;
               nomeLbl.setText("Nome: "+direccion.getNome());
               apelidosLbl.setText("Apelidos: "+direccion.getApelidos());
               enderezoLbl.setText("Enderezo: "+direccion.getEnderezo());
               cidadeLbl.setText("Cidade: "+direccion.getCidade());
               codigoLbl.setText("Codigo postal: "+direccion.getCodPostal());
               dataLbl.setText("Data de nacemento: "+direccion.getDataNac());

           }
       });


   }
}