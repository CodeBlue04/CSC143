import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainClass {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				createGUI();
				
			}
		});
		
	}
	
	public static void createGUI() {
		JFrame frame = new JFrame("Homework 3");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//DrawingModel
		DrawingModel model = new DrawingModel();
		Viewer view = new Viewer();
		model.ad
		
	}

}
