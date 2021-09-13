package org.example.fancontrol.base;

import org.example.fancontrol.operations.UserOperation;
import org.example.fancontrol.states.FanState;
import org.example.fancontrol.states.direction.Clockwise;
import org.example.fancontrol.states.speed.Off;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FanControlMain {
    public static void main(String args[]) {
        Fan fan = new Fan();
        fan.setFanState(new FanState(new Off(), new Clockwise()));

        System.out.println("INITIAL STATE : ");
        fan.getFanState().display();

        String userOperation = null;
        try {
            while (true) {
                System.out.print("\n\nType SPEED to change speed, DIRECTION to change direction, EXIT to exit  ");
                userOperation = getLine();

                if (userOperation.equalsIgnoreCase("EXIT")) {
                    System.exit(0);
                }

                System.out.println("\nOPERATION : " + UserOperation.valueOfLabel(userOperation));
                fan.operate(UserOperation.valueOfLabel(userOperation));
            }
        }
        catch(Exception e) {
            System.out.println("There was an exception. Exiting.");
        }
    }
    static String getLine() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}
