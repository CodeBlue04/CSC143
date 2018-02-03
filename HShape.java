import java.awt.Color;
import java.awt.Graphics;

public class HShape extends AbstractShape{

	DrawingModel model;
	
	/**
	 * Constructor for H Shape
	 * @param x
	 * @param y
	 * @param c
	 * @param size
	 */
	public HShape(int x, int y, Color c, int size) {
		super(x, y, c, size);
		}

	public Shape model(Shape s) {
		Shape H = s;
		return H;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLUE); // turns the character blue
		int[] widthHeight = model.getCoord();
		int height = widthHeight[1];
		int width = widthHeight[0];
		int squareSize = width / 3;
		for (int i = 0; i<3;i++) {
			for (int j=0;j<3;j++) {
				g.drawRect(width+(j*width), height-(i*height), squareSize, squareSize);
				if (i != 1 ||(i==1 && j==1)) {
				g.fillRect(width+(j*width), height-(i*height), squareSize, squareSize);
			} 
			}
		}
	}
}
