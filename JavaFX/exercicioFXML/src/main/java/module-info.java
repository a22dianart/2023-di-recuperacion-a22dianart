module com.example.exerciciofxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciofxml to javafx.fxml;
    exports com.example.exerciciofxml;
}