module com.example.exerciciopropiedades1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciopropiedades1 to javafx.fxml;
    exports com.example.exerciciopropiedades1;
}