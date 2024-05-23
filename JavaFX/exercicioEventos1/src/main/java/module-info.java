module com.example.exercicioeventos1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicioeventos1 to javafx.fxml;
    exports com.example.exercicioeventos1;
}