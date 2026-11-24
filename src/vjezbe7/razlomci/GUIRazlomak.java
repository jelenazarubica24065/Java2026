package vjezbe7.razlomci;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIRazlomak extends JFrame {
	private JTextField imenilacTF1;
	private JTextField imenilacTF2;
	private JTextField brojilacTF1;
	private JTextField brojilacTF2;
	private JLabel rezultat1, rezultat2, rezultat3, rezultat4, natpis1,
			natpis2, natpis3, natpis4;
	private JButton dugme1;
	private JButton dugme2;

	public GUIRazlomak() {
		super("Razlomci");
		this.setSize(300, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);

		Font font = new Font("Times New Roman", Font.BOLD, 18);

		brojilacTF1 = new JTextField("");
		brojilacTF1.setFont(font);
		brojilacTF1.setPreferredSize(new Dimension(40, 30));

		imenilacTF1 = new JTextField("");
		imenilacTF1.setFont(font);
		imenilacTF1.setPreferredSize(new Dimension(40, 30));

		brojilacTF2 = new JTextField("");
		brojilacTF2.setFont(font);
		brojilacTF2.setPreferredSize(new Dimension(40, 30));

		imenilacTF2 = new JTextField("");
		imenilacTF2.setFont(font);
		imenilacTF2.setPreferredSize(new Dimension(40, 30));

		natpis1 = new JLabel("Prvi broj:");
		natpis1.setFont(font);
		natpis1.setPreferredSize(new Dimension(100, 20));
		natpis1.setAlignmentX(LEFT_ALIGNMENT);

		natpis2 = new JLabel("Drugi broj:");
		natpis2.setPreferredSize(new Dimension(100, 20));
		natpis2.setFont(font);
		natpis2.setAlignmentX(LEFT_ALIGNMENT);

		natpis3 = new JLabel("/");
		natpis3.setPreferredSize(new Dimension(20, 20));
		natpis3.setFont(font);
		natpis3.setAlignmentX(CENTER_ALIGNMENT);

		natpis4 = new JLabel("/");
		natpis4.setPreferredSize(new Dimension(20, 20));
		natpis4.setFont(font);
		natpis4.setAlignmentX(CENTER_ALIGNMENT);

		dugme1 = new JButton("Izračunaj");
		dugme1.setPreferredSize(new Dimension(215, 40));
		dugme1.setFont(font);

		dugme2 = new JButton("Zatvori");
		dugme2.setPreferredSize(new Dimension(215, 40));
		dugme2.setFont(font);

		rezultat1 = new JLabel("");
		rezultat1.setPreferredSize(new Dimension(215, 40));
		rezultat1.setFont(font);

		rezultat2 = new JLabel("");
		rezultat2.setPreferredSize(new Dimension(215, 40));
		rezultat2.setFont(font);

		rezultat3 = new JLabel("");
		rezultat3.setPreferredSize(new Dimension(215, 40));
		rezultat3.setFont(font);

		rezultat4 = new JLabel("");
		rezultat4.setPreferredSize(new Dimension(215, 40));
		rezultat4.setFont(font);

		this.add(natpis1);
		this.add(brojilacTF1);
		this.add(natpis3);
		this.add(imenilacTF1);
		this.add(natpis2);
		this.add(brojilacTF2);
		this.add(natpis4);
		this.add(imenilacTF2);
		this.add(dugme1);
		this.add(dugme2);
		this.add(rezultat1);
		this.add(rezultat2);
		this.add(rezultat3);
		this.add(rezultat4);

		ObradjivacDogadjaja obradjivac = new ObradjivacDogadjaja();
		dugme1.addActionListener(obradjivac);
		dugme2.addActionListener(obradjivac);
	}

	public static void main(String[] args) {
		GUIRazlomak f = new GUIRazlomak();
		f.setVisible(true);
	}

	public class ObradjivacDogadjaja implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent a) {
			if (a.getSource() == dugme1) {
				int im, br;
				br = Integer.parseInt(brojilacTF1.getText().trim());
				im = Integer.parseInt(imenilacTF1.getText().trim());
				Razlomak r1 = new Razlomak(br, im);

				br = Integer.parseInt(brojilacTF2.getText().trim());
				im = Integer.parseInt(imenilacTF2.getText().trim());
				Razlomak r2 = new Razlomak(br, im);

				Razlomak r = Razlomak.saberi(r1, r2);
				r.skrati();
				rezultat1.setText("Sabiranje: " + r.toString());

				r = Razlomak.oduzmi(r1, r2);
				r.skrati();
				rezultat2.setText("Oduzimanje: " + r.toString());

				r = Razlomak.pomnozi(r1, r2);
				r.skrati();
				rezultat3.setText("Množenje: " + r.toString());

				r = Razlomak.podijeli(r1, r2);
				r.skrati();
				rezultat4.setText("Dijeljenje: " + r.toString());
			}
			if (a.getSource() == dugme2) {
				System.exit(EXIT_ON_CLOSE);
			}
		}
	}
}
