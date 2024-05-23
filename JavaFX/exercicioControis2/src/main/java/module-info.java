module com.example.exerciciocontrois2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciocontrois2 to javafx.fxml;
    exports com.example.exerciciocontrois2;
}