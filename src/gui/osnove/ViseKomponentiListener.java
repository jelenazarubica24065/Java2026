package gui.osnove;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViseKomponentiListener extends JFrame implements ActionListener {
	private JTextField polje;
	private JButton dugme;
	private JLabel labela;

	public ViseKomponentiListener() {
		super("Jedan listener za više komponenti");
		setLayout(new FlowLayout());

		polje = new JTextField(15);
		dugme = new JButton("Potvrdi");
		labela = new JLabel("Čekam događaj...");

		dugme.addActionListener(this);
		polje.addActionListener(this);

		add(polje);
		add(dugme);
		add(labela);

		setSize(350, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == dugme) {
			labela.setText("Klik na dugme: " + polje.getText());
		} else if (e.getSource() == polje) {
			labela.setText("Pritisnut Enter: " + polje.getText());
		}
	}

	public static void main(String[] args) {
		new ViseKomponentiListener();
	}
}
