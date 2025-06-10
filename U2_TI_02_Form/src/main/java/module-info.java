module com.damian.form.u2_ti_02_form {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.damian.form.u2_ti_02_form to javafx.fxml;
    exports com.damian.form.u2_ti_02_form;
}