module io.github.mvd18.figure {
    requires javafx.controls;
    requires javafx.fxml;

    requires io.github.mvd18.task11b;


    opens io.github.mvd18.figure to javafx.fxml;
    exports io.github.mvd18.figure;
}