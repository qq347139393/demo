package com.example.demo.controller;

import de.felixroske.jfxsupport.FXMLController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @author NLER
 * @date 2022/12/6 22:43
 */
@FXMLController
public class HelloController implements Initializable {


    @FXML
    private TableView tableView;

    @FXML
    private TableColumn idCol;

    @FXML
    private TableColumn userNameCol;

    @FXML
    private TextField idTextField;

    @FXML
    private Button addButton;

    @FXML
    private Button delButton;

    @FXML
    private TextField userNameField;

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

    
}
