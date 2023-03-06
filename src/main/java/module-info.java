module l_lau_u.calculator_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens l_lau_u.calculator_javafx to javafx.fxml;
    opens l_lau_u.calculator_javafx.forms_controllers to javafx.fxml;
    exports l_lau_u.calculator_javafx;
    exports l_lau_u.calculator_javafx.forms_controllers to javafx.fxml;
}
