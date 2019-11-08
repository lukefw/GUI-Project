import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	//contructor
	private JButton loadButton;
	private JButton createPathButton;
	private TextPanel textPanel;
	private StringListener textListener;
	
	
	public Toolbar() {
		setBorder(BorderFactory.createEtchedBorder());
		loadButton = new JButton("Load");
		createPathButton = new JButton("Create New");
		
		loadButton.addActionListener(this);
		createPathButton.addActionListener(this);
		
		//add buttons to toolbar using flowlayout. will align components from left
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(loadButton);
		add(createPathButton);
		
		
		
	}
	//saves a reference to the local variable up in the textListener variable. it sets the textlistener variable.  
	public void setStringListener(StringListener listener) {
		this.textListener = listener;
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//retrieves source of event, ehich is one of the two buttons
		JButton clicked = (JButton)e.getSource();
		if(clicked == loadButton) {
			if(textListener != null) {
				textListener.textEmitted("Hello\n");
			}
			//textPanel.appendText("Hello\n");
		}
		else if(clicked == createPathButton) {
			if(textListener != null) {
				textListener.textEmitted("Goodbye\n");
			}
			//textPanel.appendText("Goodbye\n");
		}

	}
}
