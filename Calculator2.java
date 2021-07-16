import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Cursor;


public class Calculator2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel actionReceived;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator2 frame = new Calculator2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator2() {
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		getContentPane().setBackground(new Color(255, 165, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calulator");
		getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		textField_1.setBorder(null);
		textField_1.setBounds(160, 6, 143, 46);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBorder(null);
		textField.setOpaque(true);
		textField.setBounds(128, 50, 175, 50);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+0);
			}
		});
		zero.setBounds(27, 317, 132, 67);
		getContentPane().add(zero);
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+1);

			}
		});
		one.setBounds(171, 248, 60, 67);
		getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+2);
			}
		});
		two.setBounds(99, 248, 60, 67);
		getContentPane().add(two);
		
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+3);
			}
		});
		three.setBounds(27, 248, 60, 67);
		getContentPane().add(three);
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+4);
			}
		});
		four.setBounds(171, 180, 60, 67);
		getContentPane().add(four);
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+5);
			}
		});
		five.setBounds(99, 180, 60, 67);
		getContentPane().add(five);
		
		
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+6);
			}
		});
		six.setBounds(27, 180, 60, 67);
		getContentPane().add(six);
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+7);
			}
		});
		seven.setBounds(171, 112, 60, 67);
		getContentPane().add(seven);
		
		
		
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+8);
			}
		});
		eight.setBounds(99, 112, 60, 67);
		getContentPane().add(eight);
		
		
		
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+9);
			}
		});
		nine.setBounds(27, 112, 60, 67);
		getContentPane().add(nine);
		
		JButton dot = new JButton(".");
		dot.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		dot.setBounds(171, 385, 60, 67);
		getContentPane().add(dot);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionReceived.setText(("Add"));
				textField_1.setText(textField.getText());
				textField.setText(null);
			}
		});
		plus.setBounds(243, 112, 60, 67);
		getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionReceived.setText(("Sub"));
				textField_1.setText(textField.getText());
				textField.setText(null);
				
			}
		});
		minus.setBounds(243, 180, 60, 67);
		getContentPane().add(minus);
		
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionReceived.setText(("Div"));
				textField_1.setText(textField.getText());
				textField.setText(null);
				
			}
		});
		divide.setBounds(243, 248, 60, 67);
		getContentPane().add(divide);
		
		JButton multiply = new JButton("X");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionReceived.setText(("Mult"));
				textField_1.setText(textField.getText());
				textField.setText(null);
			}
		});
		multiply.setBounds(243, 317, 60, 67);
		getContentPane().add(multiply);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				actionReceived.setText((null));
			}
		});
		clear.setBounds(243, 385, 60, 67);
		getContentPane().add(clear);
		
		JButton equals = new JButton("=");
		getContentPane().add(equals);
		equals.setBounds(171, 317, 60, 67);
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		float first = Float.parseFloat(textField.getText());
		float second = Float.parseFloat(textField_1.getText());
		
		if(actionReceived.getText().equals("Sub")) {
			float sub = second-first;
			textField.setText(String.valueOf(sub));
		}
		
		if(actionReceived.getText().equals("Add")) {
			float add = first+second;
			textField.setText(String.valueOf(add));
		}
		
		if(actionReceived.getText().equals("Div")) {
			float div = second/first;
			textField.setText(String.valueOf(div));
		}
		
		if(actionReceived.getText().equals("Mult")) {
			float mult = first*second;
			textField.setText(String.valueOf(mult));
		}
		
		textField_1.setText(null);
		
			}
		});
		
		actionReceived = new JLabel("");
		actionReceived.setHorizontalAlignment(SwingConstants.CENTER);
		actionReceived.setBackground(new Color(255, 255, 255));
		actionReceived.setForeground(new Color(255, 255, 255));
		actionReceived.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		actionReceived.setBorder(null);
		actionReceived.setBounds(27, 388, 132, 59);
		getContentPane().add(actionReceived);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		panel.setBounds(27, 5, 276, 95);
		getContentPane().add(panel);
		panel.setLayout(null);
		
	
		
		
		
		
		
	}
}
