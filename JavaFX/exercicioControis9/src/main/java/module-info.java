module com.example.exerciciocontrois9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciocontrois9 to javafx.fxml;
    exports com.example.exerciciocontrois9;
}