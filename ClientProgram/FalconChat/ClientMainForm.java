package FalconChat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class ClientMainForm extends JFrame {

	private JPanel contentPane;
	private JTextField TextInputTf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientMainForm frame = new ClientMainForm();
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
	public ClientMainForm() {
		setTitle("Client");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1160, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel UserNameLabel = new JLabel("Hello World!");
		UserNameLabel.setFont(new Font("Keep Calm Med", Font.PLAIN, 14));
		UserNameLabel.setForeground(Color.WHITE);
		UserNameLabel.setBounds(118, 572, 117, 28);
		contentPane.add(UserNameLabel);
		
		JButton LogoutButton = new JButton("");
		LogoutButton.setOpaque(false);
		LogoutButton.setContentAreaFilled(false);
		LogoutButton.setBorderPainted(false);
		LogoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		LogoutButton.setBounds(0, 601, 235, 47);
		contentPane.add(LogoutButton);
		
		TextInputTf = new JTextField();
		TextInputTf.setBounds(307, 608, 834, 32);
		contentPane.add(TextInputTf);
		TextInputTf.setColumns(10);
		TextInputTf.setOpaque(false);
		
		JButton ContactButton = new JButton("");
		ContactButton.setOpaque(false);
		ContactButton.setContentAreaFilled(false);
		ContactButton.setBorderPainted(false);
		ContactButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ClientContact.java∑Œ ¿Ãµø
			}
		});
		ContactButton.setBounds(12, 97, 208, 47);
		contentPane.add(ContactButton);
		
		JLabel lblNewLabel_1 = new JLabel("Hello World!");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Keep Calm Med", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(379, 10, 683, 47);
		contentPane.add(lblNewLabel_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.windowBorder);
		textPane.setBounds(241, 66, 912, 534);
		contentPane.add(textPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\strea\\Downloads\\Webp.net-resizeimage.png"));
		lblNewLabel.setBounds(0, 0, 1152, 648);
		contentPane.add(lblNewLabel);
	}
}
