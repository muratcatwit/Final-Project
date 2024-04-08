package javafcex;

import javafx.animation.RotateTransition;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RPSPLAYERSUPERCLASS extends RPSCLASS {
	
	public RPSPLAYERSUPERCLASS(String name) {
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
			wp++;
			t.setEditable(true);
			if(wp==2) {
				l.setText(hey.getText()+" wins it all!"); 
				 b.setDisable(true);
				 t.setEditable(false);
	    	  	 tt.setEditable(false);
	    	  	 rs=1;
			}
			
			return wp;
		}
		
		public static boolean wprange() {
			return wp!=2;
			}
		
		public static String gamesp(String p) {
			return p;
		}
		
		public static boolean decisionplayer(String oo, String p) {
			return gamesp(p).equals(game[0]) && opposite(oo).equals(game[2]) ||gamesp(p).equals(game[1]) && opposite(oo).equals(game[0]) || gamesp(p).equals(game[2]) && opposite(oo).equals(game[1]);
		}
		
		public static boolean decisionplayer2(String oo, String p) {
			return gamesp(p).equals(game[0]) && opposite(oo).equals(game[0]) ||gamesp(p).equals(game[1]) && opposite(oo).equals(game[1]) || gamesp(p).equals(game[2]) && opposite(oo).equals(game[2]);
		}
		
		public static String opposite(String o) {
			return o;
		}
		@Override
		public int winpoints() {
			// TODO Auto-generated method stub
			return 0;
		}
}
