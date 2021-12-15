import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class ventana {

	private JFrame frame;
	private JTextField txt_num1;
	private JTextField txt_num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)

	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana window = new ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(204, 204, 204));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txt_num1 = new JTextField();
		txt_num1.setHorizontalAlignment(SwingConstants.LEFT);
		txt_num1.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_num1.setBounds(113, 69, 155, 40);
		frame.getContentPane().add(txt_num1);
		txt_num1.setColumns(10);

		JLabel lbl_total = new JLabel("");
		lbl_total.setFont(new Font("Arial", Font.PLAIN, 15));
		lbl_total.setBounds(113, 185, 155, 40);
		frame.getContentPane().add(lbl_total);

		JButton btn_sumar = new JButton("SUMAR");
		btn_sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int numero1 = Integer.parseInt(txt_num1.getText());
				int numero2 = Integer.parseInt(txt_num2.getText());
				int resul = numero1 + numero2;
				lbl_total.setText(Integer.toString(resul));

			}
		});
		btn_sumar.setFont(new Font("Garamond", Font.PLAIN, 15));
		btn_sumar.setBounds(293, 69, 133, 26);
		frame.getContentPane().add(btn_sumar);

		JButton btn_restar = new JButton("RESTAR");
		btn_restar.setFont(new Font("Garamond", Font.PLAIN, 15));
		btn_restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1 = Integer.parseInt(txt_num1.getText());
				int numero2 = Integer.parseInt(txt_num2.getText());
				int resul = numero1 - numero2;
				lbl_total.setText(Integer.toString(resul));
			}
		});
		btn_restar.setBounds(293, 105, 133, 26);
		frame.getContentPane().add(btn_restar);

		JButton btn_multiplicar = new JButton("MULTIPLICAR");
		btn_multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1 = Integer.parseInt(txt_num1.getText());
				int numero2 = Integer.parseInt(txt_num2.getText());
				int resul = numero1 * numero2;
				lbl_total.setText(Integer.toString(resul));
			}
		});
		btn_multiplicar.setFont(new Font("Garamond", Font.PLAIN, 14));
		btn_multiplicar.setBounds(293, 141, 133, 26);
		frame.getContentPane().add(btn_multiplicar);

		JButton btn_dividir = new JButton("DIVIDIR");
		btn_dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1 = Integer.parseInt(txt_num1.getText());
				int numero2 = Integer.parseInt(txt_num2.getText());
				int resul = numero1 / numero2;
				lbl_total.setText(Integer.toString(resul) + " Resto: " + Integer.toString(numero1 % numero2));
			}
		});
		btn_dividir.setFont(new Font("Garamond", Font.PLAIN, 15));
		btn_dividir.setBounds(293, 177, 133, 26);
		frame.getContentPane().add(btn_dividir);

		JButton btn_salir = new JButton("SALIR");
		btn_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_salir.setFont(new Font("Garamond", Font.PLAIN, 15));
		btn_salir.setBounds(293, 211, 133, 26);
		frame.getContentPane().add(btn_salir);

		txt_num2 = new JTextField();
		txt_num2.setHorizontalAlignment(SwingConstants.LEFT);
		txt_num2.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_num2.setColumns(10);
		txt_num2.setBounds(113, 119, 155, 40);
		frame.getContentPane().add(txt_num2);

		JLabel lbl_numero1 = new JLabel("N\u00FAmero 1");
		lbl_numero1.setFont(new Font("Arial", Font.BOLD, 15));
		lbl_numero1.setBounds(20, 83, 97, 13);
		frame.getContentPane().add(lbl_numero1);

		JLabel lbl_numero2 = new JLabel("N\u00FAmero 2");
		lbl_numero2.setFont(new Font("Arial", Font.BOLD, 15));
		lbl_numero2.setBounds(20, 133, 97, 13);
		frame.getContentPane().add(lbl_numero2);

		JLabel lbl_resul_titulo = new JLabel("Resultado");
		lbl_resul_titulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_resul_titulo.setBounds(20, 199, 102, 13);
		frame.getContentPane().add(lbl_resul_titulo);

		JLabel lblNewLabel_3 = new JLabel("CALCULADORA");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Garamond", Font.BOLD, 30));
		lblNewLabel_3.setBounds(10, 13, 416, 46);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
