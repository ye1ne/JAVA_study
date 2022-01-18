package boostcourse;
import iot.DimmingLights;
import iot.Elevator;
import iot.Lighting;
import iot.Security;

import javax.swing.*;

public class OKjavaGoInHome{
    public static void main(String[] args) {
        String id = args[0];
        String bright = args[1];
//        String id = JOptionPane.showInputDialog("Enter a ID");
//        String bright = JOptionPane.showInputDialog("Enter a bright");
        //elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);

        // security off
        Security mySecurity = new Security(id);
        mySecurity.off();
        // Light on
        Lighting hallLamp = new Lighting(id + " / hall");
        hallLamp.on();
        Lighting floorLamp = new Lighting(id + " /floor");
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();
        }
}






