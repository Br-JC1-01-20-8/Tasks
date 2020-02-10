package jc01_2020.lesson07.task02;

public abstract class Figure {

	private char vertical;
	private int horizontal;

	public Figure(final char vertical, final int horizontal) {
		this.vertical = vertical;
		this.horizontal = horizontal;
	}

	public abstract boolean moveTo(char toVertical, int toHorizontal);

	public char getVertical() {
		return vertical;
	}

	public int getHorizontal() {
		return horizontal;
	}

}
