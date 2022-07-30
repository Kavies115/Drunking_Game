module com.king {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.king to javafx.fxml;
    exports com.king;
    exports com.king.controllers;
    opens com.king.controllers to javafx.fxml;
}
