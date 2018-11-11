import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1163, 763);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setForeground(new Color(255, 255, 255));
		lblAbout.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 60));
		lblAbout.setBounds(409, -11, 282, 177);
		contentPane.add(lblAbout);
		
		JLabel lblinsertAbout = new JLabel("<html> Are you financially responsible? Yes, No, Maybe So?\r\n <br/>" + 
				"We are here to help you with that.  We teach you the different parts of being financially responsible, Technica themed! <br/> We have programmed small mini lessons, a total of 4, to teach you the basics of financial responsibilities! </br> We hope you have fun with our game and learn something new!  Have Fun!");
		lblinsertAbout.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
		lblinsertAbout.setForeground(new Color(255, 204, 255));
		lblinsertAbout.setBounds(159, 60, 814, 465);
		contentPane.add(lblinsertAbout);
		
		JButton btnBackToHome = new JButton("Back To Home");
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DatBoi().frame1.setVisible(true);
				contentPane.setVisible(false);
			}
		});
		btnBackToHome.setBounds(887, 660, 182, 25);
		contentPane.add(btnBackToHome);
	}

}
