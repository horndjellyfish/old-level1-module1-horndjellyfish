import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String []args) {
		String flavor = JOptionPane.showInputDialog("What flavor of popcorn would you like?");
		String minutes1 = JOptionPane.showInputDialog("How many minutes should the popcorn be in the microwave?");
		int minutes = Integer.parseInt(minutes1);
		Microwave microwave = new Microwave();
		Popcorn popcorn = new Popcorn(flavor);
		microwave.putInMicrowave(popcorn);
		microwave.setTime(minutes);
		microwave.startMicrowave();
		
		
	}
}
