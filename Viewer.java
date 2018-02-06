import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;
/**
 * Viewer class has methods to update the desired DrawingModel object,
 * and another to draw all shapes in ArrayList of DrawingModel objects/shapes
 * @author Colby Easton, Max Sutters
 *
 */
public class Viewer extends JPanel implements View {

	private static final long serialVersionUID = 1L;
	protected DrawingModel model;
	protected Graphics g;

	/**
	 * Update method used to repaint shape in question.
	 */
	public void update(DrawingModel model) {
		this.model = model; // repaints this DrawingModel object
		repaint();
	}

	/**
	 * This method goes through the ArrayList of shapes and draws them all.
	 */
	@Override
	public void paintComponent(Graphics g) { // paints all components in the Arraylist of shapes
		super.paintComponents(g);
		if (this != null) {
			for (Shape shape : model.getShapes(g)) {//for each shape in the ArrayList of shapes, draw that shape
				shape.draw(g);
			}
		}
	}
}
