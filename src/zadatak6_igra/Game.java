package zadatak6_igra;

class Player {
	private int x, y, width, height, health;

	public Player(int x, int y, int width, int height, int health) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.health = 100;
		setHealth(health);
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

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health >= 0 && health <= 100) {
			this.health = health;
		} else {
			System.out.println("Health mora biti izmedju 0 i 100.");
		}
	}
}

class Enemy {
	private int x, y, width, height, damage;

	public Enemy(int x, int y, int width, int height, int damage) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.damage = 0;
		setDamage(damage);
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

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		if (damage >= 0 && damage <= 100) {
			this.damage = damage;
		} else {
			System.out.println("Damage mora biti izmedju 0 i 100.");
		}
	}
}

public class Game {

	public static boolean checkCollision(Player p, Enemy e) {
		boolean preklapaX = p.getX() < e.getX() + e.getWidth() && e.getX() < p.getX() + p.getWidth();
		boolean preklapaY = p.getY() < e.getY() + e.getHeight() && e.getY() < p.getY() + p.getHeight();
		return preklapaX && preklapaY;
	}

	public static void decreaseHealth(Player p, Enemy e) {
		int novo = p.getHealth() - e.getDamage();
		if (novo < 0) {
			novo = 0;
		}
		p.setHealth(novo);
	}

	public static void main(String[] args) {
		Player p = new Player(10, 5, 32, 32, 100);
		Enemy e1 = new Enemy(12, 5, 16, 16, 20);
		Enemy e2 = new Enemy(100, 50, 10, 10, 30);

		System.out.println("Health prije: " + p.getHealth());

		if (checkCollision(p, e1)) {
			System.out.println("Sudar sa prvim neprijateljem!");
			decreaseHealth(p, e1);
		}
		if (checkCollision(p, e2)) {
			System.out.println("Sudar sa drugim neprijateljem!");
			decreaseHealth(p, e2);
		} else {
			System.out.println("Nema sudara sa drugim neprijateljem.");
		}

		System.out.println("Health poslije: " + p.getHealth());
	}

}
