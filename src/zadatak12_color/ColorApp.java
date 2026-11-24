package zadatak12_color;

public class ColorApp {

	public static void main(String[] args) {
		Color c = new Color(100, 200, 50);
		c.printColor();
		c.setRed(300);
		c.addGreen(100);
		c.addBlue(-80);
		c.addRed(20);
		c.printColor();
	}

}
