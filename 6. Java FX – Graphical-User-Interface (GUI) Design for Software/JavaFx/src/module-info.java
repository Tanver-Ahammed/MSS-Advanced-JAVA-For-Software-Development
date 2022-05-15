module JavaFx {
    requires javafx.fxml;
    requires javafx.controls;
    requires icons;

    opens layouts.gridpane;
    opens layouts.hbox;
    opens layouts.vbox;
    opens layouts.borderpane;
    opens layouts.flowpane;
    opens layouts.tilepane;
    opens layouts.stackpane;

    opens grapicsicon;
    opens buttonfielddemo;
    opens addcss;

}