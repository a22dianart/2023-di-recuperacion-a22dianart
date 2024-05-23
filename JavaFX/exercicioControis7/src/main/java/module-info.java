module com.example.exerciciocontrois7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciocontrois7 to javafx.fxml;
    exports com.example.exerciciocontrois7;
}