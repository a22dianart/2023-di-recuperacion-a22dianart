module com.example.exerciciocontrois5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciocontrois5 to javafx.fxml;
    exports com.example.exerciciocontrois5;
}