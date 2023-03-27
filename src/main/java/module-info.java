module com.example.pacificwarbattleship {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pacificwarbattleship to javafx.fxml;
    exports com.example.pacificwarbattleship;
}