module com.example.ptutbdd {
    requires javafx.controls;
    requires javafx.fxml;


    opens ptut.ptutbdd to javafx.fxml;
    exports ptut.ptutbdd;
}