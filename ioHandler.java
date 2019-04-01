import java.util.Scanner;

public class ioHandler {
    static Scanner scanner = new Scanner(System.in);

    public static void output(String param, int i) { //Allows for easier implementation of TTS.
        if (i == 0) {
            System.out.println(param);
        } else if (i == 1) {
            System.out.print(param);
        } else {
            //speak(param);
        }
    }        
}