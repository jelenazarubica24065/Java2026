package zadatak12_color;

class Color {
	private int red, green, blue;

	public Color(int red, int green, int blue) {
		setRed(red);
		setGreen(green);
		setBlue(blue);
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public void setRed(int red) {
		if (red >= 0 && red <= 255) {
			this.red = red;
		} else {
			System.out.println("Red mora biti 0-255. Vrijednost nije promijenjena.");
		}
	}

	public void setGreen(int green) {
		if (green >= 0 && green <= 255) {
			this.green = green;
		} else {
			System.out.println("Green mora biti 0-255. Vrijednost nije promijenjena.");
		}
	}

	public void setBlue(int blue) {
		if (blue >= 0 && blue <= 255) {
			this.blue = blue;
		} else {
			System.out.println("Blue mora biti 0-255. Vrijednost nije promijenjena.");
		}
	}

	public void addRed(int change) {
		int novo = red + change;
		if (novo < 0) {
			System.out.println("Red ispod 0 -> postavljam na 0.");
			novo = 0;
		} else if (novo > 255) {
			System.out.println("Red iznad 255 -> postavljam na 255.");
			novo = 255;
		}
		red = novo;
	}

	public void addGreen(int change) {
		int novo = green + change;
		if (novo < 0) {
			System.out.println("Green ispod 0 -> postavljam na 0.");
			novo = 0;
		} else if (novo > 255) {
			System.out.println("Green iznad 255 -> postavljam na 255.");
			novo = 255;
		}
		green = novo;
	}

	public void addBlue(int change) {
		int novo = blue + change;
		if (novo < 0) {
			System.out.println("Blue ispod 0 -> postavljam na 0.");
			novo = 0;
		} else if (novo > 255) {
			System.out.println("Blue iznad 255 -> postavljam na 255.");
			novo = 255;
		}
		blue = novo;
	}

	public void printColor() {
		System.out.println("red: " + red + ", green: " + green + ", blue: " + blue);
	}
}
