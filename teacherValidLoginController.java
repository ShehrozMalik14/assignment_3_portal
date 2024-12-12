package com.example.portal;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class teacherValidLoginController {

    //all anchor pane
    @FXML
    AnchorPane dashboardpane, defaultpane, profilepane,attendancepane,coursespane,borderPane;
    //hboxes inside defaultpane right side buttons
    @FXML
    HBox generalbox, dashboardbox, attendancebox, marksbox, coursesbox, profilebox;
    //vboxes inside dashboard pane
    @FXML
    VBox coursebox, salarybox, salarystatusbox, dashboardTbox;
    //labels inside dashboardpane
    @FXML
    Label courseslabel, salarylabel, salarySlabel, noofcourseslabel, totalsalarylabel, salarystatuslabel, dashboardTlabel;
    //hboxes inside profile pane
    @FXML
    HBox detailbox, namebox, nameSbox, fatherbox, fatherSbox, empidbox, empidSbox, phonebox, phoneSbox, cnicbox, cnicSbox, birthbox, birthSbox, joiningbox, joiningSbox, qualifibox, qualifiSbox;
    //labels inside profile pane
    @FXML
    Label detaillabel, namelabel, nameSlabel, fatherlabel, fatherSlable, empidlabel, empidSlabel, phonelabel, phoneSlabel, cniclabel, cnicSlabel, birthlabel, birthSlabel, joininglabel, joiningSlabel, qualifilabel, qualifiSlabel, profileTlabel;
    //vboxes in profile pane
    @FXML
    VBox profileTbox;


    List<AnchorPane> panes = new ArrayList<>();
    List<HBox> hboxes = new ArrayList<>();
    List<VBox> vboxes = new ArrayList<>();
    List<Label> labels = new ArrayList<>();


    public void initialize() {
        panes.add(dashboardpane);
        panes.add(defaultpane);
        panes.add(profilepane);
        panes.add(attendancepane);
        panes.add(coursespane);

        hboxes.add(generalbox);
        hboxes.add(dashboardbox);
        hboxes.add(attendancebox);
        hboxes.add(marksbox);
        hboxes.add(profilebox);
        hboxes.add(coursesbox);

        vboxes.add(coursebox);
        vboxes.add(salarybox);
        vboxes.add(salarystatusbox);
        vboxes.add(dashboardTbox);

        labels.add(courseslabel);
        labels.add(salarylabel);
        labels.add(salarySlabel);
        labels.add(noofcourseslabel);
        labels.add(totalsalarylabel);
        labels.add(salarystatuslabel);
        setAllFalse();
        defaultpane.setVisible(true);

    }


    public void setAllFalse() {
        panes.forEach((pane) -> {
            pane.setVisible(false);
            defaultpane.setVisible(true);
        });
    }

    public void dashboard(MouseEvent event) throws IOException {
        setAllFalse();
       // defaultpane.setVisible(true);
        dashboardpane.setVisible(true);
    }

    public void profile(MouseEvent event) throws IOException {
        setAllFalse();
       // defaultpane.setVisible(true);
        profilepane.setVisible(true);
    }

    public void attendance(MouseEvent event){
        setAllFalse();
        attendancepane.setVisible(true);

    }
    public void courses(MouseEvent event){
        setAllFalse();
        coursespane.setVisible(true);
    }
    public void logout(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("teacherLogin.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage)borderPane.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}

