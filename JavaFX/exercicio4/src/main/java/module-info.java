module com.example.exercicio4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicio4 to javafx.fxml;
    exports com.example.exercicio4;
}