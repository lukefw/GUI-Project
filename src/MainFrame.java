import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;


//////////get rid of btn
//want all communication to go through MainFrame. That currently is not happening, as Toolbar is linked directly to TextPanel
//To have communication with MainFrame, need an interface 
public class MainFrame extends JFrame {
//constructor is MainFrame:
	//components
	private TextPanel textPanel;
	private JButton btn;
	private Toolbar toolbar;
	private FormPanel formPanel;
	
	
	//MainFrame class acts as a controller. hooks together the components
	//pass a reference to the toolbar and get the toolbar to call a method in the textPanel
	//must pass textpanel to toolbar 
	public MainFrame() {
		super("Hello World");
		setLayout(new BorderLayout());
		toolbar = new Toolbar();
		textPanel = new TextPanel();
		//on side of TextPanel
		formPanel = new FormPanel();
		
		
		//anonymous class
		toolbar.setStringListener(new StringListener() {

			
			public void textEmitted(String text) {
				textPanel.appendText(text);
				
				
			}
			
		});
		
		//btn = new JButton("Click Me!");
		
		//ActionListener is an interface 
		//btn.addActionListener(new ActionListener() {

			//method of the anonymous class. directly incoking a method onto textArea
			//public void actionPerformed(ActionEvent arg0) {
				//textPanel.appendText("Hello\n");
				
				
			//}
			
			
		//});
		add(formPanel, BorderLayout.WEST);
		
		add(toolbar, BorderLayout.NORTH);
		
		add(textPanel, BorderLayout.CENTER);
		//add(btn, BorderLayout.SOUTH);
		//Layout manager usually decides size of components 
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
