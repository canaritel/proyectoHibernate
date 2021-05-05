package com.televoip.proyecto_hibernate1;

import config.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import org.hibernate.Session;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    Session session;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
        System.out.println("Abrimos la coenxión a Hibernate");
        iniciaHibernate();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void runApp(String[] args) {
        launch(args);
    }

    private void iniciaHibernate() {
        session = HibernateUtil.getCurrentSessionFromConfig();
    }
    
    @Override
    public void stop(){
        session.close();
        System.out.println("Cerramos la conexión a hibernate");
    }

}