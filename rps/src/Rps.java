// Chapter 7 Question 21

import java.awt.*;
import java.awt.Graphics;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Rps extends JFrame
    implements ActionListener
{
  private final char moves[] = {'R', 'P', 'S', 'L', 'O'};
  private JRadioButton rock, paper, scissors, lizard, spock;
  private JTextField display;

  public Rps()
  {
    super("Rock, paper, Scissors, Lizard, Spock");

    rock = new JRadioButton("   Rock   ", true);
    paper = new JRadioButton("   Paper  ");
    scissors = new JRadioButton(" Scissors ");
    lizard = new JRadioButton(" Lizard ");
    spock = new JRadioButton("Spock");
    

    ButtonGroup rpsButtons = new ButtonGroup();
    rpsButtons.add(rock);
    rpsButtons.add(paper);
    rpsButtons.add(scissors);
    rpsButtons.add(lizard);
    rpsButtons.add(spock);

    JButton go = new JButton("         Go         ");
    go.addActionListener(this);

    display = new JTextField(25);
    display.setEditable(false);
    display.setBackground(Color.green);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(rock);
    c.add(paper);
    c.add(scissors);
    c.add(lizard);
    c.add(spock);
    c.add(go);
    c.add(display);
  }

  /**
   *  returns -1 if the player wins,
   *  0 if it's a tie, and 1 if the computer wins
   */
  private int nextPlay(char computerMove, char playerMove)
  {
    int result = 0; 
    
 /*  if (playerMove == 'R' && computerMove == 'S') {
	   if (computerMove == 'S')
		   result = -1;
	   else if (computerMove == 'P')
		   result = 1;
	   else if(computerMove == 'L')
		   result = -1;
	   else if (computerMove == 'O')
		   result = 1;
	   else 
		   result = 0;
   }
  if (playerMove == 'P') {
	   if (computerMove == 'S')
		   result = 1;
	   else if (computerMove == 'R')
		   result = -1;
	   else if(computerMove == 'L')
		   result = 1;
	   else if (computerMove == 'O')
		   result = -1;
	   else 
		   result = 0;
  }

 if (playerMove == 'S') {
	   if (computerMove == 'R')
		   result = 1;
	   else if (computerMove == 'P')
		   result = -1;
	   else if(computerMove == 'L')
		   result = -1;
	   else if (computerMove == 'O')
		   result = 1;
	   else 
		   result = 0;
 }

if (playerMove == 'L') {
	   if (computerMove == 'S')
		   result = 1;
	   else if (computerMove == 'P')
		   result = -1;
	   else if(computerMove == 'R')
		   result = 1;
	   else if (computerMove == 'O')
		   result = -1;
	   else 
		   result = 0;
}

if (playerMove == 'O') {
   if (computerMove == 'S')
	   result = -1;
   else if (computerMove == 'P')
	   result = 1;
   else if(computerMove == 'L')
	   result = 1;
   else if (computerMove == 'R')
	   result = -1;
   else 
	   result = 0;
} */
if ((playerMove == 'O' && computerMove == 'L') || (playerMove == 'O' && computerMove == 'R') || (playerMove == 'L' && computerMove == 'P') || (playerMove == 'L' && computerMove == 'O') || (playerMove == 'R' && computerMove == 'S') || (playerMove == 'R' && computerMove == 'L') || (playerMove == 'P' && computerMove == 'R') || (playerMove == 'P' && computerMove == 'O') || (playerMove == 'S' && computerMove == 'P') || (playerMove == 'S' && computerMove == 'L')) {
	   result = -1;
}
else if ((playerMove == 'O' && computerMove == 'P') || (playerMove == 'O' && computerMove == 'S') || (playerMove == 'L' && computerMove == 'S') || (playerMove == 'L' && computerMove == 'R') || (playerMove == 'R' && computerMove == 'P') || (playerMove == 'R' && computerMove == 'O') || (playerMove == 'P' && computerMove == 'S') || (playerMove == 'P' && computerMove == 'L') || (playerMove == 'S' && computerMove == 'R') || (playerMove == 'S' && computerMove == 'O')) {
	  result = 1;
}
    return result;
}
  public void actionPerformed(ActionEvent e)
  {
    char playerMove, computerMove;
    if (rock.isSelected())
      playerMove = 'R';
    else if (paper.isSelected())
      playerMove = 'P';
    else if (scissors.isSelected())
      playerMove = 'S';
    else if (lizard.isSelected())
      playerMove = 'L';
    else
      playerMove = 'O';

    int k = (int)(Math.random() * 5);
    computerMove = moves[k];
    int result = nextPlay(computerMove, playerMove);

    String msg = "  You said " + makeWord(playerMove) + ", I said " +
                 makeWord(computerMove);
    if (result < 0)
      msg += " -- you win.";
    else if (result == 0)
      msg += " -- tie.";
    else // if (result > 0)
      msg += " -- I win.";
    display.setText(msg);
  }

  private String makeWord(char move)
  {
    String word = "";

    switch (move)
    {
      case 'R': word = "ROCK"; break;
      case 'P': word = "PAPER"; break;
      case 'S': word = "SCISSORS"; break;
      case 'L': word = "LIZARD"; break;
      case 'O': word = "SPOCK"; break;
    }
    return word;
  }

  public static void main(String[] args)
  {
    Rps window = new Rps();
    window.setBounds(300, 300, 400, 140);
   //
    JFrame frame = new JFrame();
    ImageIcon icon = new ImageIcon("FrenchHead.jpg");
    JLabel label = new JLabel(icon);
    frame.add(label);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
   //
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
    
  }
}

