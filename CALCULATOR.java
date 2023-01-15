package CALCULATOR;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CALCULATOR {

	private JFrame C_FRAME;
	double firstnumber , secondnumber , result ;
	String operation , answer ;
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					CALCULATOR window = new CALCULATOR();
					window.C_FRAME.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public CALCULATOR() 
	{
		initialize();
	}

	private void initialize() 
	{
		C_FRAME = new JFrame();
		C_FRAME.getContentPane().setBackground(new Color(0, 255, 0));
		C_FRAME.getContentPane().setForeground(new Color(0, 255, 0));
		C_FRAME.setTitle("CALCULATOR");
		C_FRAME.setResizable(false);
		C_FRAME.setBounds(100, 100, 317, 341);
		C_FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		C_FRAME.getContentPane().setLayout(null);
		
		JTextArea CTEXT_AREA = new JTextArea();
		CTEXT_AREA.setLineWrap(true);
		CTEXT_AREA.setWrapStyleWord(true);
		CTEXT_AREA.setBackground(new Color(0, 0, 0));
		CTEXT_AREA.setForeground(new Color(255, 255, 255));
		CTEXT_AREA.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		CTEXT_AREA.setBounds(12, 13, 278, 62);
		C_FRAME.getContentPane().add(CTEXT_AREA);
		
		JButton BUTTON1 = new JButton("1");
		BUTTON1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String no1 = CTEXT_AREA.getText() + BUTTON1.getText();
				CTEXT_AREA.setText(no1);
			}
		});
		BUTTON1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON1.setBounds(12, 90, 60, 29);
		C_FRAME.getContentPane().add(BUTTON1);
		
		JButton BUTTON2 = new JButton("2");
		BUTTON2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String no2 = CTEXT_AREA.getText() + BUTTON2.getText();
				CTEXT_AREA.setText(no2);
			}
		});
		BUTTON2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON2.setBounds(84, 90, 60, 29);
		C_FRAME.getContentPane().add(BUTTON2);
		
		JButton BUTTON3 = new JButton("3");
		BUTTON3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String no3 = CTEXT_AREA.getText() + BUTTON3.getText();
				CTEXT_AREA.setText(no3);
			}
		});
		BUTTON3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON3.setBounds(156, 88, 60, 29);
		C_FRAME.getContentPane().add(BUTTON3);
		
		JButton BUTTON4 = new JButton("4");
		BUTTON4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String no4 = CTEXT_AREA.getText() + BUTTON4.getText();
				CTEXT_AREA.setText(no4);
			}
		});
		BUTTON4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON4.setBounds(230, 88, 60, 29);
		C_FRAME.getContentPane().add(BUTTON4);
		
		JButton BUTTON5 = new JButton("5");
		BUTTON5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String no5 = CTEXT_AREA.getText() + BUTTON5.getText();
				CTEXT_AREA.setText(no5);
			}
		});
		BUTTON5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON5.setBounds(12, 132, 60, 29);
		C_FRAME.getContentPane().add(BUTTON5);
		
		JButton BUTTON6 = new JButton("6");
		BUTTON6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String no6 = CTEXT_AREA.getText() + BUTTON6.getText();
				CTEXT_AREA.setText(no6);
			}
		});
		BUTTON6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON6.setBounds(84, 132, 60, 29);
		C_FRAME.getContentPane().add(BUTTON6);
		
		JButton BUTTON7 = new JButton("7");
		BUTTON7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String no7 = CTEXT_AREA.getText() + BUTTON7.getText();
				CTEXT_AREA.setText(no7);
			}
		});
		BUTTON7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON7.setBounds(156, 132, 60, 29);
		C_FRAME.getContentPane().add(BUTTON7);
		
		JButton BUTTON8 = new JButton("8");
		BUTTON8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 	
			{
				String no8 = CTEXT_AREA.getText() + BUTTON8.getText();
				CTEXT_AREA.setText(no8);
			}
		});
		BUTTON8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON8.setBounds(230, 130, 60, 29);
		C_FRAME.getContentPane().add(BUTTON8);
		
		JButton BUTTON9 = new JButton("9");
		BUTTON9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String no9 = CTEXT_AREA.getText() + BUTTON9.getText();
				CTEXT_AREA.setText(no9);
			}
		});
		BUTTON9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON9.setBounds(12, 174, 60, 29);
		C_FRAME.getContentPane().add(BUTTON9);
		
		JButton BUTTON0 = new JButton("0");
		BUTTON0.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String no0 = CTEXT_AREA.getText() + BUTTON0.getText();
				CTEXT_AREA.setText(no0);
			}
		});
		BUTTON0.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON0.setBounds(84, 174, 60, 29);
		C_FRAME.getContentPane().add(BUTTON0);
		
		JButton BUTTON00 = new JButton("00");
		BUTTON00.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String no00 = CTEXT_AREA.getText() + BUTTON00.getText();
				CTEXT_AREA.setText(no00);
			}
		});
		BUTTON00.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON00.setBounds(156, 258, 60, 29);
		C_FRAME.getContentPane().add(BUTTON00);
		
		JButton BUTTON_CLEAR = new JButton("CLEAR");
		BUTTON_CLEAR.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				CTEXT_AREA.setText(null);
			}
		});
		BUTTON_CLEAR.setForeground(new Color(255, 0, 0));
		BUTTON_CLEAR.setFont(new Font("Tahoma", Font.PLAIN, 8));
		BUTTON_CLEAR.setBounds(230, 177, 60, 29);
		C_FRAME.getContentPane().add(BUTTON_CLEAR);
		
		JButton BUTTON_BS = new JButton("<-");
		BUTTON_BS.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String BS = null ;
				if(CTEXT_AREA.getText().length() > 0)
				{
					StringBuilder STR = new StringBuilder(CTEXT_AREA.getText());
					STR.deleteCharAt(CTEXT_AREA.getText().length()-1);
					BS = STR.toString();
					CTEXT_AREA.setText(BS);
				}
			}
		});
		BUTTON_BS.setForeground(new Color(0, 0, 255));
		BUTTON_BS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON_BS.setBounds(230, 258, 60, 29);
		C_FRAME.getContentPane().add(BUTTON_BS);
		
		JButton BUTTON_DOT = new JButton(".");
		BUTTON_DOT.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String noD = CTEXT_AREA.getText() + BUTTON_DOT.getText();
				CTEXT_AREA.setText(noD);
			}
		});
		BUTTON_DOT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		BUTTON_DOT.setBounds(156, 174, 60, 29);
		C_FRAME.getContentPane().add(BUTTON_DOT);
		
		JButton BUTTON_ADD = new JButton("+");
		BUTTON_ADD.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				firstnumber = Double.parseDouble(CTEXT_AREA.getText());
				CTEXT_AREA.setText("");
				operation = "+";
			}
		});
		BUTTON_ADD.setForeground(new Color(0, 0, 255));
		BUTTON_ADD.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON_ADD.setBounds(12, 218, 60, 29);
		C_FRAME.getContentPane().add(BUTTON_ADD);
		
		JButton BUTTON_SUB = new JButton("-");
		BUTTON_SUB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				firstnumber = Double.parseDouble(CTEXT_AREA.getText());
				CTEXT_AREA.setText("");
				operation = "-";
			}
		});
		BUTTON_SUB.setForeground(new Color(0, 0, 255));
		BUTTON_SUB.setFont(new Font("Tahoma", Font.PLAIN, 19));
		BUTTON_SUB.setBounds(84, 216, 60, 29);
		C_FRAME.getContentPane().add(BUTTON_SUB);
		
		JButton BUTTON_MUL = new JButton("*");
		BUTTON_MUL.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				firstnumber = Double.parseDouble(CTEXT_AREA.getText());
				CTEXT_AREA.setText("");
				operation = "*";
			}
		});
		BUTTON_MUL.setForeground(new Color(0, 0, 255));
		BUTTON_MUL.setFont(new Font("Tahoma", Font.PLAIN, 18));
		BUTTON_MUL.setBounds(156, 216, 60, 29);
		C_FRAME.getContentPane().add(BUTTON_MUL);
		
		JButton BUTTON_DIV = new JButton("/");
		BUTTON_DIV.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				firstnumber = Double.parseDouble(CTEXT_AREA.getText());
				CTEXT_AREA.setText("");
				operation = "/";
			}
		});
		BUTTON_DIV.setForeground(new Color(0, 0, 255));
		BUTTON_DIV.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON_DIV.setBounds(230, 219, 60, 29);
		C_FRAME.getContentPane().add(BUTTON_DIV);
		
		JButton BUTTON_EQUAL = new JButton("=");
		BUTTON_EQUAL.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String answer ; 
				secondnumber = Double.parseDouble(CTEXT_AREA.getText());
				
				if(operation == "+")
				{
					result = firstnumber + secondnumber ;
					answer = String.format("%.2f", result);
					CTEXT_AREA.setText(answer);
				}
				else if(operation == "-")
				{
					result = firstnumber - secondnumber ;
					answer = String.format("%.2f", result);
					CTEXT_AREA.setText(answer);
				}
				else if(operation == "*")
				{
					result = firstnumber * secondnumber ;
					answer = String.format("%.2f", result);
					CTEXT_AREA.setText(answer);
				}
				else if(operation == "/")
				{
					result = firstnumber / secondnumber ;
					answer = String.format("%.2f", result);
					CTEXT_AREA.setText(answer);
				}
			}
		});
		BUTTON_EQUAL.setForeground(new Color(0, 0, 255));
		BUTTON_EQUAL.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BUTTON_EQUAL.setBounds(12, 260, 132, 27);
		C_FRAME.getContentPane().add(BUTTON_EQUAL);
	}
}
