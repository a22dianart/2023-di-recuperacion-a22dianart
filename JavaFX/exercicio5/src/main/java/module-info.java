module com.example.exercicio5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicio5 to javafx.fxml;
    exports com.example.exercicio5;
}