package com.gui;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Lesson51 extends Application {
    Label label = new Label();
    Button ok = new Button("确定"),
           cancel = new Button("取消");
    @Override
    public void start(Stage stage) {
        
    	ButtonHandler handler = new ButtonHandler();
    	ok.setOnAction(handler);
    	cancel.setOnAction(handler);
	    FlowPane rootNode = new FlowPane(10,10);
		rootNode.setAlignment(Pos.CENTER); 
		rootNode.getChildren().addAll(ok, cancel, label);
        Scene scene = new Scene(rootNode, 240, 100);
        stage.setTitle("事件处理示例");
        stage.setScene(scene);
        stage.show();
   }
    private class ButtonHandler implements EventHandler<ActionEvent>
    {
    	public void handle(ActionEvent e)
    	{
    		if((Button)(e.getSource())==ok)
    			{
    			label.setText("你单击了'确定'按钮");
    				}
    			else if((Button)(e.getSource())==cancel)
    			{
    				label.setText("你单击了'取消'按钮");
    			}
    	}
    }
   
   
   public static void main(String[] args) {
	      launch(args);
   }
}