package Q7;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OrderDetails extends JFrame{
	
	Window w = new Window();
	
	JLabel lblDetails = new JLabel("Order Details: ");
	JLabel lblcoftype = new JLabel("Coffee Type: ");
	JLabel lblFlavor = new JLabel("Flavor: ");
	JLabel lblFood = new JLabel("Food: ");
	JLabel lblTotal = new JLabel("Total: ");
	
	JLabel lblcoffeechoice = new JLabel();
	JLabel lblflavorChoice = new JLabel();
	JLabel lblfoodchoice = new JLabel();
	JLabel lblprice = new JLabel();
	
	JTextField txtTip = new JTextField(10);
	
	public OrderDetails() {
		super("Details");
		setBounds(200,300, 400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(5,3));
		
		add(lblDetails);
		add(lblcoftype);
		add(lblcoffeechoice);
		add(new JLabel());
		add(lblFlavor);
		add(lblflavorChoice);
		add(new JLabel());
		add(lblFood);
		add(lblfoodchoice);
		add(new JLabel());
		add(lblTotal);
		add(lblprice);
		add(new JLabel());
		add(txtTip);
		add(new JLabel());
		
		
		
		
	}
	public static void main(String[] args) {
		new OrderDetails().setVisible(true);
	}

}
