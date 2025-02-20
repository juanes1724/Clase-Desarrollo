package Taller;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class Calculadora {
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new CalculadoraGUI());
	    }
	}

	class CalculadoraGUI extends JFrame {
	    private JTextField campoNumero1, campoNumero2, campoResultado;
	    private JButton btnSumar, btnRestar, btnMultiplicar, btnDividir;

	    public CalculadoraGUI() {
	        setTitle("Calculadora");
	        setSize(300, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new GridLayout(5, 2));

	        add(new JLabel("Número 1:"));
	        campoNumero1 = new JTextField();
	        add(campoNumero1);

	        add(new JLabel("Número 2:"));
	        campoNumero2 = new JTextField();
	        add(campoNumero2);

	        btnSumar = new JButton("+");
	        btnRestar = new JButton("-");
	        btnMultiplicar = new JButton("×");
	        btnDividir = new JButton("÷");

	        add(btnSumar);
	        add(btnRestar);
	        add(btnMultiplicar);
	        add(btnDividir);
	        
	        add(new JLabel("Resultado:"));
	        campoResultado = new JTextField();
	        campoResultado.setEditable(false);
	        add(campoResultado);

	        btnSumar.addActionListener(e -> calcular('+'));
	        btnRestar.addActionListener(e -> calcular('-'));
	        btnMultiplicar.addActionListener(e -> calcular('*'));
	        btnDividir.addActionListener(e -> calcular('/'));

	        setVisible(true);
	    }

	    private void calcular(char operacion) {
	        try {
	            double num1 = Double.parseDouble(campoNumero1.getText());
	            double num2 = Double.parseDouble(campoNumero2.getText());
	            double resultado = 0;

	            switch (operacion) {
	                case '+': resultado = num1 + num2; break;
	                case '-': resultado = num1 - num2; break;
	                case '*': resultado = num1 * num2; break;
	                case '/': 
	                    if (num2 == 0) {
	                        campoResultado.setText("Error: División por 0");
	                        return;
	                    }
	                    resultado = num1 / num2; 
	                    break;
	            }
	            campoResultado.setText(String.valueOf(resultado));
	        } catch (NumberFormatException e) {
	            campoResultado.setText("Error: Entrada inválida");
	        }
	    }
	}

