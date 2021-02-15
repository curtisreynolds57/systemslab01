package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Lab 04 Solution");

        GridPane myGrid = new GridPane();

        myGrid.setHgap(10);
        myGrid.setVgap(10);
        myGrid.setPadding(new Insets(10,10,10,10));

        // All of the necessary labels
        Label lbUsername = new Label("Username:");
        Label lbPassword = new Label("Password:");
        Label lbFullName = new Label("Full Name:");
        Label lbEmail = new Label("E-Mail:");
        Label lbPhone = new Label("Phone #:");
        Label lbDoB = new Label("Date of Birth:");

        //-Adding text fields to grid
        // Username
        TextField txUserName = new TextField();
        myGrid.add(lbUsername, 0, 1);
        myGrid.add(txUserName, 1, 1);

        // Password
        PasswordField passwordField = new PasswordField();
        myGrid.add(lbPassword, 0, 2);
        myGrid.add(passwordField, 1, 2);

        // Full Name
        TextField txFullName = new TextField();
        myGrid.add(lbFullName, 0, 3);
        myGrid.add(txFullName, 1, 3);

        // E-mail
        TextField txEmail = new TextField();
        myGrid.add(lbEmail, 0, 4);
        myGrid.add(txEmail, 1, 4);

        // Phone #
        TextField txPhone = new TextField();
        myGrid.add(lbPhone, 0, 5);
        myGrid.add(txPhone, 1, 5);

        // Date of Birth
        DatePicker dtDate = new DatePicker();
        myGrid.add(lbDoB, 0, 6);
        myGrid.add(dtDate, 1, 6);

        // Register
        Button register = new Button();
        register.setText("Register");
        register.setOnAction(value -> {
            System.out.println("User Name: " + txUserName.getText());
            System.out.println("Password: " + passwordField.getText());
            System.out.println("Full Name: " + txFullName.getText());
            System.out.println("E-Mail: " + txEmail.getText());
            System.out.println("Phone #: " + txPhone.getText());
        });
        myGrid.add(register, 1,7);

        Scene myScene = new Scene(myGrid, 300, 275);
        primaryStage.setScene((myScene));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
