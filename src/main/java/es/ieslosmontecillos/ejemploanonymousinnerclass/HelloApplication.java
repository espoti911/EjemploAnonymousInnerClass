package es.ieslosmontecillos.ejemploanonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)
    {
        //Creamos y configuramos la caja donde se encontraran los botones
        HBox root = new HBox();

        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);

        //Creamos y añadimos los botones
        root.getChildren().addAll(
                crearBotonTest("new"),
                crearBotonTest("open"),
                crearBotonTest("save"),
                crearBotonTest("print"));

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Ejemplo anonymous inner class");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Este metodo crea un boton con el nombre indicado,
     * el cual al ser clicado mostrara por consola "Se pulso el boton" + su nombre
     * @param nombre texto que se mostrara en el boton
     * @return El objeto boton creado
     */
    private Button crearBotonTest(String nombre) {
        Button button = new Button(nombre);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se pulso el boton " + nombre);
            }
        });
        return button;
    }

    public static void main(String[] args) {
        launch();
    }
}