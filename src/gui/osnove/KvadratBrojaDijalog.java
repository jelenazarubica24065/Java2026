package gui.osnove;

import javax.swing.JOptionPane;

public class KvadratBrojaDijalog {
	public static void main(String[] args) {
		String unos = JOptionPane.showInputDialog(
				null,
				"Unesite broj:"
		);
		double broj = Double.parseDouble(unos);

		int izbor = JOptionPane.showConfirmDialog(
				null,
				"Da li želite prikaz rezultata?",
				"Potvrda",
				JOptionPane.YES_NO_CANCEL_OPTION
		);

		if (izbor == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(
					null,
					"Kvadrat broja je: " + (broj * broj)
			);
		}
	}
}
