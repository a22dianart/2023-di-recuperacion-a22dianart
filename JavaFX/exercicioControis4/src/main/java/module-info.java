module com.example.exerciciocontrois4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciocontrois4 to javafx.fxml;
    exports com.example.exerciciocontrois4;
}