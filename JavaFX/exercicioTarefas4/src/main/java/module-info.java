module com.mycompany.todolist.exerciciotarefas4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mycompany.todolist to javafx.fxml;
    exports com.mycompany.todolist;
}