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
		frame.setBackground(Color.BLACK);


		// DrawingModel
		DrawingModel model = new DrawingModel();
		Viewer view = new Viewer();
		
		Shape fib = new FibonacciSquare(400,400, Color.RED, 1, 200);
		Shape h = new HShape(200,200,Color.BLUE,150);
		model.addShape(fib);
//		model.addShape(h);
		model.addView(view);
		frame.add(view);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
