import java.awt.Color;
import java.awt.Graphics;

public interface Shape {
	public void AbstractShape(int x, int y, Color c, int size);
	
	public Shape deepCopy();
	
	public void draw(Graphics g);
	
	public void update(DrawingModel model);
}

