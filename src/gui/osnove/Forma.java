package gui.osnove;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Forma extends JFrame {
	private JTextField polje;
	private JButton dugme;
	private JLabel labela;

	public Forma() {
		super("Moja prva forma");
		setLayout(new FlowLayout());
		polje = new JTextField(15);
		dugme = new JButton("Prikaži");
		labela = new JLabel(" ");

		add(polje);
		add(dugme);
		add(labela);

		dugme.addActionListener(new ObradjivacDogadjaja());
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class ObradjivacDogadjaja implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			labela.setText(polje.getText());
		}
	}

	public static void main(String[] args) {
		new Forma();
	}
}
