package javafcex;

 abstract public class RPSCLASS {
	
	final private String name;
	final public static String[] game={"Rock","Paper","Scissors"};
	final static String[] rounds= {"1","3"};

	static int wa=0;
	static int wp=0;
	protected static int rs=1;
	
	public RPSCLASS(String name) {
	this.name = name;
	}
	
	public String getName() {
	return name;
	}
	
	
	public String[] games() {
		return game;
	}
	
	public static String rounds(int i) {
			if(i==0) {
				return rounds[0];
			}
			else if(i==1) {
				return rounds[1];
			}
			return null;
	}
	
	public String toString() {
	return String.format("%s", getName());
	}
	
	public static int getrounds() {
		return rs;
	}
	
	public static int addrounds() {
		rs++;
		return rs;
	}
	
	public abstract int winpoints();
	public abstract String gamestuff();
	public abstract String gamestuff2();
	public abstract String gamestuff3();
}
