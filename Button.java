import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame implements ActionListener {
	
	private JButton buttonOne;
    private JButton buttonTwo;
    private JButton buttonThree;
   // @SuppressWarnings("unused")
	private int gewinnserie = 0;

    public Button(String title) {
        super(title);
        
        
        buttonOne = new JButton("Button 1");
        buttonTwo = new JButton("Button 2");
        buttonThree = new JButton("Button 3");
        
        setLayout(new FlowLayout());
        add(buttonOne);
        add(buttonTwo);
        add(buttonThree);
        
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        
    }

	public static void main(String[] args) {
		  Button game = new Button("Dictionary");
	        game.setSize(500, 500);
	        game.setVisible(true);
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent E) {
	    Random rnd = new Random();
        int zufallszahl = rnd.nextInt(3);
        
        
        if (zufallszahl == 0 || zufallszahl == 1) {
            getContentPane().setBackground(Color.green);
            System.out.println(++gewinnserie);
        }else {
            System.exit(0);
        }
        
    }
		// TODO Auto-generated method stub
		
	}


