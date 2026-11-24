package gui.osnove;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MojaForma extends JFrame {
	public MojaForma() {
		super("Moja aplikacija");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JLabel labela = new JLabel("Unesite ime:");
		JTextField polje = new JTextField(15);
		JButton dugme = new JButton("Potvrdi");

		add(labela);
		add(polje);
		add(dugme);
	}

	public static void main(String[] args) {
		MojaForma forma = new MojaForma();
		forma.setVisible(true);
	}
}
