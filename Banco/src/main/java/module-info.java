module com.example.banco {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.banco to javafx.fxml;
    exports com.example.banco;
}