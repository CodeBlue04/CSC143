import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class FibonacciSquare extends AbstractShape {

//	private Random rand = new Random();

	/**
	 * Constructor for Fibonacci Square shape
	 * 
	 * @param x
	 * @param y
	 * @param c
	 * @param size
	 */
	public FibonacciSquare(int x, int y, Color c, int quadrant, int size) {
		super(x, y, Color.RED, size);
		this.quadrant = quadrant;
	}

	public int fibNum(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibNum(n - 1) + fibNum(n - 2);
		}
	}

	public Shape deepCopy() {
		int x = this.x;
		int y = this.y;
		Color c = this.c;
		int quadrant = this.quadrant;
		int size = this.size;
		return new FibonacciSquare(x, y, c, quadrant, size);
	}

	public void draw(Graphics g) {
		g.setColor(this.c);

		// g.drawRect(xCoord, yCoord, widthHeight, widthHeight);
		switch (quadrant) {
		// Quadrant 1
		case 0:
			g.drawRect(x + (size / 2), y, size, size);
			g.drawArc(x, y, size, size, 0, 90);
			break;

		// Quadrant 2
		case 1:
			g.drawRect(x + (size / 2), y, size, size);
			g.drawArc(x, y, size, size, 90, 180);
			break;

		// Quadrant 3
		case 2:
			g.drawRect(x + (size / 2), y, size, size);
			g.drawArc(x, y, size, size, 180, 270);
			break;

		// Quadrant 4
		case 3:
			g.drawRect(x + (size / 2), y, size, size);
			g.drawArc(x, y, size, size, 270, 0);
			break;

		}
	}
}
