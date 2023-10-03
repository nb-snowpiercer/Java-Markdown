package com.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Lesson55 extends Application {

	private Scene scene1;
	private Stage stage1;
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane bpane = new BorderPane();
		bpane.setPadding(new Insets(10,10,10,10));
		Label luser = new Label("用户名");
		Label lpass = new Label("密码");
		Label message = new Label("              ");
		TextField tuser = new TextField();
		PasswordField tpass = new PasswordField();
		tuser.setPrefSize(20, 10);
		tpass.setPrefSize(20, 10);
		CheckBox cb1 = new CheckBox("保存用户信息");
		Button blogin = new Button("登录");
		Button bcancel = new Button("取消");
		VBox vbox1 = new VBox();
		VBox vbox2 = new VBox();
		HBox hbox1 = new HBox();
		vbox1.setSpacing(10);
		vbox1.setPadding(new Insets(10,10,10,10));
		vbox1.setAlignment(Pos.CENTER);
		vbox2.setSpacing(10);
		vbox2.setPadding(new Insets(10,10,10,10));
		vbox2.setAlignment(Pos.CENTER);
		hbox1.setSpacing(10);
		hbox1.setAlignment(Pos.CENTER);
		vbox1.getChildren().add(luser);
		vbox1.getChildren().add(lpass);
		bpane.setLeft(vbox1);
		vbox2.getChildren().add(tuser);
		vbox2.getChildren().add(tpass);
		bpane.setCenter(vbox2);
		hbox1.getChildren().add(cb1);
		hbox1.getChildren().add(message);
		hbox1.getChildren().add(blogin);
		hbox1.getChildren().add(bcancel);
		bpane.setBottom(hbox1);
		Scene scene1 = new Scene(bpane,300,200,Color.RED);
		stage.setTitle("登录界面");
		stage.setFullScreen(false);
		stage.setScene(scene1);
		stage.show();
		
		
		blogin.setOnAction((e)->
		{
			if(tuser.getText().equals("nbut") && tpass.getText().equals("123456"))
			{
				stage.close();
				Stage sstage = new Stage();
				FlowPane pane2 = new FlowPane();
				Label lab2 = new Label("Second Pane");
				pane2.getChildren().add(lab2);
				Scene scene2 = new Scene(pane2,300,200);
				sstage.setScene(scene2);
				sstage.setTitle("Scenod Stage");
				sstage.show();
			}
			else
			{
				tuser.setText("");
				tpass.setText(STYLESHEET_CASPIAN);
			}
		
		}
		);
	
	}
	
	public static void main(String[] args)
	{
		launch(args);
		
	}


}



