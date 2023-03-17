module com.example.handlingevents {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.handlingevents to javafx.fxml;
    exports com.example.handlingevents;
}