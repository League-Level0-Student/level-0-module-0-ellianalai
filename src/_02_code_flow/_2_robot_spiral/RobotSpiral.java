package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {

	public static void main(String[] args) {

		// Create a new Robot
		Robot elliana = new Robot("batman");
		// Set your robot's pen down
elliana.sparkle();
		elliana.penDown();

		// SPEED. Set the robot to go at max speed (100)
		elliana.setSpeed(75);
		// LOOP. Use a for loop to repeat ALL the following lines of code 50 times.
		for (int i = 0; i < 50; i++) {
			// Change the robot pen color to random
			elliana.setRandomPenColor();
			// DRAW. Move the robot (10*i) pixels
			// "i" is the variable in the for loop
			elliana.move(3 * i);
			// TURN. Turn the robot (360/3) degrees to the right
			elliana.turn(360/ 3);
			// Change the robot pen width to (i)
			elliana.setPenWidth(i);

			// Check the pattern against the picture in the recipe. If it matches, you are
			// done!
		}
elliana.unSparkle();	}
}
