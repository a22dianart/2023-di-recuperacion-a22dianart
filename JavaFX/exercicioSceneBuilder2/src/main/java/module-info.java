module com.example.exercicioscenebuilder2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicioscenebuilder2 to javafx.fxml;
    exports com.example.exercicioscenebuilder2;

    opens com.example.exercicioscenebuilder2.model to javafx.base;
}