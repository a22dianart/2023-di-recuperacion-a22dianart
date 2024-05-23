module com.example.exercicio1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicio1 to javafx.fxml;
    exports com.example.exercicio1;
}