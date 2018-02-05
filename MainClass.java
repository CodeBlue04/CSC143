import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainClass {
	
	private static Random rand = new Random();

	public static void main(String[] args) {

				createGUI();//runs entire program
	}

	public static void createGUI() {
		JFrame frame = new JFrame("Homework 3");//Title of frame
		frame.setSize(800, 600);//Dimensions of frame
		frame.setBackground(Color.YELLOW);//Sets background color
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//End condition

		// DrawingModel
		DrawingModel model = new DrawingModel();
		Viewer view = new Viewer();
		
		model.addView(view);
		frame.add(view);
		
		for(int i = 0; i <10; i++) { // for loop to create shapes. Similar to example, but with different math
			int size = rand.nextInt(20) + 20;//put first to contain shapes within frame
			int x = rand.nextInt(frame.getWidth() - (20+size));//Ensures that x coordinate leaves entire shape in frame
			int y = rand.nextInt(frame.getHeight() -(20+size));//Ensures that y coordinate leaves entier shape in frame
			int s = rand.nextInt(2);//Decided which shape is created using random number
			if (s == 0) {
				model.addShape(new HShape(x,y,size, Color.BLUE));
			} else {
				int quadrant = rand.nextInt(4)+1;//Quadrant needs to be on interval (1,4), so 1+(0,3) creates correct int range
				model.addShape(new FibonacciSquare(x, y, size/3 ,Color.RED, quadrant));
			}
		}
		frame.setVisible(true); //Put at bottom to make frame visible
	}

}
