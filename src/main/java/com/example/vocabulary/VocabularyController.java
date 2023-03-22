package com.example.vocabulary;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.Collections;

public class VocabularyController {
    @FXML
    public Button addTextButton;
    @FXML
    public Button deleteTextButton;
    @FXML
    public TextField inputTextField;
    @FXML
    public ListView listView = new ListView();
    public ArrayList<String> words = new ArrayList<>();

    public void addTextButton(ActionEvent actionEvent) {
        words.add(inputTextField.getText());
        listView.getItems().add(words.get(words.indexOf(inputTextField.getText())));
        inputTextField.clear();
    }

    public void deleteTextButton(ActionEvent event) {
        int selectedWordID = listView.getSelectionModel().getSelectedIndex();
        listView.getItems().remove(selectedWordID);
    }

}
