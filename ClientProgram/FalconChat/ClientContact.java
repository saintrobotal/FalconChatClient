package FalconChat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientContact extends JFrame {

	private JPanel contentPane;
	private JTextField DisplayNametf;
	private JTextField Usertf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientContact frame = new ClientContact();
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
	public ClientContact() {
		setResizable(false);
		setTitle("Client Contact");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Usertf = new JTextField();
		Usertf.setColumns(10);
		Usertf.setBounds(273, 105, 403, 26);
		contentPane.add(Usertf);
		
		DisplayNametf = new JTextField();
		DisplayNametf.setBounds(273, 47, 403, 26);
		contentPane.add(DisplayNametf);
		DisplayNametf.setColumns(10);
		
		JButton AddButton = new JButton("");
		AddButton.setOpaque(false);
		AddButton.setContentAreaFilled(false);
		AddButton.setBorderPainted(false);
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AddButton.setBounds(273, 153, 185, 33);
		contentPane.add(AddButton);
		
		JButton EditButton = new JButton("");
		EditButton.setOpaque(false);
		EditButton.setContentAreaFilled(false);
		EditButton.setBorderPainted(false);
		EditButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		EditButton.setBounds(273, 203, 185, 33);
		contentPane.add(EditButton);
		
		JList Contactlist = new JList();
		Contactlist.setBounds(12, 469, 237, -417);
		contentPane.add(Contactlist);
		
		JLabel BackGround = new JLabel("");
		BackGround.setIcon(new ImageIcon("C:\\Users\\strea\\Desktop\\falconchatclientcontact.png"));
		BackGround.setBounds(0, 0, 700, 499);
		contentPane.add(BackGround);
	}
}
