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
	public HShape(int x, int y, Color c, int size) {
		super(x, y, c, size);
		this.x = x;
		this.y = y;
		this.c = c;
		this.size = size;

	}

	public Shape deepCopy() {
		int x = this.x;
		int y = this.y;
		Color c = this.c;
		int size = this.size;
		return new HShape(x, y, c, size);
	}

	/**
	 * This method draws the HShape object using nested for loops and the Graphics
	 * class methods drawRect() & fillRect()
	 * 
	 * @param g
	 */
	public void draw(Graphics g) {
		g.setColor(Color.BLUE); // turns the character blue
		int[] widthHeight = model.getCoord();
		int height = widthHeight[1];
		int width = widthHeight[0];
		int squareSize = width / 3;
		for (int i = 0; i < 3; i++) {// nested for loops to create H shape, i is vertical
			for (int j = 0; j < 3; j++) {// j is horizontal
				// g.drawRect draws rectangle at given point, with given height/width
				g.drawRect(width + (j * width), height - (i * height), squareSize, squareSize);
				if (i != 1 || (i == 1 && j == 1)) {
					// This only fills in left/right columns, and one square in the middle to make
					// an H
					g.fillRect(width + (j * width), height - (i * height), squareSize, squareSize);
				}
			}
		}
	}
}
