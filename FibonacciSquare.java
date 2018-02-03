import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class FibonacciSquare extends AbstractShape{
	
	private Random rand = new Random(); 
	
	/**
	 * Constructor for Fibonacci Square shape
	 * @param x
	 * @param y
	 * @param c
	 * @param size
	 */
	public FibonacciSquare(int x, int y, Color c, int quadrant, int size) {
		super(x, y, Color.RED, size);
		this.quadrant = quadrant;
	}
	
	public int fibNum(int n) {
		if (n <=1) {
			return n;
		} else {
			return fibNum(n-1) + fibNum(n-2);
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		int xCoord = rand.nextInt(800);
		int yCoord = rand.nextInt(800);
		int widthHeight = rand.nextInt(50);
		
		g.drawRect(xCoord, yCoord, widthHeight, widthHeight);
		
		//Quadrant 1
		g.drawArc()
		//Quadrant 2
		
		//Quadrant 3
		
		//Quadrant 4
	}
}
