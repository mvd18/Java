module io.github.mvd18.task11b {
    requires javafx.controls;
    requires javafx.fxml;



    opens io.github.mvd18.task11b to javafx.fxml;
    exports io.github.mvd18.task11b;
}