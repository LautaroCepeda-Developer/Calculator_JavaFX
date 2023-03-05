module l_lau_u.calculator_javafx {
    
    requires javafx.controls;
    requires java.base;
    requires javafx.fxml;
    requires com.gluonhq.charm.glisten;
    requires com.gluonhq.attach.display;
    requires com.gluonhq.attach.lifecycle;
    requires com.gluonhq.attach.statusbar;
    requires com.gluonhq.attach.storage;
    requires com.gluonhq.attach.util;
    
    opens l_lau_u.calculator_javafx to javafx.fxml;
    opens l_lau_u.calculator_javafx.forms to javafx.fxml;
    exports l_lau_u.calculator_javafx;
    exports l_lau_u.calculator_javafx.forms to javafx.fxml;
}
