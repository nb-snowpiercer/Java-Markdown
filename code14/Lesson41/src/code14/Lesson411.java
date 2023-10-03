package code14;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Lesson411 extends Application {
    @Override 
    public void start(Stage stage) {
       Image image = new Image("images/flower.png");
       ImageView iv1 = new ImageView();
       iv1.setImage(image);
       
       ImageView iv2 = new ImageView();
       iv2.setImage(image);
       iv2.setFitWidth(100);         
       iv2.setPreserveRatio(true);    
       iv2.setSmooth(true);
       iv2.setCache(true);            
       
       ImageView iv3 = new ImageView();
       iv3.setImage(image);
       Rectangle2D viewportRect = new Rectangle2D(40, 35, 110, 110);
       iv3.setViewport(viewportRect);
       iv3.setRotate(90);              
        HBox box = new HBox();        
        box.getChildren().add(iv1);
        box.getChildren().add(iv2);
        box.getChildren().add(iv3);
       // 
        Group root = new Group();
        root.getChildren().add(box);
        Scene scene = new Scene(root);
        scene.setFill(Color.BLACK);
         stage.setTitle("��ʾͼ��");
         stage.setWidth(415);
         stage.setHeight(200);
         stage.setScene(scene); 
         stage.sizeToScene(); 
         stage.show(); 
     }
     public static void main(String[] args) {
         Application.launch(args);
     }
 }

