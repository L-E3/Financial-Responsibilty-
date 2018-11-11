import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tutorial extends JFrame {
	private JPanel contentPane;
	int currentSlide = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tutorial frame = new Tutorial();
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
	public Tutorial() {
		initialize();
	}
	public void initialize() {
		
//variables
		String[] slidesHeaders = {"What are you Worth?","Avoiding Consumer Scams and rip offs","Saving for College","Cash Or Credit"};
		String[] notes = {
				"<html>Net worth goes up or down based on: <br/>-how much money you have\r\n<br/>" + 
				"-how much debt you take on \r\n<br/>" + 
				"-how much debt you pay down \r\n <br/>" + 
				"-whether the value of investments increases or decreases \r\n<br/>" + 
				"-- update your net worth statement each year, at the same time \r\n <br/>" + 
				"--don't be discouraged if you start out with a negative net worth\r\n <br/>" + 
				"--follow a plan to get into a positive posiion<br/>", 
				
				"<html> Protect your identity by: \r\n<br/>" + 
				"1) Before you reveal and personal information, find out how it will be used, and whetherit will be shared with others\r\n<br/>" + 
				"2) Put passwords on ur credit card, bank, phone, and any other online accounts.  Avoid easy passcodes \r\n <br/>" + 
				"3)  Keep items with personal information in a safe place.  Tear/ Shred receipts, mailing labels, or any other items containing personal information.  \r\n <br/>" + 
				"4)Order a copy of your credit report annually from major credit bureaus.  Review it for accuracy\r\n <br/>" + 
				"5) Use a secure browser for shopping online.  Click the \"Lock\" icon on the browser's statis bar to display the site's security certificate. <br/> If there is't one availale, do NOT transmit any private info into this browser. \r\n" + 
				"", 
				
				"<html>college costs continue to rise\r\n <br/>" + 
				"-start saving for college early in a child's life \r\n </br>" + 
				"-ways to save include some with tax advantage\r\n <br/>" + 
				"     -529 plans \r\n <br/>" + 
				" --Prepaid tuition plans\r\n <br/>" + 
				" --college savings plans \r\n <br/>" + 
				"     -Covererdell education savings Accounts\r\n <br/>" + 
				"     -Custodial Accounts \r\n<br/>" + 
				"     -U.S. Saving Bonds\r\n<br/>" + 
				"-consider the pros and cons before making a decision<br/>",
				"<html>-Avoid temptation \r\n <br/>" + 
				"-Use debit instead of credit \r\n<br/>" + 
				"- Put away the plastic, don't carry around card unless you have to make a specific purchase. \r\n <br/>" + 
				"-Know what you owe"
		};
		String currentHeader = slidesHeaders[currentSlide];
		currentSlide = 0;
		
//frame stuff
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1163, 763);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	//Notes body
		JLabel lblNewLabel = new JLabel(notes[currentSlide]);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 25));
		lblNewLabel.setBounds(306, 181, 584, 413);
		contentPane.add(lblNewLabel);
		
//panel 
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText(slidesHeaders[currentSlide]);
		panel_1.setForeground(new Color(51, 51, 51));
		panel_1.setBackground(new Color(153, 255, 255));
		panel_1.setBounds(228, 121, 690, 505);
		contentPane.add(panel_1);
//Label
		JLabel label = new JLabel(slidesHeaders[currentSlide]);
		label.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
		panel_1.add(label);
		
//****forward button*******//
		JButton button = new JButton("->");
		
		//mouse paint
		button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//enable or disable
				if (currentSlide >= 5) {
					button.setEnabled(false);
				}
				else {
					button.setEnabled(true);
				}
				currentSlide++;
				label.setText(slidesHeaders[currentSlide]);
				lblNewLabel.setText(notes[currentSlide]);
			}
		});
		button.setBounds(1006, 353, 75, 25);
		contentPane.add(button);
		
//back button
		JButton button_1 = new JButton("<-");
	
		//mouse clicks
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (currentSlide <= 0) {
					button.setEnabled(false);
				}
				else {
					button.setEnabled(true);
				}
				//enable or disable
				currentSlide--;
				label.setText(slidesHeaders[currentSlide]);
				lblNewLabel.setText(notes[currentSlide]);
			}
			
		});

		button_1.setBounds(54, 353, 97, 25);
		contentPane.add(button_1);

	
//exit button
		JButton btnSkip = new JButton("Skip/Exit");
		btnSkip.addActionListener(new ActionListener() {
			//exit button clicked
			public void actionPerformed(ActionEvent e) {
				//exit to game mode
					new Game().setVisible(true);
					contentPane.setVisible(false);
			}
		});
		btnSkip.setBounds(970, 641, 120, 41);
		contentPane.add(btnSkip);
		
		JLabel lblTutorial = new JLabel("Tutorial");
		lblTutorial.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTutorial.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 65));
		lblTutorial.setForeground(new Color(204, 255, 204));
		lblTutorial.setBounds(448, 31, 508, 62);
		contentPane.add(lblTutorial);
	}
}
