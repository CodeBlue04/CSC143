import java.awt.Color;
import java.awt.Graphics;

public class HShape extends AbstractShape {

	DrawingModel model;

	/**
	 * Constructor for H Shape
	 * 
	 * @param x
	 * @param y
	 * @param c
	 * @param size
	 */
	public HShape(int x, int y, int size, Color c) {
		super(x, y, size, c);

	}

	public Shape deepCopy() {
		int x = this.x;
		int y = this.y;
		Color c = this.c;
		int size = this.size;
		return new HShape(x, y, size, c);
	}

	/**
	 * This method draws the HShape object using nested for loops and the Graphics
	 * class methods drawRect() & fillRect()
	 * 
	 * @param g
	 */
	public void draw(Graphics g) {
		int size = this.size/3;
		for (int i = 0; i < 3; i++) {// nested for loops to create H shape, i is vertical
			for (int j = 0; j < 3; j++) {
				if (j != 1 || (i == 1 && j == 1)) {
					// This only fills in left/right columns, and one square in the middle to make
					// an H
					g.setColor(c); // turns the character blue
					g.fillRect(this.x + (j * size), this.y - (i * size), size, size);
				}
			}
		}
	}
}
