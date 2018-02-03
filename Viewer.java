import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Viewer extends JPanel implements View {

	protected DrawingModel model;
	
	protected Graphics g;
	
	public Viewer() {
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Shape s) {
		if (s != null) {
			for (DrawingModel model; model.getShapes(s.draw(g)) {
				s.update(model);
			}
		}
		
		
	}
}
