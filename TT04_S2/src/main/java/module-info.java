module com.example.tt04_s2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.tt04_s2 to javafx.fxml;
    exports com.example.tt04_s2;
}