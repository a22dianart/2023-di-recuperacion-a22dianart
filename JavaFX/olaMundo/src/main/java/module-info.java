module com.example.olamundo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.olamundo to javafx.fxml;
    exports com.example.olamundo;
}