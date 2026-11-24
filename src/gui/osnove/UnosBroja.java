package gui.osnove;

import javax.swing.JOptionPane;

public class UnosBroja {
	public static void main(String[] args) {
		String unos = JOptionPane.showInputDialog(
				null,
				"Unesite realan broj:"
		);
		double broj = Double.parseDouble(unos);

		JOptionPane.showMessageDialog(
				null,
				"Duplo je: " + 2 * broj
		);
	}
}
