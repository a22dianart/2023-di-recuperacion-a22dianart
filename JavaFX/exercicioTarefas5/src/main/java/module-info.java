module com.mycompany.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mycompany.todolist to javafx.fxml;
    exports com.mycompany.todolist;
}