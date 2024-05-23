module com.example.exerciciocontactos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciocontactos to javafx.fxml;
    exports com.example.exerciciocontactos;

    opens com.example.exerciciocontactos.datamodel to javafx.base;
}