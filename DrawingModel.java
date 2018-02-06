import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
/**
 * DrawingModel class does the marjority of the heavy lifting, with methods returning various
 * values and objects to other classes.
 * @author Colby Easton, Max Sutters
 *
 */
public class DrawingModel {
	protected ArrayList<Shape> shapes = new ArrayList<Shape>();
	protected ArrayList<View> views = new ArrayList<View>();
	protected Color c;
	protected int size, x, y, quadrant;
	protected Random rand = new Random();

	/**
	 * This method returns a deep copy of an ArrayList of shapes.
	 * 
	 * @param s
	 * @return
	 */
	public ArrayList<Shape> getShapes(Graphics g) {
		ArrayList<Shape> newShapes = new ArrayList<Shape>(shapes.size());
		for (int i = 0; i < shapes.size(); i++) {// loop to copy ArrayList
			Shape placeholder = (Shape) shapes.get(i);
			newShapes.add(placeholder); //
		}
		return newShapes;
	}

	/**
	 * This method allows other classes to query the size/n value of the shape in question
	 * 
	 * @return size
	 */
	public int getSize() {
		return this.size; // returns size of shape as int
	}

	/**
	 * This method returns the coordinates of the shape in an int array, with index
	 * 0 being x, and index 1 being y.
	 * 
	 * @return coordinates in int[]
	 */
	public int[] getCoord() {
		int[] coord = new int[2];// creates new int array with 2 indexes to store values
		coord[0] = this.x; // Index 0 stores the X coordinate
		coord[1] = this.y; // Index 1 stores the Y coordinate
		return coord;
	}

	/**
	 * This method allows other classes to query the color of the shape in question.
	 * 
	 * @return Color c
	 */
	public Color getColor() {
		return this.c; // returns color of shape using constant c
	}

	/**
	 * This method allows the user to add a shape to the frame.
	 */
	public void addShape(Shape s) {
		System.out.println("New shape added."); // Alerts user to new shape
		shapes.add(s);
		createShape();
	}

	/**
	 * This method adds View v to ArrayList of Views.
	 * @param v
	 */
	public void addView(View v) {
		views.add(v);
		v.update(this);
	}

	/**
	 * This method creates shapes 
	 */
	private void createShape() {
			HShape h = new HShape(x, y,  size, c);
			FibonacciSquare fib = new FibonacciSquare(x, y, size, c, quadrant);
	}
}
