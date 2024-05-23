module com.example.exercicio2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicio2 to javafx.fxml;
    exports com.example.exercicio2;
}