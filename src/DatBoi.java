import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//new secondBox().setVisible(true);

public class DatBoi {

	public JFrame frame1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatBoi window = new DatBoi();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DatBoi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int currentSlide = 0;
		//PowerUp the frame
		frame1 = new JFrame();
		frame1.getContentPane().setForeground(new Color(255, 255, 255));
		frame1.getContentPane().setBackground(new Color(51, 51, 51));
		frame1.setBounds(100, 100, 1163, 763);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
	//Title
		JLabel lblAreYouFinancially = new JLabel("Are You Financially Responsible?\r\n");
		lblAreYouFinancially.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 59));
		lblAreYouFinancially.setForeground(new Color(255, 255, 255));
		lblAreYouFinancially.setBounds(124, 73, 918, 90);
		frame1.getContentPane().add(lblAreYouFinancially);
	//Play Button
		JButton btnPlay = new JButton("Play");
		//Hover Stuff
		btnPlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnPlay.setBackground(new Color(255,200,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnPlay.setBackground(new Color(255, 153, 255));
			}
		});
		btnPlay.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnPlay.setForeground(new Color(255, 255, 255));
		//Click Deal, goes to the tutorial
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Tutorial().setVisible(true);
				frame1.setVisible(false);
			}
		});
		btnPlay.setBackground(new Color(255, 153, 255));
		btnPlay.setBounds(328, 208, 366, 90);
		frame1.getContentPane().add(btnPlay);
	//About Button
		JButton btnAbout = new JButton("About");
		btnAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAbout.setBackground(new Color(200, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAbout.setBackground(new Color(153, 255, 255));
			}
		});
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new About().setVisible(true);
				frame1.setVisible(false);
			}
		});
		
		btnAbout.setForeground(new Color(255, 255, 255));
		btnAbout.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnAbout.setBackground(new Color(153, 255, 255));
		btnAbout.setBounds(328, 324, 366, 90);
		frame1.getContentPane().add(btnAbout);
	//Help Button
		JButton btnHelp = new JButton("Help");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Help().setVisible(true);
				frame1.setVisible(false);
			}
		});
		btnHelp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnHelp.setBackground(new Color(251,200,255));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnHelp.setBackground(new Color(204,153,255));
			}
		});
		btnHelp.setBackground(new Color(204, 153, 255));
		btnHelp.setForeground(Color.WHITE);
		btnHelp.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnHelp.setBounds(328, 436, 366, 90);
		frame1.getContentPane().add(btnHelp);
	}
}
