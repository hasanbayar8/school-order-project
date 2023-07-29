package Q7;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;



public class Window extends JFrame implements ActionListener {

	String[] cofType = {"Latte - 8TL", "Esspresso - 5TL", "Cappucino - 9TL"};
    JComboBox cmb = new JComboBox(cofType);
    
    JRadioButton rbVanilla = new JRadioButton("Vanilla - 2TL");
    JRadioButton rbMilk = new JRadioButton("Milk - 1TL");
    JRadioButton rbAlmond = new JRadioButton("Almond - 3TL");
    
    JCheckBox cbDonut = new JCheckBox("Donut - 8TL");
    JCheckBox cbSandwich = new JCheckBox("Sandwich - 12TL");
    JCheckBox cbBrownie = new JCheckBox("Brownie - 9TL");
    
    JButton btnExit = new JButton("EXIT");
    JButton btnClear = new JButton("CLEAR");
    JButton btnCheckOut = new JButton("CHECK OUT");
    
    
    public Window() {
    	super("STARBUCKS");
    	setSize(400, 400);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setLayout(new GridLayout(4, 2));
    	
    	add(new JLabel("Coffee Type: "));
    	add(cmb);
    	add(new JLabel("Extra Flavors: "));
    	
    	ButtonGroup grp = new ButtonGroup();
    	grp.add(rbAlmond);
    	grp.add(rbMilk);
    	grp.add(rbVanilla);
    	
    	JPanel pnlFlavors = new JPanel(new FlowLayout());
    	pnlFlavors.add(rbAlmond);
    	pnlFlavors.add(rbMilk);
    	pnlFlavors.add(rbVanilla);
    	add(pnlFlavors);
    	
    	add(new JLabel("Food Option: "));
    	
    	JPanel pnlFood = new JPanel(new FlowLayout());
    	pnlFood.add(cbBrownie);
    	pnlFood.add(cbDonut);
    	pnlFood.add(cbSandwich);
    	add(pnlFood);
    	
    	add(new JLabel());
    	
    	JPanel pnlButtons = new JPanel(new FlowLayout());
    	pnlButtons.add(btnCheckOut);
    	pnlButtons.add(btnClear);
    	pnlButtons.add(btnExit);
    	add(pnlButtons);
    	
    	btnExit.addActionListener(this);
    	btnClear.addActionListener(this);
    	btnCheckOut.addActionListener(this);
    	
    }
    public static void main(String[] args) {
		new Window().setVisible(true);
	}
    
   //OrderDetails od = new OrderDetails(); 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnExit) {
			System.exit(0);
		}
		else if(e.getSource() == btnClear) {
			cmb.setSelectedIndex(0);
			rbAlmond.setSelected(false);
			rbMilk.setSelected(false);
			rbVanilla.setSelected(false);
			cbBrownie.setSelected(false);
			cbDonut.setSelected(false);
			cbSandwich.setSelected(false);
		}
		else if(e.getSource() == btnCheckOut) {
			//od.setVisible(true);
		}
		
	}
	
    
    
    
    
    
    
    
    
    

}
