import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import javafx.geometry.Insets;
import javafx.scene.layout.Border;

public class FormPanel extends JPanel {
	
	private JLabel nameLabel;
	private JLabel occupationLabel;
	private JTextField nameField;
	private JTextField occupationField;
	private JButton okBtn;
	private JList carList;
	private JComboBox carCombo;
	private JRadioButton IDM;
	private JRadioButton Trajectory;
	private ButtonGroup Controller;
	
	
	
	
	public FormPanel() {
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
		nameLabel = new JLabel("Controller: ");
		occupationLabel = new JLabel("Path: ");
		nameField = new JTextField(10);
		occupationField = new JTextField(10);
		carList = new JList();
		carCombo = new JComboBox();
		IDM = new JRadioButton("IDM");
		Trajectory = new JRadioButton("Trajectory");
		Controller = new ButtonGroup();
		
		//set up controler radios
		Controller.add(IDM);
		Controller.add(Trajectory);
		
		
		
		
		
		// setup list box
		
		
		
		DefaultListModel carModel = new DefaultListModel();
		carModel.addElement("Car 1");
		carModel.addElement("Car 2");
		carModel.addElement("Car3");
		carModel.addElement("Car4");
		carList.setModel(carModel);
		carList.setPreferredSize(new Dimension(110, 65));
		carList.setBorder(BorderFactory.createEtchedBorder());
		
		//setup combobox
		DefaultComboBoxModel carComboModel = new DefaultComboBoxModel();
		carComboModel.addElement("Car 1");
		carComboModel.addElement("Car 2");
		carComboModel.addElement("Car 3");
		carCombo.setModel(carComboModel);
		//carCombo.setModel(carModel);
		
		
		
		
		
		okBtn = new JButton("OK");
		
		
		TitledBorder innerBorder = BorderFactory.createTitledBorder("Add Vehicle");
		javax.swing.border.Border outerBorder = BorderFactory.createEmptyBorder(5 , 5 , 5 , 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		setLayout(new GridBagLayout());
		
		//layout manager 
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.weightx = 1;
		gc.weighty = 1;
		/////// First Row 
		
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		
		
		add(nameLabel, gc);
		gc.gridx = 1;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		add(nameField, gc);
		gc.gridy = 1;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(occupationLabel, gc);
		gc.gridy = 1;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(occupationField, gc);
		
		gc.gridy = 2;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(okBtn, gc);
		
		
		
		gc.weightx = 1;
		gc.weighty = 0.2;
		gc.gridy = 2;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		//gc.insets = new Insets(0, 0, 0, 0);
		add(carList, gc);
		
		gc.weightx = 1;
		gc.weighty = 0.2;
		gc.gridx = 0;
		
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		//gc.insets = new Insets(0, 0, 0, 0);
		//add(carList, gc)
		
		
		
		
	}

}
