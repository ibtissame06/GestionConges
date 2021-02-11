package InterfaceG;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Authentification {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification window = new Authentification();
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
	public Authentification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 929, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("SE CONNECTER");
		btnNewButton.setForeground(new Color(51, 0, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(700, 361, 143, 33);
		frame.getContentPane().add(btnNewButton);

		lblNewLabel_2 = new JLabel("Password : ");
		lblNewLabel_2.setForeground(new Color(51, 0, 153));
		lblNewLabel_2.setFont(lblNewLabel_2.getFont().deriveFont(lblNewLabel_2.getFont().getSize() + 12f));
		lblNewLabel_2.setBackground(SystemColor.menu);
		lblNewLabel_2.setBounds(558, 316, 163, 27);
		frame.getContentPane().add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(684, 287, 174, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(684, 321, 174, 19);
		frame.getContentPane().add(textField_1);

		lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(new Color(51, 0, 153));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(lblNewLabel_1.getFont().deriveFont(lblNewLabel_1.getFont().getSize() + 12f));
		lblNewLabel_1.setBounds(558, 279, 143, 27);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ibtis\\Desktop\\Projet GestionConges\\image_boulangerie.jpg"));
		lblNewLabel.setBounds(0, 0, 1005, 584);
		frame.getContentPane().add(lblNewLabel);
	}
}
