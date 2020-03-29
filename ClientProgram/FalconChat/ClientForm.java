package FalconChat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.net.UnknownHostException;
import java.util.Date;


public class ClientForm extends JFrame {

	private JPanel contentPane;
	private JTextField IDtf;
	private JPasswordField PWtf;
	public static String ID; 
	public static String PW; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientForm frame = new ClientForm();
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
	public ClientForm() {
		setTitle("Client Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 309, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JButton LoginButton = new JButton("");
		LoginButton.setOpaque(false);
		LoginButton.setContentAreaFilled(false);
		LoginButton.setBorderPainted(false);
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID = IDtf.getText(); 
				PW = new String(PWtf.getPassword());
				try {
		            MessageDigest md = MessageDigest.getInstance("SHA-256");
		            md.update(PW.getBytes());
		            byte[] bytes = md.digest();
		            StringBuilder sb = new StringBuilder();
		            for(int i=0; i< bytes.length ;i++)
		            {
		                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
		            }
		            PW = sb.toString();
		        } 
		        catch (NoSuchAlgorithmException e1) 
		        {
		            e1.printStackTrace();
		        }
				
			}
		});
		LoginButton.setBounds(91, 356, 118, 31);
		contentPane.add(LoginButton);
		
		IDtf = new JTextField();
		IDtf.setBounds(18, 154, 265, 25);
		contentPane.add(IDtf);
		IDtf.setColumns(10);
		
		PWtf = new JPasswordField();
		PWtf.setBounds(18, 250, 265, 25);
		contentPane.add(PWtf);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InitProg.cf.setVisible(false);
				InitProg.cmf.setVisible(true);
			}
		});
		btnNewButton.setBounds(90, 308, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ClientForm.class.getResource("/images/ClientLogin.png")));
		lblNewLabel.setBounds(0, 0, 300, 500);
		contentPane.add(lblNewLabel);
	}
}
