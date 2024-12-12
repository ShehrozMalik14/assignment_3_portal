package com.example.portal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.util.EventObject;

public class teacherLoginController {
    @FXML
    TextField textField;
    @FXML
    PasswordField passField;
    @FXML
    AnchorPane teacherLoginpane ;
    File file = new File("TeacherLoginUserPass.txt");
    public void signIn(ActionEvent event) throws IOException {
//System.out.println(file.getAbsolutePath());
        if(file.exists()){
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ( (line = br.readLine()) != null){
                String [] userPass = line.split(" ");
                if(userPass[0].equals(textField.getText()) && userPass[1].equals(passField.getText())){

                    teacherLoginpane.setVisible(false);

                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/teacherValidLogin.fxml"));
                    Parent root = fxmlLoader.load();
                    Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
            }

        }
        else{
            System.out.println("File does not exist");
            System.out.println(file.getAbsolutePath());
        }
    }
    public void backBtn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("landingPage.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

}