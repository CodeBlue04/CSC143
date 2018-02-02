import java.awt.Color;

public class HShape extends AbstractShape{

	
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
}
