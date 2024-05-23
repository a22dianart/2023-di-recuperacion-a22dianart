module com.example.exerciciocontrois10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciocontrois10 to javafx.fxml;
    exports com.example.exerciciocontrois10;
}