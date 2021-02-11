package InterfaceG;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AuthentificationPro extends JFrame {

	private JFrame frame;
	private JTextField Usernamefield;
	private JLabel lblNewLabel;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthentificationPro window = new AuthentificationPro();
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
	public AuthentificationPro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ibtis\\Desktop\\imgLogo.jpg"));

		frame.setBounds(100, 100, 970, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(710, 194, 106, 19);
		frame.getContentPane().add(passwordField);

		JLabel lblNewLabel_3 = new JLabel("Password  : ");
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(572, 194, 128, 16);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(572, 141, 128, 16);
		frame.getContentPane().add(lblNewLabel_2);

		Usernamefield = new JTextField();
		Usernamefield.setBounds(710, 141, 106, 19);
		frame.getContentPane().add(Usernamefield);
		Usernamefield.setColumns(10);

		JButton ButtonSConnect = new JButton("Se connecterazaz");
		ButtonSConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = Usernamefield.getText().toString();
				@SuppressWarnings("deprecation")
				String password = passwordField.getText().toString();

				// username = admin -- Passeword : admin

				if (!username.equals("") || !password.equals("")) {

					if (username.equals("admin") && password.equals("admin")) {
						JOptionPane.showMessageDialog(null, "Connexion Réussite");
						MenuAdministrateur menu = new MenuAdministrateur();
						menu.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Connexion Échouée");
					}
				}
			}
		});
		ButtonSConnect.setForeground(Color.DARK_GRAY);
		ButtonSConnect.setBounds(635, 247, 116, 26);
		frame.getContentPane().add(ButtonSConnect);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\ibtis\\Desktop\\Projet GestionConges\\gray-white-futuristic-technology-background-vector_53876-85332.jpg"));
		lblNewLabel.setBounds(0, -14, 909, 436);
		frame.getContentPane().add(lblNewLabel);

	}
}
