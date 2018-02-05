import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainClass {

	public static void main(String[] args) {

		createGUI();

	}

	public static void createGUI() {
		JFrame frame = new JFrame("Homework 3");
		frame.setSize(800, 600);
		frame.setBackground(Color.YELLOW);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// DrawingModel
		DrawingModel model = new DrawingModel();
		Viewer view = new Viewer();

		// Shape fib = new FibonacciSquare(200,200, 10, Color.RED, 0);
		Shape h = new HShape(400, 400, 15, Color.BLUE);
		model.addShape(h);

		model.addView(view);
		frame.add(view);

		frame.setVisible(true);

	}

}
