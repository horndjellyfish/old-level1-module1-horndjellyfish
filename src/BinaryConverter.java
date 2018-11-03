import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField answer = new JTextField(8);
	JButton button = new JButton();

	public static void main(String[] args) {
		BinaryConverter binary = new BinaryConverter();
		binary.createUI();
	}

	private void createUI() {
		frame.setVisible(true);
		frame.setSize(550, 100);
		frame.add(panel);
		frame.setTitle("Convert 8 bits of binary to ASCII");
		answer.setSize(350, 22);
		answer.setLocation(50, 25);
		panel.add(answer);
		frame.add(panel);
		panel.add(label);
		button.addActionListener(this);
		button.setText("Convert");
		button.setSize(70, 20);
		button.setLocation(405, 26);
		panel.add(button);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	public void actionPerformed(ActionEvent e) {
		String outp = answer.getText();
		String out = convert(outp);
		label.setText(out);
		panel.add(label);
	}

}