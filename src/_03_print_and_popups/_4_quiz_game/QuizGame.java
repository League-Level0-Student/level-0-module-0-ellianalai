package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
int score = 0;		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String code = JOptionPane.showInputDialog("In Harry Potter what book did Ginny first go to Howgwarts ");				
				// 3.  Use an if statement to check if their answer is correct
if (code.equals("The Chamber of Secrets"))	{
	score ++;
}
				// 4.  if the user's answer was correct, add one to their score 
String code1 = JOptionPane.showInputDialog("In Keeper of the Lost Cities what identity did Mr. Forkle first reveal ");				
// 3.  Use an if statement to check if their answer is correct
if (code1.equals("Sir Astin"))	{
score ++;
}		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
JOptionPane.showMessageDialog(null,"Your Final Score is " + score);
	}
}
