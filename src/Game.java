import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

public class Game extends JFrame {

	private JPanel contentPane;
	String playerAnswer;
	String currentAnswer;
	int corrects = 0;
	int wrongs = 0;
	int counter = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
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
	public Game() {
		initialize();
	}

	public void initialize() {
//Q + A
		String[] level = { "Very High level of financial responsibility", "Moderate level of financial responsibility",
				"Low level of financial responsibility" };
		String[] questions = { "<html>By law, salespeople can't <br/>exaggerate a product's qualities",
				"<html>Scam and rip-off <br/>artists rarely go to jail",
				"<html>Most consumers believe <br/> advertisements",
				"<html>Most consumers know about <br/>rip-offs and frauds, but take <br/>a chance on them anyway",
				"<html>Consumer deception <br/>is profitable",
				"<html>Sellers are expert,<br/> professional specialists in persuasions",
				"<html>Most financial fraud <br/>goes unreported" };
		String[] answers = { "false", "false", "true", "true", "true", "true", "true" };
//Frame stuff
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1163, 763);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

//question counter label
		JLabel lblQuestion = new JLabel("Question " + (counter + 1) + "#");
		lblQuestion.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblQuestion.setForeground(new Color(204, 102, 255));
		lblQuestion.setBounds(351, 0, 390, 108);
		contentPane.add(lblQuestion);
		// question (real) label
		JLabel lblinsertQuestion = new JLabel(questions[counter]);
		lblinsertQuestion.setVerticalAlignment(SwingConstants.TOP);
		lblinsertQuestion.setBounds(108, 149, 349, 437);
		contentPane.add(lblinsertQuestion);
		lblinsertQuestion.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
//another panel	
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(255, 153, 255));
		panel.setBounds(108, 149, 349, 431);
		contentPane.add(panel);
		// Label of intelligence
		JLabel label = new JLabel("");
		label.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 23));
		label.setForeground(new Color(255, 255, 255));
		label.setBounds(588, 280, 437, 37);
		contentPane.add(label);
//panel
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 255, 255));
		panel_1.setBounds(630, 149, 369, 100);
		contentPane.add(panel_1);
		// True button
		JButton btnTrue_1 = new JButton("True");
		btnTrue_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 26));
		btnTrue_1.setForeground(new Color(255, 255, 255));
		btnTrue_1.setBackground(new Color(102, 255, 153));
		
		btnTrue_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (corrects == 7) {
					label.setText(level[0]);
				} else if (corrects <= 6 && corrects >= 4) {
					label.setText(level[1]);
				} else {
					label.setText(level[2]);
				} 
				
				playerAnswer = "true";
				if (playerAnswer.equals(currentAnswer)) {
					corrects++;
				} else {
					wrongs++;
				}
				if (counter < questions.length - 1) {
					counter++;
					lblQuestion.setText("Question " + (counter + 1) + "#");
					lblinsertQuestion.setText(questions[counter]);
					currentAnswer = answers[counter];

				} else {
					lblQuestion.setText("Results: ");
					lblinsertQuestion.setText("<html> Total questions Correct: " + corrects
							+ "# <br/> Total questions Wrong: " + wrongs + "# <br/> Total questions:7#");

				}
			}
		});
		panel_1.add(btnTrue_1);
		// false button
		JButton btnF = new JButton("False");
		btnF.setForeground(new Color(255, 255, 255));
		btnF.setBackground(new Color(255, 153, 153));
		btnF.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 26));
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerAnswer = "false";
				if (playerAnswer.equals(currentAnswer)) {
					corrects++;
				} else {
					wrongs++;
				}
				if (counter < questions.length - 1) {
					counter++;
					lblQuestion.setText("Question " + (counter + 1) + "#");
					lblinsertQuestion.setText(questions[counter]);
					currentAnswer = answers[counter];

				} else {
					lblQuestion.setText("Results: ");
					lblinsertQuestion.setText("<html> Total questions Correct: " + corrects
							+ "# <br/> Total questions Wrong: " + wrongs + "# <br/> Total questions:7# <br/> <br/>");

				}
			}
		});
		panel_1.add(btnF);

	

		//nextQuestion button 
		JButton btnCheckAnswer = new JButton("Home");

		btnCheckAnswer.setBackground(new Color(204, 153, 255));
		btnCheckAnswer.setForeground(Color.WHITE);
		btnCheckAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 26));
		btnCheckAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DatBoi().frame1.setVisible(true);
				contentPane.setVisible(false);
				
			}
		});

		btnCheckAnswer.setBounds(704, 341, 229, 80);
		contentPane.add(btnCheckAnswer);


	}
}
