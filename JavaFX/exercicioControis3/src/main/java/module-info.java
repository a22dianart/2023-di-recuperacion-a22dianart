module com.example.exerciciocontrois3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciocontrois3 to javafx.fxml;
    exports com.example.exerciciocontrois3;
}