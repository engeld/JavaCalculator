package cc.engeld.calc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorWindow {

	private static final long serialVersionUID = 3102619477774487423L;

	public static void main(String[] args) {
		JTextField window = new JTextField("0");
		window.setEnabled(false);
		window.setHorizontalAlignment(JTextField.RIGHT);
		
		JPanel numpad = new JPanel();
		numpad.setLayout(new GridLayout(0,3));
		numpad.add(new JButton("9"));
		numpad.add(new JButton("8"));
		numpad.add(new JButton("7"));
		numpad.add(new JButton("6"));
		numpad.add(new JButton("5"));
		numpad.add(new JButton("4"));
		numpad.add(new JButton("3"));
		numpad.add(new JButton("2"));
		numpad.add(new JButton("1"));
		numpad.add(new JButton("0"));
		numpad.add(new JButton("."));
		
		JPanel operator = new JPanel();
		operator.setLayout(new GridLayout(0,1));
		operator.add(new JButton("+"));
		operator.add(new JButton("-"));
		operator.add(new JButton("*"));
		operator.add(new JButton(":"));
		
		
		JFrame frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(window, BorderLayout.PAGE_START);
		frame.getContentPane().add(numpad, BorderLayout.CENTER);
		frame.getContentPane().add(operator, BorderLayout.LINE_END);
		frame.pack();
		frame.setVisible(true);
	}
}
