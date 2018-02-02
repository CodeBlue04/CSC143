import java.awt.Color;

public class FibonacciSquare extends AbstractShape{
	
	
	/**
	 * Constructor for Fibonacci Square shape
	 * @param x
	 * @param y
	 * @param c
	 * @param size
	 */
	public FibonacciSquare(int x, int y, Color c, int quadrant, int size) {
		super(x, y, c, size);
		this.quadrant = quadrant;
	}
}
