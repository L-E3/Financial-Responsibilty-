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

public class Help extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help frame = new Help();
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
	public Help() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1163, 763);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 60));
		lblHelp.setForeground(new Color(255, 153, 255));
		lblHelp.setBounds(437, 39, 362, 81);
		contentPane.add(lblHelp);
		
		JLabel lblinsertHelp = new JLabel("<html>You will go through a simulation (at your own pace) , and learn new things.<br/>  It is best if you take notes, but in the end of each simulation, <br/> there will be a mini test and your score would determine how financially <br/> responsible you are! Have fun!");
		lblinsertHelp.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
		lblinsertHelp.setBounds(167, 96, 715, 428);
		contentPane.add(lblinsertHelp);
		lblinsertHelp.setForeground(new Color(0, 255, 255));
		
		JButton btnBackToHome = new JButton("Back To home");
		btnBackToHome.setBackground(new Color(255, 153, 204));
		btnBackToHome.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DatBoi().frame1.setVisible(true);
				contentPane.setVisible(false);
			}
		});
		btnBackToHome.setBounds(847, 623, 195, 57);
		contentPane.add(btnBackToHome);
	}
}
