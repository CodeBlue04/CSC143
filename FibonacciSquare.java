import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class FibonacciSquare extends AbstractShape {


	/**
	 * Constructor for Fibonacci Square shape
	 * 
	 * @param x
	 * @param y
	 * @param c
	 * @param size
	 */
	public FibonacciSquare(int x, int y, int n,  Color c, int quadrant) {
		super(x, y, fibNum(n), Color.RED);
		this.quadrant = quadrant;
	}

	/**
	 * Simple recursion method that calculates the Fibonacci number n.
	 * @param n
	 * @return
	 */
	public static int fibNum(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibNum(n - 1) + fibNum(n - 2);
		}
	}

	/**
	 * This method returns a deep copy of the fibonacci square in question.
	 * @return
	 */
	public Shape deepCopy() {
		int x = this.x;
		int y = this.y;
		Color c = this.c;
		int quadrant = this.quadrant;
		int n = this.size;
		return new FibonacciSquare(x, y, n, c, quadrant);
	}

	/**
	 * This method draws out the Fibonacci square and spiral with switch cases 
	 * for each of 4 possible quadrants.
	 */
	public void draw(Graphics g) {
		g.setColor(this.c);
		quadrant = this.quadrant+1;
		switch (quadrant) {
		// Quadrant 1
		case 1:
			g.drawRect(x, y, size, size);
			g.drawArc(x-size, y, 2* size, 2* size, 0, 90);
			break;

		// Quadrant 2
		case 2:
			g.drawRect(x, y, size, size);
			g.drawArc(x, y-size, 2*size, 2*size, 180, 90);
			break;

		// Quadrant 3
		case 3:
			g.drawRect(x, y, size, size);
			g.drawArc(x, y-size, 2*size, 2*size, 180, 90);
			break;

		// Quadrant 4
		case 4:
			g.drawRect(x, y, size, size);
			g.drawArc(x-size, y-size, 2*size, 2*size, 0, -90);
			break;

		}
	}
}
