module com.example.exerciciocontrois8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciocontrois8 to javafx.fxml;
    exports com.example.exerciciocontrois8;
}