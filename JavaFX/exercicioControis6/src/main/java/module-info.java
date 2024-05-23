module com.example.exerciciocontrois6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciocontrois6 to javafx.fxml;
    exports com.example.exerciciocontrois6;
}