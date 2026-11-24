package zadatak17_geometrija;

class Tacka {
	private int x, y;

	public Tacka(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void ispisi() {
		System.out.println("Tacka (" + x + ", " + y + ")");
	}
}

class Pravougaonik {
	private int x, y, width, height;

	public Pravougaonik(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean sadrzi(int tx, int ty) {
		return tx >= x && tx <= x + width && ty >= y && ty <= y + height;
	}

	public void ispisi() {
		System.out.println("Pravougaonik (" + x + ", " + y + ") " + width + "x" + height);
	}
}

public class GeometryApp {

	public static void main(String[] args) {
		Pravougaonik p1 = new Pravougaonik(0, 0, 10, 5);
		Tacka t = new Tacka(3, 4);

		p1.ispisi();
		t.ispisi();
		boolean unutra = p1.sadrzi(t.getX(), t.getY());
		System.out.println("Tacka je unutar pravougaonika: " + unutra);

		Pravougaonik p2 = new Pravougaonik(8, 3, 6, 6);
		boolean preklapaX = p1.getX() < p2.getX() + p2.getWidth() && p2.getX() < p1.getX() + p1.getWidth();
		boolean preklapaY = p1.getY() < p2.getY() + p2.getHeight() && p2.getY() < p1.getY() + p1.getHeight();
		System.out.println("Pravougaonici se preklapaju: " + (preklapaX && preklapaY));

		Pravougaonik p3 = new Pravougaonik(20, 20, 2, 2);
		boolean px = p1.getX() < p3.getX() + p3.getWidth() && p3.getX() < p1.getX() + p1.getWidth();
		boolean py = p1.getY() < p3.getY() + p3.getHeight() && p3.getY() < p1.getY() + p1.getHeight();
		System.out.println("p1 i p3 se preklapaju: " + (px && py));
	}

}
