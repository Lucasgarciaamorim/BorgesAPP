package com.borgesapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BorgesAppApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BorgesAppApplication.class.getResource("BorgesApp-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.setTitle("Envio de Nota Fiscal ");
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(e -> {
            if (BorgesAppController.onCloseQuery()) {
                System.exit(0);
            } else {
                e.consume();
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}