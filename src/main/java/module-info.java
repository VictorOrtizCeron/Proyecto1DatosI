module com.example.proyecto1datosi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyecto1datosi to javafx.fxml;
    exports com.example.proyecto1datosi;
}