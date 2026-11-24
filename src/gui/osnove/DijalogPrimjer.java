package gui.osnove;

import javax.swing.JOptionPane;

public class DijalogPrimjer {
	public static void main(String[] args) {
		String ime = JOptionPane.showInputDialog(
				null,
				"Unesite ime:"
		);

		JOptionPane.showMessageDialog(
				null,
				"Zdravo " + ime
		);
	}
}
