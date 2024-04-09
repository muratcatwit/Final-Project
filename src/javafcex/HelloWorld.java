package javafcex;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class HelloWorld extends Application {

	RPSPLAYERSUPERCLASS obj = new RPSPLAYERSUPERCLASS(null); 
    String var = obj.gamestuff();
    String var2 = obj.gamestuff2();
    String var3 = obj.gamestuff3();

     RSPAISUPERCLASS obj2 = new RSPAISUPERCLASS(null); 
     String var4 = obj2.gamestuff();
     String var5 = obj2.gamestuff2();
     String var6 = obj2.gamestuff3();
          
	@Override
	public void start(Stage s) throws Exception {
		
		 Label winner = new Label();
	      winner.setLayoutX(160);
	      winner.setLayoutY(150);
				
		Pane pane=new StackPane();
		s.setWidth(400);
		s.setHeight(400);
		s.setTitle("Rock, Paper, Scissors");
		Button b1 = new Button("Start");
		Button b2 = new Button("Reset");
		Button b3 = new Button("Submit");
		Button b4 = new Button("Back");
	    b2.setLayoutX(180);
	    b2.setLayoutY(300);
	    b3.setLayoutX(222);
	    b3.setLayoutY(25);
	    b4.setLayoutX(180);
	    b4.setLayoutY(330);
	    
	    
	      Group root = new Group(b1);
	      	      
	      Label label = new Label("Rock, Paper, Scissors! Who will win? You or the AI?");
	      label.setFont(Font.font("Times New Roman",18));
	      label.setTranslateY(-30);
	      pane.getChildren().addAll(b1,label);
	      Scene scene = new Scene(pane, 200, 200, Color.BEIGE);
	      
	      GridPane grid = new GridPane();
	      Label userName = new Label("User Name:");
	      grid.add(userName, 0, 1);
	      TextField userTextField = new TextField();
	      grid.add(userTextField, 1, 1);
	      
	      Label ai = new Label("Ai's name: ");
	      grid.add(ai, 0, 2);
	      TextField aiBox = new TextField();
	      grid.add(aiBox, 1, 2);
	      Scene scene2 = new Scene(grid, 300, 275);
	      s.setScene(scene2);
	      
	      Image image=new Image("file:///Users/christlermurat/Downloads/IMG_7741%206.jpg");
	      ImageView imageView=new ImageView(image);
	      
	      imageView.setFitHeight(50);
	      imageView.setFitWidth(50);
	      imageView.setX(50);
	      imageView.setY(150);
	      
	      Image image2=new Image("file:///Users/christlermurat/Downloads/IMG_7741%205.jpg");
	      ImageView imageView2=new ImageView(image2);
	      
	      imageView2.setFitHeight(50);
	      imageView2.setFitWidth(50);
	      imageView2.setX(300);
	      imageView2.setY(150);
	      
	      Image image3=new Image("file:///Users/christlermurat/Downloads/IMG_7741%203.jpg");
	      ImageView imageView3=new ImageView(image3);
	      
	      imageView3.setFitHeight(50);
	      imageView3.setFitWidth(50);
	      imageView3.setX(50);
	      imageView3.setY(150);
	      imageView3.setVisible(false);
	      
	      Image image4=new Image("file:///Users/christlermurat/Downloads/IMG_7741%204.jpg");
	      ImageView imageView4=new ImageView(image4);
	      
	      imageView4.setFitHeight(50);
	      imageView4.setFitWidth(50);
	      imageView4.setX(300);
	      imageView4.setY(150);
	      imageView4.setVisible(false);
	      
	      Image image5=new Image("file:///Users/christlermurat/Downloads/IMG_7741%202.jpg");
	      ImageView imageView5=new ImageView(image5);
	      
	      imageView5.setFitHeight(50);
	      imageView5.setFitWidth(50);
	      imageView5.setX(50);
	      imageView5.setY(150);
	      imageView5.setVisible(false);
	      
	      Image image6=new Image("file:///Users/christlermurat/Downloads/IMG_7741.jpg");
	      ImageView imageView6=new ImageView(image6);
	      
	      imageView6.setFitHeight(50);
	      imageView6.setFitWidth(50);
	      imageView6.setX(300);
	      imageView6.setY(150);
	      imageView6.setVisible(false);
	      
	      
	      Label pt = new Label();
	      pt.setTranslateX(50);
	      pt.setTranslateY(100);
	      Label at = new Label();
	      at.setTranslateX(300);
	      at.setTranslateY(100);
	      
	      userTextField.textProperty().addListener((observable, oldValue, newValue) -> {
	            pt.setText(newValue); 
	        });

	        aiBox.textProperty().addListener((observable, oldValue, newValue) -> {
	            at.setText(newValue); 
	        });
	      
	      
	      GridPane grid2 = new GridPane();
	      Label game = new Label("Choose:");
	      grid2.add(game, 0, 1);
	      TextField gamebox = new TextField();
	      grid2.add(gamebox, 1, 1);
	      
	      Label rounds = new Label("Best out of: ");
	      grid2.add(rounds, 0, 2);
	      TextField rs = new TextField();
	      grid2.add(rs, 1, 2);
	      

	      	     
	      Group root2 = new Group(imageView,imageView2,imageView3,imageView4,imageView5,imageView6,at,pt,grid2,b2,b3,winner,b4);
  	      
	      Scene scene3 = new Scene(root2);
	      	      
	      aiBox.setOnKeyPressed(new EventHandler<KeyEvent>() {
	    	  public void handle(KeyEvent event) {
	    	  if (event.getCode() == KeyCode.ENTER) {
	    		  aiBox.setOnAction(e->{s.setScene(scene3);});
	    	  }
	    	  }
	    	  });
	     
	      b1.setOnAction(event->{s.setScene(scene2);});

	      
	      RotateTransition r=new RotateTransition(Duration.seconds(0.5),imageView);
	      r.setFromAngle(-10);
	      r.setToAngle(0);
	      r.setCycleCount(4);
	      
	      RotateTransition r2=new RotateTransition(Duration.seconds(0.5),imageView2);
	      r2.setFromAngle(10);
	      r2.setToAngle(0);
	      r2.setCycleCount(4);
	      
	      Label game2 = new Label(obj2.gamess());
	      
	      game2.setVisible(false);
	      
	      b2.setOnAction(event->reset(r,r2,imageView,imageView2,imageView3,imageView4,imageView5,imageView6,game2,winner,b3,gamebox,rs));
	      
	      b4.setOnAction(event->back(r,r2,s,scene2,imageView,imageView2,imageView3,imageView4,imageView5,imageView6,game2,winner,b3,gamebox,rs));

	    	 
	    	  
	      b3.setOnAction(event->pressbutton(gamebox,rs,r,r2,imageView,imageView2,imageView3,imageView4,imageView5,imageView6,game2,winner));
	      
	    
	      game2.textProperty().addListener((observable, oldValue, newValue) -> {
	    	  game2.setText(newValue); 
	    	 
	        });
	      
	      gamebox.textProperty().addListener((observable, oldValue, newValue) -> {
	    	  gamebox.setText(newValue); 
	    	  
	        });
	      
	      rs.textProperty().addListener((observable, oldValue, newValue) -> {
	    	  rs.setText(newValue); 
	        });
	      
	     
	      r.setOnFinished(event -> {
	        	  
	        	  String g=gamebox.getText();
	    	      String a=game2.getText();
	    	      winner.setVisible(true);
	        	
	    	      if(gamebox.getText().equals(var)) {
		        	  imageView.setVisible(true);
		        	  imageView3.setVisible(false);
		        	  imageView5.setVisible(false);
		          }
		          else if(gamebox.getText().equals(var2)) {
		        	  imageView.setVisible(false);
		        	  imageView3.setVisible(true);
		        	  imageView5.setVisible(false);
		          }
		          else if(gamebox.getText().equals(var3)) {
		        	  imageView.setVisible(false);
		        	  imageView3.setVisible(false);
		        	  imageView5.setVisible(true);
		          }
		      
		          if(game2.getText()==var4) {
		        	  imageView2.setVisible(true);
		        	  imageView4.setVisible(false);
		        	  imageView6.setVisible(false);
		          }
		          else if(game2.getText()==var5) {
		        	  imageView2.setVisible(false);
		        	  imageView4.setVisible(true);
		        	  imageView6.setVisible(false);
		          }
		          else if(game2.getText()==var6) {
		        	  imageView2.setVisible(false);
		        	  imageView4.setVisible(false);
		        	  imageView6.setVisible(true);
		          }
		          
	    	  if(rs.getText().equals(RPSCLASS.rounds(0))) {
	          
	          
	          if(obj.decisionplayer(a,g)) {
    	    	  winner.setText(userTextField.getText()+" wins"); 
    	    	  b3.setDisable(true);
    	    	  gamebox.setEditable(false);
    	  	      rs.setEditable(false);
          }
          else if(obj.decisionplayer2(a,g)) {
    	    	  winner.setText("It is a tie! Go Again!"); 
    	    	  b3.setOnAction(e->pressbutton(gamebox,rs,r,r2,imageView,imageView2,imageView3,imageView4,imageView5,imageView6,game2,winner));
    	    	  gamebox.setEditable(true);
    	  	      rs.setEditable(false);
    	    	  
          }
          else {
    	    	  winner.setText(aiBox.getText()+" wins"); 
    	    	  b3.setDisable(true);
    	    	  gamebox.setEditable(false);
    	  	      rs.setEditable(false);
          }
	    	  }
	    	  

	    	  if(rs.getText().equals(RPSCLASS.rounds(1))) {
					if(obj2.warange() || obj.wprange()) {
					if(obj.decisionplayer(a,g)) {
						winner.setText(userTextField.getText()+" wins Round "+RPSCLASS.getrounds()); 
						RPSCLASS.addrounds();	
						obj.winpoints(winner,userTextField,b3,gamebox,rs);
						b3.setOnAction(e->pressbutton(gamebox,rs,r,r2,imageView,imageView2,imageView3,imageView4,imageView5,imageView6,game2,winner));
		    	  	    rs.setEditable(false);
					}
					else if(obj.decisionplayer2(a,g)) {
						winner.setText("It is a tie! Go Again!");
						b3.setOnAction(e->pressbutton(gamebox,rs,r,r2,imageView,imageView2,imageView3,imageView4,imageView5,imageView6,game2,winner));
		    	  	    rs.setEditable(false);
					}
					else {
						winner.setText(aiBox.getText()+" wins Round "+RPSCLASS.getrounds()); 
						RPSCLASS.addrounds();
						obj2.winpoints(winner,aiBox,b3,gamebox,rs);
						b3.setOnAction(e->pressbutton(gamebox,rs,r,r2,imageView,imageView2,imageView3,imageView4,imageView5,imageView6,game2,winner));
		    	  	    rs.setEditable(false);
					}
					}
					}
	      });
	      s.setScene(scene);
	      s.show(); 
	}
	
	private void pressbutton(TextField t, TextField tt, RotateTransition r,RotateTransition rr,ImageView i1,ImageView i2,ImageView i3,ImageView i4,ImageView i5,ImageView i6,Label d,Label c) {
		
		d.setText(obj2.gamess());
		
		TextField textField1 = t;
	    TextField textField2 = tt;		   
	   
	    if ((textField1.getText().equals(var) || textField1.getText().equals(var2) || textField1.getText().equals(var3))
	            && (textField2.getText().equals(RPSCLASS.rounds(0)) || textField2.getText().equals(RPSCLASS.rounds(1)))) {
	    	t.setEditable(false);
		    tt.setEditable(false);
		    c.setVisible(false);
	    	i1.setVisible(true);
      	  i3.setVisible(false);
      	  i5.setVisible(false);
      	  i2.setVisible(true);
      	  i4.setVisible(false);
      	  i6.setVisible(false);
	        r.play();
	        rr.play();
	    }
	}
	
	private void reset(RotateTransition r,RotateTransition rr,ImageView i1,ImageView i2,ImageView i3,ImageView i4,ImageView i5,ImageView i6,Label d,Label c,Button b,TextField t, TextField tt) {
		 t.setEditable(true);
		 tt.setEditable(true);
		 t.clear();
		 tt.clear();
		b.setDisable(false);
		c.setVisible(false);
		d.setText(obj2.gamess());
		i1.setVisible(true);
    	  i3.setVisible(false);
    	  i5.setVisible(false);
    	  i2.setVisible(true);
    	  i4.setVisible(false);
    	  i6.setVisible(false);
    	  r.stop();
	      rr.stop();
	      
	}
	
	private void back(RotateTransition r,RotateTransition rr,Stage s,Scene ss,ImageView i1,ImageView i2,ImageView i3,ImageView i4,ImageView i5,ImageView i6,Label d,Label c,Button b,TextField t, TextField tt) {
		s.setScene(ss);
		
		reset(r,rr,i1,i2,i3,i4,i5,i6,d,c,b,t,tt);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
