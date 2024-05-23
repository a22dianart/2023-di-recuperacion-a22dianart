module com.example.exercicioalert {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicioalert to javafx.fxml;
    exports com.example.exercicioalert;
}