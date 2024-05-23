module com.example.exerciciocontrois1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciocontrois1 to javafx.fxml;
    exports com.example.exerciciocontrois1;
}