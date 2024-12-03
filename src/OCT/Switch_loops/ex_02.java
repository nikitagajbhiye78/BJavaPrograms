package OCT.Switch_loops;

import java.util.Locale;
import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        // Web automation
        // Ask user which browser want to run
        // chrome - execute on chrome
        // firefox - execute on firefox
        // edge - execute on edge

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = SC.nextLine();
        switch (browser){
            case "chrome":
                System.out.println("Start the chrome");
                break;
            case "firefox":
                System.out.println("Start the firefox");
                break;
            case "edge":
                System.out.println("Start the edge");
                break;

                default:
                System.out.println("Invalid browser");
                break;
        }
        SC.close();
    }
}
