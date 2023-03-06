module l_lau_u.calculator_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens l_lau_u.calculator_javafx to javafx.fxml;
    exports l_lau_u.calculator_javafx;
}
