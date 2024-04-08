package javafcex;

import static javafcex.RPSCLASS.rs;

import javafx.animation.RotateTransition;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RSPAISUPERCLASS extends RPSCLASS {
	
		public RSPAISUPERCLASS(String name) {
		super(name);
	}
		
		public String gamestuff() {
			return game[0];
			}
		public String gamestuff2() {
			return game[1];
			}
		public String gamestuff3() {
			return game[2];
			}
		
		public int winpoints(Label l, TextField hey, Button b,TextField t, TextField tt) {
			wa++;
			t.setEditable(true);
			if(wa==2) {
				l.setText(hey.getText()+" wins it all!"); 
				 b.setDisable(true);
				 t.setEditable(false);
	    	  	 tt.setEditable(false);
	    	  	 rs=1;
			}
			return wa;
			}	
		
		public static boolean warange() {
			return wa!=2;
			}	
		
		public static String gamess() {
			String l=game[(int) Math.floor(Math.random() * game.length)];
			return l;
		}

		@Override
		public int winpoints() {
			// TODO Auto-generated method stub
			return 0;
		}
}
