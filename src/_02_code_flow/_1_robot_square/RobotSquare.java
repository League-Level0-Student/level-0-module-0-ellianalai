package _02_code_flow._1_robot_square;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	
    public static void main(String[] args){

    	// This code makes a new Robot
    	Robot elliana = new Robot("mini");
elliana.setX(325);
elliana.setY(450);
 elliana.sparkle();
        // Put the robot's pen down so it can draw
		//        Use the     rob.penDown();   command.
elliana.setRandomPenColor();
elliana.setPenWidth(30);
elliana.penDown();
        // SPEED. Make the robot move quickly.
		//        Use the     rob.setSpeed();   command.
elliana.setSpeed(100);

        // DRAW.  Draw a line
    	//		Use the     rob.move(); command
for(int i = 0;i < 4; i++) {
elliana.move(250);

		// TURN.  Turn 90 degrees
    	//      Use the     rob.turn();  command
elliana.turn(90); }

        // LOOP.  Now put the DRAW and TURN code into a for loop to repeat 4 times.
		//        Did your Robot draw a square?


    }
}
