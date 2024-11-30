module com.example.aslkjaoibacjk {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.aslkjaoibacjk to javafx.fxml;
    exports com.example.aslkjaoibacjk;
}