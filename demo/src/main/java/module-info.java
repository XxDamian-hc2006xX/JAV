module com.damian.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.damian.demo to javafx.fxml;
    exports com.damian.demo;
}