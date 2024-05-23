module com.example.exerciciopropiedades3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciopropiedades3 to javafx.fxml;
    exports com.example.exerciciopropiedades3;
}