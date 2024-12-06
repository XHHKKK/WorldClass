module org.example.worldclass {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.worldclass to javafx.fxml;
    exports org.example.worldclass;
}