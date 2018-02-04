import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class DrawingModel {
	protected ArrayList<Shape> shapes = new ArrayList<Shape>();
	protected ArrayList<View> views = new ArrayList<View>();
	protected Color c;
	protected int size, x, y;
	protected Random rand = new Random();

	/**
	 * This method returns a deep copy of an ArrayList of shapes.
	 * 
	 * @param s
	 * @return
	 */
	public ArrayList<Shape> deepCopy(ArrayList<Shape> s) {
		ArrayList<Shape> newShapes = new ArrayList<Shape>(s.size());
		for (int i = 0; i < s.size(); i++) {// loop to copy ArrayList
			Shape placeholder = (Shape) s.get(i);
			newShapes.add(placeholder); //
		}
		return newShapes;
	}

	/**
	 * This method allows other classes to query the size of the shape in question
	 * 
	 * @return
	 */
	public int getSize() {
		return this.size; // returns size of shape as int
	}

	/**
	 * This method returns the coordinates of the shape in an int array, with index
	 * 0 being x, and index 1 being y.
	 * 
	 * @return
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
	 * @return
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
//		updateViews();
		createShape();
	}

	public ArrayList<Shape> getShapes(Graphics g) {
		return shapes;
	}
	
	public void addView(View v) {
		views.add(v);
		v.update(this);
	}

	
	private void createShape() {
//		c = new Color(rand.nextInt());
//		x = rand.nextInt(200);
//		y = rand.nextInt(200);
//		size = rand.nextInt(200);
		int quadrant = 1;
		int shapeModel = 1;
		if (shapeModel == 0) {
			HShape h = new HShape(x, y, c, size);
		} else {
			FibonacciSquare fib = new FibonacciSquare(x, y, c, quadrant, size);
		}

	}
}
