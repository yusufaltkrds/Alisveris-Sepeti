module org.example.alisverissepeti {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.alisverissepeti to javafx.fxml;
    exports org.example.alisverissepeti;
}