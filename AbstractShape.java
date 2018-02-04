import java.awt.Color;

/**
 * Abstract class with constructor for all shapes.
 * 
 * @author Colby Easton
 *
 */
public abstract class AbstractShape implements Shape {
	protected int x; // X coordinate
	protected int y; // Y coordinate
	protected int size; // Size
	protected int quadrant; // Quadrant for Fibonacci Square shape
	protected Color c; // Color of shape

	/**
	 * Constructor for all shapes.
	 * 
	 * @param x
	 * @param y
	 * @param c
	 * @param size
	 */
	public AbstractShape(int x, int y, Color c, int size) {
		this.x = x;
		this.y = y;
		this.c = c;
		this.size = size;
	}
//Done, do not edit without good cause
}
