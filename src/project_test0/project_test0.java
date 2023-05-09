package project_test0;

import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.TextArea;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class project_test0 extends Application{
	
	
	
	@Override
	public void start(Stage primaryStage) {
		ScrollPane sp = new ScrollPane();
		
		// color
		sp.setBackground(Color.PINK);
		
		// string list
		String[] heroList = {"hippo", "lion", "tiger"};
		
		// create ObersableList
		ObservableList<String> ob = FXCollections.observableArrayList(heroList);
		
		
		//sp.setFont();
		
		
	}
	  
	public static void main(String args[]) {
		launch(args);
	}
}


