import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class GuessMyColor extends JFrame{
	private JPanel targetPanel = new JPanel();
	private 	JPanel myColorPanel = new JPanel();
	
	private int targetRed = 0;
	private int targetGreen = 0;
	private int targetBlue = 0;

	public GuessMyColor(){	
		
		initGUI();
		
		setTitle("guess my COLORRRRRR");
		setSize(200, 100); 
		setResizable(true);
		pack();
		setLocationRelativeTo(null); 

			
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	public void initGUI(){
		//title panel
		JPanel titlePanel = new JPanel();
		add(titlePanel, BorderLayout.PAGE_START);
		titlePanel.setBackground(Color.BLACK);
		JLabel titleLabel = new JLabel("Guess My Color");
		titlePanel.add(titleLabel);
		titleLabel.setHorizontalAlignment(JLabel.CENTER); //left or right
		Font titleFont = new Font("Marker Felt", Font.BOLD, 50);
		titleLabel.setForeground(Color.MAGENTA);
		titleLabel.setFont(titleFont);
		
		//center panel
		JPanel centerPanel = new JPanel();
		add(centerPanel, BorderLayout.CENTER);
		centerPanel.setBackground(Color.BLACK);
		
		// target color
		Dimension size = new Dimension (70,70);
		centerPanel.add(targetPanel);
		generateColor();
		targetPanel.setPreferredSize(size);
		targetPanel.setSize(getPreferredSize());
		
		//my color panel
		centerPanel.add(myColorPanel);
		myColorPanel.setBackground(Color.BLUE);
		myColorPanel.setPreferredSize(size);
		myColorPanel.setSize(getPreferredSize());
		
		//bottom panel
		JPanel bottomPanel = new JPanel();
		add(bottomPanel, BorderLayout.PAGE_END);
		bottomPanel.setBackground(Color.BLACK);
		
		Font buttonFont = new Font("Arial", Font.BOLD, 25);
		
		JButton plusRed = new JButton("+");
		plusRed.setFont(buttonFont);;
		plusRed.setBackground(Color.RED);
		bottomPanel.add(plusRed);
		
		JButton lessRed = new JButton("-");
		lessRed.setFont(buttonFont);;
		lessRed.setBackground(Color.RED);
		bottomPanel.add(lessRed);
		
		JButton plusGreen = new JButton("+");
		plusGreen.setFont(buttonFont);;
		plusGreen.setBackground(Color.GREEN);
		bottomPanel.add(plusGreen);
		
		JButton lessGreen = new JButton("-");
		lessGreen.setFont(buttonFont);;
		lessGreen.setBackground(Color.GREEN);
		bottomPanel.add(lessGreen);
		
		JButton plusBlue = new JButton("+");
		plusBlue.setFont(buttonFont);;
		plusBlue.setBackground(Color.BLUE);
		bottomPanel.add(plusBlue);
		
		JButton lessBlue = new JButton("-");
		lessBlue.setFont(buttonFont);;
		lessBlue.setBackground(Color.BLUE);
		bottomPanel.add(lessBlue);
	}
	public void generateColor() {
		targetRed = (int)(Math.random() * 17) *15;
		targetGreen = (int)(Math.random() * 17) *15;
		targetBlue = (int)(Math.random() * 17) *15;
		
		Color targetColor = new Color (targetRed, targetGreen, targetBlue);
		targetPanel.setBackground(targetColor);
	}

	public static void main(String[] args) {
		try {
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch ( Exception e) {}
        
        EventQueue.invokeLater(new Runnable (){
            @Override
            public void run() {
                new GuessMyColor();
            }   
        });

	}

}