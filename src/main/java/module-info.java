module es.ieslosmontecillos.ejemploanonymousinnerclass {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.ejemploanonymousinnerclass to javafx.fxml;
    exports es.ieslosmontecillos.ejemploanonymousinnerclass;
}