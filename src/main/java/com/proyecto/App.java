package com.proyecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        /*var layout = new VBox();
        layout.setSpacing(15);
        layout.setAlignment(Pos.CENTER);

        var lblName = new Label();
        lblName.setText("Nombre");
        var inputName = new TextField();

        var lblEmail = new Label();
        lblEmail.setText("Correo");
        var inputEmail = new TextField();

        var lblPhone = new Label();
        lblPhone.setText("Phone");
        var inputPhone = new TextField();

        var lblPassword = new Label();
        lblPassword.setText("Contraseña");
        var inputPassword = new TextField();

        var lblPassword2 = new Label();
        lblPassword2.setText("Contraseña");
        var inputPassword2 = new TextField();

        var btnSave = new Button("Aceptar");

        btnSave.setOnAction(e ->{
            btnSave.setDisable(true);
            var notif = new Alert(Alert.AlertType.ERROR);
            String name = inputName.getText().toLowerCase().trim();
            String validate = "^[a-z]+$";

            if (name.length() < 3 || name.length() > 25 || !name.matches(validate)){
                notif.setTitle("Nombre no válido");
                notif.setContentText("El nombre de usuario no cumple con la longitud (Menos de 25 caracteres y mayor a 3) sin espacios");
                notif.showAndWait();
                btnSave.setDisable(false);
                return;
            }

            String password = inputPassword.getText();
            String password2 = inputPassword2.getText();
        });

        layout.getChildren().addAll(lblName, inputName, lblEmail, inputEmail, lblPhone, inputPhone, lblPassword, inputPassword, lblPassword2, inputPassword2, btnSave);
        layout.setSpacing(20);*/
        var loader = new FXMLLoader(getClass().getResource("/pages/Login.fxml"));
        Parent root = loader.load();
        var scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}