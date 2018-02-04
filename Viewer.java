import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Viewer extends JPanel implements View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected DrawingModel model;
	
	protected Graphics g;

	public void update(DrawingModel model) {
		this.model = model; //repaints this DrawingModel object 
		repaint();
	}
	
	public void paintComponent(Shape s) { //paints all components in the Arraylist of shapes
		super.paintComponents(g);
		if (s != null) {
			for (Shape shape: model.getShapes(g)) {
				shape.draw(g);
			}
		}
	}
}
