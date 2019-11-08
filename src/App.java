import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		
		//static method in SwingUtilities class invokeLater for multi-threading purposes
		//this runs the app in a separate thread. Runnable interface has one method 
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new MainFrame();
				
			}
			
		});
		

	}
		

}
