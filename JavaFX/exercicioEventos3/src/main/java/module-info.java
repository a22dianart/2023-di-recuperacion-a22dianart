module com.example.exercicioeventos3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicioeventos3 to javafx.fxml;
    exports com.example.exercicioeventos3;
}