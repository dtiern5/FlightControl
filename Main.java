package FlightControl;

import FlightControl.domain.Place;
import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        FlightControl mainControl = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        TextUI mainUI = new TextUI(mainControl, scanner);
        mainUI.start();
    }
}
