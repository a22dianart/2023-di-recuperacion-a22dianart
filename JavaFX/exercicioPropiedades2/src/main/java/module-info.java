module com.example.exerciciopropiedades2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciopropiedades2 to javafx.fxml;
    exports com.example.exerciciopropiedades2;
}