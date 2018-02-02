import java.awt.Color;
import java.util.ArrayList;

public class DrawingModel {
	protected ArrayList<Shape> shapes;
	protected Color c;
	protected int size, x, y;
	
	/**
	 * This method returns a deep copy of an ArrayList
	 * of shapes.
	 * @param s
	 * @return
	 */
	public ArrayList<Shape> deepCopy(ArrayList<Shape> s) {
		return shapes;
	}
	
	/**
	 * This method allows other classes to query
	 * the size of the shape in question
	 * @return
	 */
	public int getSize() {
		return size; // returns size of shape as int
	}
	
	/**
	 * This method returns the coordinates of the shape
	 * in an int array, with index 0 being x, and
	 * index 1 being y.
	 * @return
	 */
	public int[] getCoord() {
		int[] coord = new int[2];// creates new int array with 2 indexes to store values
		coord[0] = x; // Index 0 stores the X coordinate
		coord[1] = y; // Index 1 stores the Y coordinate
		return coord;
	}
	
	
	/**
	 * This method allows other classes to query
	 * the color of the shape in question.
	 * @return
	 */
	public Color getColor() {
		return c; // returns color of shape using constant c
	}
	
	/**
	 * This method allows the user to add a shape to the
	 * frame.
	 * @param s
	 * @return
	 */
	public void addShape() {
		System.out.println("New shape added."); // Alerts user to new shape
		createShape();
	}
	
	private void createShape() {
		
	}
}
