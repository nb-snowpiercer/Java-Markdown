package code14;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Lesson49 extends Application {
   @Override
   public void start(Stage myStage) {
      myStage.setTitle("����Բ��");
      Group rootNode = new Group();  
      Scene scene = new Scene(rootNode, 300, 130, Color.WHITE);
       // ������Բ
      Ellipse ellipse = new Ellipse( 110,80, 80, 40); 
      ellipse.setStrokeWidth(3);
      ellipse.setStroke(Color.BLUE);
      ellipse.setFill(Color.WHITE);


      rootNode.getChildren().add(ellipse);
      myStage.setScene(scene);
      myStage.show();
    }
   public static void main(String[] args) {
       launch(args);
   }
}

