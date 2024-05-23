module com.example.exerciciofxml1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciofxml1 to javafx.fxml;
    exports com.example.exerciciofxml1;
}